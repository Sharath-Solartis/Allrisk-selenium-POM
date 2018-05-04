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
import com.solartis.test.pom.pages.output.Pg18_EndoQuoteSummaryPageOutput;

import cucumber.api.java.en.Then;

public class Pg18_EndoQuoteSummaryPageSD 
{
	
	
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg18_EndoQuoteSummaryPageOutput endoQuoteOP = new Pg18_EndoQuoteSummaryPageOutput();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	@Then("^get Taxes and Fees from Endorsements Quote Summary Page for \"([^\"]*)\" and write those in DB \"([^\"]*)\" for \"([^\"]*)\"$")
	public void coveragesTab(String State, String tableName, String SNo) throws POMPageException
	{
		
		try
		{
			DatabaseOperation DB = FireEventobject.establishDBConnection();
			
			//String EndoProrataFactor = endoQuoteOP.getEndoProratafactor();
			//DB.InserValueWithRowNumber(DBName, "EndoProrataFactorActual", EndoProrataFactor, Integer.parseInt(SNo));
			FireEventobject.ThreadWait(10000);
			endoQuoteOP.getEndoPolicyPremium();
			
			String policyFeeEndoFromDB = DB.getValueWithRowNumber(tableName, "EndoPolicyPremiumActual", Integer.parseInt(SNo));
			System.out.println("Tax from DB in endo page " + policyFeeEndoFromDB);
						
			
			endoQuoteOP.getEndoNewPremium();
			
			endoQuoteOP.getEndoPremiumDifference();
			
			endoQuoteOP.getEndoProrataPremium();
			
			endoQuoteOP.getEndoPolicyFee();
			
			endoQuoteOP.getEndoInspectionFee();
			
			endoQuoteOP.getEndoFilingFee();
			
			if(objectconditions.ConditionReading("State=AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
			{
				endoQuoteOP.getEndoStampFee();
			}
			
			if(objectconditions.ConditionReading("State=FL", State))
			{
				endoQuoteOP.getEndoDCAEMPAFee();
				
				endoQuoteOP.getEndoCitizenFee();
				
				endoQuoteOP.getEndoHurricaneFee();
				
				endoQuoteOP.getEndoSurplusLineTax();		
			}
			
			HashMap<Object, Object> resultMap = endoQuoteOP.getEndoQuoteSummaryPageOutput();
			for (Map.Entry<Object,Object> entry : resultMap.entrySet()) 
			{
					DB.InserValueWithRowNumber(tableName, entry.getKey().toString(), entry.getValue().toString(), Integer.parseInt(SNo));
					System.out.println("Key is :"+entry.getKey());
					System.out.println("Value is :"+entry.getValue());
			}
			
			endoQuoteOP.clickIssueEndorsement();
			FireEventobject.ProcessingLoad();
		}
		catch (POMEventException | DatabaseException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Endorsements Quote Summary Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Endorsements Quote Summary Page", e1);
			}
			errorlog.info("Error in getting Taxes and Fees from Endorsements Quote Summary Page", e);
			throw new POMPageException("Error in getting Taxes and Fees from Endorsements Quote Summary Page", e);
		}
		scenariolog.info("Output Values of Endorsements have been written in DB for Quote Summary Page for Testdata " + SNo);
			
	}

}
