package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.FindPolicyConsole;

import cucumber.api.java.en.Then;

public class FindPolicySD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	FindPolicyConsole findpolicy = new FindPolicyConsole();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^enter \"([^\"]*)\" in the By Policy Number option in the Find Policy console and click Search button and click the Policy Number link for \"([^\"]*)\"$")
	public void searchByPolicyNumber(String PolicyNumber, String SNo) throws POMPageException
	{
		try
		{
			findpolicy.findByPolicyNumber(PolicyNumber);
			Thread.sleep(5000);
			findpolicy.clickSearchButton();
			Thread.sleep(10000);
			findpolicy.clickPolicyNumberLink(PolicyNumber);
		}
		catch(InterruptedException | POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Find Policy Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Find Policy Page", e1);
			}
			errorlog.info("Error in Find Policy Page", e);
			throw new POMPageException("Error in Find Policy Page", e);
		}
		scenariolog.info("Insured has been found through Find Policy console for " + SNo);
	}

}
