package com.solartis.test.pom.pages.output;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg17_EndoCSPOutput extends PomEventsMethodDefinition
	{
		public static FireEvent FireEventobject =new FireEvent();
		protected ConditionVerify objectconditions = new ConditionVerify();
		static int tablerow = 0;
		static int tablerow1 = 0;
		HashMap<Object, Object> endoOutputMap = new HashMap<Object, Object>();
		
		
		public void endoCarrierSelectionOutput(String carrierName, List<WebElement> carriers, String State, String SNo) throws POMPageException
		{
			try
			{
				System.out.println("carrier size   " + carriers.size());
				
				for( int i=0; i<carriers.size(); i++)
				{
					
					if((((WebElement) carriers.get(i)).getText()).equals(carrierName))
			    	{
						
						System.out.println("Carrier Names :"+carriers.get(i).getText());
						tablerow = i;
						tablerow1 = i + 1;
						System.out.println("tableRow   " + tablerow);
					
							
						String totalBasePremium = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath(".//*[@id='CarrierSelectionFormPage:carrierTile4:ApplicablePanel"+ tablerow +"']/input")));
						endoOutputMap.put("TotalBasePremiumEndoCSPActual", totalBasePremium);
						
						String policyFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:Object__Plan__DefaultPolicyFee"+ tablerow +"')")));
						endoOutputMap.put("PolicyFeeEndoCSPActual", policyFee);
						
						String inspectionFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:Object__Plan__InspectionFee"+ tablerow +"')")));
						endoOutputMap.put("InspectionFeeEndoCSPActual", inspectionFee);
						
						if(objectconditions.ConditionReading("State=AZ|CA|FL|ID|IL|MN|MS|NC|NV|NY|OR|PA|TX|UT|VA|WA", State))
						{
							String stampFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:StampFeeUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("StampFeeEndoCSPActual", stampFee);
						}
						
						if(objectconditions.ConditionReading("State=AK", State))
						{
							String filingFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:FilingFeeUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("FilingFeeEndoCSPActual", filingFee);
						}
						
						String surplusLinesTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:SurplusLinesTaxUpdateDisplayPanel"+ tablerow +"')/input")));
						endoOutputMap.put("SurplusLinesTaxEndoCSPActual", surplusLinesTax);
						
						if(objectconditions.ConditionReading("State=MS", State))
						{
							String windstormTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:WindStormTaxUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("WindstormTaxEndoCSPActual", windstormTax);
						}
						
						if(objectconditions.ConditionReading("State=IL|OR|MT", State))
						{
							String fireMarshallTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('FireMarshallTax')/td["+ tablerow1 +"]")));
							endoOutputMap.put("FireMarshallTaxEndoCSPActual", fireMarshallTax);
						}
						
						if(objectconditions.ConditionReading("State=TN|SD|WY", State))
						{
							String clearingHouseFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('ClearingHouseFee')/td["+ tablerow1 +"]")));
							endoOutputMap.put("ClearingHouseFeeEndoCSPActual", clearingHouseFee);
						}
						
						
						if(objectconditions.ConditionReading("State=FL", State))
						{
							String hurricaneCatastropeFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:HurricaneCatastropheFundUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("HurricaneCatastropeFeeEndoCSPActual", hurricaneCatastropeFee);
							
							String citizenAssessmentFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:CitizenAssessmentFeeUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("CitizenAssessmentFeeEndoCSPActual", citizenAssessmentFee);
							
							String DCAEMPAResidentialFee = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:DCAEMPAResidentialUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("DCAEMPAResidentialFeeEndoCSPActual", DCAEMPAResidentialFee);
						}
						
						
						if(objectconditions.ConditionReading("State=SC", State))
						{
							String municipalTax = FireEventobject.getValueByAttributeOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:MunicipalTaxUpdateDisplayPanel"+ tablerow +"')/input")));
							endoOutputMap.put("MunicipalTaxEndoCSPActual", municipalTax);
						}
						
						String totalPremiumFooter = FireEventobject.getValueByTextOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:TotalPremiumRepeat:"+ tablerow +":PremiumApplicablePanel')/span")));
						endoOutputMap.put("TotalPremiumFooterEndoCSPActual", totalPremiumFooter);
						
						String totalPremiumHeader = FireEventobject.getValueByTextOutput(driver.findElement(By.xpath("id('CarrierSelectionFormPage:carrierTile4:PremiumRepeat:"+ tablerow +":Premiumcontent')")));
						endoOutputMap.put("TotalPremiumHeaderEndoCSPActual", totalPremiumHeader);
						
					}
				}
			}
			catch(POMEventException e)
			{
				try 
				{
					FireEventobject.takeScreenshot(SNo);
				} 
				catch (POMEventException e1) 
				{
					throw new POMPageException("Error in Taking ScreenShot in Carrier Selection output Page", e1);
				}
				throw new POMPageException("Error in Carrier Selection output Page", e);
			}
			
		}
		public HashMap<Object, Object> getEndoCarrierSelectionPageOutput()
		{
			System.out.println("Endorsement Carrier Selection HashMap :" +endoOutputMap);
			return endoOutputMap;
		}
			
	}

