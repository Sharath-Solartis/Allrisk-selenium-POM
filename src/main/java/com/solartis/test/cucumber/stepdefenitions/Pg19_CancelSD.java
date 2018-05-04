/*package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.pages.input.CancelPage;
import com.solartis.test.pom.pages.output.CancelPageOutput;

import cucumber.api.java.en.Then;

public class Pg19_CancelSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	FireEvent FireEventobject = new FireEvent();
	CancelPage cancel = new CancelPage();
	CancelPageOutput canceloutput = new CancelPageOutput();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^do cancellation based on the Cancel Date \"([^\"]*)\" And Cancel Type \"([^\"]*)\" And Minimum Earned Enforced for \"([^\"]*)\" And Return Policy Fee \"([^\"]*)\" And \"([^\"]*)\" And enter values into DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void cancelPolicy(String cancelDate, String cancelType, String minEarnedInforced, String returnPolicyFee, String State, String DBName, String SNo) throws POMPageException
	{
		try
		{
			DatabaseOperation DB = FireEventobject.establishDBConnection();
			cancel.clickCancelTab();
			Thread.sleep(5000);
			cancel.clickCancelEffectiveDate();
			cancel.DatePicker(cancel.datePicker, cancelDate);
			Thread.sleep(2000);
			
			if(objectconditions.ConditionReading("cancelType=Prorata", cancelType))
			{
				cancel.selectMinEarnedInforced(minEarnedInforced);
				cancel.selectIsPolicyFeeReturned(returnPolicyFee);
				Thread.sleep(4000);
			}
			
			String cancelBasePremium = canceloutput.getCancelBasePremium();
			DB.InserValueWithRowNumber(DBName, "CancelBasePremium", cancelBasePremium, Integer.parseInt(SNo));
			
			String cancelProrataFactor = canceloutput.getCancelProrataFactor();
			DB.InserValueWithRowNumber(DBName, "CancelProrataFactor", cancelProrataFactor, Integer.parseInt(SNo));
			
			if(objectconditions.ConditionReading("cancelType = Flat", cancelType))
			{
				String cancelPolicyFee = canceloutput.getTaxandFee01();
				DB.InserValueWithRowNumber(DBName, "CancelPolicyFee", cancelPolicyFee, Integer.parseInt(SNo));
			
				if(objectconditions.ConditionReading("State = AK", State))
				{
					String cancelStampFee = canceloutput.getTaxandFee02();
					DB.InserValueWithRowNumber(DBName, "CancelStampFee", cancelStampFee, Integer.parseInt(SNo));
				}
				else
				{
					String cancelInspectionFee = canceloutput.getTaxandFee02();
					DB.InserValueWithRowNumber(DBName, "CancelInspectionFee", cancelInspectionFee, Integer.parseInt(SNo));
				}
			
				String cancelFilingFee = canceloutput.getTaxandFee03();
				DB.InserValueWithRowNumber(DBName, "CancelFilingFee", cancelFilingFee, Integer.parseInt(SNo));
				
				if(objectconditions.ConditionReading("State = AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
				{
					String cancelStampFee = canceloutput.getTaxandFee04();
					DB.InserValueWithRowNumber(DBName, "CancelStampFee", cancelStampFee, Integer.parseInt(SNo));
				}
				else if(objectconditions.ConditionReading("State = DE|AK", State))
				{
					String cancelSurplusLineTax = canceloutput.getTaxandFee04();
					DB.InserValueWithRowNumber(DBName, "CancelSurplusLineTax", cancelSurplusLineTax, Integer.parseInt(SNo));
				}
				
				if(objectconditions.ConditionReading("State = DE|AK", State))
				{
					String cancelTotalPremium = canceloutput.getTaxandFee05();
					DB.InserValueWithRowNumber(DBName, "CancelTotalPremium", cancelTotalPremium, Integer.parseInt(SNo));
				}
				else if(objectconditions.ConditionReading("State = FL", State))
				{
					String cancelDCAEMPAResidentialFee = canceloutput.getTaxandFee05();
					DB.InserValueWithRowNumber(DBName, "CancelDCAEMPAResidentialFee", cancelDCAEMPAResidentialFee, Integer.parseInt(SNo));
				}
				else if(objectconditions.ConditionReading("State = AZ|CA|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
				{
					String cancelSurplusLineTax = canceloutput.getTaxandFee05();
					DB.InserValueWithRowNumber(DBName, "CancelSurplusLineTax", cancelSurplusLineTax, Integer.parseInt(SNo));
				}
				
				if(objectconditions.ConditionReading("State = FL", State))
				{
					String cancelCitizenAssessmentFee = canceloutput.getTaxandFee06();
					DB.InserValueWithRowNumber(DBName, "CancelCitizenAssessmentFee", cancelCitizenAssessmentFee, Integer.parseInt(SNo));
				}
				else if(objectconditions.ConditionReading("State = AZ|CA|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
				{
					String cancelTotalPremium = canceloutput.getTaxandFee06();
					DB.InserValueWithRowNumber(DBName, "CancelTotalPremium", cancelTotalPremium, Integer.parseInt(SNo));
				}
				
				if(objectconditions.ConditionReading("State = FL", State))
				{
					String cancelHurricaneCatastropheFee = canceloutput.getTaxandFee07();
					DB.InserValueWithRowNumber(DBName, "CancelHurricaneCatastropheFee", cancelHurricaneCatastropheFee, Integer.parseInt(SNo));
					
					String cancelSurplusLineTax = canceloutput.getTaxandFee08();
					DB.InserValueWithRowNumber(DBName, "CancelSurplusLineTax", cancelSurplusLineTax, Integer.parseInt(SNo));
					
					String cancelTotalPremium = canceloutput.getTaxandFee09();
					DB.InserValueWithRowNumber(DBName, "CancelTotalPremium", cancelTotalPremium, Integer.parseInt(SNo));
				}
			}
			
			if(objectconditions.ConditionReading("cancelType = Prorata", cancelType))
			{
				
			}
	}


}
*/