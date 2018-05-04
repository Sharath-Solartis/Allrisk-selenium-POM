package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg19_EndoPaymentPage extends PomEventsMethodDefinition
{
	
		FireEvent FireEventobject = new FireEvent();

	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__PaymentMethod')")
	    public WebElement paymentMethodEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardType')")
	    public WebElement cardTypeEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardNumber')")
	    public WebElement cardNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ExpirationMonth")
	    public WebElement expirationMonthEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ExpirationYear")
	    public WebElement expirationYearEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__CardVerificationNumber")
	    public WebElement cardVerificationNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__CheckNumber")
	    public WebElement CheckNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__BankName")
	    public WebElement BankNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:paymentDetailPanel')/table/tbody/tr[7]/td[2]/input")
	    public WebElement ClickCheckDateEndo;
	    	    
	    public String CheckDateEndo = "id('ui-datepicker-div')";
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AbaRoutingNumber")
	    public WebElement ABARoutingNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ConfirmABARoutingNo")
	    public WebElement ConfirmABARoutingNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:bankNamePanel:Object__Payment__BankName")
	    public WebElement NameOfFinancialInstitutionEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AccountType")
	    public WebElement AccountTypeEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AccountNumber")
	    public WebElement AccountNumberEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ConfirmAccountNumber")
	    public WebElement ConfirmAccountNumberEndo;
	  
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:AccountHolderInformation')/table/tbody/tr[2]/td/input")
	    public WebElement UseInsuredInformationEndo;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__UserAgreedCheck")
	    public WebElement AcceptTermsAndConditionsEndo;
	
	    @FindBy(xpath="id('PaymentForm')/button[2]/span[contains(text(),'Buy Now')]")
	    public WebElement BuyNowEndo;
	
	    @FindBy(xpath="id('QuoteDetails')/div/table/tbody/tr/td[1]/span/button")
	    public WebElement EndoReturnToPolicySummary;
	    
	    	    
	
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardNumberMessage')")
	    public WebElement emptyCardNumberEndo; 
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardVerificationNumberMessage')")
	    public WebElement emptyCardVerificationNumberEndo; 
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardHolderNameMessage')")
	    public WebElement emptyAccountHolderNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__AbaRoutingNumberMessage')")
	    public WebElement emptyABARoutingNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__ConfirmABARoutingNoMessage')")
	    public WebElement emptyConfirmABARoutingNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__FinancialInstitutionNameMessage')")
	    public WebElement emptyFinancialInstitutionNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__AccountNumberMessage')")
	    public WebElement emptyAccountNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__ConfirmAccountNumberMessage')")
	    public WebElement emptyConfirmAccountNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CheckNumberMessage')")
	    public WebElement emptyCheckNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__BankNameMessage')")
	    public WebElement emptyBankNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CheckDateMessage')")
	    public WebElement emptyCheckDateEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StreetNumberMessage')")
	    public WebElement emptyStreetNumberEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StreetNameMessage')")
	    public WebElement emptyStreetNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__CityMessage')")
	    public WebElement emptyCityNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StateMessage')")
	    public WebElement emptyStateNameEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__ZipMessage')")
	    public WebElement emptyZipcodeEndo;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__UserAgreedMessage')")
	    public WebElement emptyTermsAndConditionsEndo;
	    
	    
	    
	    
	    public Pg19_EndoPaymentPage()
		{
	    	    PageFactory.initElements(driver, this);
		}
	    
	    public void selectPaymentMethodEndo(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(paymentMethodEndo , Value);			
		}
	    
	    public void selectCardTypeEndo(String Value) throws POMEventException 
	  	{	  			
	  			FireEventobject.Dropdown(cardTypeEndo , Value);	  			
	  	}
	    
	    public void enterCardNumberEndo(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(cardNumberEndo, value);	    		
		}
	    
	    public void selectExpirationMonthEndo(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(expirationMonthEndo , Value);			
		}
	    
	    public void selectExpirationYearEndo(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(expirationYearEndo , Value);			
		}
	    
	    public void enterCardVerificationNumberEndo(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(cardVerificationNumberEndo, value);	    		
		}
	    
	    public void enterCheckNumberEndo(String value) throws POMEventException
	  	{	  	    	
	      		FireEventobject.EnterTextWithoutEnter(CheckNumberEndo, value);	  	    		
		}
	    
	    public void enterBankNameEndo(String value) throws POMEventException
	  	{	  	    	
	      		FireEventobject.EnterTextWithoutEnter(BankNameEndo, value);	  	    		
		}
	    
	    public void clickCheckDateEndo() throws POMEventException
		{			
				FireEventobject.ClickElement(ClickCheckDateEndo);			
		}
	    
	    public void enterABARoutingNumberEndo(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(ABARoutingNumberEndo, value);	    		
		}
	    
	    public void enterConfirmABARoutingNumberEndo(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(ConfirmABARoutingNumberEndo, value);	    		
		}
	    
	    public void enterNameOfFinancialInstitutionEndo(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(NameOfFinancialInstitutionEndo, value);	    		
		}
	    
	    public void selectAccountTypeEndo(String Value) throws POMEventException 
	  	{	  			
	  			FireEventobject.Dropdown(AccountTypeEndo, Value);	  			
	  	}
	    	    
	    public void enterAccountNumberEndo(String value) throws POMEventException
	  	{	  	    	
	  	    	FireEventobject.EnterTextWithoutEnter(AccountNumberEndo, value);	  	    		
	  	}
	    
	    public void enterConfirmAccountNumberEndo(String value) throws POMEventException
	  	{	  	    	
	  	    	FireEventobject.EnterTextWithoutEnter(ConfirmAccountNumberEndo, value);	  	    		
	  	}
	    
		public void DatePickerEndo(String checkDateEndo,String inputValue) throws POMEventException
		{			   
			   FireEventobject.DatePickerpopup(checkDateEndo, inputValue);
		}
	    
		public void clickUseInsuredInformationEndo() throws POMEventException
		{	  			
		  	   FireEventobject.ClickElement(UseInsuredInformationEndo);	  			
		}
		    
		public void clickAcceptTermsAndConditionsEndo() throws POMEventException
		{	  			
		  	   FireEventobject.ClickElement(AcceptTermsAndConditionsEndo);	  			
		}
		    
		public void clickBuyNowEndo() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(BuyNowEndo);	  			
		}
	
		public void clickEndoReturnToPolicySummary() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(EndoReturnToPolicySummary);	  			
		}
		
}
