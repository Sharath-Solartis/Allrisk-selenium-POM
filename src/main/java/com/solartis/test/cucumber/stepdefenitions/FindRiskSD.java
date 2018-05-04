package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.FindRiskConsole;

import cucumber.api.java.en.Then;

public class FindRiskSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	FindRiskConsole findrisk = new FindRiskConsole();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^enter \"([^\"]*)\" in the By Insured option in Find Risk console and click Search button and click the Risk Location link for \"([^\"]*)\"$")
	public void findByInsuredName(String insuredName, String SNo) throws POMPageException
	{
		try
		{
			findrisk.findByInsured(insuredName);
			Thread.sleep(5000);
			findrisk.clickSearchButton();
			Thread.sleep(5000);
			findrisk.clickSearchResult1();
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Find Risk Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Find Risk Page", e1);
			}
			errorlog.info("Error in Find Risk Page", e);
			throw new POMPageException("Error in Find Risk Page", e);
		}
		scenariolog.info("Insured has been found through Find Risk console for " + SNo);
	}

}
