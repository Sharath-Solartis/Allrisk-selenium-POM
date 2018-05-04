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
import com.solartis.test.pom.pages.output.Pg09_UWWorksheetPageOutput;

import cucumber.api.java.en.Then;


public class Pg09_UWWorksheetSD
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	Pg09_UWWorksheetPageOutput uwpage = new Pg09_UWWorksheetPageOutput();
	FireEvent FireEventobject = new FireEvent();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	@Then("^get values from underwriting worksheet for \"([^\"]*)\" And \"([^\"]*)\" And \"([^\"]*)\" And for State \"([^\"]*)\" and write those in DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void getUWSheetValues(String policyForm, String carrierName, String WindDeductible, String State, String DBName, String SNo) throws POMPageException 
	{
		
		try
		{
			
			  DatabaseOperation DB = FireEventobject.establishDBConnection();
			  Thread.sleep(25000);
			  uwpage.clickUWworkSheetButton();
			  Thread.sleep(15000);
			  
			  uwpage.getBaseNonWindRate();
		      
		      uwpage.getConstructionTypeFactorNW();
		      
		      uwpage.getOccupancyFactorNW();
		      
		      uwpage.getAgeOfDwellingFactorNW();
		      
		      uwpage.getAgeOfRoofFactorNW();
		      
		      uwpage.getCovABandCreditFactorNW();
		      
		      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm))
		      {
		    	  uwpage.getExtReplacementCostFactorNW();
		      }
		      
		      uwpage.getNumOfFamiliesFactorNW();
			  
		      uwpage.getProtectionClassFactorNW();
		      
		      uwpage.getAlarmsFactorNW();
		      
		      uwpage.getAOPFactorNW();
		      
		      uwpage.getTotalNWPropertyRate();
		      
		      uwpage.getTotalNWPropertyPremium();
		      
		      
		      if(objectconditions.ConditionReading("WindDeductible<>Wind Excluded", WindDeductible))
		      {
		    	  
				      if(objectconditions.ConditionReading("carrierName<>1126 Evanston Insurance Company;carrierName<>Gen Star $250k+ coverage A;carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getBaseWindRate();
						      
						      uwpage.getConstructionTypeFactorW();
						      
						      uwpage.getOccupancyFactorW();
						      
						      uwpage.getAgeOfDwellingFactorW();
						      
						      uwpage.getAgeOfRoofFactorW();
						      
						      uwpage.getCovABandCreditFactorW();
						      
						      uwpage.getDistanceToCoastFactorW();
						      
						      uwpage.getRoofShapeFactor();
						      
						      uwpage.getRoofCoveringFactor();
						      
						      uwpage.getRoofAnchorFactor();
						      
						      uwpage.getOpeningProtectionFactor();
						      
						      uwpage.getWindDeductibleFactor();
						      
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>1126 Evanston Insurance Company;carrierName<>Gen Star $250k+ coverage A;carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getExtReplacementFactorW();
				      }
				      
				      if(objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A|Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getGrossAAL();
						      
						      uwpage.getTCQAALFactor();
				      }
		      
				      if(objectconditions.ConditionReading("carrierName<>1126 Evanston Insurance Company", carrierName))
				      {
						      uwpage.getTotalWPropertyRate();      
				      }
				      
				      uwpage.getTotalWPropertyPremium();
				      
				      if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
						      uwpage.getTheftCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLimitedMoldCoveragePremium1();
				      }
				      
				      else if(objectconditions.ConditionReading("policyForm=HO3|DP3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLimitedMoldCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3", policyForm))
				      {
						      uwpage.getWaterBackUpCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getIdentityFraudCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getOrdinanceLawCoveragePremium1();
				      }
				      
				      else if(objectconditions.ConditionReading("policyForm=DP3", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc|Everest Indemnity Insurance Company", carrierName))
				      {
						      uwpage.getOrdinanceLawCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLossAssessmentCoveragePremium1();
						      
						      uwpage.getGreenUpgradesCoveragePremium1();
						      
						      uwpage.getGolfCartCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("State=SC", State))
				      {
						      uwpage.getEarthquakeCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Everest Indemnity Insurance Company", carrierName))
				      {
						      uwpage.getVandalismAndMaliciousCoveragePremium1();
				      }
				      
				      uwpage.getTotalOptionalCoveragesPremium1();
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
				      {
						      uwpage.getLiabilityPremium1();
						      
						      uwpage.getMedicalPaymentsPremium1();
				      }
				      
				      
				      if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
						      uwpage.getPremisesCoverageForOwners1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO8", policyForm) && objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A", carrierName))
				      {
						      uwpage.getPersonalInjuryCoveragePremium1();
				      }
				      
				      else if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getPersonalInjuryCoveragePremium1();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
				      {
						      uwpage.getTotalLiabilityPremium1();
				      }
				      else if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
					    	  uwpage.getPremisesCoverageForBRandVacant1();
				      }
				      
				      uwpage.getBaseRateTotal1();
				      
				      uwpage.getMaxCreditCalculation1();
				      
				      uwpage.getTotalPropertyPremium1();
				      
				      uwpage.getMaxCreditOrCalculatedRate1();
				          
				      uwpage.getTotalPolicyPremium1();
		      }
		      
		      
		      
		      
		      
		      else if(objectconditions.ConditionReading("WindDeductible=Wind Excluded", WindDeductible))
		      {
		    	  	
			    	  if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
						      uwpage.getTheftCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLimitedMoldCoveragePremium2();
				      }
				      
				      else if(objectconditions.ConditionReading("policyForm=HO3|DP3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLimitedMoldCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3", policyForm))
				      {
						      uwpage.getWaterBackUpCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getIdentityFraudCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getOrdinanceLawCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=DP3", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc|Everest Indemnity Insurance Company", carrierName))
				      {
						      uwpage.getOrdinanceLawCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
				      {
						      uwpage.getLossAssessmentCoveragePremium2();
						      
						      uwpage.getGreenUpgradesCoveragePremium2();
						      
						      uwpage.getGolfCartCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("State=SC", State))
				      {
						      uwpage.getEarthquakeCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Everest Indemnity Insurance Company", carrierName))
				      {
						      uwpage.getVandalismAndMaliciousCoveragePremium2();
				      }
				      
				      uwpage.getTotalOptionalCoveragesPremium2();
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
				      {
						      uwpage.getLiabilityPremium2();
						      
						      uwpage.getMedicalPaymentsPremium2();
				      }
				      
				      
				      if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
						      uwpage.getPremisesCoverageForOwners2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=HO8", policyForm) && objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A", carrierName))
				      {
						      uwpage.getPersonalInjuryCoveragePremium2();
				      }
				      
				      else if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
				      {
						      uwpage.getPersonalInjuryCoveragePremium2();
				      }
				      
				      if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
				      {
						      uwpage.getTotalLiabilityPremium2();
				      }
				      else if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
				      {
					    	  uwpage.getPremisesCoverageForBRandVacant2();
				      }
				      
				      uwpage.getBaseRateTotal2();
				      
				      uwpage.getMaxCreditCalculation2();
				      
				      uwpage.getTotalPropertyPremium2();
				      
				      uwpage.getMaxCreditOrCalculatedRate2();;
				          
				      uwpage.getTotalPolicyPremium2();
		    	  	  
		    	  
		      }
		      
		      uwpage.getMiscellaneousSurcharge();
		      
		      uwpage.getPolicyFee();
		      
		      uwpage.getInspectionFee();
		      
		      if(objectconditions.ConditionReading("State=Ak", State))
		      {
			      uwpage.getFillingFee();
		      }
		      
		      if(objectconditions.ConditionReading("State=AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
		      {
			      uwpage.getStampFee();
		      }
		      
		      uwpage.getSurplusLinesTax();
		      
		      if(objectconditions.ConditionReading("State=MS", State))
		      {
			      uwpage.getWindstormTax();
		      }
		      
		      if(objectconditions.ConditionReading("State=IL|OR|MT", State))
		      {
			      uwpage.getFireMarshallTax();
		      }
		      
		      if(objectconditions.ConditionReading("State=TN|SD|WY", State))
		      {
			      uwpage.getClearingHouseFee();
		      }
		      
		      if(objectconditions.ConditionReading("State=FL", State))
		      {
			      uwpage.getHurricaneCatastropeFee();
			      
			      uwpage.getCitizenAssessmentFee();
			      
			      uwpage.getDCAEMPAResidentialFee();
		      }
		      
		      if(objectconditions.ConditionReading("State=SC", State) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc;carrierName<>1126 Evanston Insurance Company", carrierName))
		      {
			      uwpage.getMunicipalTax();
		      }
		      
		      uwpage.getTotalPremium();
		      
		      uwpage.clickUWSheetClose();
		      Thread.sleep(3000);
		      
		      HashMap<Object, Object> resultMap = uwpage.getUWWorksheetPageOutput();
				for (Map.Entry<Object,Object> entry : resultMap.entrySet()) 
				{
						DB.InserValueWithRowNumber(DBName, entry.getKey().toString(), entry.getValue().toString(), Integer.parseInt(SNo));
						System.out.println("Key is :"+entry.getKey());
						System.out.println("Value is :"+entry.getValue());
				}
		      
		}
		
		catch(POMEventException | InterruptedException | NumberFormatException | DatabaseException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in UWWorksheet Page", e1);
			}
			errorlog.info("Error in UWWorksheet Page", e);
			throw new POMPageException("Error in UWWorksheet Page", e);
		}
		
		scenariolog.info("Output Values have been written in DB for UW worksheet for Testdata " + SNo);
	}
	
}