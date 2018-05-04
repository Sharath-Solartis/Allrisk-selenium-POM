package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.FindInsuredConsole;

import cucumber.api.java.en.Then;

public class FindInsuredSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	FindInsuredConsole findinsured = new FindInsuredConsole();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^enter \"([^\"]*)\" in the By Insured option in Find Insured console and click Search button and click the Insured Name link for \"([^\"]*)\"$")
	public void searchByInsuredName(String insuredName, String SNo) throws POMPageException
	{
		try
		{
			findinsured.findByInsured(insuredName);
			Thread.sleep(5000);
			findinsured.clickSearchButton();
			Thread.sleep(5000);
			findinsured.clickInsuredNameLink(insuredName);
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Find Insured Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Find Insured Page", e1);
			}
			errorlog.info("Error in Find Insured Page", e);
			throw new POMPageException("Error in Find Insured Page", e);
		}
		scenariolog.info("Insured has been found through Find Insured console for " + SNo);
	}
	
}
