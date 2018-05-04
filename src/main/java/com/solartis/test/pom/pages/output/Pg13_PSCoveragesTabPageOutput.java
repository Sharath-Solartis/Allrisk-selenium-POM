package com.solartis.test.pom.pages.output;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg13_PSCoveragesTabPageOutput extends PomEventsMethodDefinition
{
	@FindBy(xpath="*//h3[5]//table/tbody/tr/td[2]/button/span[1]")
	public WebElement coveragesTabClick; 
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Water Backup')]/../td[3]")
	public WebElement waterBackupCoveragesTab; 
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Ordinance or Law Coverage')]/../td[3]")
	public WebElement ordinanceLawCoverageInCoveragesTab; 
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Theft Coverage')]/../td[3]")
	public WebElement theftCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Limited Mold Coverage')]/../td[3]")
	public WebElement limitedMoldCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Identity Fraud')]/../td[3]")
	public WebElement identityFraudCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Green Upgrades Coverage')]/../td[3]")
	public WebElement greenUpgradesCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Golf Cart Collision Coverage')]/../td[3]")
	public WebElement golfCartCollisionCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Loss Assessment Coverage')]/../td[3]")
	public WebElement lossAssessmentCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Personal Liability')]/../td[3]")
	public WebElement personalLiabilityCoveragesTab;

	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Medical Payments to Others (Each Person)')]/../td[3]")
	public WebElement medicalPaymentCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Premises Coverages for Owners')]/../td[3]")
	public WebElement premisesCoverageForOwnersCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Personal Injury Coverage')]/../td[3]")
	public WebElement personalInjuryCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Liability Total Premium')]/../td[3]")
	public WebElement liabilityTotalPremiumForHODPCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Earthquake Coverage')]/../td[3]")
	public WebElement earthquakeCoverageInCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]//tr/td[contains(text(),'Total Base Premium')]/../td[3]")
	public WebElement totalBasePremiumCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Policy Fee')]/td[3]")
	public WebElement policyFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Inspection Fee')]/td[3]")
	public WebElement inspectionFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Stamp Fee')]/td[3]")
	public WebElement stampFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Filing Fee')]/td[3]")
	public WebElement filingFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Surplus Lines Tax')]/td[3]")
	public WebElement surplusLinesTaxCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Windstorm tax')]/td[3]")
	public WebElement windstormTaxCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Fire Marshall Tax')]/td[3]")
	public WebElement fireMarshallTaxCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Clearing house fee')]/td[3]")
	public WebElement clearingHouseFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'HurricaneCatastropeFee')]/td[3]")
	public WebElement hurricaneCatastropeFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Citizen Assesment Fee')]/td[3]")
	public WebElement citizenAssessmentFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'DCA EMPA Residential Fee')]/td[3]")
	public WebElement DCAEMPAResidentialFeeCoveragesTab;
	
	@FindBy(xpath="//div[@id='CoverageLimitsPanel']//tr[contains(.,'Municipal tax')]/td[3]")
	public WebElement municipalTaxCoveragesTab;
	
	@FindBy(xpath="id('CoverageLimitsPanel')/div[1]/div[2]/table[4]/tbody/tr[1]/td[2]")
	public WebElement totalPremiumCoveragesTab;
	
	@FindBy(xpath="*//h3[6]/table/tbody/tr/td[2]/button")
	public WebElement SummaryTab;
	
	
	FireEvent FireEventobject = new FireEvent();
	
	HashMap<Object, Object> outputMap = new HashMap<Object, Object>();
	
	
	public Pg13_PSCoveragesTabPageOutput()
	{
    	    PageFactory.initElements(driver, this);
	}
		
	public void clickCoveragesTab() throws POMEventException
	{
		    FireEventobject.ClickElement(coveragesTabClick);
	}
		
	public void getWaterBackupCoveragesTab() throws POMEventException
	{
			outputMap.put("WaterBackupPremiumPSActual", FireEventobject.getValueByTextOutput(waterBackupCoveragesTab));
	}
	
	public void getOrdinanceLawCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("OrdinanceLawCoveragePSActual", FireEventobject.getValueByTextOutput(ordinanceLawCoverageInCoveragesTab));
	}
	
	public void getTheftCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("TheftCoveragePSActual", FireEventobject.getValueByTextOutput(theftCoverageInCoveragesTab));
	}
	
	public void getLimitedMoldCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("LimitedMoldCoveragePSActual", FireEventobject.getValueByTextOutput(limitedMoldCoverageInCoveragesTab));
	}
	
	public void getIdentityFraudCoveragesTab() throws POMEventException
	{
			outputMap.put("IdentityFraudCoveragePSActual", FireEventobject.getValueByTextOutput(identityFraudCoveragesTab));
	}
	
	public void getGreenUpgradesCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("GreenUpgradesCoveragePSActual", FireEventobject.getValueByTextOutput(greenUpgradesCoverageInCoveragesTab));
	}
	
	public void getGolfCartCollisionCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("GolfCartCollisionCoveragePSActual", FireEventobject.getValueByTextOutput(golfCartCollisionCoverageInCoveragesTab));
	}
	
	public void getLossAssessmentCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("LossAssessmentCoveragePSActual", FireEventobject.getValueByTextOutput(lossAssessmentCoverageInCoveragesTab));
	}
	
	public void getPersonalLiabilityCoveragesTab() throws POMEventException
	{
		    outputMap.put("PersonalLiabilityCoveragePSActual", FireEventobject.getValueByTextOutput(personalLiabilityCoveragesTab));
	}
	
	public void getMedicalPaymentCoveragesTab() throws POMEventException
	{
		    outputMap.put("MedicalPaymentCoveragePSActual", FireEventobject.getValueByTextOutput(medicalPaymentCoveragesTab));
	}
	
	public void getPremisesCoverageForOwnersCoveragesTab() throws POMEventException
	{
			outputMap.put("PremisesCoverageForOwnersPSActual", FireEventobject.getValueByTextOutput(premisesCoverageForOwnersCoveragesTab));
	}
	
	public void getPersonalInjuryCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("PersonalInjuryCoveragePSActual", FireEventobject.getValueByTextOutput(personalInjuryCoverageInCoveragesTab));
	}
	
	public void getLiabilityTotalPremiumForHODPCoveragesTab() throws POMEventException
	{
			outputMap.put("LiabilityTotalPremiumPSActual", FireEventobject.getValueByTextOutput(liabilityTotalPremiumForHODPCoveragesTab));
	}
	
	public void getEarthquakeCoverageInCoveragesTab() throws POMEventException
	{
			outputMap.put("EarthquakeCoveragePSActual", FireEventobject.getValueByTextOutput(earthquakeCoverageInCoveragesTab));
	}
	
	public void getTotalBasePremiumCoveragesTab() throws POMEventException
	{
			outputMap.put("TotalBasePremiumPSActual", FireEventobject.getValueByTextOutput(totalBasePremiumCoveragesTab));
	}
	
	public void getPolicyFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("PolicyFeePSActual", FireEventobject.getValueByTextOutput(policyFeeCoveragesTab));
	}
	
	public void getInspectionFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("InspectionFeePSActual", FireEventobject.getValueByTextOutput(inspectionFeeCoveragesTab));
	}
	
	public void getStampFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("StampFeePSActual", FireEventobject.getValueByTextOutput(stampFeeCoveragesTab));
	}
	
	public void getFilingFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("FilingFeePSActual", FireEventobject.getValueByTextOutput(filingFeeCoveragesTab));
	}
	
	public void getSurplusLinesTaxCoveragesTab() throws POMEventException
	{
			outputMap.put("SurplusLinesTaxPSActual", FireEventobject.getValueByTextOutput(surplusLinesTaxCoveragesTab));
	}
	
	public void getWindstormTaxCoveragesTab() throws POMEventException
	{
			outputMap.put("WindstormTaxPSActual", FireEventobject.getValueByTextOutput(windstormTaxCoveragesTab));
	}
	
	public void getFireMarshallTaxCoveragesTab() throws POMEventException
	{
			outputMap.put("FireMarshallTaxPSActual", FireEventobject.getValueByTextOutput(fireMarshallTaxCoveragesTab));
	}
	
	public void getClearingHouseFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("ClearingHouseFeePSActual", FireEventobject.getValueByTextOutput(clearingHouseFeeCoveragesTab));
	}
	
	public void getHurricaneCatastropeFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("HurricaneCatastropeFeePSActual", FireEventobject.getValueByTextOutput(hurricaneCatastropeFeeCoveragesTab));
	}
	
	public void getCitizenAssessmentFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("CitizenAssessmentFeePSActual", FireEventobject.getValueByTextOutput(citizenAssessmentFeeCoveragesTab));
	}
	
	public void getDCAEMPAResidentialFeeCoveragesTab() throws POMEventException
	{
			outputMap.put("DCAEMPAResidentialFeePSActual", FireEventobject.getValueByTextOutput(DCAEMPAResidentialFeeCoveragesTab));
	}
	
	public void getMunicipalTaxCoveragesTab() throws POMEventException
	{
			outputMap.put("MunicipalTaxPSActual", FireEventobject.getValueByTextOutput(municipalTaxCoveragesTab));
	}
	
	public void getTotalPremiumCoveragesTab() throws POMEventException
	{
			outputMap.put("TotalPremiumPSActual", FireEventobject.getValueByTextOutput(totalPremiumCoveragesTab));
	}
	
	public void clickSummaryTab() throws POMEventException
	{
		    FireEventobject.ClickElement(SummaryTab);
	}
	
	public HashMap<Object, Object> getPSCoveragesTabPageOutput()
	{
		System.out.println("Coverages HashMap :" +outputMap);
		return outputMap;
	}

}
