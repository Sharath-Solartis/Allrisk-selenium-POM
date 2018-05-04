package com.solartis.test.cucumber.stepdefenitions;


import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg17_EndoCarrierSelectionPage;
import com.solartis.test.pom.pages.output.Pg17_EndoCSPOutput;

import cucumber.api.java.en.Then;


public class Pg17_EndoCarrierSelectionPageSD extends PomEventsMethodDefinition
{

	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg17_EndoCSPOutput EndoCSoP = new Pg17_EndoCSPOutput();
	Pg17_EndoCarrierSelectionPage endocspage = new Pg17_EndoCarrierSelectionPage();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	
	@Then("^enter Endorsements CoverageA \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageA(String CoverageAEndo, String SNo) throws POMPageException  
	{
		
		try 
		{
			FireEventobject.ProcessingLoad();
			FireEventobject.ProcessingLoadCSOverlay();
			FireEventobject.EndoOverLay();
			
			//FireEventobject.SyncWait(2000);
			FireEventobject.ThreadWait(5000);
			endocspage.clickCoverageAEndo();
			endocspage.clearTextboxCoverageAEndo();
			endocspage.EnterCoverageAEndo(CoverageAEndo);
			
			FireEventobject.ProcessingLoad();
			FireEventobject.ProcessingLoadCSOverlay();
			FireEventobject.EndoOverLay();
			FireEventobject.ThreadWait(25000);
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage A in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage A in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("CoverageA in Endorsements Carrier Selection has been entered for Testdata " + SNo);
			
	}
	
	@Then("^enter Endorsements coverageB \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageB(String CoverageBEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm))
			{
				endocspage.clickCoverageBEndo();
				endocspage.clearTextboxCoverageBEndo();
				endocspage.EnterCoverageBEndo(CoverageBEndo);
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage B in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage B in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Coverage B in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements coverageC \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageC(String CoverageCEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm))
			{				
				endocspage.clickCoverageCEndo();
				endocspage.clearTextboxCoverageCEndo();
				endocspage.EnterCoverageCEndo(CoverageCEndo);
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage C in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage C in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Coverage C in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements coverageD \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterCoverageD(String CoverageDEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3", policyForm))
			{
				endocspage.clickCoverageDEndo();
				endocspage.clearTextboxCoverageDEndo();
				endocspage.EnterCoverageDEndo(CoverageDEndo);
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Coverage D in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in entering Coverage D in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Coverage D in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements Loss Settlement Contents value \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterLossSettlementContents(String LossSettlementContentsEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				endocspage.selectLossSettlementContentsEndo(LossSettlementContentsEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Loss Settlement Contents in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Loss Settlement Contents in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Loss Settlement Contents in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements AllOtherPerils Deductible \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterAllOtherPerilsDeductible(String AllOtherPerilsDeductibleEndo, String SNo) throws POMPageException  
	{
		
		try 
		{
			endocspage.selectAllOtherPerilsDeductibleEndo(AllOtherPerilsDeductibleEndo);
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting AOP Deductible in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting AOP Deductible in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("AOP Deductible in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Wind Deductible \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterWindDeductible(String WindDeductibleEndo, String SNo) throws POMPageException  
	{
		
		try 
		{
			endocspage.selectWindDeductibleEndo(WindDeductibleEndo);			
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in entering Wind Deductible in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in entering Wind Deductible in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Wind Deductible in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements Dwelling Extended Replacement Cost \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterDwellingExtendedReplacementCost(String DwellingExtendedReplacementCostEndo, String policyForm, String SNo) throws POMPageException  
	{		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm))
			{
				endocspage.selectDwellingExtendedReplacementCostEndo(DwellingExtendedReplacementCostEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Dwelling ERC in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Dwelling ERC in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Dwelling Extended Replacement Cost in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements Water Backup \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterWaterBackup(String WaterBackupEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3", policyForm))
			{
				endocspage.selectWaterBackupEndo(WaterBackupEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Water Backup in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Water Backup in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Water Backup in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Ordinance Law Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterOrdinanceOrLawCoverageHO(String OrdinanceOrLawCoverageEndo,String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				endocspage.selectOrdinanceOrLawCoverageEndo(OrdinanceOrLawCoverageEndo);			
			}
			else if(objectconditions.ConditionReading("policyForm=DP3", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc|Everest Indemnity Insurance Company", carrierName))
			{
				endocspage.selectOrdinanceOrLawCoverageEndo(OrdinanceOrLawCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Ordinance Law Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Ordinance Law Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Ordinance Law Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements Vandalism Malicious Mischief \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterVandalismAndMaliciousMischief(String VandalismAndMaliciousMischiefEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Everest Indemnity Insurance Company", carrierName))
			{
				endocspage.selectVandalismAndMaliciousMischiefEndo(VandalismAndMaliciousMischiefEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Vandalism Malicious Mischief in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Vandalism Malicious Mischief in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Vandalism And Malicious Mischief in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Theft Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterTheftCoverage(String TheftCoverageEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				endocspage.selectTheftCoverageEndo(TheftCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Theft Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Theft Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Theft Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	@Then("^enter Endorsements Limited Mold Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in  Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterLimitedMoldCoverage(String LimitedMoldCoverageEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				endocspage.selecLimitedMoldCoverageEndo(LimitedMoldCoverageEndo);			
			}
			else if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3|DP1", policyForm) && objectconditions.ConditionReading("carrierName=Everest Indemnity Insurance Company|Canopius US Insurance Inc|1126 Evanston Insurance Company", carrierName))
 			{
				endocspage.selecLimitedMoldCoverageEndo(LimitedMoldCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Limited Mold Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Limited Mold Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Limited Mold Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Identity Fraud \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterIdentityFraud(String IdentityFraudEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
			{
				endocspage.selectIdentityFraudEndo(IdentityFraudEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Identity Fraud in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Identity Fraud in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Identity Fraud in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Green Upgrades Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterGreenUpgradesCoverage(String GreenUpgradesCoverageEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				endocspage.selectGreenUpgradesCoverageEndo(GreenUpgradesCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Green Upgardes Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Green Upgardes Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Green Upgrades Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements GolfCart Collision Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterGolfCartCollisionCoverage(String GolfCartCollisionCoverageEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				endocspage.selectGolfCartCollisionCoverageEndo(GolfCartCollisionCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting GolfCart Collision Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting GolfCart Collision Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("GolfCart Collision Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements LossAssessment Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterLossAssessmentCoverage(String LossAssessmentCoverageEndo, String SNo, String policyForm, String carrierName) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				endocspage.selectLossAssessmentCoverageEndo(LossAssessmentCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting LossAssessment Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting LossAssessment Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Loss Assessment Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Personal Injury Coverage \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterPersonalInjuryCoverage(String PersonalInjuryCoverageEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London;carrierName<>1126 Evanston Insurance Company", carrierName))
			{
				endocspage.selectPersonalInjuryCoverageEndo(PersonalInjuryCoverageEndo);			
			}
			else if(objectconditions.ConditionReading("policyForm=HO8", policyForm) && objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A", carrierName))
			{
				endocspage.selectPersonalInjuryCoverageEndo(PersonalInjuryCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Personal Injury Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Personal Injury Coverage in Endorsements Carrier Selection Page", e);
		} 
		scenariolog.info("Personal Injury Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements liability limit options \"([^\"]*)\" And \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterLiabilityLimit(String PersonalLiabilityEndo, String MedicalPaymentstoOthersEndo, String policyForm, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				endocspage.selectPersonalLiabilityEndo(PersonalLiabilityEndo);			
			}
			
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				if(PersonalLiabilityEndo.equals("None"))
				{
					endocspage.selectMedicalPaymentstoOthers2Endo(MedicalPaymentstoOthersEndo);
				}
				else
				{
					endocspage.selectMedicalPaymentstoOthers1Endo(MedicalPaymentstoOthersEndo);
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Liability Limit Options in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Liability Limit Options in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("liability limit in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^enter Endorsements Premises Coverage for Owners \"([^\"]*)\" for \"([^\"]*)\" And \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterPremisesCoverageforOwners(String PremisesCoverageforOwnersEndo, String policyForm, String carrierName, String SNo) throws POMPageException  
	{
		
		try 
		{
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				endocspage.selectPremisesCoverageforOwnersEndo(PremisesCoverageforOwnersEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Premises Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Premises Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Premises Coverage for Owners in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^enter Endorsements Earthquake Coverage \"([^\"]*)\" for \"([^\"]*)\" in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void enterEarthquakeCoverage(String EarthquakeCoverageEndo, String State, String SNo) throws POMPageException  
	{
		
		
		try 
		{
			if(objectconditions.ConditionReading("State=SC", State))
			{
				endocspage.selectEarthquakeCoverageEndo(EarthquakeCoverageEndo);			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in selecting Earthquake Coverage in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in selecting Earthquake Coverage in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Earthquake Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	@Then("^click refresh premium in Endorsements carrier selection page for \"([^\"]*)\"$")
	public void clickRefreshPremium(String SNo) throws POMPageException  
	{
		
		try 
		{
			FireEventobject.ProcessingLoad();
			FireEventobject.SyncWait(5000);
			endocspage.clickRefreshPremiumButtonEndo();	
			System.out.println("clicked refresh premium button");
			//FireEventobject.SyncWait(1000);
			//FireEventobject.ProcessingLoadStickyForm();
			FireEventobject.ProcessingLoadCSOverlay();
			FireEventobject.ThreadWait(10000);
		}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in clicking Refresh Premium Button in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in clicking Refresh Premium Button in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Earthquake Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);
			
	}
	
	
	
	
	@Then("^get output values from Endorsements for \"([^\"]*)\" for \"([^\"]*)\" and store those in DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void getOutputvalues(String carrierName, String State, String DBName, String SNo) throws POMPageException  
	{
		
		try 
		{
			DatabaseOperation DB = FireEventobject.establishDBConnection();
			
			EndoCSoP.endoCarrierSelectionOutput(carrierName, endocspage.carriers, State, SNo);
			
			HashMap<Object, Object> resultMap = EndoCSoP.getEndoCarrierSelectionPageOutput();
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in getting output values in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in getting output values in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Output Values of Endorsements have beenn written in DB for Carrier Selection Page for Testdata " + SNo);
			
	}
	
	
	
	@Then("^click Coverage Save button in Endorsements for \"([^\"]*)\" for \"([^\"]*)\"$")
	public void clickCoverageSave(String carrierName, String SNo) throws POMPageException  
	{
		try 
		{			
			endocspage.clickcontinueToEndoSummary();			
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
				errorlog.info("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Carrier Selection Page", e1);
			}
			errorlog.info("Error in clicking Coverages Save Button in Endorsements Carrier Selection Page", e);
			throw new POMPageException("Error in clicking Coverages Save Button in Endorsements Carrier Selection Page", e);
		}
		scenariolog.info("Earthquake Coverage in Endorsements Carrier Selection Page has been entered for Testdata " + SNo);	
	}
	
	
}
