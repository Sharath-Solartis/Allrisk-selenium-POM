package com.solartis.test.pom.pages.input;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class Pg17_EndoCarrierSelectionPage extends PomEventsMethodDefinition
{
	
	FireEvent FireEventobject = new FireEvent();

	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__Plan__Dwellingcoverage')")
	public WebElement CoverageAEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__OtherStructureCovadjAmt\"]")
	public WebElement CoverageBEndo;
	@FindBy(xpath = "//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__PersonalPropCovadjamt\"]")
	public WebElement CoverageCEndo;
	@FindBy(xpath ="id('CarrierSelectionFormPage:carrierTile4:Object__Plan__LossOfUseCovadjAmt')")
	public WebElement CoverageDEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__RConContents\"]")
	public WebElement LossSettlementContentsEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Deductible\"]")
	public WebElement AllOtherPerilsDeductibleEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__WindHailDeductibleIncreasedPrecentage1\"]")
	public WebElement WindDeductibleEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__ExtendedReplacementCost\"]")
	public WebElement DwellingExtendedReplacementCostEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__WaterbackupDeductible\"]")
	public WebElement WaterBackupEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__OrdinanceLawCoverageLimit\"]")
	public WebElement OrdinanceOrLawCoverageEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Vandalism\"]")
	public WebElement VandalismAndMaliciousMischiefEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__TheftCoverage\"]")
	public WebElement TheftCoverageEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__IdentityTheft\"]")
	public WebElement IdentityFraudEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MoldAmt\"]")
	public WebElement LimitedMoldCoverageEndo;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__GreenUpgradesCoverage\"]")
	public WebElement GreenUpgradesCoverageEndo;
	@FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__GolfCartCollisionCoverage\"]")
    public WebElement GolfCartCollisionCoverageEndo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__LossAssessmentCovAmt\"]")
    public WebElement LossAssessmentCoverageEndo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Liability\"]")
    public WebElement PersonalLiabilityEndo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MedicalPaymentDeductible1\"]")
    public WebElement MedicalPaymentstoOthers1Endo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MedicalPaymentDeductible2\"]")
    public WebElement MedicalPaymentstoOthers2Endo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__PersonalInjury\"]")
    public WebElement PersonalInjuryCoverageEndo;
    @FindBy(xpath="id('CarrierSelectionFormPage:carrierTile4:Object__Plan__PremisesCoverage')")
    public WebElement PremisesCoverageforOwnersEndo;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__EarthQuakeCoverageType\"]")
    public WebElement EarthquakeCoverageEndo;
    @FindBy(xpath="//button/*[contains(text(),'Refresh Premium')]")
    public WebElement RefreshPremiumButtonEndo;
    @FindBy(xpath="id('CoverageSave')")
    public WebElement continueToEndoSummary;
    
    
    @FindBy(xpath ="id('topgrid')/tbody/tr[1]/td//a")
	public List<WebElement> carriers;
	
    
	
    public Pg17_EndoCarrierSelectionPage()
	{
    	    PageFactory.initElements(driver, this);
	}
    
    public void clickCoverageAEndo() throws POMEventException
	{			
			FireEventobject.ClickElement(CoverageAEndo);
	}
    
    public void clickCoverageBEndo() throws POMEventException
	{			
			FireEventobject.ClickElement(CoverageBEndo);
	}
 
    public void clickCoverageCEndo() throws POMEventException
	{
    		FireEventobject.ClickElement(CoverageCEndo);
	}
 
    public void clickCoverageDEndo() throws POMEventException
	{			
			FireEventobject.ClickElement(CoverageDEndo);
	}
 
    public void clearTextboxCoverageAEndo() throws POMEventException
	{				
			FireEventobject.clearTextbox(CoverageAEndo);
	}
 
    public void clearTextboxCoverageBEndo() throws POMEventException
	{				
			FireEventobject.clearTextbox(CoverageBEndo);
	}
 
    public void clearTextboxCoverageCEndo() throws POMEventException
	{				
			FireEventobject.clearTextbox(CoverageCEndo);
	}
 
    public void clearTextboxCoverageDEndo() throws POMEventException
	{				
			FireEventobject.clearTextbox(CoverageDEndo);
	}
 
    public void EnterCoverageAEndo(String Value) throws POMEventException
	{				
			FireEventobject.setTextThenTab(CoverageAEndo, Value);
	}
    
    public void EnterCoverageBEndo(String Value) throws POMEventException
	{		
		    FireEventobject.setTextThenTab(CoverageBEndo, Value);	
	}
    
    public void EnterCoverageCEndo(String Value) throws POMEventException
	{		
	    	FireEventobject.setTextThenTab(CoverageCEndo, Value);
	}
    
    public void EnterCoverageDEndo(String Value) throws POMEventException
	{		
		   FireEventobject.setTextThenTab(CoverageDEndo, Value);	
	}
	
	public void selectLossSettlementContentsEndo(String Value) throws POMEventException 
	{		
		   FireEventobject.Dropdown(LossSettlementContentsEndo , Value);
	}
	 
	public void selectAllOtherPerilsDeductibleEndo(String Value) throws POMEventException 
	{		
		   FireEventobject.Dropdown(AllOtherPerilsDeductibleEndo , Value);
	}
	 
	public void selectWindDeductibleEndo(String Value) throws POMEventException 
	{		
			FireEventobject.Dropdown(WindDeductibleEndo , Value);
	}
	 
	public void selectDwellingExtendedReplacementCostEndo(String Value) throws POMEventException 
	{		
			FireEventobject.Dropdown(DwellingExtendedReplacementCostEndo , Value);
	}
	 
	public void selectWaterBackupEndo(String Value) throws POMEventException 
	{		
			FireEventobject.Dropdown(WaterBackupEndo , Value);
	}
	
	public void selectOrdinanceOrLawCoverageEndo(String Value) throws POMEventException 
	{		
			FireEventobject.Dropdown(OrdinanceOrLawCoverageEndo , Value);
	}
	
	public void selectVandalismAndMaliciousMischiefEndo(String Value) throws POMEventException 
	{		
			FireEventobject.Dropdown(VandalismAndMaliciousMischiefEndo , Value);
	}
		 
	public void selectTheftCoverageEndo(String theftcvg) throws POMEventException
	{
	       FireEventobject.Dropdown(TheftCoverageEndo, theftcvg);
	}
	    
	public void selectIdentityFraudEndo(String identityfraud) throws POMEventException
	{
	       FireEventobject.Dropdown(IdentityFraudEndo, identityfraud);
	}
	    
	public void selectGreenUpgradesCoverageEndo(String greenupgradescvg) throws POMEventException
	{
	       FireEventobject.Dropdown(GreenUpgradesCoverageEndo, greenupgradescvg);
	}
	    
	public void selecLimitedMoldCoverageEndo(String limitedmold) throws POMEventException
	{
	       FireEventobject.Dropdown(LimitedMoldCoverageEndo, limitedmold);
	}
	    
	public void selectGolfCartCollisionCoverageEndo(String golfcartcollision) throws POMEventException
	{
	       FireEventobject.Dropdown(GolfCartCollisionCoverageEndo, golfcartcollision);
	}
	    
	public void selectLossAssessmentCoverageEndo(String lossassessment) throws POMEventException
	{
	       FireEventobject.Dropdown(LossAssessmentCoverageEndo, lossassessment);
	}
	    
	public void selectPersonalLiabilityEndo(String personalliability) throws POMEventException
	{
	       FireEventobject.Dropdown(PersonalLiabilityEndo, personalliability);
	}
	    
	public void selectMedicalPaymentstoOthers1Endo(String medicalpayment1) throws POMEventException
	{
	       FireEventobject.Dropdown(MedicalPaymentstoOthers1Endo, medicalpayment1);
	}
	    
	public void selectMedicalPaymentstoOthers2Endo(String medicalpayment2) throws POMEventException
	{
	       FireEventobject.Dropdown(MedicalPaymentstoOthers2Endo, medicalpayment2);
	}
	    
	public void selectPersonalInjuryCoverageEndo(String personalinjury) throws POMEventException
	{
	       FireEventobject.Dropdown(PersonalInjuryCoverageEndo, personalinjury);
	}
	    
	public void selectPremisesCoverageforOwnersEndo(String premisescoverage) throws POMEventException
	{
	       FireEventobject.Dropdown(PremisesCoverageforOwnersEndo, premisescoverage);
	}
	    
	public void selectEarthquakeCoverageEndo(String earthquakecoverage) throws POMEventException
	{
	       FireEventobject.Dropdown(EarthquakeCoverageEndo, earthquakecoverage);
	}
	    
	public void clickRefreshPremiumButtonEndo() throws POMEventException
	{
	       FireEventobject.ClickElement(RefreshPremiumButtonEndo);
	}
		    
	public void RefreshPremiumLoadingEndo() throws POMEventException
	{
	       FireEventobject.ProcessingLoadStickyForm();
	}
	
	public void RefreshPremiumCSoverlayLoadingEndo() throws POMEventException
	{
	       FireEventobject.ProcessingLoadCSOverlay();
	}
    
	public void clickcontinueToEndoSummary() throws POMEventException
	{
    		FireEventobject.ClickElement(continueToEndoSummary);
	}
    
	
}

