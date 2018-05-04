package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.pages.input.Pg16_EndoAdditionalInterestPage;
import com.solartis.test.pom.pages.input.Pg15_EndorsementsPage;
import cucumber.api.java.en.Then;

public class Pg16_EndorsementsAdditionalInterestSD 
{

	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg16_EndoAdditionalInterestPage endoAddInterestPage = new Pg16_EndoAdditionalInterestPage();
	Pg15_EndorsementsPage endoPage = new Pg15_EndorsementsPage();
	
	
	@Then("^enter the Additional Interest Type \"([^\"]*)\" Then Additional Interest Name \"([^\"]*)\" in Endorsements page for \"([^\"]*)\"$")
	public void proceedEndorsements(String endoAdditionalInterestType, String endoAdditionalInterestName, String Sno) throws POMPageException
	{
		
		try
		{
			if(endoAdditionalInterestType.equals("Mortgagee") | endoAdditionalInterestType.equals("Loss Payee") | endoAdditionalInterestType.equals("Others"))
			{
				endoAddInterestPage.clickEndoAddButton();
				FireEventobject.ProcessingLoad();
				
				endoAddInterestPage.selectEndoAdditionalInterestType(endoAdditionalInterestType);
				endoAddInterestPage.enterEndoAdditionalInterestName(endoAdditionalInterestName);		
				endoAddInterestPage.clickEndoSaveButton();
				FireEventobject.ProcessingLoad();
			}
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
			errorlog.info("Error in entering Addtional Interest data in Endorsements Page", e);
			throw new POMPageException("Error in entering Addtional Interest data in Endorsements Page", e);
		}
		scenariolog.info("Error while Entering Additional Interest in Endorsements Page for Testdata " + Sno);
    }
	
	
	
	
	@Then("^Click Continue to coverages button in Endorsements for \"([^\"]*)\"$")
	public void clickContinueToCoveragesPage(String Sno) throws POMPageException
	{
		
		try
		{
			endoPage.clickContinueToCoverages();
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
			errorlog.info("Error in clicking Continue to coverages button in Endorsements Page", e);
			throw new POMPageException("Error in clicking Continue to coverages button in Endorsements Page", e);
		}
		scenariolog.info("Error while Entering Additional Interest in Endorsements Page for Testdata " + Sno);
    }
	
	
}
