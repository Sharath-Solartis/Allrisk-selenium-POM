package com.solartis.test.cucumber.stepdefenitions;


import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg07_CarrierSelectionPage;
import com.solartis.test.pom.pages.output.Pg07_CarrierSelectionPageOutput;

import cucumber.api.java.en.Then;

public class Pg07_CarrierSelectionSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg07_CarrierSelectionPageOutput CSoP = new Pg07_CarrierSelectionPageOutput();
	Pg07_CarrierSelectionPage cspage = new Pg07_CarrierSelectionPage();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	@Then("^enter effective date \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterEnterEffectiveDate(String effectiveDate, String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.EffectiveDate();
			cspage.datePicker(cspage.datePicker, effectiveDate);								
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering the Effective Date in Carrier Selection Page", e);
			throw new POMPageException("Error in entering the Effective Date in Carrier Selection Page", e);
		}
		scenariolog.info("Effective date in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter policy term \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterPolicyTerm(String policyTerm, String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.selectPolicyTerm(policyTerm);							
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering the Policy Term in Carrier Selection Page", e);
			throw new POMPageException("Error in entering the Policy Term in Carrier Selection Page", e);
		}
		scenariolog.info("Policy Term in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter billing type \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterBillingType(String billingType, String SNo) throws POMPageException  
	{

        try 
		{
			cspage.selectBillType(billingType);						
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering the Billing Type in Carrier Selection Page", e);
			throw new POMPageException("Error in entering the Billing Type in Carrier Selection Page", e);
		}
		scenariolog.info("Billing type in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter quote type \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterQuoteType(String quoteType, String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.selectQuoteType(quoteType);					
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting the Quote Type in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting the Quote Type in Carrier Selection Page", e);
		}
		scenariolog.info("Quote Type in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Loss Settlement Dwelling \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterLossSettlementDwelling(String LossSettlementDwelling, String SNo) throws POMPageException  
	{
		
		try 
		{			
			FireEventobject.ProcessingLoad();
			cspage.selectLossSettlementDwelling(LossSettlementDwelling);
			if(LossSettlementDwelling.equals("ACV"))			
				 FireEventobject.ProcessingLoad();									
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Loss Settlement Dwelling in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Loss Settlement Dwelling in Carrier Selection Page", e);
		}
		scenariolog.info("Loss Settlement Dwelling in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter CoverageA \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageA(String CoverageA, String SNo) throws POMPageException  
	{
		
		try 
		{			
			cspage.clickCoverageA();
			cspage.clearTextboxCoverageA();
			cspage.EnterCoverageA(CoverageA);
			FireEventobject.ProcessingLoad();
			FireEventobject.SyncWait(2000);
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage A in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage A in Carrier Selection Page", e);
		}
		scenariolog.info("CoverageA in Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter policy Form \"([^\"]*)\" and click Getrates in carrier selection page for \"([^\"]*)\"$")
	public void enterPolicyForm(String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
				
				FireEventobject.SyncWait(5000);
				if(objectconditions.ConditionReading("policyForm=HO3|Builders Risk|Vacant - DP1|HO6", policyForm))
				{
					cspage.selectHO3BRDP1VDP1HO6();
				}
				
				else if(objectconditions.ConditionReading("policyForm=HO5|Builders Risk DP3|Vacant - DP3", policyForm))
				{
					cspage.selectHO5BRDP3VDP3();	
				}
				
				else if(objectconditions.ConditionReading("policyForm=HO8", policyForm))
				{
					cspage.selectHO8();	
				}
				
				else if(objectconditions.ConditionReading("policyForm=DP1", policyForm))
				{
					cspage.selectDP1();	
				}		
				
				else if(objectconditions.ConditionReading("policyForm=DP3", policyForm))
				{
					cspage.selectDP3();	
				}
			
				FireEventobject.SyncWait(5000);
				cspage.clickGetRates();
				
				//FireEventobject.ProcessingLoad();
				FireEventobject.ProcessingLoadCSOverlay();
				System.out.println("getrates clicked");
								
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Policy Form in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Policy Form in Carrier Selection Page", e);
		}
		scenariolog.info("Policy form in Carrier Selection has been entered and click get rates for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^close alertbox if displayed in carrier selection page for \"([^\"]*)\"$")
	public void closeAlertBox(String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.alertPresence(cspage.AlertBoxCloseButton);						
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in closing Alert Box if displayed in Carrier Selection Page", e);
			throw new POMPageException("Error in closing Alert Box if displayed in Carrier Selection Page", e);
		}
		scenariolog.info("Alert box has been closed if it is displayed for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter coverageB \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageB(String CoverageB, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm))
			{
				/*cspage.clickCoverageB();
				cspage.clearTextboxCoverageB();*/
				cspage.EnterCoverageB(CoverageB);				
			}						
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage B in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage B in Carrier Selection Page", e);
		}
		scenariolog.info("Coverage B in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter coverageC \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageC(String CoverageC, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm))
			{				
				/*cspage.clickCoverageC();
				cspage.clearTextboxCoverageC();*/
				cspage.EnterCoverageC(CoverageC);				
			}	
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage C in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage C in Carrier Selection Page", e);
		}
		scenariolog.info("Coverage C in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter CoverageD \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageD(String CoverageD, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3", policyForm))
			{				
				/*cspage.clickCoverageD();
				cspage.clearTextboxCoverageD();*/
				cspage.EnterCoverageD(CoverageD);				
			}		
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage D in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage D in Carrier Selection Page", e);
		}
		scenariolog.info("Coverage D in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Loss Settlement Contents \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterLossSettlementContents(String LossSettlementContents, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				cspage.selectLossSettlementContents(LossSettlementContents);				
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Loss Settlement Contents in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Loss Settlement Contents in Carrier Selection Page", e);
		}
		scenariolog.info("Loss Settlement Contents in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}	
	
	
	
	@Then("^enter AllOtherPerils Deductible \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterAllOtherPerilsDeductible(String AllOtherPerilsDeductible, String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.selectAllOtherPerilsDeductible(AllOtherPerilsDeductible);			
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting AOP Deductible in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting AOP Deductible in Carrier Selection Page", e);
		}
		scenariolog.info("AOP Deductible in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Wind Deductible \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterWindDeductible(String WindDeductible, String SNo) throws POMPageException  
	{
		
		try 
		{
			cspage.selectWindDeductible(WindDeductible);			
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Wind Deductible in Carrier Selection Page", e);
			throw new POMPageException("Error in entering Wind Deductible in Carrier Selection Page", e);
		}
		scenariolog.info("Wind Deductible in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}	
	
	
	
	@Then("^enter Dwelling Extended Replacement Cost \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterDwellingExtendedReplacementCost(String DwellingExtendedReplacementCost, String policyForm, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm))
			{
				cspage.selectDwellingExtendedReplacementCost(DwellingExtendedReplacementCost);				
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Dwelling ERC in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Dwelling ERC in Carrier Selection Page", e);
		}
		scenariolog.info("Dwelling Extended Replacement Cost in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Water Backup \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterWaterBackup(String WaterBackup, String policyForm, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3", policyForm))
			{
				cspage.selectWaterBackup(WaterBackup);				
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Water Backup in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Water Backup in Carrier Selection Page", e);
		}
		scenariolog.info("Water Backup in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Ordinance Law Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterOrdinanceOrLawCoverageHO(String OrdinanceOrLawCoverage,String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				cspage.selectOrdinanceOrLawCoverage(OrdinanceOrLawCoverage);						
			}
			else if(objectconditions.ConditionReading("policyForm=DP3", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc|Everest Indemnity Insurance Company", carrierName))
			{
				cspage.selectOrdinanceOrLawCoverage(OrdinanceOrLawCoverage);			
			}
			
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Ordinance Law Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Ordinance Law Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Ordinance Law Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Vandalism Malicious Mischief \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterVandalismAndMaliciousMischief(String VandalismAndMaliciousMischief, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Everest Indemnity Insurance Company", carrierName))
			{
				cspage.selectVandalismAndMaliciousMischief(VandalismAndMaliciousMischief);				
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Vandalism Malicious Mischief in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Vandalism Malicious Mischief in Carrier Selection Page", e);
		}
		scenariolog.info("Vandalism And Malicious Mischief in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Theft Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterTheftCoverage(String TheftCoverage, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				cspage.selectTheftCoverage(TheftCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Theft Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Theft Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Theft Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	@Then("^enter Limited Mold Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterLimitedMoldCoverage(String LimitedMoldCoverage, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				cspage.selecLimitedMoldCoverage(LimitedMoldCoverage);			
			}
			else if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3|DP1", policyForm) && objectconditions.ConditionReading("carrierName=Everest Indemnity Insurance Company|Canopius US Insurance Inc|1126 Evanston Insurance Company", carrierName))
 			{
				cspage.selecLimitedMoldCoverage(LimitedMoldCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Limited Mold Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Limited Mold Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Limited Mold Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Identity Fraud \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterIdentityFraud(String IdentityFraud, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
			{
				cspage.selectIdentityFraud(IdentityFraud);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Identity Fraud in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Identity Fraud in Carrier Selection Page", e);
		}
		scenariolog.info("Identity Fraud in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Green Upgrades Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterGreenUpgradesCoverage(String GreenUpgradesCoverage, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				cspage.selectGreenUpgradesCoverage(GreenUpgradesCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Green Upgardes Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Green Upgardes Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Green Upgrades Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}	
	
	
	
	@Then("^enter GolfCart Collision Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterGolfCartCollisionCoverage(String GolfCartCollisionCoverage, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				cspage.selectGolfCartCollisionCoverage(GolfCartCollisionCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting GolfCart Collision Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting GolfCart Collision Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("GolfCart Collision Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter LossAssessment Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterLossAssessmentCoverage(String LossAssessmentCoverage, String SNo, String policyForm, String carrierName) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				cspage.selectLossAssessmentCoverage(LossAssessmentCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting LossAssessment Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting LossAssessment Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Loss Assessment Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Personal Injury Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterPersonalInjuryCoverage(String PersonalInjuryCoverage, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				cspage.selectPersonalInjuryCoverage(PersonalInjuryCoverage);			
			}
			else if(objectconditions.ConditionReading("policyForm=HO8", policyForm) && objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A", carrierName))
			{
				cspage.selectPersonalInjuryCoverage(PersonalInjuryCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Personal Injury Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Personal Injury Coverage in Carrier Selection Page", e);
		} 
		scenariolog.info("Personal Injury Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter liability limit options \"([^\"]*)\" And \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterLiabilityLimit(String PersonalLiability, String MedicalPaymentstoOthers, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				cspage.selectPersonalLiability(PersonalLiability);			
			}
			
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				if(PersonalLiability.equals("None"))
				{
					cspage.selectMedicalPaymentstoOthers2(MedicalPaymentstoOthers);
				}
				else
				{
					cspage.selectMedicalPaymentstoOthers1(MedicalPaymentstoOthers);
				}
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Liability Limit Options in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Liability Limit Options in Carrier Selection Page", e);
		}
		scenariolog.info("liability limit in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Premises Coverage for Owners \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterPremisesCoverageforOwners(String PremisesCoverageforOwners, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				cspage.selectPremisesCoverageforOwners(PremisesCoverageforOwners);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Premises Coverage for Owners in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Premises Coverage for Owners in Carrier Selection Page", e);
		}
		scenariolog.info("Premises Coverage for Owners in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Earthquake Coverage \"([^\"]*)\" for \"([^\"]*)\" in carrier selection page for \"([^\"]*)\"$")
	public void enterEarthquakeCoverage(String EarthquakeCoverage, String State, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("State=SC", State))
			{
				cspage.selectEarthquakeCoverage(EarthquakeCoverage);			
			}
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Earthquake Coverage in Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Earthquake Coverage in Carrier Selection Page", e);
		}
		scenariolog.info("Earthquake Coverage in Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^click refresh premium in carrier selection page for \"([^\"]*)\"$")
	public void clickRefreshPremium(String SNo) throws POMPageException  
	{
		
		try 
		{			
			FireEventobject.ProcessingLoad();
			FireEventobject.ThreadWait(5000);
			cspage.clickRefreshPremiumButton();			
			
			//FireEventobject.ProcessingLoadStickyForm();
			FireEventobject.ProcessingLoadCSOverlay();
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in clicking Refresh Premium Button in Carrier Selection Page", e);
			throw new POMPageException("Error in clicking Refresh Premium Button in Carrier Selection Page", e);
		}
		scenariolog.info("Refresh Premium Button has been clicked for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^get output values for \"([^\"]*)\" for \"([^\"]*)\" and store those in DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void getOutputvalues(String carrierName, String State, String DBName, String SNo) throws POMPageException  
	{
		
		try 
		{
			DatabaseOperation DB = FireEventobject.establishDBConnection();
			
			CSoP.CarrierSelectionOutput(carrierName, cspage.carriers, State, SNo);
			
			HashMap<Object, Object> resultMap = CSoP.getCarrierSelectionPageOutput();
			for (Map.Entry<Object,Object> entry : resultMap.entrySet()) 
			{
					DB.InserValueWithRowNumber(DBName, entry.getKey().toString(), entry.getValue().toString(), Integer.parseInt(SNo));
					System.out.println("Key is :"+entry.getKey());
					System.out.println("Value is :"+entry.getValue());
			}

		}
		catch (POMEventException | NumberFormatException | DatabaseException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in getting output values in Carrier Selection Page", e);
			throw new POMPageException("Error in getting output values in Carrier Selection Page", e);
		}
		scenariolog.info("Output Values have beenn written in DB for Carrier Selection Page for Testdata " + SNo);
			
	}
	
	
	
	@Then("^click Create Quote button for \"([^\"]*)\" for \"([^\"]*)\"$")
	public void clickCreateQuote(String carrierName, String SNo) throws POMPageException  
	{
		try 
		{	
			int tablerow = 0;
			System.out.println("carrier size   " + cspage.carriers.size());
			for( int i=0; i < cspage.carriers.size(); i++)
			{
				
				if((((WebElement) cspage.carriers.get(i)).getText()).equals(carrierName))
				{
					System.out.println("Carrier Names :"+ cspage.carriers.get(i).getText());
					tablerow =i+1;
					System.out.println("tableRow   " + tablerow);					
					driver.findElement(By.xpath("id('topgrid')/tbody/tr[5]/td["+tablerow+"]//span//span/button")).click();
				}
			}					
			FireEventobject.ProcessingLoad();
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection Page", e1);
			}
			errorlog.info("Error in clicking Create Quote Button in Carrier Selection Page", e);
			throw new POMPageException("Error in clicking Create Quote Button in Carrier Selection Page", e);
	    }
		scenariolog.info("Create Quote button has been clicked for Testdata " + SNo);
			
	}
	
	
}