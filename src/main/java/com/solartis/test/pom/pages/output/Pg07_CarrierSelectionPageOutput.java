package com.solartis.test.pom.pages.output;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg07_CarrierSelectionPageOutput extends PomEventsMethodDefinition
{
	public static FireEvent FireEventobject =new FireEvent();
	protected ConditionVerify objectconditions = new ConditionVerify();
	static int tablerow = 0;
	static int tablerow1 = 0;
	HashMap<Object, Object> outputMap = new HashMap<Object, Object>();
	
	public void CarrierSelectionOutput(String carrierName, List<WebElement> carriers, String State, String SNo) throws POMPageException
	{
		try
		{
			System.out.println("carrier size   " + carriers.size());
			
			for( int i=0; i<carriers.size(); i++)
			{
				System.out.println("Carrier Name before quote creation :"+carriers.get(i).getText());
				if((((WebElement) carriers.get(i)).getText()).equals(carrierName))
		    	{
					//System.out.println("Carrier Names :"+carriers.get(i).getText());
					tablerow = i;
					tablerow1 = tablerow + 1;
					System.out.println("tableRow   " + tablerow);
					Thread.sleep(2000);
				
						
					String totalBasePremium = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath(".//*[@id='CarrierSelectionFormPage:carrierTile4:ApplicablePanel"+ tablerow +"']/input")));
					System.out.println("Tesdata  " + SNo + "TotalBasePremium " + totalBasePremium);
					outputMap.put("TotalBasePremiumCSPActual", totalBasePremium);
					
					String policyFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:Object__Plan__DefaultPolicyFee"+ tablerow +"')")));
					System.out.println("Tesdata  " + SNo + "PolicyFee " + policyFee);
					outputMap.put("PolicyFeeCSPActual", policyFee);
					
					String inspectionFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:Object__Plan__InspectionFee"+ tablerow +"')")));
					System.out.println("Tesdata  " + SNo + "InspectionFee " + inspectionFee);
					outputMap.put("InspectionFeeCSPActual", inspectionFee);
					
					if(objectconditions.ConditionReading("State=AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
					{
						String stampFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:StampFeeUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "StampFee " + stampFee);
						outputMap.put("StampFeeCSPActual", stampFee);
					}
					
					if(objectconditions.ConditionReading("State=AK", State))
					{
						String filingFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:FilingFeeUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "FilingFee " + filingFee);
						outputMap.put("FilingFeeCSPActual", filingFee);
					}
					
					String surplusLinesTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:SurplusLinesTaxUpdateDisplayPanel"+ tablerow +"')/input")));
					System.out.println("Tesdata  " + SNo + "SurplusLinesTax " + surplusLinesTax);
					outputMap.put("SurplusLinesTaxCSPActual", surplusLinesTax);
					
					if(objectconditions.ConditionReading("State=MS", State))
					{
						String windstormTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:WindStormTaxUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "WindstormTax " + windstormTax);
						outputMap.put("WindstormTaxCSPActual", windstormTax);
					}
					
					if(objectconditions.ConditionReading("State=IL|OR|MT", State))
					{
						String fireMarshallTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('FireMarshallTax')/td["+ tablerow1 +"]")));
						System.out.println("Tesdata  " + SNo + "FireMarshallTax " + fireMarshallTax);
						outputMap.put("FireMarshallTaxCSPActual", fireMarshallTax);
					}
					
					if(objectconditions.ConditionReading("State=TN|SD|WY", State))
					{
						String clearingHouseFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('ClearingHouseFee')/td["+ tablerow1 +"]")));
						System.out.println("Tesdata  " + SNo + "ClearingHouseFee " + clearingHouseFee);
						outputMap.put("ClearingHouseFeeCSPActual", clearingHouseFee);
					}
					
					
					if(objectconditions.ConditionReading("State=FL", State))
					{
						String hurricaneCatastropeFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:HurricaneCatastropheFundUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "HurricaneCatastropeFee " + hurricaneCatastropeFee);
						outputMap.put("HurricaneCatastropeFeeCSPActual", hurricaneCatastropeFee);
						
						String citizenAssessmentFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:CitizenAssessmentFeeUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "CitizenAssessmentFee " + citizenAssessmentFee);
						outputMap.put("CitizenAssessmentFeeCSPActual", citizenAssessmentFee);
						
						String DCAEMPAResidentialFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:DCAEMPAResidentialUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "DCAEMPAResidentialFee " + DCAEMPAResidentialFee);
						outputMap.put("DCAEMPAResidentialFeeCSPActual", DCAEMPAResidentialFee);
					}
					
					
					if(objectconditions.ConditionReading("State=SC", State))
					{
						String municipalTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:MunicipalTaxUpdateDisplayPanel"+ tablerow +"')/input")));
						System.out.println("Tesdata  " + SNo + "MunicipalTax " + municipalTax);
						outputMap.put("MunicipalTaxCSPActual", municipalTax);
					}
					
					String totalPremiumFooter = FireEventobject.getValueByTextOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:TotalPremiumRepeat:"+ tablerow +":PremiumApplicablePanel')/span")));
					System.out.println("Tesdata  " + SNo + "TotalPremiumFooter " + totalPremiumFooter);
					outputMap.put("TotalPremiumFooterCSPActual", totalPremiumFooter);
					
					String totalPremiumHeader = FireEventobject.getValueByTextOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:PremiumRepeat:"+ tablerow +":Premiumcontent')")));
					System.out.println("Tesdata  " + SNo + "TotalPremiumHeader " + totalPremiumHeader);
					outputMap.put("TotalPremiumHeaderCSPActual", totalPremiumHeader);
					
				}
			}
		}
		catch(InterruptedException | POMEventException e)	
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Carrier Selection input Page", e);
			}
			throw new POMPageException("Error in Carrier Selection output Page", e);
		}
	}
	
	public HashMap<Object, Object> getCarrierSelectionPageOutput()
	{
		System.out.println("Carrier Selection HashMap :" +outputMap);
		return outputMap;
	}
		
}
