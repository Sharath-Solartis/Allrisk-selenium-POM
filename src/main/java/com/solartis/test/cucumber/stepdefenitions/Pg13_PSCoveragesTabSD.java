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
import com.solartis.test.pom.pages.output.Pg13_PSCoveragesTabPageOutput;

import cucumber.api.java.en.Then;

public class Pg13_PSCoveragesTabSD 
{

	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg13_PSCoveragesTabPageOutput coveragesTab = new Pg13_PSCoveragesTabPageOutput();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	@Then("^get optional coverages values for \"([^\"]*)\" And \"([^\"]*)\" And for State \"([^\"]*)\" from the policy summary coverages tab and write those in DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void coveragesTab(String policyForm, String carrierName, String State, String DBName, String SNo) throws POMPageException
	{
	
		try 
		{
			DatabaseOperation DB = FireEventobject.establishDBConnection();
			FireEventobject.SyncWait(15000);
			coveragesTab.clickCoveragesTab();
			FireEventobject.ProcessingLoad();
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|DP3", policyForm))
			{
				coveragesTab.getWaterBackupCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
			{
				coveragesTab.getOrdinanceLawCoverageInCoveragesTab();
			}

			if(objectconditions.ConditionReading("policyForm=DP3", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc|Everest Indemnity Insurance Company", carrierName))
			{
				coveragesTab.getOrdinanceLawCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				coveragesTab.getTheftCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3|Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
			{
				coveragesTab.getLimitedMoldCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|DP3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				coveragesTab.getLimitedMoldCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5|HO8", policyForm) && objectconditions.ConditionReading("carrierName<>Canopius US Insurance Inc", carrierName))
			{
				coveragesTab.getIdentityFraudCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName=Canopius US Insurance Inc", carrierName))
			{
				coveragesTab.getGreenUpgradesCoverageInCoveragesTab();
				
				coveragesTab.getGolfCartCollisionCoverageInCoveragesTab();
				
				coveragesTab.getLossAssessmentCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				coveragesTab.getPersonalLiabilityCoveragesTab();
				
				coveragesTab.getMedicalPaymentCoveragesTab();
				
			}
			
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				coveragesTab.getPremisesCoverageForOwnersCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO3|HO5", policyForm) && objectconditions.ConditionReading("carrierName<>Certain Underwriters at Lloyds,London", carrierName))
			{
				coveragesTab.getPersonalInjuryCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=HO8", policyForm) && objectconditions.ConditionReading("carrierName=Gen Star $250k+ coverage A", carrierName))
			{
				coveragesTab.getPersonalInjuryCoverageInCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=Builders Risk|Builders Risk DP3|Vacant - DP1|Vacant - DP3", policyForm) && objectconditions.ConditionReading("carrierName=Certain Underwriters at Lloyds,London|1126 Evanston Insurance Company", carrierName))
			{
				coveragesTab.getLiabilityTotalPremiumForHODPCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("policyForm=DP1|DP3|HO3|HO8|HO5", policyForm))
			{
				coveragesTab.getLiabilityTotalPremiumForHODPCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=SC", State))
			{
				coveragesTab.getEarthquakeCoverageInCoveragesTab();
			}
			
			coveragesTab.getTotalBasePremiumCoveragesTab();
			
			coveragesTab.getPolicyFeeCoveragesTab();
			
			coveragesTab.getInspectionFeeCoveragesTab();
			
			if(objectconditions.ConditionReading("State=AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
			{
				coveragesTab.getStampFeeCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=AK", State))
			{
				coveragesTab.getFilingFeeCoveragesTab();
			}
			
			coveragesTab.getSurplusLinesTaxCoveragesTab();
			
			if(objectconditions.ConditionReading("State=MS", State))
			{
				coveragesTab.getWindstormTaxCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=IL|OR|MT", State))
			{
				coveragesTab.getFireMarshallTaxCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=TN|SD|WY", State))
			{
				coveragesTab.getClearingHouseFeeCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=FL", State))
			{
				coveragesTab.getHurricaneCatastropeFeeCoveragesTab();
				
				coveragesTab.getCitizenAssessmentFeeCoveragesTab();
				
				coveragesTab.getDCAEMPAResidentialFeeCoveragesTab();
			}
			
			if(objectconditions.ConditionReading("State=SC", State))
			{
				coveragesTab.getMunicipalTaxCoveragesTab();
			}
			
			coveragesTab.getTotalPremiumCoveragesTab();
			
			HashMap<Object, Object> resultMap = coveragesTab.getPSCoveragesTabPageOutput();
			for (Map.Entry<Object,Object> entry : resultMap.entrySet()) 
			{
					DB.InserValueWithRowNumber(DBName, entry.getKey().toString(), entry.getValue().toString(), Integer.parseInt(SNo));
					System.out.println("Key is :"+entry.getKey());
					System.out.println("Value is :"+entry.getValue());
			}
			
			coveragesTab.clickSummaryTab();
			
			DB.CloseConn();
						
			
		}
		catch (POMEventException | DatabaseException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Coverages Tab Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Coverages Tab Page", e1);
			}
			errorlog.info("Error in getting Optional Coverages in Policy Summary Coverages Tab Page", e);
			throw new POMPageException("Error in getting Optional Coverages in Policy Summary Coverages Tab Page", e);
		}
		scenariolog.info("Output Values have been written in DB for Coverages Tab Page for Testdata " + SNo);
	
	}
}
