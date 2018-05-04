package com.solartis.test.cucumber.stepdefenitions;


import org.apache.log4j.Logger;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.Excel;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg03_AgencyPage;
import cucumber.api.java.en.Then;

public class Pg03_AgencyPageSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg03_AgencyPage agencypage = new Pg03_AgencyPage();
	Excel excelobj= new Excel();
	
	@Then("^click Continue to Insured without Agency Code for \"([^\"]*)\"$")
	public void continueWithoutAgencyCode(String SNo) throws POMPageException
	{
		try 
		{
		agencypage.contInsured();
		
		AssertCheck("Please Enter Agency/Agent Above",agencypage.emptyAgencyCode);
	    System.out.println("Enter Agency Code - Agency Code is empty");
	    scenariolog.info("Enter Agency Code - Agency Code is empty for testdata  " + SNo);
	    }
		catch (POMEventException e) 
		{
			errorlog.info("Error in Agency Page while continuing without Agency code", e);
			throw new POMPageException("Error in Agency Page while continuing without Agency code", e);
		}
		scenariolog.info("Continue without Agency Code for Testdata" + SNo);
	}
	
	
	@Then("^enter invalid data <\"([^\"]*)\"> as agency code for \"([^\"]*)\"$")
	public void continueWithInvalidAgencyCode(String invalidAgencyCode, String SNo) throws POMPageException
	{
		
		try 
		{
			agencypage.clickLookup(); 
			agencypage.pickAgency(invalidAgencyCode);
			agencypage.contInsured();
			
			AssertCheck("Please Enter Agency/Agent Above",agencypage.emptyAgencyCode);
		    System.out.println("Enter Agency Code - Agency Code is Invalid");
		    scenariolog.info("Enter Agency Code - Agency Code is Invalid for testdata " + SNo);
		    //Thread.sleep(2000);
		}
		catch (POMEventException | InterruptedException e) 
		{
			errorlog.info("Error in Agency Page while continuing with invalid Agency code", e);
			throw new POMPageException("Error in Agency Page while continuing with invalid Agency code", e);
		}
		scenariolog.info("Continue with Invalid Agency Code for Testdata" + SNo);
	}
	
	
	
	@Then("^enter the \"([^\"]*)\" in Agency Page and click Continue To Insured for \"([^\"]*)\"$")
	public void enterAgencyInformation(String agencyCode,String testData) throws POMPageException 
	{
		Pg03_AgencyPage agencypage = new Pg03_AgencyPage();
		
		try 
		{
			
			agencypage.clickLookup(); 
			agencypage.pickAgency(agencyCode);
			agencypage.contInsured();
			FireEventobject.ProcessingLoad();
		  	
		}
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(testData);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in  Agency Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in  Agency Page", e1);
			}
			errorlog.info("Error in Agency Page", e);
			throw new POMPageException("Error in Agency Page", e);
		}
		
		scenariolog.info("Agency code entered for Testdata" + testData);
	}
	
	
	/*@Then("^enter the \"([^\"]*)\" in Agency Page and click Continue To Insured for \"([^\"]*)\"$")
	public void enterAgencyInformation(int agencyCodecolNo,int rowno) throws POMPageException 
	{
				
		try 
		{
			Thread.sleep(2000);
			agencypage.clickLookup();
			
			String agencyCode = excelobj.ExcelRead(rowno, agencyCodecolNo);
			System.out.println("usernameExcel " + agencyCode);
			agencypage.pickAgency(agencyCode);
			agencypage.contInsured();
			Thread.sleep(8000);
		}
		catch (POMEventException | InterruptedException | IOException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(Integer.toString(rowno));
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in  Agency Page", e1);
			}
			throw new POMPageException("Error in Agency Page", e);
		}
		
		scenariolog.info("Agency code entered for Testdata" + rowno);
	}*/
}
