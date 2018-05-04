package com.solartis.test.cucumber.stepdefenitions;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.FindInsuredConsole;
import com.solartis.test.pom.pages.input.FindPolicyConsole;
import com.solartis.test.pom.pages.input.FindQuoteConsole;
import com.solartis.test.pom.pages.input.FindRiskConsole;
import com.solartis.test.pom.pages.input.Pg02_HomePage;

import cucumber.api.java.en.Then;

public class Pg02_HomePageSD extends PomEventsMethodDefinition
{
	
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg02_HomePage homepage = new Pg02_HomePage();
	FindInsuredConsole findinsured = new FindInsuredConsole();
	FindRiskConsole findrisk = new FindRiskConsole();
	FindQuoteConsole findquote = new FindQuoteConsole();
	FindPolicyConsole findpolicy = new FindPolicyConsole();
	
	
	@Then("^validate home page title \"([^\"]*)\" for \"([^\"]*)\"$")
	public void validateHomePageTitle(String URL, String test_data) throws Throwable
	{
		
		System.out.println("Checking URL");
		assertEquals(URL, driver.getCurrentUrl());
		scenariolog.info("Checking URL in Home page for Testdata " + test_data);
	}
	
	

	@Then("^click on Homeowner / Dwelling / Condo Quote button for \"([^\"]*)\"$")
	public void clickOnHomeownerOrDwellingOrCondoQuoteButton(String test_data) throws Throwable 
	{
		
		try
		{
			//FireEventobject.SyncWait(5000);
			homepage.clickHoDpButton();
			
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Home Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e1);
			}
			errorlog.info(" Error in clicking Homeowner / Dwelling / Condo Quote Button in Home Page ", e);
			throw new POMPageException(" Error in clicking Homeowner / Dwelling / Condo Quote Button in Home Page ", e);
		}
		
		scenariolog.info("Clicking Homeowner / Dwelling / Condo Quote button for Testdata " + test_data);
	}
	
	@Then("^click By Insured button for \"([^\"]*)\"$")
	public void clickByInsuredButton(String test_data) throws Throwable
	{
		try
		{
			findinsured.clickByInsuredButton();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Home Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e1);
			}
			errorlog.info(" Error in clicking By Insured Button in Home Page ", e);
			throw new POMPageException(" Error in clicking By Insured Button in Home Page ", e);
		}
		
		scenariolog.info("Clicking By Insured button for Testdata " + test_data);
	}
	
	@Then("^click By Risk button for \"([^\"]*)\"$")
	public void clickByRiskButton(String test_data) throws Throwable
	{
		try
		{
			findrisk.clickByRiskButton();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Home Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e1);
			}
			errorlog.info(" Error in clicking By Risk Button in Home Page ", e);
			throw new POMPageException(" Error in clicking By Risk Button in Home Page ", e);
		}
		
		scenariolog.info("Clicking By Risk button for Testdata " + test_data);
	}
	
	@Then("^click By Quote button for \"([^\"]*)\"$")
	public void clickByQuoteButton(String test_data) throws Throwable
	{
		try
		{
			findquote.clickByQuoteButton();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Home Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e1);
			}
			errorlog.info(" Error in clicking By Quote Button in Home Page ", e);
			throw new POMPageException(" Error in clicking By Quote Button in Home Page ", e);
		}
		
		scenariolog.info("Clicking By Quote button for Testdata " + test_data);
	}
	
	@Then("^click By Policy button for \"([^\"]*)\"$")
	public void clickByPolicyButton(String test_data) throws Throwable
	{
		try
		{
			findpolicy.clickByPolicyButton();
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Home Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Home Page", e1);
			}
			errorlog.info(" Error in clicking By Policy Button in Home Page ", e);
			throw new POMPageException(" Error in clicking By Policy Button in Home Page ", e);
		}
		
		scenariolog.info("Clicking By Policy button for Testdata " + test_data);
	}
	
}
