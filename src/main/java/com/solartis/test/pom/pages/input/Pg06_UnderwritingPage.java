package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg06_UnderwritingPage extends PomEventsMethodDefinition
{
	
	public String BusinessChildcare = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__OtherBusiness2')";
		
	@FindBy(id ="AdditionalTile:underwritingTile:Object__Risk__ResProperty__BusinessType")
	public WebElement DescBusinessActivities;
	
	public String AnyEmployees = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__InsuredEmploy')";

	@FindBy(id ="AdditionalTile:underwritingTile:Object__Risk__ResProperty__NumberOfChildren")
	public WebElement DaycareAttendingChildren;
	
	public String SwimmingPool = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__Swimming__Pool__On__Premises')";

	public String FullyFenced = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__SwimmingPoolFenceType')";

	public String AnimalBite = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__AnimalsBitinghistory2')";

	public String TrustEstate = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__InsuredResidence')";

	public String NationalRegisterHistoric = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__IsListOnHistoricPlace')";

	public String ToursConducted = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__TourConducted')";

	public String HighProfileIndividual = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__HighProfileIndividual')";

	public String LocationinPast = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__LocationCancelledPreviously')";

	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__PurchaseDurationInfo']")
	public WebElement BRLocationIsWas;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__Purchased__Amountbr']")
	public WebElement BRPurchasePrice;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__DateOfPurchase']")
	public WebElement BRDateOfPurchase;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__ExtendOfRenovation']")
	public WebElement BRTypeOfRenovation;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationCost']")
	public WebElement BRCostOfRenovations;
	
	public String BRConstructionBegan = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationStarted']";

	public String BRRenovationWitin3months = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationStartedMonths']";

	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationEstimatedEndDate']")
	public WebElement BREstimatedCompletionDateClick;
	
	
	public String datePicker = "id('ui-datepicker-div')";
	
	public String BRRenovationsCompleted = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationCompletedbr']";

	public String BREntityOwned = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__Renovation__Operations']";

	public String BRLicensedContracter = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__LicensedRenovator']";

	public String BRLockedFencedBoarded = "id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__PropertyLockedFencedBoardedbr')";

	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__IntentionForProperty')")
	public WebElement BRIntentionForProperty;
	
	public String VacPurchasedLast12months = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RecentPurchasedLocation']";
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__Purchased__AmountVacant']")
	public WebElement VacPurchasePriceVacant;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:vacantdate:Object__Risk__ResProperty__DateOfPurchase']")
	public WebElement VacDateOfPurchaseVacantClick;
	
	@FindBy(xpath =".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__VacantDate']")
	public WebElement VacLocationBecameVacantClick;
	
	public String VacRenovationsCompleted = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationCompletedvacant']";

	public String VacLockedFencedBoardedVacant = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__PropertyLockedFencedBoardedvacant']";

	public String VacPlanToOccupancy = ".//*[@id='AdditionalTile:underwritingTile:Object__Risk__ResProperty__PropertyToSellRent']";

	@FindBy(xpath ="id('additionalInterestTile:AdditionalInterest')/div[2]/button")
	public WebElement AddButton;
	
	@FindBy(xpath ="id('additionalInterestTile:AIForm:Object__Risk__ResProperty__AdditionalInterest__InterestType')")
	public WebElement AdditionalInterestType;
	
	@FindBy(xpath ="id('additionalInterestTile:AIForm:Object__Risk__ResProperty__AdditionalInterest__InterestCompanyName')")
	public WebElement AdditionalInterestName;
	
	@FindBy(xpath ="*//button/span[contains(text(),'Save')]")
	public WebElement SaveButton;
		
	@FindBy(xpath ="id('additionalInterestTile:AIdialog')/div[1]/a/span")
	public WebElement CloseButton;
	
	@FindBy(xpath ="id('msgspan')")
	public WebElement ProcessingLoad;
	
	@FindBy(xpath ="//*[contains(text(),'Continue To Carrier Selection')]")
	public WebElement continueToCSP;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__thislocationisMsg')")
	public WebElement emptyBRLocationIsWas;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__HiddenMsg')")
	public WebElement emptyBRTypeOfRenovation;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationEstimatedEndDateMsg')")
	public WebElement emptyBREstimatedCompletionDate;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationCompletedbrMsg')")
	public WebElement emptyRenovationCompletedBR;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__IntentionForPropertyMsg')")
	public WebElement emptyBRIntentionOfProperty;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__VacantDateMsg')")
	public WebElement emptyVacantDate;
	
	@FindBy(xpath ="id('AdditionalTile:underwritingTile:Object__Risk__ResProperty__RenovationCompletedvacantMsg')")
	public WebElement emptyVacantRenovationCompleted;
	
	@FindBy(xpath ="id('additionalInterestTile:AIForm:InterestType')")
	public WebElement emptyAdditionalInterestType;
	
	@FindBy(xpath ="id('additionalInterestTile:AIForm:InterestName')")
	public WebElement emptyAdditionalInterestName;
	
	FireEvent FireEventobject = new FireEvent();
	
	
	
	
	public Pg06_UnderwritingPage() 
	{
		   PageFactory.initElements(driver, this);
	}
	
	public void clickBusinessChildcare(String inputValue) throws POMEventException
	{
		
			FireEventobject.toggleButton(BusinessChildcare,inputValue);
		
	}
	
	 public void clickDescBusinessActivities(String value) throws POMEventException
	{
	    	
	    	FireEventobject.EnterTextWithoutEnter(DescBusinessActivities, value);
	    		
	}
	    
	 public void clickAnyEmployees(String inputValue) throws POMEventException
	{
			
			FireEventobject.toggleButton(AnyEmployees,inputValue);
			
	}
	 
	 public void clickDaycareAttendingChildren(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(DaycareAttendingChildren , Value);
			
	}
	
	 public void clickSwimmingPool(String inputValue) throws POMEventException
	 {
				
			FireEventobject.toggleButton(SwimmingPool,inputValue);
				
	 }
	 
	 public void clickFullyFenced(String inputValue) throws POMEventException
	 {
					
			FireEventobject.toggleButton(FullyFenced,inputValue);
					
	 }
	 
	 public void clickAnimalBite(String inputValue) throws POMEventException
	 {
						
			FireEventobject.toggleButton(AnimalBite,inputValue);
						
	 }
	 
	 public void clickTrustEstate(String inputValue) throws POMEventException
	 {
							
			FireEventobject.toggleButton(TrustEstate,inputValue);
							
	 }
	 
	 public void clickNationalRegisterHistoric(String inputValue) throws POMEventException
	 {
								
			FireEventobject.toggleButton(NationalRegisterHistoric,inputValue);
								
	 }
	 
	 public void clickToursConducted(String inputValue) throws POMEventException
	 {
									
			FireEventobject.toggleButton(ToursConducted,inputValue);
									
	 }
	 
	 public void clickHighProfileIndividual(String inputValue) throws POMEventException
	 {
										
			FireEventobject.toggleButton(HighProfileIndividual,inputValue);
										
	 }
	 
	 public void clickLocationinPast(String inputValue) throws POMEventException
	 {
											
			FireEventobject.toggleButton(LocationinPast,inputValue);
											
	 }
	 
	 public void selectBRLocationIsWas(String inputValue) throws POMEventException
	 {
			
			FireEventobject.Dropdown(BRLocationIsWas, inputValue);
			
	 }
		
	 public void clickBRPurchasePrice(String inputValue) throws POMEventException
	 {
		    	
		    FireEventobject.EnterTextWithoutEnter(BRPurchasePrice, inputValue);
		    		
	 }
	 
	 public void clickBRDateOfPurchase() throws POMEventException
	{
			
			FireEventobject.ClickElement(BRDateOfPurchase);
			
	}
	
	 public void selectBRTypeOfRenovation(String inputValue) throws POMEventException
	 {
				
			FireEventobject.Dropdown(BRTypeOfRenovation, inputValue);
				
	 }
	 
	 public void enterBRCostOfRenovations(String inputValue) throws POMEventException
	 {
			    	
		    FireEventobject.EnterTextWithoutEnter(BRCostOfRenovations, inputValue);
			    		
	 } 
	 
	 public void clickBRConstructionBegan(String inputValue) throws POMEventException
	 {
												
			FireEventobject.toggleButton(BRConstructionBegan,inputValue);
												
	 }
	
	 public void clickBRRenovationWitin3months(String inputValue) throws POMEventException
	 {
												
			FireEventobject.toggleButton(BRRenovationWitin3months,inputValue);
												
	 }
	 
	 public void clickBREstimatedCompletionDate() throws POMEventException
	{
			
			FireEventobject.ClickElement(BREstimatedCompletionDateClick);
			
	}
	 
	 public void datePicker(String datePicker,String inputValue) throws POMEventException
	 {
		   
		   FireEventobject.DatePickerpopup(datePicker, inputValue);
	 }
	 
	 public void clickBRRenovationsCompleted(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(BRRenovationsCompleted,inputValue);
														
	 }
	 
	 public void clickBREntityOwned(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(BREntityOwned,inputValue);
														
	 }
	 
	 public void clickBRLicensedContracter(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(BRLicensedContracter,inputValue);
														
	 }
	 
	 public void clickBRLockedFencedBoarded(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(BRLockedFencedBoarded,inputValue);
														
	 }
	 
	 public void selectBRIntentionForProperty(String inputValue) throws POMEventException
	 {
				
			FireEventobject.Dropdown(BRIntentionForProperty, inputValue);
				
	 }
	 public void clickVacPurchasedLast12months(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(VacPurchasedLast12months,inputValue);
														
	 }
	 
	 public void enterVacPurchasePriceVacant(String inputValue) throws POMEventException
	 {
			    	
		    FireEventobject.EnterTextWithoutEnter(VacPurchasePriceVacant, inputValue);
			    		
	 } 
	 
	 public void clickVacDateOfPurchaseVacant() throws POMEventException
	 {
				
			FireEventobject.ClickElement(VacDateOfPurchaseVacantClick);
				
	 }
		 
	
	public void clickVacLocationBecameVacant() throws POMEventException
	 {
				
			FireEventobject.ClickElement(VacLocationBecameVacantClick);
				
	 }
	
	public void clickVacRenovationsCompleted(String inputValue) throws POMEventException
	{
														
			FireEventobject.toggleButton(VacRenovationsCompleted,inputValue);
														
	}
	
	
	public void clickVacLockedFencedBoardedVacant(String inputValue) throws POMEventException
	{
														
			FireEventobject.toggleButton(VacLockedFencedBoardedVacant,inputValue);
														
	}
	
	public void clickVacPlanToOccupancy(String inputValue) throws POMEventException
	 {
														
			FireEventobject.toggleButton(VacPlanToOccupancy,inputValue);
														
	 }
	public void clickAddButton() throws POMEventException
	 {
				
			FireEventobject.ClickElement(AddButton);
				
	 }
	
	public void selectAdditionalInterestType(String inputValue) throws POMEventException
	 {
				
			FireEventobject.Dropdown(AdditionalInterestType, inputValue);
				
	 }
	 
	
	public void clickContCSP() throws POMEventException
	{
		
			FireEventobject.ClickElement(continueToCSP);
		
	}
	
	public void enterAdditionalInterestName(String inputValue) throws POMEventException
	 {
			    	
		    FireEventobject.EnterTextWithoutEnter(AdditionalInterestName, inputValue);
			    		
	 } 
	 
	 public void clickSaveButton() throws POMEventException
	 {
				
			FireEventobject.ClickElement(SaveButton);
				
	 }
	 
	 public void clickCloseButton() throws POMEventException
	 {
				
			FireEventobject.ClickElement(CloseButton);
				
	 }
	 
	 
	public Pg07_CarrierSelectionPage uwpage1()
	{
		  return new Pg07_CarrierSelectionPage();
	}
}