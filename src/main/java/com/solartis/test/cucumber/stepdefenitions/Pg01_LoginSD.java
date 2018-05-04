package com.solartis.test.cucumber.stepdefenitions;


import org.apache.log4j.Logger;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.Excel;
import com.solartis.test.pom.common.DriversHandling;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg01_LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Pg01_LoginSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg01_LoginPage loginpage= new Pg01_LoginPage();
	Excel excelobj= new Excel();
	
	@Given("^user opens browser \"([^\"]*)\" and enter the \"([^\"]*)\"$")
	public void userOpenBrowser(String Browser, String URL) throws Throwable
	{
		System.out.println(System.getProperty("URL"));
		System.out.println(System.getProperty("Browser"));
		DriversHandling.initialization(System.getProperty("Browser"), System.getProperty("URL"));
		scenariolog.info("Browser Launched");
	}

		
	
	@Then("^user enter password <\"([^\"]*)\"> and click on login button for \"([^\"]*)\"$")
	public void loginWithEmptyUsername(String password, String Sno) throws POMPageException
	{
		
		try
		{
			loginpage.enterPwd(password);
			loginpage.clickLoginbtn();
		    
		    AssertCheck("Please enter the Username",loginpage.EmptyUserName);
		    System.out.println("Enter Username - Username is empty " + Sno);
		    scenariolog.info("Enter Username - Username is empty in login page for testdata  " + Sno);
		    //driver.quit();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Login Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e1);
			}
			errorlog.info("Error in Login Page", e);
			throw new POMPageException("Error in Login Page", e);
		}
		
		scenariolog.info("Login Action with Empty UserName for Testdata " + Sno);		
	}
	
	
	
	
	@Then("^user enter username <\"([^\"]*)\"> and click on login button for \"([^\"]*)\"$")
	public void loginWithEmptyPassword(String username, String Sno) throws POMPageException
	{
		
		try
		{	
			loginpage.enterUserName(username);
			loginpage.clickLoginbtn();
			
			AssertCheck("Please enter the Password",loginpage.EmptyPassword);
			System.out.println("Enter Password - Password is empty");
			scenariolog.info("Enter Password - Password is empty in login page for testdata " + Sno);
			//driver.quit();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Login Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e1);
			}
			errorlog.info("Error in Login Page", e);
			throw new POMPageException("Error in Login Page", e);
		}
		
		scenariolog.info("Login Action with Empty Password for Testdata " + Sno);
	}
	
	
	
	
	
	@Then("^user enter wrong credentials <\"([^\"]*)\"> and <\"([^\"]*)\"> and click on login button for \"([^\"]*)\"$")
	public void loginWithWrongCredentials(String username, String password, String Sno) throws POMPageException
	{
		
		try
		{

			loginpage.enterUserName(System.getProperty("username"));
			loginpage.enterPwd(System.getProperty("password"));
			loginpage.clickLoginbtn();
			Thread.sleep(1000);
			
			AssertCheck("User Name and Password provided does not match or Invalid",loginpage.wrongCredentials);
			System.out.println("Enter correct username and Password");
			scenariolog.info("Enter correct username and Password in login page for testdata " + Sno);
			//driver.quit();
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Login Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e1);
			}
			errorlog.info("Error in Login Page", e);
			throw new POMPageException("Error in Login Page", e);
		}
		
		scenariolog.info("Login Action with Wrong Credentials for Testdata " + Sno);
		
	}
	

	
	
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\" and click on login button for \"([^\"]*)\"$")
	public void SuccessfulLogin(String username,String password,String test_data) throws POMPageException
	{
		Pg01_LoginPage loginpage= new Pg01_LoginPage();
		
		try
		{
			//loginpage.xrebelPresence();
			loginpage.enterUserName(System.getProperty("username"));
			loginpage.enterPwd(System.getProperty("password"));
			loginpage.clickLoginbtn();			
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Login Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e1);
			}
			errorlog.info("Error in Login Page", e);
			throw new POMPageException("Error in Login Page", e);
		}
		
		scenariolog.info("Login Action for Testdata " + test_data);
	}
	

	/*@Then("^user enter username \"([^\"]*)\" and password \"([^\"]*)\" and click on login button for \"([^\"]*)\"$")
	public HomePage SuccessfulLogin(int usernamecolNO, int pwdcolno, int rowno) throws POMPageException, IOException
	{
		
		try
		{
			String usernameExcel = excelobj.ExcelRead(rowno, usernamecolNO);
			System.out.println("usernameExcel  " + usernameExcel);
			loginpage.enterUserName(usernameExcel);
			
			String pwdExcel = excelobj.ExcelRead(rowno, pwdcolno);
			System.out.println("pwdExcel " + pwdExcel);
			loginpage.enterPwd(pwdExcel);
			
			loginpage.clickLoginbtn();
			Thread.sleep(1000);
			
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Integer.toString(rowno));
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Login Page", e1);
			}
			throw new POMPageException("Error in Login Page", e);
		}
		
		
		scenariolog.info("Login Action for Testdata " + rowno);
		return new HomePage();
	}*/
	
	
}

