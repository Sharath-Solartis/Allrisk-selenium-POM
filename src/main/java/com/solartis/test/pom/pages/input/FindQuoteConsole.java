package com.solartis.test.pom.pages.input;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class FindQuoteConsole extends PomEventsMethodDefinition  
{
	@FindBy(xpath = "//button[contains(.,'BY QUOTE')]")
	public WebElement ByQuoteButton;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Agency__BusinessName_input")
	public WebElement FindByAgent;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__InsuredName")
	public WebElement FindByInsured;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__QuoteNumber")
	public WebElement FindByQuoteNumber;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__QuoteType")
	public WebElement FindByQuoteType;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__PreferredMarket")
	public WebElement FindByPreferredMarket;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__QuoteStatus")
	public WebElement FindByQuoteStatus;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__BillingType")
	public WebElement FindByBillingType;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__Carrier")
	public WebElement FindByCarrier;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__LOB")
	public WebElement FindByLOB;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__Product")
	public WebElement FindByProduct;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Plan__StateCode")
	public WebElement FindByState;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Plan__ZipCode")
	public WebElement FindByZipcode;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:j_idt237")
	public WebElement FindByCreatedDateAccordion;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__CreatedDateFrom")
	public WebElement CreatedDateFrom;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__CreatedDateTo")
	public WebElement CreatedDateTo;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:j_idt265")
	public WebElement FindByUpdatedDateAccordion;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__UpdatedDateFrom")
	public WebElement UpdatedDateFrom;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__UpdatedDateTo")
	public WebElement UpdatedDateTo;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:j_idt293")
	public WebElement FindByEffectiveDateAccordion;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__EffectiveDateFrom")
	public WebElement EffectiveDateFrom;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__EffectiveDateTo")
	public WebElement EffectiveDateTo;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:j_idt321")
	public WebElement FindByExpiryDateAccordion;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__ExpiryDateFrom")
	public WebElement ExpiryDateFrom;
	
	@FindBy(id = "FindQuoteForm:FindQuoteTile:Object__Quote__ExpiryDateTo")
	public WebElement ExpiryDateTo;
	
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElement ResetButton;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement SearchButton;
	
	FireEvent FireEventobject = new FireEvent();
	
	public FindQuoteConsole()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickByQuoteButton() throws POMEventException
	{
		FireEventobject.ClickElement(ByQuoteButton);
	}
	
	public void findByAgencyAgent(String value) throws POMEventException, InterruptedException
	{
		FireEventobject.ClickElement(FindByAgent);
		FireEventobject.EnterTextWithoutEnter(FindByAgent, value);
		Thread.sleep(5000);
		FindByAgent.sendKeys(Keys.ENTER);
	}
	
	public void findByInsured(String value) throws POMEventException, InterruptedException
	{
		FireEventobject.ClickElement(FindByInsured);
		FireEventobject.EnterTextWithoutEnter(FindByInsured, value);
		Thread.sleep(2000);
		FindByInsured.sendKeys(Keys.ENTER);
	}
	
	public void findByQuoteNumber(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByQuoteNumber, value);
	}
	
	public void findByQuoteType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByQuoteType, value);
	}
	
	public void findByPreferredMarket(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByPreferredMarket, value);
	}
	
	public void findByQuoteStatus(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByQuoteStatus, value);
	}
	
	public void findByBillingType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByBillingType, value);
	}
	
	public void findByCarrier(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByCarrier, value);
	}
	
	public void findByLOB(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByLOB, value);
	}
	
	public void findByProduct(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByProduct, value);
	}
	
	public void findByState(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByState, value);
	}
	
	public void findByZipcode(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByZipcode, value);
	}
	
	public void datePicker(String datePicker, String value) throws POMEventException
	{
		FireEventobject.DatePickerpopup(datePicker, value);
	}
	
	public void clickFindByCreatedDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByCreatedDateAccordion);
	}
	
	public void clickCreatedDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(CreatedDateFrom);
	}
	
	public void clickCreatedDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(CreatedDateTo);
	}
	
	public void clickFindByUpdatedDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByUpdatedDateAccordion);
	}
	
	public void clickUpdatedDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(UpdatedDateFrom);
	}
	
	public void clickUpdatedDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(UpdatedDateTo);
	}
	
	public void clickFindByEffectiveDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByEffectiveDateAccordion);
	}
	
	public void clickEffectiveDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(EffectiveDateFrom);
	}
	
	public void clickEffectiveDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(EffectiveDateTo);
	}
	
	public void clickFindByExpiryDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByExpiryDateAccordion);
	}
	
	public void clickExpiryDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(ExpiryDateFrom);
	}
	
	public void clickExpiryDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(ExpiryDateTo);
	}
	
	public void clickQuoteNumberLink(String value) throws POMEventException
	{
		FireEventobject.ClickElement(driver.findElement(By.xpath("//a[contains(.,'"+value+"')]")));
	}
	
	public void clickResetButton() throws POMEventException
	{
		FireEventobject.ClickElement(ResetButton);
	}
	
	public void clickSearchButton() throws POMEventException
	{
		FireEventobject.ClickElement(SearchButton);
	}

}
