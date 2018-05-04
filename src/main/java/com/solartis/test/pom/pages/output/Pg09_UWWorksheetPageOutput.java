package com.solartis.test.pom.pages.output;


import java.util.HashMap;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg09_UWWorksheetPageOutput extends PomEventsMethodDefinition 
{
	
	FireEvent FireEventobject = new FireEvent();
	
	HashMap<Object, Object> outputMap = new HashMap<Object, Object>();
	
	@FindBy(xpath = "*//button/span[contains(text(),'UNDERWRITER WORKSHEET')]")
	public WebElement UWSheetClick;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Base Non-Wind Rate')]/../td[2]")
	public WebElement baseNonWindRate;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Construction Type Factor')]/../td[2]")
	public WebElement constructionTypeFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Occupancy Factor')]/../td[2]")
	public WebElement occupancyFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Age of Dwelling Factor')]/../td[2]")
	public WebElement ageOfDwellingFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Age of Roof Factor')]/../td[2]")
	public WebElement ageOfRoofFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Coverage A Band Credit Factor')]/../td[2]")
	public WebElement covABandCreditFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Extended Replacement Cost Factor')]/../td[2]")
	public WebElement extReplacementCostFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Number of Families Factor')]/../td[2]")
	public WebElement numOfFamiliesFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Protection Class Factor')]/../td[2]")
	public WebElement protectionClassFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'Central Station Alarms Factor')]/../td[2]")
	public WebElement alarmsFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[1]//tr/td[contains(text(),'AOP Deductible Factor')]/../td[2]")
	public WebElement AOPFactorNW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm:NonWindPropertyRate')")
	public WebElement totalNWPropertyRate;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm:NonWindPropertyPremiumPanel')")
	public WebElement totalNWPropertyPremium;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Base Wind Rate')]/../td[2]")
	public WebElement baseWindRate;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Construction Type Factor')]/../td[2]")
	public WebElement constructionTypeFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Occupancy Factor')]/../td[2]")
	public WebElement occupancyFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Age of Dwelling Factor')]/../td[2]")
	public WebElement ageOfDwellingFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Age of Roof Factor')]/../td[2]")
	public WebElement ageOfRoofFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Coverage A Band Credit Factor')]/../td[2]")
	public WebElement covABandCreditFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Extended Replacement Cost Factor')]/../td[2]")
	public WebElement extReplacementCostW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Distance To Coast Factor')]/../td[2]")
	public WebElement distanceToCoastFactorW;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Roof Shape Factor')]/../td[2]")
	public WebElement roofShapeFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Roof Covering Factor')]/../td[2]")
	public WebElement roofCoveringFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Roof Anchor Factor')]/../td[2]")
	public WebElement roofAnchorFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Opening Protection Factor')]/../td[2]")
	public WebElement openingProtectionFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Wind Deductible Factor')]/../td[2]")
	public WebElement windDeductibleFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Gross AAL')]/../td[2]")
	public WebElement grossAAl;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'TCQ AAL Factor')]/../td[2]")
	public WebElement TCQAALFactor;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Wind Property Rate')]/../td[2]")
	public WebElement totalWPropertyRate;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm:WindPropertyPremiumPanel')")
	public WebElement totalWPropertyPremium;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Theft Coverage Premium')]/../td[2]")
	public WebElement theftCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Theft Coverage Premium')]/../td[2]")
	public WebElement theftCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Limited Mold Coverage Premium')]/../td[2]")
	public WebElement limitedMoldCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Limited Mold Coverage Premium')]/../td[2]")
	public WebElement limitedMoldCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Water Back-Up Coverage Premium')]/../td[2]")
	public WebElement waterBackUpCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Water Back-Up Coverage Premium')]/../td[2]")
	public WebElement waterBackUpCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Identity Fraud Coverage Premium')]/../td[2]")
	public WebElement identityFraudCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Identity Fraud Coverage Premium')]/../td[2]")
	public WebElement identityFraudCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Ordinance or Law Coverage Premium')]/../td[2]")
	public WebElement ordinanceLawCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Ordinance or Law Coverage Premium')]/../td[2]")
	public WebElement ordinanceLawCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Loss Assessment Coverage Premium')]/../td[2]")
	public WebElement lossAssessmentCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Loss Assessment Coverage Premium')]/../td[2]")
	public WebElement lossAssessmentCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Green Upgrades Coverage Premium')]/../td[2]")
	public WebElement greenUpgradesCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Green Upgrades Coverage Premium')]/../td[2]")
	public WebElement greenUpgradesCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Golf Cart Coverage Premium')]/../td[2]")
	public WebElement golfCartCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Golf Cart Coverage Premium')]/../td[2]")
	public WebElement golfCartCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Earthquake Coverage Premium')]/../td[2]")
	public WebElement earthquakeCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Earthquake Coverage Premium')]/../td[2]")
	public WebElement earthquakeCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Vandalism & Malicious Mischief Coverage Premium')]/../td[2]")
	public WebElement vandalismAndMaliciousCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Vandalism & Malicious Mischief Coverage Premium')]/../td[2]")
	public WebElement vandalismAndMaliciousCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Total Optional Coverages Premium')]/../td[3]")
	public WebElement totalOptionalCoveragesPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Total Optional Coverages Premium')]/../td[3]")
	public WebElement totalOptionalCoveragesPremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Liability Premium')]/../td[2]")
	public WebElement liabilityPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Liability Premium')]/../td[2]")
	public WebElement liabilityPremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Medical Payments Premium')]/../td[2]")
	public WebElement medicalPaymentsPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Medical Payments Premium')]/../td[2]")
	public WebElement medicalPaymentsPremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Premises Coverage Premium')]/../td[2]")
	public WebElement premisesCoverageForOwners1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Premises Coverage Premium')]/../td[2]")
	public WebElement premisesCoverageForOwners2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Personal Injury Coverage Premium')]/../td[2]")
	public WebElement personalInjuryCoveragePremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Personal Injury Coverage Premium')]/../td[2]")
	public WebElement personalInjuryCoveragePremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Total Liability Premium')]/../td[3]")
	public WebElement totalLiabilityPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Total Liability Premium')]/../td[3]")
	public WebElement totalLiabilityPremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Premises Coverage Premium')]/../td[2]")
	public WebElement premisesCoverageForBRandVacant1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Premises Coverage Premium')]/../td[2]")
	public WebElement premisesCoverageForBRandVacant2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Base Rate Total')]/../td[2]")
	public WebElement baseRateTotal1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Base Rate Total')]/../td[2]")
	public WebElement baseRateTotal2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'35% Max Credit Calculation')]/../td[2]")
	public WebElement maxCreditCalculation1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'35% Max Credit Calculation')]/../td[2]")
	public WebElement maxCreditCalculation2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Total Property Premium')]/../td[2]")
	public WebElement totalPropertyPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Total Property Premium')]/../td[2]")
	public WebElement totalPropertyPremium2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Max Credit or Calculated Rate')]/../td[2]")
	public WebElement maxCreditOrCalculatedRate1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Max Credit or Calculated Rate')]/../td[2]")
	public WebElement maxCreditOrCalculatedRate2;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm:Object__PlanFactor__MiscSurcharge_Factor')")
	public WebElement miscellaneousSurcharge;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[3]//tr/td[contains(text(),'Total Policy Premium')]/../td[2]")
	public WebElement totalPolicyPremium1;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div/table[2]//tr/td[contains(text(),'Total Policy Premium')]/../td[2]")
	public WebElement totalPolicyPremium2;
	
	@FindBy(xpath = "id('Object__Plan__DefaultPolicyFee')")
	public WebElement policyFee;
	
	@FindBy(xpath = "id('Object__Plan__InspectionFee')")
	public WebElement inspectionFee;
	
	@FindBy(xpath = "id('Object__Plan__FilingFee')")
	public WebElement fillingFee;
	
	@FindBy(xpath = "id('Object__Plan__StampFee')")
	public WebElement stampFee;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div//tr/td[contains(text(),'Surplus Lines Tax')]/../td[2]")
	public WebElement surplusLinesTax;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div//tr/td[contains(text(),'Windstorm tax')]/../td[2]")
	public WebElement windstormTax;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div//tr/td[contains(text(),'Fire Marshall Tax')]/../td[2]")
	public WebElement fireMarshallTax;
	
	@FindBy(xpath = "id('Object__Plan__ClearingHouseFee')")
	public WebElement clearingHouseFee;
	
	@FindBy(xpath = "id('Object__Plan__HurricaneCatastropheFund')")
	public WebElement hurricaneCatastropeFee;
	
	@FindBy(xpath = "id('Object__Plan__CitizenAssessmentFee')")
	public WebElement citizenAssessmentFee;
	
	@FindBy(xpath = "id('Object__Plan__DCAEMPAResidential')")
	public WebElement DCAEMPAResidentialFee;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm:TaxList')/table[2]//td[2]")
	public WebElement municipalTax;
	
	@FindBy(xpath = "id('DocumentsTile:UW_WorksheetForm')/div//tr/td[contains(text(),'Total Premium')]/../td[3]")
	public WebElement totalPremium;
	
	@FindBy(xpath = "*//div/span[contains(text(),'UNDERWRITER WORKSHEET')]/../a")
	public WebElement UWSheetClose;
	
	
	
	public Pg09_UWWorksheetPageOutput() 
	{
		    PageFactory.initElements(driver, this);
	}
		
	public void clickUWworkSheetButton() throws POMEventException
	{
			FireEventobject.ClickElement(UWSheetClick);
	}
	
	public void getBaseNonWindRate() throws POMEventException
	{
		outputMap.put("BaseNonWindRateActual", FireEventobject.getValueByTextOutput(baseNonWindRate));
	}
	
	public void getConstructionTypeFactorNW() throws POMEventException
	{
		outputMap.put("ConstructionTypeFactorNWActual", FireEventobject.getValueByTextOutput(constructionTypeFactorNW));
	}
	
	public void getOccupancyFactorNW() throws POMEventException
	{
		outputMap.put("OccupancyFactorNWActual", FireEventobject.getValueByTextOutput(occupancyFactorNW));
	}
	
	public void getAgeOfDwellingFactorNW() throws POMEventException
	{
		outputMap.put("AgeOfDwellingFactorNWActual", FireEventobject.getValueByTextOutput(ageOfDwellingFactorNW));
	}
	
	public void getAgeOfRoofFactorNW() throws POMEventException
	{
		outputMap.put("AgeOfRoofFactorNWActual", FireEventobject.getValueByTextOutput(ageOfRoofFactorNW));
	}
	
	public void getCovABandCreditFactorNW() throws POMEventException
	{
		outputMap.put("CovABandCreditFactorNWActual", FireEventobject.getValueByTextOutput(covABandCreditFactorNW));
	}
	
	public void getExtReplacementCostFactorNW() throws POMEventException
	{
		outputMap.put("ExtReplacementCostFactorNWActual", FireEventobject.getValueByTextOutput(extReplacementCostFactorNW));
	}
	
	public void getNumOfFamiliesFactorNW() throws POMEventException
	{
		outputMap.put("NumOfFamiliesFactorNWActual", FireEventobject.getValueByTextOutput(numOfFamiliesFactorNW));
	}
	
	public void getProtectionClassFactorNW() throws POMEventException
	{
		outputMap.put("ProtectionClassFactorNWActual", FireEventobject.getValueByTextOutput(protectionClassFactorNW));
	}
	
	public void getAlarmsFactorNW() throws POMEventException
	{
		outputMap.put("AlarmsFactorNWActual", FireEventobject.getValueByTextOutput(alarmsFactorNW));
	}
	
	public void getAOPFactorNW() throws POMEventException
	{
		outputMap.put("AOPFactorNWActual", FireEventobject.getValueByTextOutput(AOPFactorNW));
	}
	
	public void getTotalNWPropertyRate() throws POMEventException
	{
		outputMap.put("TotalNWPropertyRateActual", FireEventobject.getValueByTextOutput(totalNWPropertyRate));
	}
	
	public void getTotalNWPropertyPremium() throws POMEventException
	{
		outputMap.put("TotalNWPropertyPremiumActual", FireEventobject.getValueByTextOutput(totalNWPropertyPremium));
	}
	
	public void getBaseWindRate() throws POMEventException
	{
		outputMap.put("BaseWindRateActual", FireEventobject.getValueByTextOutput(baseWindRate));
	}

	public void getConstructionTypeFactorW() throws POMEventException
	{
		outputMap.put("ConstructionTypeFactorWActual", FireEventobject.getValueByTextOutput(constructionTypeFactorW));
	}
	
	public void getOccupancyFactorW() throws POMEventException
	{
		outputMap.put("OccupancyFactorWActual", FireEventobject.getValueByTextOutput(occupancyFactorW));
	}
	
	public void getAgeOfDwellingFactorW() throws POMEventException
	{
		outputMap.put("AgeOfDwellingFactorWActual", FireEventobject.getValueByTextOutput(ageOfDwellingFactorW));
	}
	
	public void getAgeOfRoofFactorW() throws POMEventException
	{
		outputMap.put("AgeOfRoofFactorWActual", FireEventobject.getValueByTextOutput(ageOfRoofFactorW));
	}
	
	public void getCovABandCreditFactorW() throws POMEventException
	{
		outputMap.put("CovABandCreditFactorWActual", FireEventobject.getValueByTextOutput(covABandCreditFactorW));
	}
	
	public void getExtReplacementFactorW() throws POMEventException
	{
		outputMap.put("ExtReplacementCostWActual", FireEventobject.getValueByTextOutput(extReplacementCostW));
	}
	
	public void getDistanceToCoastFactorW() throws POMEventException
	{
		outputMap.put("DistanceToCoastFactorWActual", FireEventobject.getValueByTextOutput(distanceToCoastFactorW));
	}
	
	public void getRoofShapeFactor() throws POMEventException
	{
		outputMap.put("RoofShapeFactorActual", FireEventobject.getValueByTextOutput(roofShapeFactor));
	}
	
	public void getRoofCoveringFactor() throws POMEventException
	{
		outputMap.put("RoofCoveringFactorActual", FireEventobject.getValueByTextOutput(roofCoveringFactor));
	}

	public void getRoofAnchorFactor() throws POMEventException
	{
		outputMap.put("RoofAnchorFactorActual", FireEventobject.getValueByTextOutput(roofAnchorFactor));
	}
	
	public void getOpeningProtectionFactor() throws POMEventException
	{
		outputMap.put("OpeningProtectionFactorActual", FireEventobject.getValueByTextOutput(openingProtectionFactor));
	}
	
	public void getWindDeductibleFactor() throws POMEventException
	{
		outputMap.put("WindDeductibleFactorActual", FireEventobject.getValueByTextOutput(windDeductibleFactor));
	}
	
	public void getGrossAAL() throws POMEventException
	{
		outputMap.put("GrossAAlActual", FireEventobject.getValueByTextOutput(grossAAl));
	}
	
	public void getTCQAALFactor() throws POMEventException
	{
		outputMap.put("TCQAALFactorActual", FireEventobject.getValueByTextOutput(TCQAALFactor));
	}
	
	public void getTotalWPropertyRate() throws POMEventException
	{
		outputMap.put("TotalWPropertyRateActual", FireEventobject.getValueByTextOutput(totalWPropertyRate));
	}
	
	public void getTotalWPropertyPremium() throws POMEventException
	{
		outputMap.put("TotalWPropertyPremiumActual", FireEventobject.getValueByTextOutput(totalWPropertyPremium));
	}
	
	public void getTheftCoveragePremium1() throws POMEventException
	{
		outputMap.put("TheftCoveragePremiumActual", FireEventobject.getValueByTextOutput(theftCoveragePremium1));
	}
	
	public void getTheftCoveragePremium2() throws POMEventException
	{
		outputMap.put("TheftCoveragePremium_Actual", FireEventobject.getValueByTextOutput(totalWPropertyPremium));
	}
	
	public void getLimitedMoldCoveragePremium1() throws POMEventException
	{
		outputMap.put("LimitedMoldCoveragePremiumActual", FireEventobject.getValueByTextOutput(limitedMoldCoveragePremium1));
	}
	
	public void getLimitedMoldCoveragePremium2() throws POMEventException
	{
		outputMap.put("LimitedMoldCoveragePremiumActual", FireEventobject.getValueByTextOutput(limitedMoldCoveragePremium2));
	}
	
	public void getWaterBackUpCoveragePremium1() throws POMEventException
	{
		outputMap.put("WaterBackUpCoveragePremiumActual", FireEventobject.getValueByTextOutput(waterBackUpCoveragePremium1));
	}
	
	public void getWaterBackUpCoveragePremium2() throws POMEventException
	{
		outputMap.put("WaterBackUpCoveragePremiumActual", FireEventobject.getValueByTextOutput(waterBackUpCoveragePremium2));
	}
	
	public void getIdentityFraudCoveragePremium1() throws POMEventException
	{
		outputMap.put("IdentityFraudCoveragePremiumActual", FireEventobject.getValueByTextOutput(identityFraudCoveragePremium1));
	}
	
	public void getIdentityFraudCoveragePremium2() throws POMEventException
	{
		outputMap.put("IdentityFraudCoveragePremiumActual", FireEventobject.getValueByTextOutput(identityFraudCoveragePremium2));
	}
	
	public void getOrdinanceLawCoveragePremium1() throws POMEventException
	{
		outputMap.put("OrdinanceLawCoveragePremiumActual", FireEventobject.getValueByTextOutput(ordinanceLawCoveragePremium1));
	}
	
	public void getOrdinanceLawCoveragePremium2() throws POMEventException
	{
		outputMap.put("OrdinanceLawCoveragePremiumActual", FireEventobject.getValueByTextOutput(ordinanceLawCoveragePremium2));
	}
	
	public void getLossAssessmentCoveragePremium1() throws POMEventException
	{
		outputMap.put("LossAssessmentCoveragePremiumActual", FireEventobject.getValueByTextOutput(lossAssessmentCoveragePremium1));
	}
	
	public void getLossAssessmentCoveragePremium2() throws POMEventException
	{
		outputMap.put("LossAssessmentCoveragePremiumActual", FireEventobject.getValueByTextOutput(lossAssessmentCoveragePremium2));
	}
	
	public void getGreenUpgradesCoveragePremium1() throws POMEventException
	{
		outputMap.put("GreenUpgradesCoveragePremiumActual", FireEventobject.getValueByTextOutput(greenUpgradesCoveragePremium1));
	}
	
	public void getGreenUpgradesCoveragePremium2() throws POMEventException
	{
		outputMap.put("GreenUpgradesCoveragePremiumActual", FireEventobject.getValueByTextOutput(greenUpgradesCoveragePremium2));
	}
	
	public void getGolfCartCoveragePremium1() throws POMEventException
	{
		outputMap.put("GolfCartCoveragePremiumActual", FireEventobject.getValueByTextOutput(golfCartCoveragePremium1));
	}
	
	public void getGolfCartCoveragePremium2() throws POMEventException
	{
		outputMap.put("GolfCartCoveragePremiumActual", FireEventobject.getValueByTextOutput(golfCartCoveragePremium2));
	}

	public void getEarthquakeCoveragePremium1() throws POMEventException
	{
		outputMap.put("EarthquakeCoveragePremiumActual", FireEventobject.getValueByTextOutput(earthquakeCoveragePremium1));
	}
	
	public void getEarthquakeCoveragePremium2() throws POMEventException
	{
		outputMap.put("EarthquakeCoveragePremiumActual", FireEventobject.getValueByTextOutput(earthquakeCoveragePremium2));
	}
	
	public void getVandalismAndMaliciousCoveragePremium1() throws POMEventException
	{
		outputMap.put("VandalismAndMaliciousCoveragePremiumActual", FireEventobject.getValueByTextOutput(vandalismAndMaliciousCoveragePremium1));
	}
	
	public void getVandalismAndMaliciousCoveragePremium2() throws POMEventException
	{
		outputMap.put("VandalismAndMaliciousCoveragePremiumActual", FireEventobject.getValueByTextOutput(vandalismAndMaliciousCoveragePremium2));
	}
	
	public void getTotalOptionalCoveragesPremium1() throws POMEventException
	{
		outputMap.put("TotalOptionalCoveragesPremiumActual", FireEventobject.getValueByTextOutput(totalOptionalCoveragesPremium1));
	}
	
	public void getTotalOptionalCoveragesPremium2() throws POMEventException
	{
		outputMap.put("TotalOptionalCoveragesPremiumActual", FireEventobject.getValueByTextOutput(totalOptionalCoveragesPremium2));
	}
	
	public void getLiabilityPremium1() throws POMEventException
	{
		outputMap.put("LiabilityPremiumActual", FireEventobject.getValueByTextOutput(liabilityPremium1));
	}
	
	public void getLiabilityPremium2() throws POMEventException
	{
		outputMap.put("LiabilityPremiumActual", FireEventobject.getValueByTextOutput(liabilityPremium2));
	}
	
	public void getMedicalPaymentsPremium1() throws POMEventException
	{
		outputMap.put("MedicalPaymentsPremiumActual", FireEventobject.getValueByTextOutput(medicalPaymentsPremium1));
	}
	
	public void getMedicalPaymentsPremium2() throws POMEventException
	{
		outputMap.put("MedicalPaymentsPremiumActual", FireEventobject.getValueByTextOutput(medicalPaymentsPremium2));
	}
	
	public void getPremisesCoverageForOwners1() throws POMEventException
	{
		outputMap.put("PremisesCoverageForOwnersActual", FireEventobject.getValueByTextOutput(premisesCoverageForOwners1));
	}
	
	public void getPremisesCoverageForOwners2() throws POMEventException
	{
		outputMap.put("PremisesCoverageForOwnersActual", FireEventobject.getValueByTextOutput(premisesCoverageForOwners2));
	}
	
	public void getPersonalInjuryCoveragePremium1() throws POMEventException
	{
		outputMap.put("PersonalInjuryCoveragePremiumActual", FireEventobject.getValueByTextOutput(personalInjuryCoveragePremium1));
	}
	
	public void getPersonalInjuryCoveragePremium2() throws POMEventException
	{
		outputMap.put("PersonalInjuryCoveragePremiumActual", FireEventobject.getValueByTextOutput(personalInjuryCoveragePremium2));
	}
	
	public void getTotalLiabilityPremium1() throws POMEventException
	{
		outputMap.put("TotalLiabilityPremiumActual", FireEventobject.getValueByTextOutput(totalLiabilityPremium1));
	}
	
	public void getTotalLiabilityPremium2() throws POMEventException
	{
		outputMap.put("totalLiabilityPremiumActual", FireEventobject.getValueByTextOutput(totalLiabilityPremium2));
	}
	
	public void getPremisesCoverageForBRandVacant1() throws POMEventException
	{
		outputMap.put("PremisesCoverageForBRandVacantActual", FireEventobject.getValueByTextOutput(premisesCoverageForBRandVacant1));
	}
	
	public void getPremisesCoverageForBRandVacant2() throws POMEventException
	{
		outputMap.put("PremisesCoverageForBRandVacantActual", FireEventobject.getValueByTextOutput(premisesCoverageForBRandVacant2));
	}
	
	public void getBaseRateTotal1() throws POMEventException
	{
		outputMap.put("BaseRateTotalActual", FireEventobject.getValueByTextOutput(baseRateTotal1));
	}
	
	public void getBaseRateTotal2() throws POMEventException
	{
		outputMap.put("BaseRateTotalActual", FireEventobject.getValueByTextOutput(baseRateTotal2));
	}
	
	public void getMaxCreditCalculation1() throws POMEventException
	{
		outputMap.put("MaxCreditCalculationActual", FireEventobject.getValueByTextOutput(maxCreditCalculation1));
	}
	
	public void getMaxCreditCalculation2() throws POMEventException
	{
		outputMap.put("MaxCreditCalculationActual", FireEventobject.getValueByTextOutput(maxCreditCalculation2));
	}
	
	public void getTotalPropertyPremium1() throws POMEventException
	{
		outputMap.put("TotalPropertyPremiumUWActual", FireEventobject.getValueByTextOutput(totalPropertyPremium1));
	}
	
	public void getTotalPropertyPremium2() throws POMEventException
	{
		outputMap.put("TotalPropertyPremiumUWActual", FireEventobject.getValueByTextOutput(totalPropertyPremium2));
	}
	
	public void getMaxCreditOrCalculatedRate1() throws POMEventException
	{
		outputMap.put("MaxCreditOrCalculatedRateActual", FireEventobject.getValueByTextOutput(maxCreditOrCalculatedRate1));
	}
	
	public void getMaxCreditOrCalculatedRate2() throws POMEventException
	{
		outputMap.put("MaxCreditOrCalculatedRateActual", FireEventobject.getValueByTextOutput(maxCreditOrCalculatedRate2));
	}
	
	public void getMiscellaneousSurcharge() throws POMEventException
	{
		outputMap.put("MiscSurchargeActual", FireEventobject.getValueByTextOutput(miscellaneousSurcharge));
	}
	
	public void getTotalPolicyPremium1() throws POMEventException
	{
		outputMap.put("TotalPolicyPremiumUWActual", FireEventobject.getValueByTextOutput(totalPolicyPremium1));
	}
	
	public void getTotalPolicyPremium2() throws POMEventException
	{
		outputMap.put("TotalPolicyPremiumUWActual", FireEventobject.getValueByTextOutput(totalPolicyPremium2));
	}
	
	public void getPolicyFee() throws POMEventException
	{
		outputMap.put("PolicyFeeUWActual", FireEventobject.getValueByTextOutput(policyFee));
	}
	
	public void getInspectionFee() throws POMEventException
	{
		outputMap.put("InspectionFeeUWActual", FireEventobject.getValueByTextOutput(inspectionFee));
	}
	
	public void getFillingFee() throws POMEventException
	{
		outputMap.put("FillingFeeUWActual", FireEventobject.getValueByTextOutput(fillingFee));
	}
	
	public void getStampFee() throws POMEventException
	{
		outputMap.put("StampFeeUWActual", FireEventobject.getValueByTextOutput(stampFee));
	}
	
	public void getSurplusLinesTax() throws POMEventException
	{
		outputMap.put("SurplusLinesTaxUWActual", FireEventobject.getValueByTextOutput(surplusLinesTax));
	}
	
	public void getWindstormTax() throws POMEventException
	{
		outputMap.put("WindstormTaxUWActual", FireEventobject.getValueByTextOutput(windstormTax));
	}
	
	public void getFireMarshallTax() throws POMEventException
	{
		outputMap.put("FireMarshallTaxUWActual", FireEventobject.getValueByTextOutput(fireMarshallTax));
	}
	
	public void getClearingHouseFee() throws POMEventException
	{
		outputMap.put("ClearingHouseFeeUWActual", FireEventobject.getValueByTextOutput(clearingHouseFee));
	}
	
	public void getHurricaneCatastropeFee() throws POMEventException
	{
		outputMap.put("HurricaneCatastropeFeeUWActual", FireEventobject.getValueByTextOutput(hurricaneCatastropeFee));
	}
	
	public void getCitizenAssessmentFee() throws POMEventException
	{
		outputMap.put("CitizenAssessmentFeeUWActual", FireEventobject.getValueByTextOutput(citizenAssessmentFee));
	}
	
	public void getDCAEMPAResidentialFee() throws POMEventException
	{
		outputMap.put("DCAEMPAResidentialFeeUWActual", FireEventobject.getValueByTextOutput(DCAEMPAResidentialFee));
	}
	
	public void getMunicipalTax() throws POMEventException
	{
		outputMap.put("MunicipalTaxUWActual", FireEventobject.getValueByTextOutput(municipalTax));
	}
	
	public void getTotalPremium() throws POMEventException
	{
		outputMap.put("TotalPremiumUWActual", FireEventobject.getValueByTextOutput(totalPremium));
	}
	
	public void clickUWSheetClose() throws POMEventException
	{
			FireEventobject.ClickElement(UWSheetClose);
	}
	
	public HashMap<Object, Object> getUWWorksheetPageOutput()
	{
		System.out.println("Coverages HashMap :" +outputMap);
		return outputMap;
	}
	
	
	public boolean BaseRateCheck(String base_wind_rate) throws InterruptedException
	{
		//DBop DBobject = new DBop();
		boolean result;
		Thread.sleep(3000);
		System.out.println("WBasreate :" + baseWindRate.getText());
		if (baseWindRate.getText().equals(base_wind_rate)) 
		{
			//DBobject.callDB("Base_Rate",base_w_rate.getText());
			result = true;
		}
		else 
		{
			result = false;
		}
		System.out.println("Result is :"+result);
		return result;
	}
	
	
	/*public QuoteProposalPage UWSheet(String base_wind_rate, String test_data) throws POMPageException
	{
		try
		{
			BaseRateCheck(base_wind_rate);
			UWsheetClose();
		} 
		catch (POMEventException | InterruptedException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(test_data);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Underwriter Worksheet Page", e);
			}
			throw new POMPageException("Error in Underwriter Worksheet Page", e);
		}
		return new QuoteProposalPage();
	}*/
}