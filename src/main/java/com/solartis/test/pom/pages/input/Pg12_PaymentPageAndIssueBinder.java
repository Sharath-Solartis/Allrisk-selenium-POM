package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.common.exception.POMEventException;


public class Pg12_PaymentPageAndIssueBinder extends PomEventsMethodDefinition  
{

	    FireEvent FireEventobject = new FireEvent();
	
		@FindBy(xpath="id('updatepanel')/span/button/span[contains(text(),'Pay Now')]")
	    public WebElement paynowButton;
		
		@FindBy(xpath = "id('HeaderForm:quoteHeaderPanelTest:HeaderBlock')/table/tbody/tr[5]/td[2]/label")
		public WebElement billingType;
		
		@FindBy(xpath="id('PaymentForm:PaymentFormTile:ACDataTable_data')/tr/td[2]/input")
	    public WebElement IncludeITP;
		
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__QuoteInsured__FName')")
	    public WebElement contactFirstNameInDirectBill;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__QuoteInsured__LName')")
	    public WebElement contactLastNameInDirectBill;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__PaymentMethod')")
	    public WebElement paymentMethod;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardType')")
	    public WebElement cardType;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardNumber')")
	    public WebElement cardNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ExpirationMonth")
	    public WebElement expirationMonth;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ExpirationYear")
	    public WebElement expirationYear;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__CardVerificationNumber")
	    public WebElement cardVerificationNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__CheckNumber")
	    public WebElement CheckNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__BankName")
	    public WebElement BankName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:paymentDetailPanel')/table/tbody/tr[7]/td[2]/input")
	    public WebElement ClickCheckDate;
	    	    
	    public String CheckDate = "id('ui-datepicker-div')";
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AbaRoutingNumber")
	    public WebElement ABARoutingNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ConfirmABARoutingNo")
	    public WebElement ConfirmABARoutingNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:bankNamePanel:Object__Payment__BankName")
	    public WebElement NameOfFinancialInstitution;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AccountType")
	    public WebElement AccountType;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__AccountNumber")
	    public WebElement AccountNumber;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__ConfirmAccountNumber")
	    public WebElement ConfirmAccountNumber;
	  
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:AccountHolderInformation')/table/tbody/tr[2]/td/input")
	    public WebElement UseInsuredInformation;
	    
	    @FindBy(id="PaymentForm:PaymentFormTile:Object__Payment__UserAgreedCheck")
	    public WebElement AcceptTermsAndConditions;
	
	    @FindBy(xpath="id('PaymentForm')/button[2]/span[contains(text(),'Buy Now')]")
	    public WebElement BuyNow;
	    
	    @FindBy(xpath = "id('updatepanel')/button[2]/span[contains(text(),'Go to Policy Summary')]")
	    public WebElement GoToPolicySummary;
	    
	    @FindBy(xpath = "id('ErrorMessage1:ErrorMessageForm:ModuleErrorPanelId')//label")
	    public WebElement ErrorMessage;
	    
	    @FindBy(xpath = "id('HeaderForm:quoteHeaderPanelTest:HeaderBlock')/table/tbody/tr[3]/td[2]/label")
	    public WebElement carrierName;
	    
	    
	    
	    @FindBy(xpath=".//*[@id='profileoptionfind1']")
	    public WebElement inspectionFeeDownArrow;
	    
	    @FindBy(xpath="id('PremiumpanelDefaultQuote')/table/tbody/tr[3]/td[2]/label")
	    public WebElement inspectionFee;
	    
	    @FindBy(xpath="id('updatepanel')/button[2]/span[contains(text(),'Bind Request')]")
	    public WebElement bindRequest;
	    
	    @FindBy(xpath=".//*[@id='IssueBinderPanel']/img")
	    public WebElement issueBinderOptions;
	    
	    @FindBy(xpath="id('IssueBinderPanel')/div/div/a[contains(text(),'Issue Binder')]")
	    public WebElement issueBinderInHeader;
	    
	    @FindBy(xpath=".//*[@id='IssueBinderTile:binder:QuoteEffectiveDateButton']")
	    public WebElement effectiveDateClick;
	    
	    @FindBy(xpath="id('IssueBinderTile:binder:binders')/table/tbody/tr[5]/td[2]/input")
	    public WebElement contactFirstNameInAgencyBill;
	    
	    @FindBy(xpath="id('IssueBinderTile:binder:binders')/table/tbody/tr[6]/td[2]/input")
	    public WebElement contactLastNameInAgencyBill;
	    
	    @FindBy(xpath="id('IssueBinderTile:binder:binders')/table[2]/tbody/tr/td[3]/div/button/span[contains(text(),'Issue Binder')]")
	    public WebElement issueBinderButton;
	    
	    
	    
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardNumberMessage')")
	    public WebElement emptyCardNumber; 
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardVerificationNumberMessage')")
	    public WebElement emptyCardVerificationNumber; 
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CardHolderNameMessage')")
	    public WebElement emptyAccountHolderName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__AbaRoutingNumberMessage')")
	    public WebElement emptyABARoutingNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__ConfirmABARoutingNoMessage')")
	    public WebElement emptyConfirmABARoutingNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__FinancialInstitutionNameMessage')")
	    public WebElement emptyFinancialInstitutionName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__AccountNumberMessage')")
	    public WebElement emptyAccountNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__ConfirmAccountNumberMessage')")
	    public WebElement emptyConfirmAccountNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CheckNumberMessage')")
	    public WebElement emptyCheckNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__BankNameMessage')")
	    public WebElement emptyBankName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__CheckDateMessage')")
	    public WebElement emptyCheckDate;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StreetNumberMessage')")
	    public WebElement emptyStreetNumber;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StreetNameMessage')")
	    public WebElement emptyStreetName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__CityMessage')")
	    public WebElement emptyCityName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__StateMessage')")
	    public WebElement emptyStateName;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Location__ZipMessage')")
	    public WebElement emptyZipcode;
	    
	    @FindBy(xpath="id('PaymentForm:PaymentFormTile:Object__Payment__UserAgreedMessage')")
	    public WebElement emptyTermsAndConditions;
	    
	    
	    
	    
	    public Pg12_PaymentPageAndIssueBinder()
		{
	    	    PageFactory.initElements(driver, this);
		}
	    
	    public void paynowButtonClick() throws POMEventException
		{			
				FireEventobject.ClickElement(paynowButton);	
		}
	    
	    public void clickincludeITP() throws POMEventException
	  	{	  		
	  			FireEventobject.ClickElement(IncludeITP);	  			
	  	}
	    
	    public void enterContactFirstNameInDirectBill(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(contactFirstNameInDirectBill, value);	    		
		}
	    
	    public void enterContactLastNameInDirectBill(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(contactLastNameInDirectBill, value);	    		
		}
	    
	    public void selectPaymentMethod(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(paymentMethod , Value);			
		}
	    
	    public void selectCardType(String Value) throws POMEventException 
	  	{	  			
	  			FireEventobject.Dropdown(cardType , Value);	  			
	  	}
	    
	    public void enterCardNumber(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(cardNumber, value);	    		
		}
	    
	    public void selectExpirationMonth(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(expirationMonth , Value);			
		}
	    
	    public void selectExpirationYear(String Value) throws POMEventException 
		{			
				FireEventobject.Dropdown(expirationYear , Value);			
		}
	    
	    public void enterCardVerificationNumber(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(cardVerificationNumber, value);	    		
		}
	    
	    public void enterCheckNumber(String value) throws POMEventException
	  	{	  	    	
	      		FireEventobject.EnterTextWithoutEnter(CheckNumber, value);	  	    		
		}
	    
	    public void enterBankName(String value) throws POMEventException
	  	{	  	    	
	      		FireEventobject.EnterTextWithoutEnter(BankName, value);	  	    		
		}
	    
	    public void clickCheckDate() throws POMEventException
		{			
				FireEventobject.ClickElement(ClickCheckDate);			
		}
	    
	    public void enterABARoutingNumber(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(ABARoutingNumber, value);	    		
		}
	    
	    public void enterConfirmABARoutingNumber(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(ConfirmABARoutingNumber, value);	    		
		}
	    
	    public void enterNameOfFinancialInstitution(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(NameOfFinancialInstitution, value);	    		
		}
	    
	    public void selectAccountType(String Value) throws POMEventException 
	  	{	  			
	  			FireEventobject.Dropdown(AccountType , Value);	  			
	  	}
	    	    
	    public void enterAccountNumber(String value) throws POMEventException
	  	{	  	    	
	  	    	FireEventobject.EnterTextWithoutEnter(AccountNumber, value);	  	    		
	  	}
	    
	    public void enterConfirmAccountNumber(String value) throws POMEventException
	  	{	  	    	
	  	    	FireEventobject.EnterTextWithoutEnter(ConfirmAccountNumber, value);	  	    		
	  	}
	    
		public void DatePicker(String checkDate,String inputValue) throws POMEventException
		{			   
			   FireEventobject.DatePickerpopup(checkDate, inputValue);
		}
	    
		public void clickUseInsuredInformation() throws POMEventException
		{	  			
		  	   FireEventobject.ClickElement(UseInsuredInformation);	  			
		}
		    
		public void clickAcceptTermsAndConditions() throws POMEventException
		{	  			
		  	   FireEventobject.ClickElement(AcceptTermsAndConditions);	  			
		}
		    
		public void clickBuyNow() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(BuyNow);	  			
		}
		
		public String getBillingType() throws POMEventException
		{
			return FireEventobject.getValueByTextOutput(billingType);
		}
		    
		
		
		public String getCarrierName() throws POMEventException
		{
			return FireEventobject.getValueByTextOutput(carrierName);
		}
		
		public void clickInspectionFeeDownArrow() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(inspectionFeeDownArrow);	  			
		}
		
		public String getInspectionFee() throws POMEventException
		{	  			
			  return FireEventobject.getValueByTextOutput(inspectionFee);	  			
		}
		
		public void clickBindRequest() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(bindRequest);	  			
		}
		
		public void clickIssueBinderOptions() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(issueBinderOptions);	  			
		}
		
		public void clickIssueBinderInHeader() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(issueBinderInHeader);	  			
		}
		
		public void clickEffectiveDate() throws POMEventException
		{	  			
		  	  FireEventobject.ClickElement(effectiveDateClick);	  			
		}
		
		public void enterContactFirstNameInAgencyBill(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(contactFirstNameInAgencyBill, value);	    		
		}
	    
	    public void enterContactLastNameInAgencyBill(String value) throws POMEventException
		{	    	
	    		FireEventobject.EnterTextWithoutEnter(contactLastNameInAgencyBill, value);	    		
		}
	    
	    public void clickIssueBinderButton() throws POMEventException
		{	  			
		  	   FireEventobject.ClickElement(issueBinderButton);	  			
		}
	    
	    public void clickGoToPolicySummaryButton() throws POMEventException
	    {
	    	FireEventobject.ClickElement(GoToPolicySummary);
	    }
	    
	    
}
