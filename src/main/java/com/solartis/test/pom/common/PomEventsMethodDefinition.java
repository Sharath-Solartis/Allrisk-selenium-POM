package com.solartis.test.pom.common;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.DriversHandling;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import java.util.function.Function;


public class PomEventsMethodDefinition extends DriversHandling implements PomEvents
{
	
	//driver handling is extended here bcoz intansiating driver in each page shows error
	
	//public static WebDriver driver;
	protected WebDriverWait wait=null; 
	public static final String screenshotpath;
	    
    static 
	{
    	screenshotpath = "target//";
	}
    
	@Override
		public void ClickElement(WebElement element) throws POMEventException
		{
		try 
		{
				element.click();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR IN CLICK OPERATION : " + element, e);
		}
		}
	
	@Override
	public void OutsideClick() throws POMEventException
	{
		try
		{
			WebElement element = driver.findElement(By.xpath("id('templateBody')"));
			element.click();
		}
		catch (Exception e)
		{
			throw new POMEventException("ERROR IN OUTSIDE CLICK : "+ e);
		}
	}
	
	
	@Override
		public void Dropdown(WebElement element, String value) throws POMEventException
		{
		try 
		{
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(value);
		}
		catch (Exception e)
		{
			throw new POMEventException("ERROR IN DROPDOWN OPERATION : "+ e);
		}
		}
	
	
	@Override	
		public void EnterTextWithoutEnter(WebElement element, String value) throws POMEventException 
		{
		try 
		{
				element.sendKeys(value);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE ENTERING TEXT OPERATION WITHOUT ENTER : "+ element, e);
		}
		}
	
	@Override	
		public void EnterTextWithEnter(WebElement element, String value) throws POMEventException 
		{
		try 
		{
				element.sendKeys(value);
				element.sendKeys(Keys.ENTER);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE ENTERING TEXT OPERATION WITH ENTER : "+ element, e);
		}
		}

	
	@Override
	   public void toggleButton(String p,String inputValue) throws POMEventException
	   {
			
		try 
		{
			WebElement element = driver.findElement(By.xpath(p + "/div[contains(.,'"+inputValue+"')]/span"));
			//wait.until(ExpectedConditions.elementToBeClickable(p));
			ClickElement(element);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING TOGGLE OPERATION : ", e);
		}
	  }
	
	@Override
	   public void clearTextbox(WebElement element) throws POMEventException
	   {
		try 
		{
		   	  	element.clear();
	    }
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING TEXTBOX CLEAR OPERATION : ", e);
		}
	   }
	
	@Override
	   public void AssertCheck(String value, WebElement element) throws POMEventException
	   {
		try 
		{
			assertEquals(value, element.getText());
	    }
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING ASSERT EQUALS OPERATION : ", e);
		}
	   }
	
	@Override	
		public void WaitElementVisibility(WebElement element) throws POMEventException
		{
		try 
		{
		
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT VISIBILITY OPERATION : "+ element, e);
		}
		}
	
	
	/*@Override	
		public void WaitElementClickable(WebElement element) throws POMEventException
		{
		
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT TO CLICK : "+ element, e);
		}
		}
	*/
	@Override
		public void WaitElementClickable(String p) throws POMEventException
		{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(p)));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT TO CLICK : "+ e);
		}
		}
	
	@Override	
	public void fluentProcessingLoad(WebElement element) throws POMEventException
	{
		try 
		{
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).pollingEvery(10, TimeUnit.SECONDS).withTimeout(2, TimeUnit.MINUTES).ignoring(NoSuchElementException.class); 
				
			Function<WebDriver, WebElement> waitfunction = new Function<WebDriver, WebElement>() 
			{
				public WebElement apply(WebDriver driver)
				{
							
					//WebElement element = driver.findElement(By.xpath("id('msgspan')"));
					//if (element != null)
					if(element.isEnabled())
						  System.out.println("object found!!");
					return element;
				}
			};
	
			wait.until(waitfunction);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ELEMENT : ", e);
		}
	}
	
	@Override	
	public void SyncWait(int time) throws POMEventException
	{
		try 
		{
			synchronized (driver)
			{
			   driver.wait(time);		
			}
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING SYNC WAIT : ", e);
		}
	}

	
	@Override	
	public void ThreadWait(int time) throws POMEventException
	{
		try 
		{
			Thread.sleep(time);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING THREAD WAIT : ", e);
		}
	}
	
	@Override	
	public void QuoteOverLay() throws POMEventException
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('QuoteOverlayPanel')")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('QuoteOverlayPanel')")));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR QUOTE OVERLAY : ", e);
		}
	}
	
	@Override	
	public void EndoOverLay() throws POMEventException
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('blockUI_blocker')")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('blockUI_blocker')")));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR ENDO OVERLAY : ", e);
		}
	}
	
	@Override	
		public void ProcessingLoad() throws POMEventException
		{
			try 
			{
				WebDriverWait wait = new WebDriverWait(driver, 250);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('msgspan')")));
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('msgspan')")));
			}
			catch (Exception e) 
			{
				throw new POMEventException("ERROR WHILE WAITING FOR PROCESSING LOAD : ", e);
			}
		}
	
	@Override	
	public void LocationProcessingLoad() throws POMEventException
	{
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('j_idt3824')")));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('j_idt3824')")));
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE WAITING FOR PROCESSING LOAD : ", e);
		}
	}
	
	@Override    
	    public void ProcessingLoadStickyForm() throws POMEventException
	    {
		    try 
		    {
		        WebDriverWait wait = new WebDriverWait(driver, 120);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('CarrierSelectionFormPage:carrierTile4:overlayStickyForm')")));
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('CarrierSelectionFormPage:carrierTile4:overlayStickyForm')")));
		    }
		    catch (Exception e) 
		    {
		        throw new POMEventException("ERROR WHILE WAITING FOR PROCESSING LOAD : ", e);
		    }
	    }

	@Override    
		public void ProcessingLoadCSOverlay() throws POMEventException
		{
			try 
			{
			    WebDriverWait wait = new WebDriverWait(driver, 180);
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("id('CSOverlay')")));
			    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("id('CSOverlay')")));
			}
			catch (Exception e) 
			{
			    throw new POMEventException("ERROR WHILE WAITING FOR PROCESSING LOAD : ", e);
			}
		}
	
	@Override	
		public void autoComplete(WebElement element, String value) throws POMEventException
		{
			try 
			{
				element.sendKeys(value);
			 	element.sendKeys(Keys.DOWN);
			 	element.sendKeys(Keys.ENTER);
			}
			catch (Exception e) 
			{
				throw new POMEventException("ERROR WHILE PERFORMING AUTOCOMPLETE : ", e);
			}
		}
		
	
	@Override	
		public void waitWithClickable(String p) throws POMEventException 
		 {
			try 
			{
			 	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(p)));
			 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(p)));
			 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(p)));
			}
			catch (Exception e) 
			{
				throw new POMEventException("ERROR WHILE PERFORMING WAIT WITH CLICKABLE : ", e);
			}
		 }
	
	
	@Override
	public void DatePickerpopup(String p,String inputValue) throws POMEventException
		 {
			  //int totElements=inputValue.length();
			  String[] value1=inputValue.split("/");
			  for(int i=2;i>=0;--i)
			  {
				   if(i==2)
				   {
				     WaitElementClickable(p+"/div/div/select[2]");
				     WebElement element1 = driver.findElement(By.xpath(p+"/div/div/select[2]"));
				     Select dropdown = new Select(element1);
				     dropdown.selectByVisibleText(value1[i]);
				   }
				  
				   if(i==0)
				   {
					    int day=Integer.parseInt(value1[i]);
					    WaitElementClickable(p+"/div/div/select[2]");
					    // WebElement element3 = driver.findElement(By.xpath(p+"/div/div/select[2]"));
					    driver.findElement(By.xpath(p+"/table/tbody/tr/td/a[contains(text(),'"+day+"')]")).click();
				   }
				   
				   if(i==1)
				   {
					   WaitElementClickable(p+"/div/div/select[1]");
				       switch (value1[i]) 
				           {
				               case "01":  value1[i] = "Jan";            break;
				               case "02":  value1[i] = "Feb";            break;
				               case "03":  value1[i] = "Mar";            break;
				               case "04":  value1[i] = "Apr";            break;
				               case "05":  value1[i] = "May";            break;
				               case "06":  value1[i] = "Jun";            break;
				               case "07":  value1[i] = "Jul";            break;
				               case "08":  value1[i] = "Aug";            break;
				               case "09":  value1[i] = "Sep";            break;
				               case "10":  value1[i] = "Oct";            break;
				               case "11":  value1[i] = "Nov";            break;
				               case "12":  value1[i] = "Dec";            break;
				               default  :  value1[i] = "Invalid month";  break;
				           }
				     WebElement element2 = driver.findElement(By.xpath(p+"/div/div/select[1]"));
				     Select dropdown = new Select(element2);
				     dropdown.selectByVisibleText(value1[i]); 
				  }
				   
			   }
			  
		 }
	@Override	
	public boolean assertText(WebElement element, String value) throws POMEventException
		{
		try 
		{
			boolean status = false;
			String actualText = element.getText();
		   	if(actualText.equals(value))
		   	{
			   status=true;
		   	}
		   	System.out.println(status);
		   	return status;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE COMPARING TEXTS USING ASSERT : ", e);
		}
		}

			
		
	@Override	
		public void takeScreenShot() throws IOException, POMEventException
		{
		try 
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	FileUtils.copyFile(scrFile, new File("D:\\Exception\\screenshots\\"+".png"));	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE TAKING SCREENSHOTS : ", e);
		}
		}
	
	
	@Override
		public void JSradioButton(WebElement element) throws POMEventException
		{
		try 
		{
			JavascriptExecutor radio = (JavascriptExecutor) driver;
			radio.executeScript("arguments[0].click();", element);
			radio.executeScript("arguments[0].checked=true",element);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE CLICKING RADIO BUTTON : " + element, e);
		}
		}
	
	@Override
		public void JScheckbox(WebElement element) throws POMEventException
		{	
		try 
		{
			JavascriptExecutor checkbox = (JavascriptExecutor) driver;
			checkbox.executeScript("arguments[0].click();", element);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE CLICKING CHECK BOX : " + element, e);
		}
		}
	
	@Override
		public void JStextbox(WebElement element, String value) throws POMEventException
		{
		try 
		{
			JavascriptExecutor textbox = (JavascriptExecutor) driver;
			textbox.executeScript("arguments[0].value="+value,element);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR IN JSEXECUTOR TEXTBOX : " + element, e);
		}
		}
	
	@Override
		public void contSendkeysOperation(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			Actions builder = new Actions(driver);
		 	Actions seriesOfActions = builder.moveToElement(element).click().sendKeys(element, value);
		 	seriesOfActions.perform();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING CONTINUOUS SEND KEYS OPERATION : " + element, e);
		}
		}
	
		
	@Override
		
		public void setTextWithoutEnter(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			element.clear();
		   	element.sendKeys(value);
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITHOUT ENTER : " + element, e);
		}
		}
	
		
	@Override
		public void setTextThenEnter(WebElement element, String value) throws POMEventException
		{
		try 
		{
			element.clear();
		   	element.sendKeys(value);
		   	element.sendKeys(Keys.ENTER);	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITH ENTER : " + element, e);
		}
		}
	
		
	@Override
		public void setTextThenTab(WebElement element, String value) throws POMEventException
		{
		try 
		{
		
			element.sendKeys(value);
		   	element.sendKeys(Keys.TAB);	
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE SETING TEXT WITH TAB : " + element, e);
		}
		}
		
	
	@Override	
		public int checkProductDisable(WebElement element, String value) throws POMEventException
		{
		try 
		{
			int tr=0;
		   	if(element.isEnabled())
		   	{
		   		tr=1;
		   	}
		   	else
		   	{
		   		tr=0;
		   	}
			return tr;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE CHECKING WHETHER PRODUCT IS ENABLE OR NOT : " + element, e);
		}
		}
		
	
	@Override
		public String getValueByTextInput(WebElement element) throws POMEventException
		{
		try 
		{
			String label=element.getText();
		   	return label;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE GETTING VALUE BY TEXT INPUT : " + element, e);
		}
		}
	
	@Override	
		public String getValueByAttributeInput(WebElement element) throws POMEventException
		{
		try 
		{
			String label=element.getAttribute("value");
		 	return label;
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE GETTING VALUE BY ATTRIBUTE INPUT : " + element, e);
		}
		}
	
	@Override	
		public void mouseHover(WebElement element) throws POMEventException
		{
		try 
		{
			Actions mouse_hover = new Actions(driver);
		    mouse_hover.moveToElement(element).build().perform();
		}
		catch (Exception e) 
		{
			throw new POMEventException("ERROR WHILE PERFORMING MOUSE HOVER : " + element, e);
		}	
		}	
	
	 @Override
	    public void takeScreenshot(String filename) throws POMEventException
		{
		    try
		    {
	        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String screenPath = screenshotpath.toString()+"Testdata_"+filename+".png";
	        FileUtils.copyFile(screenshot, new File(screenPath));
	        driver.quit();
		    }
		    catch (IOException e) 
		    {
		    	throw new POMEventException("ERROR WHILE TAKING SCREENSHOT.", e);
			}
	    }

	 @Override
	 public DatabaseOperation establishDBConnection() throws POMEventException 
     {
		 try
		 {
		 DatabaseOperation DB = new DatabaseOperation();
		 DB.ConnectionSetup("com.mysql.jdbc.Driver", "jdbc:mysql://192.168.84.225:3700/TestDB_Allrisk", "root", "redhat");
		 return DB;
		 }
		 catch (DatabaseException e) 
		 {
			 throw new POMEventException("ERROR WHILE CONNECTINING DB IN FRIEEVENT CLASS", e);
		 }
     }
	 
	@Override
	public String getValueByTextOutput(WebElement element) throws POMEventException 
	{
		try
	    {
		String label=element.getText();
		System.out.println("Output value is :"+label);
	   	return label;
	    }
	    catch (Exception e) 
	    {
	    	throw new POMEventException("ERROR WHILE GET VALUE BY TEXT OUTPUT.", e);
		}
	}

	
	public String getValueByAttributeOutput(WebElement element) throws POMEventException 
	{
		String label="";
		try
	    {
		label=element.getAttribute("value");
		System.out.println(label);
	 	
		}
	    catch (Exception e) 
	    {
	    	throw new POMEventException("ERROR WHILE GET VALUE BY ATTRIBUT OUTPUT.", e);
		}
		return label;
	}

	@Override
	public void WaitElementClickable(WebElement element)
			throws POMEventException {
		// TODO Auto-generated method stub
		
	}


			
	}

