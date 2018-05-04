package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.FindQuoteConsole;

import cucumber.api.java.en.Then;

public class FindQuoteSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	FindQuoteConsole findquote = new FindQuoteConsole();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^enter \"([^\"]*)\" in the By Quote Number option in Find Quote console and click Search button and click the Quote Number link for \"([^\"]*)\"$")
	public void searchByQuoteNumber(String QuoteNumber, String SNo) throws POMPageException
	{
		try
		{
			findquote.findByQuoteNumber(QuoteNumber);
			Thread.sleep(5000);
			findquote.clickSearchButton();
			Thread.sleep(5000);
			findquote.clickQuoteNumberLink(QuoteNumber);
			Thread.sleep(12000);
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Find Quote Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Find Quote Page", e1);
			}
			errorlog.info("Error in Find Quote Page", e);
			throw new POMPageException("Error in Find Quote Page", e);
		}
		scenariolog.info("Insured has been found through Find Quote console for " + SNo);
	}

}
