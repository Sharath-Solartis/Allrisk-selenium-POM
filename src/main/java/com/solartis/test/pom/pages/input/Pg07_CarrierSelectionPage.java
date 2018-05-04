package com.solartis.test.pom.pages.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.output.Pg07_CarrierSelectionPageOutput;


public class Pg07_CarrierSelectionPage extends PomEventsMethodDefinition
{
	
	static int tablerow = 0;
	
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__PolicyDetail__EffectiveDate__Display')")
	public WebElement EffectiveDateClick;
	
	public String datePicker = "id('ui-datepicker-div')";
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__Policy__PolicyTerm')")
	public WebElement PolicyTerm;
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__PolicyDetail__QuoteType__DrpDown')")
	public WebElement QuoteType;
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__PolicyDetail__BillType__Drpdown')")
	public WebElement BillType;
	@FindBy(xpath ="//select[contains(@id,'PolicyFormOption')]")
	public WebElement LossSettlementDwelling;
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:Object__Plan__Dwellingcoverage')")
	public WebElement CoverageA;	
	@FindBy(xpath ="id('ProductSelectionFormPage:carrierTile:PFormsRepeat:0:Object__Policy__PolicyForm__Repeat:0')")
	public WebElement HO3BRDP1VDP1HO6Radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:1:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement HO5BRDP3VDP3radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:2:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement HO8Radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:3:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement DP1Radiobtn;
	@FindBy(xpath =".//*[@id='ProductSelectionFormPage:carrierTile:PFormsRepeat:4:Object__Policy__PolicyForm__Repeat:0']")
	public WebElement DP3Radiobtn;
	@FindBy(id ="ProductSelectionFormPage:carrierTile:GetratesButton")
	public WebElement GetRates;
	public String AlertBoxCloseButton = "id('CarrierSelectionFormPage:carrierTile4:VeRiskRuleMsgDialog')/div[1]/a/span";
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__OtherStructureCovadjAmt\"]")
	public WebElement CoverageB;
	@FindBy(xpath = "//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__PersonalPropCovadjamt\"]")
	public WebElement CoverageC;
	@FindBy(xpath ="id('CarrierSelectionFormPage:carrierTile4:Object__Plan__LossOfUseCovadjAmt')")
	public WebElement CoverageD;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__RConContents\"]")
	public WebElement LossSettlementContents;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Deductible\"]")
	public WebElement AllOtherPerilsDeductible;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__WindHailDeductibleIncreasedPrecentage1\"]")
	public WebElement WindDeductible;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__ExtendedReplacementCost\"]")
	public WebElement DwellingExtendedReplacementCost;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__WaterbackupDeductible\"]")
	public WebElement WaterBackup;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__OrdinanceLawCoverageLimit\"]")
	public WebElement OrdinanceOrLawCoverage;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Vandalism\"]")
	public WebElement VandalismAndMaliciousMischief;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__TheftCoverage\"]")
	public WebElement TheftCoverage;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__IdentityTheft\"]")
	public WebElement IdentityFraud;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MoldAmt\"]")
	public WebElement LimitedMoldCoverage;
	@FindBy(xpath ="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__GreenUpgradesCoverage\"]")
	public WebElement GreenUpgradesCoverage;
	@FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__GolfCartCollisionCoverage\"]")
    public WebElement GolfCartCollisionCoverage;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__LossAssessmentCovAmt\"]")
    public WebElement LossAssessmentCoverage;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__Liability\"]")
    public WebElement PersonalLiability;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MedicalPaymentDeductible1\"]")
    public WebElement MedicalPaymentstoOthers1;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__MedicalPaymentDeductible2\"]")
    public WebElement MedicalPaymentstoOthers2;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__PersonalInjury\"]")
    public WebElement PersonalInjuryCoverage;
    @FindBy(xpath="id('CarrierSelectionFormPage:carrierTile4:Object__Plan__PremisesCoverage')")
    public WebElement PremisesCoverageforOwners;
    @FindBy(xpath="//*[@id=\"CarrierSelectionFormPage:carrierTile4:Object__Plan__EarthQuakeCoverageType\"]")
    public WebElement EarthquakeCoverage;
    @FindBy(xpath="//button/*[contains(text(),'Refresh Premium')]")
    public WebElement RefreshPremiumButton;
	
    @FindBy(xpath="id('CarrierSelectionFormPage:carrierTile4:AddQNotesLink')/label")
    public WebElement addQuoteNotes;
    @FindBy(xpath="id('CarrierSelectionFormPage:carrierTile4:QuoteNotesPopup:CQNButton')/button")
    public WebElement saveButton;
	
	@FindBy(xpath ="id('topgrid')/tbody/tr[1]/td//a")
	public List<WebElement> carriers;
	
	
	FireEvent FireEventobject = new FireEvent();
	Pg07_CarrierSelectionPageOutput CSoP = new Pg07_CarrierSelectionPageOutput();
	
	public Pg07_CarrierSelectionPage() 
		{
			PageFactory.initElements(driver, this);
		}
	
	public void EffectiveDate() throws POMEventException
		{
		     	FireEventobject.ClickElement(EffectiveDateClick);
		}
	
	public void datePicker(String datePicker,String inputValue) throws POMEventException
	 {
		  	    FireEventobject.DatePickerpopup(datePicker, inputValue);
	 }
	
	 public void selectPolicyTerm(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(PolicyTerm , Value);
		}
	 
	 public void ProcessingLoad() throws POMEventException 
		{		
				FireEventobject.ProcessingLoad();
		}
	 
		 
	 public void selectQuoteType(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(QuoteType , Value);
		}
	
	 public void selectBillType(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(BillType , Value);
		}
	 
	 public void selectLossSettlementDwelling(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(LossSettlementDwelling , Value);
		}
	 
	 public void clickCoverageA() throws POMEventException
		{
				
				FireEventobject.ClickElement(CoverageA);
		}
	 
	 public void clickCoverageB() throws POMEventException
		{
				
				FireEventobject.ClickElement(CoverageB);
		}
	 
	 public void clickCoverageC() throws POMEventException
		{
		 FireEventobject.ClickElement(CoverageC);
		}
	 
	 public void clickCoverageD() throws POMEventException
		{
				
				FireEventobject.ClickElement(CoverageD);
		}
	 
	 public void clearTextboxCoverageA() throws POMEventException
		{
					
				FireEventobject.clearTextbox(CoverageA);
		}
	 
	 public void clearTextboxCoverageB() throws POMEventException
		{
					
				FireEventobject.clearTextbox(CoverageB);
		}
	 
	 public void clearTextboxCoverageC() throws POMEventException
		{
					
				FireEventobject.clearTextbox(CoverageC);
		}
	 
	 public void clearTextboxCoverageD() throws POMEventException
		{
					
				FireEventobject.clearTextbox(CoverageD);
		}
	 
	public void EnterCoverageA(String Value) throws POMEventException
		{
					
				FireEventobject.setTextThenTab(CoverageA, Value);
		}
		 
	/*public void selectHO3BRDP1VDP1HO6() throws POMEventException
		{
			
				FireEventobject.ClickElement(HO3BRDP1VDP1HO6Radiobtn);
		}
	
	public void selectHO5BRDP3VDP3() throws POMEventException
		{
			
				FireEventobject.ClickElement(HO5BRDP3VDP3radiobtn);
		}
	
	public void selectHO8() throws POMEventException
		{
	
				FireEventobject.ClickElement(HO8Radiobtn);
			
		}
	
	public void selectDP1() throws POMEventException
		{
			
				FireEventobject.ClickElement(DP1Radiobtn);
			
		}
	
	public void selectDP3() throws POMEventException
		{
			   FireEventobject.ClickElement(DP3Radiobtn);
			
		}*/
	
	public void selectHO3BRDP1VDP1HO6() throws POMEventException
	{
		
			FireEventobject.JSradioButton(HO3BRDP1VDP1HO6Radiobtn);
	}

	public void selectHO5BRDP3VDP3() throws POMEventException
	{
		
			FireEventobject.JSradioButton(HO5BRDP3VDP3radiobtn);
	}

	public void selectHO8() throws POMEventException
	{

			FireEventobject.JSradioButton(HO8Radiobtn);
		
	}

	public void selectDP1() throws POMEventException
	{
		
			FireEventobject.JSradioButton(DP1Radiobtn);
		
	}

	public void selectDP3() throws POMEventException
	{
		   FireEventobject.JSradioButton(DP3Radiobtn);
		
	}
		
	public void clickGetRates() throws POMEventException 
	{
		
			FireEventobject.ClickElement(GetRates);	
			
	}
	
	/*public void EnterCoverageB(String Value) throws POMEventException
		{
					
				FireEventobject.setTextThenTab(CoverageB , Value);
		}*/
	
	public void EnterCoverageB(String Value) throws POMEventException
	{
		
		FireEventobject.JStextbox(CoverageB, Value);
		
	}
	
	/*public void EnterCoverageC(String Value) throws POMEventException
		{
					
				FireEventobject.setTextThenTab(CoverageC , Value);
		}*/
	
	public void EnterCoverageC(String Value) throws POMEventException
	{
		
		FireEventobject.JStextbox(CoverageC, Value);
		
	}
		
	/*public void EnterCoverageD(String Value) throws POMEventException
		{
					
				FireEventobject.setTextThenTab(CoverageD , Value);
		}*/
	
	public void EnterCoverageD(String Value) throws POMEventException
	{
		
		FireEventobject.JStextbox(CoverageD, Value);
		
	}
	
	 public void selectLossSettlementContents(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(LossSettlementContents , Value);
		}
	 
	 public void selectAllOtherPerilsDeductible(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(AllOtherPerilsDeductible , Value);
		}
	 
	 public void selectWindDeductible(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(WindDeductible , Value);
		}
	 
	 public void selectDwellingExtendedReplacementCost(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(DwellingExtendedReplacementCost , Value);
		}
	 
	 public void selectWaterBackup(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(WaterBackup , Value);
		}
	 public void selectOrdinanceOrLawCoverage(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(OrdinanceOrLawCoverage , Value);
		}
	 public void selectVandalismAndMaliciousMischief(String Value) throws POMEventException 
		{		
				FireEventobject.Dropdown(VandalismAndMaliciousMischief , Value);
		}
		 
	 public void selectTheftCoverage(String theftcvg) throws POMEventException
	    {
	        FireEventobject.Dropdown(TheftCoverage, theftcvg);
	    }
	    
	    public void selectIdentityFraud(String identityfraud) throws POMEventException
	    {
	        FireEventobject.Dropdown(IdentityFraud, identityfraud);
	    }
	    
	    public void selectGreenUpgradesCoverage(String greenupgradescvg) throws POMEventException
	    {
	        FireEventobject.Dropdown(GreenUpgradesCoverage, greenupgradescvg);
	    }
	    
	    public void selecLimitedMoldCoverage(String limitedmold) throws POMEventException
	    {
	        FireEventobject.Dropdown(LimitedMoldCoverage, limitedmold);
	    }
	    
	    public void selectGolfCartCollisionCoverage(String golfcartcollision) throws POMEventException
	    {
	        FireEventobject.Dropdown(GolfCartCollisionCoverage, golfcartcollision);
	    }
	    
	    public void selectLossAssessmentCoverage(String lossassessment) throws POMEventException
	    {
	        FireEventobject.Dropdown(LossAssessmentCoverage, lossassessment);
	    }
	    
	    public void selectPersonalLiability(String personalliability) throws POMEventException
	    {
	        FireEventobject.Dropdown(PersonalLiability, personalliability);
	    }
	    
	    public void selectMedicalPaymentstoOthers1(String medicalpayment1) throws POMEventException
	    {
	        FireEventobject.Dropdown(MedicalPaymentstoOthers1, medicalpayment1);
	    }
	    
	    public void selectMedicalPaymentstoOthers2(String medicalpayment2) throws POMEventException
	    {
	        FireEventobject.Dropdown(MedicalPaymentstoOthers2, medicalpayment2);
	    }
	    
	    public void selectPersonalInjuryCoverage(String personalinjury) throws POMEventException
	    {
	        FireEventobject.Dropdown(PersonalInjuryCoverage, personalinjury);
	    }
	    
	    public void selectPremisesCoverageforOwners(String premisescoverage) throws POMEventException
	    {
	        FireEventobject.Dropdown(PremisesCoverageforOwners, premisescoverage);
	    }
	    
	    public void selectEarthquakeCoverage(String earthquakecoverage) throws POMEventException
	    {
	        FireEventobject.Dropdown(EarthquakeCoverage, earthquakecoverage);
	    }
	    
	    public void clickRefreshPremiumButton() throws POMEventException
	    {
	        FireEventobject.ClickElement(RefreshPremiumButton);
	    }
	
	    
	    public void RefreshPremiumLoading() throws POMEventException
	    {
	        FireEventobject.ProcessingLoadStickyForm();
	    }
	
	    public void RefreshPremiumCSoverlayLoading() throws POMEventException
	    {
	        FireEventobject.ProcessingLoadCSOverlay();
	    }
	    
	    public void alertPresence(String p) throws POMEventException
	    {
			    System.out.println("into ALERTPRESENCE");
				try
				{
					if(driver.findElement(By.xpath(p)).isDisplayed())
					{
						System.out.println("into if loop");
						WebElement element = driver.findElement(By.xpath(p));
						JavascriptExecutor click = (JavascriptExecutor) driver;
						click.executeScript("arguments[0].click();", element);
					}
				}
				catch(org.openqa.selenium.NoSuchElementException e)
				{
					System.out.println("into Else Loop");
				}
	    }
	    	
}