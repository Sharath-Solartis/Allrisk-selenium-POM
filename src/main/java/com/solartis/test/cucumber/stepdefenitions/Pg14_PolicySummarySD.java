package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.Pg14_PolicySummary;

import cucumber.api.java.en.Then;

public class Pg14_PolicySummarySD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	Pg14_PolicySummary policy = new Pg14_PolicySummary();
	FireEvent FireEventobject = new FireEvent();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^check the Post Bound Checklist and Issue Policy for \"([^\"]*)\"$")
	public void issuePolicy(String SNo) throws POMPageException
	{
		try
        {
			policy.selectSignedApplicationReceived();
			policy.selectDecliningCarrierFormReceived();
			policy.selectApplicationDataEntryCompleted();
			policy.savePostboundChecklist();
			FireEventobject.ProcessingLoad();
			
			policy.clickIssuePolicy();
			FireEventobject.ProcessingLoad();
        }
        catch(POMEventException e)
        {
            try 
            {
                FireEventobject.takeScreenshot(SNo);
            } 
            catch (POMEventException e1) 
            {
            	errorlog.info("Error in Taking ScreenShot in Policy Summary Page", e1);
                throw new POMPageException("Error in Taking ScreenShot in Policy Summary Page", e1);
            }
            errorlog.info("Error in Post Bound Checklist and Issue Policy in Location Page", e);
            throw new POMPageException("Error in Post Bound Checklist and Issue Policy in Location Page", e);
        }
		
	}

}
