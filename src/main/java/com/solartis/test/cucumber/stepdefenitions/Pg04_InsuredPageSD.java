package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg04_InsuredPage;

import cucumber.api.java.en.Then;

public class Pg04_InsuredPageSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg04_InsuredPage insuredpage = new Pg04_InsuredPage();
	
	
	@Then("^click Continue to Insured without filling insured details for \"([^\"]*)\"$")
	public void contWithoutInsuredInformation(String Sno) throws POMPageException
	{
		
		try
		{
		insuredpage.clickContToLoc();
		Thread.sleep(4000);
		
		AssertCheck("Please enter the Insured Name",insuredpage.emptyInsuredName);
	    System.out.println("Enter Insured Name - Insured Name is empty");
	    scenariolog.info("Enter Insured Name - Insured Name is empty for testdata  " + Sno);

		AssertCheck("Please enter Insured Mailing Address", insuredpage.emptyInsuredAddress);
	    System.out.println("Enter Insured Address - Insured Address is empty");
	    scenariolog.info("Enter Insured Address - Insured Address is empty for testdata  " + Sno);
	    
	    AssertCheck("Please enter Street Number", insuredpage.emptyStreetNumber);
	    System.out.println("Enter Street Number - Street Number is empty");
	    scenariolog.info("Enter Street Number - Street Number is empty for testdata  " + Sno);
	    
	    AssertCheck("Please enter Street Name",insuredpage.emptyStreetName);
	    System.out.println("Enter Street Name - Street Name is empty");
	    scenariolog.info("Enter Street Name - Street Name is empty for testdata " + Sno);

	    AssertCheck("Please enter Zip Code", insuredpage.emptyZipcode);
	    System.out.println("Enter Zipcode - Zipcode is empty");
	    scenariolog.info("Enter Zipcode - Zipcode is empty for testdata  " + Sno);

	   	AssertCheck("Please enter Phone Number", insuredpage.emptyPhoneNumber);
	    System.out.println("Enter Phone Number - Phone Number is empty");
	    scenariolog.info("Enter Phone Number - Phone Number is empty for testdata  " + Sno);
    
	    Thread.sleep(2000);
		}
		catch(POMEventException | InterruptedException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(Sno);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Insured Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Insured Page", e1);
			}
			errorlog.info("Error in Insured Page", e);
			throw new POMPageException("Error in Insured Page", e);
		}
		scenariolog.info("Continue without Insured Information for Testdata " + Sno);
	}

	@Then("^enter the \"([^\"]*)\" Then \"([^\"]*)\" And \"([^\"]*)\" And \"([^\"]*)\" And \"([^\"]*)\" in insured information for \"([^\"]*)\"$")
	public void enterInsuredInformation(String insuredName, String insuredMailingAddress,String phoneNumber,String LLC,String LlcPrincipals,String test_data) throws POMPageException, InterruptedException
	{
		
		try
		{
			
			insuredpage.enterInsuredName(insuredName);	
			insuredpage.enterInsuredAddr(insuredMailingAddress);
			FireEventobject.SyncWait(2000);
			
		    insuredpage.insuredAddress.sendKeys(Keys.ARROW_DOWN);
		    FireEventobject.SyncWait(2000);
		   	insuredpage.insuredAddress.sendKeys(Keys.ENTER);
			FireEventobject.ProcessingLoad();
			
			insuredpage.enterPhNumber(phoneNumber);
			insuredpage.llc(insuredpage.llcQn,LLC);
			
			if(LLC.equals("Yes"))
				insuredpage.enterLLCPrincipals(LlcPrincipals);
			
			insuredpage.clickContToLoc();
			FireEventobject.ProcessingLoad();
			//FireEventobject.LocationProcessingLoad();
			
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Insured Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Insured Page", e1);
			}
			errorlog.info("Error in Insured Page", e);
			throw new POMPageException("Error in Insured Page", e);
		}
		
		scenariolog.info("Entering Insured Information for Testdata " + test_data);
	}
	
	@Then("^click Continue to Location button for \"([^\"]*)\"$")
	public void clickContinueToLocation(String test_data) throws POMPageException
	{
		try
		{
			insuredpage.clickContToLoc();
			FireEventobject.ProcessingLoad();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Insured Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Insured Page", e1);
			}
			errorlog.info("Error in clicking Continue to Location button in Insured Page", e);
			throw new POMPageException("Error in clicking Continue to Location button in Insured Page", e);
		}
		
		scenariolog.info("Clicking Continue To Location for Testdata " + test_data);
	}

}