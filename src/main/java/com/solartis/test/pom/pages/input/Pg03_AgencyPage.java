package com.solartis.test.pom.pages.input;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg03_AgencyPage extends PomEventsMethodDefinition 
{

		@FindBy(xpath="id('AgencyForm:AgencyTile:Object__Agency__BusinessName_input')")
		public WebElement agencyLookup;                                     
		@FindBy(xpath="//*[contains(text(),'Continue To Insured')]")
		public WebElement contToInsuredButton;
		@FindBy(xpath = "id('msgspan')")
	    public WebElement processing_load;
		@FindBy(xpath="id('AgencyForm:AgencyTile:AgencyPanel_Container')/tbody/tr[2]/td[2]/div/span[2]")
		public WebElement emptyAgencyCode;
		
		
		FireEvent FireEventobject = new FireEvent();
		
		
		public Pg03_AgencyPage()
		{
	    	   PageFactory.initElements(driver, this);
		}
		
		
		public void clickLookup() throws POMEventException
		{
			    FireEventobject.ClickElement(agencyLookup);
		}
		
		
		public void pickAgency(String agency_code) throws POMEventException, InterruptedException
		{
			    FireEventobject.EnterTextWithoutEnter(agencyLookup, agency_code);
				Thread.sleep(5000);
				agencyLookup.sendKeys(Keys.ENTER);
		}
		
		
		public void contInsured() throws POMEventException 
		{            
            	FireEventobject.ClickElement(contToInsuredButton);
		}
		
		
		public Pg04_InsuredPage Agency() 
		{
				return new Pg04_InsuredPage();
		}

}
