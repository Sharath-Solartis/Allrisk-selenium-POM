package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.pages.input.Pg15_EndorsementsPage;
import com.solartis.test.pom.pages.input.Pg04_InsuredPage;
import cucumber.api.java.en.Then;


public class Pg15_EndorsementsInsuredSD 
{

	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg04_InsuredPage insuredpage = new Pg04_InsuredPage();
	Pg15_EndorsementsPage endoPage = new Pg15_EndorsementsPage();
	
	
	@Then("^Proceed with endorsements with Endo Effective Date \"([^\"]*)\" for \"([^\"]*)\"$")
	public void proceedEndorsements(String endoEffectiveDate, String Sno) throws POMPageException
	{
		
		try
		{
			//FireEventobject.SyncWait(1000);
			endoPage.clickEndorsementsTab();
			FireEventobject.ProcessingLoad();	
			
			endoPage.clickAddEndorsements();
			FireEventobject.ProcessingLoad();	
			
			endoPage.clickEffectiveDateClick();
			//endoPage.datePicker(endoPage.datePicker,endoEffectiveDate);
			endoPage.clickProceedToEndorsement();	
			FireEventobject.ProcessingLoad();	
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot while proceeding to Endorsements Page", e1);
				throw new POMPageException("Error in Taking ScreenShot while proceeding to Endorsements Page", e1);
			}
			errorlog.info("Error in setting Effective Date in Endorsements Page", e);
			throw new POMPageException("Error in setting Effective Date in Endorsements Page", e);
		}
			scenariolog.info("Proceeding to Endorsements Page for Testdata " + Sno);
    }
	
	
	
	
	@Then("^Edit Insured Details for \"([^\"]*)\" Then \"([^\"]*)\" And \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterEndorsementsInsuredInformation(String endoInsuredName, String endoInsuredAddress, String endoPhoneNumber, String Sno) throws POMPageException
	{
		
		try
		{			
			insuredpage.clickInsuredName();
			insuredpage.clearInsuredName();
			insuredpage.enterInsuredName(endoInsuredName);
						
			insuredpage.clickInsuredAddress();
			insuredpage.clearInsuredAddress();
			insuredpage.enterInsuredAddr(endoInsuredAddress);
			
			FireEventobject.SyncWait(2000);
		    insuredpage.insuredAddress.sendKeys(Keys.ARROW_DOWN);
		    FireEventobject.SyncWait(2000);
			insuredpage.insuredAddress.sendKeys(Keys.ENTER);
			FireEventobject.ProcessingLoad();
			
			insuredpage.clickPhoneNumber();
			insuredpage.clearPhoneNumber();
			insuredpage.enterPhNumber(endoPhoneNumber);
			
			endoPage.clickSaveInsuredButton();	
			FireEventobject.ProcessingLoad();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot while proceeding to Endorsements Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Insured Endorsements Page", e1);
			}
			errorlog.info("Error in editing the Insured details in Endorsements Page", e);
			throw new POMPageException("Error in editing the Insured details in Endorsements Page", e);
		}
		
		scenariolog.info("Error while Entering Insured Endorsements Information for Testdata " + Sno);
    }	
		
	
	@Then("^Click Continue to underwriting Page for \"([^\"]*)\"$")
	public void continueToUnderwriting(String Sno) throws POMPageException
	{
		
		try
		{
			endoPage.clickContinueToUnderwriting();
			FireEventobject.ProcessingLoad();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot while proceeding to Endorsements Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Insured Endorsements Page", e1);
			}
			errorlog.info("Error in clicking Continue to Underwriting Page Button in Endorsements Page", e);
			throw new POMPageException("Error in clicking Continue to Underwriting Page Button in Endorsements Page", e);
		}
		
		scenariolog.info("Clicked Continue to Underwriting in Endorsements for Testdata " + Sno);
    }	
}

