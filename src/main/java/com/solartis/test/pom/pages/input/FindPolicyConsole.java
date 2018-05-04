package com.solartis.test.pom.pages.input;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class FindPolicyConsole extends PomEventsMethodDefinition
{
	@FindBy(xpath = "//button[contains(.,'BY POLICY')]")
	public WebElement ByPolicyButton;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Agency__BusinessName_input")
	public WebElement FindByAgent;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__PolicyNumber")
	public WebElement FindByPolicyNumber;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__InsuredName")
	public WebElement FindByInsured;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Quote__QuoteNumber")
	public WebElement FindByQuoteNumber;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__PolicyStatus")
	public WebElement FindByPolicyStatus;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__PolicyType")
	public WebElement FindByPolicyType;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__PreferredMarket")
	public WebElement FindByPreferredMarket;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__LOB")
	public WebElement FindByLOB;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__Product")
	public WebElement FindByProduct;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__Carrier")
	public WebElement FindByCarrier;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Plan__State")
	public WebElement FindByState;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__Zipcode")
	public WebElement FindByZipcode;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__SignedApp")
	public WebElement FindBySignedApplicationReceived;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__Decline")
	public WebElement FindByCarrierFormReceived;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__AppData")
	public WebElement FindByDataEntryCompleted;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:j_idt269")
	public WebElement FindByCreatedDateAccordion;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__CreatedDateFrom")
	public WebElement CreatedDateFrom;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__CreatedDateTo")
	public WebElement CreatedDateTo;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:j_idt297")
	public WebElement FindByPolicyEffectiveDateAccordion;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__EffectiveDateFrom")
	public WebElement EffectiveDateFrom;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__EffectiveDateTo")
	public WebElement EffectiveDateTo;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:j_idt325")
	public WebElement FindByPolicyExpiryDateAccordion;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__ExpiryDateFrom")
	public WebElement ExpiryDateFrom;
	
	@FindBy(id = "FindPolicyForm:FindPolicyTile:Object__Policy__ExpiryDateTo")
	public WebElement ExpiryDateTo;
	
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElement ResetButton;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement SearchButton;
	
	FireEvent FireEventobject = new FireEvent();
	
	public FindPolicyConsole()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickByPolicyButton() throws POMEventException
	{
		FireEventobject.ClickElement(ByPolicyButton);
	}
	
	public void findByAgencyAgent(String value) throws POMEventException, InterruptedException
	{
		FireEventobject.ClickElement(FindByAgent);
		FireEventobject.EnterTextWithoutEnter(FindByAgent, value);
		Thread.sleep(5000);
		FindByAgent.sendKeys(Keys.ENTER);
	}
	
	public void findByPolicyNumber(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByPolicyNumber, value);
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
	
	public void findByPolicyStatus(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByPolicyStatus, value);
	}
	
	public void findByPolicyType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByPolicyType, value);
	}
	
	public void findByPreferredMarket(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByPreferredMarket, value);
	}
	
	public void findByLOB(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByLOB, value);
	}
	
	public void findByProduct(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByProduct, value);
	}
	
	public void findByCarrier(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByCarrier, value);
	}
	
	public void findByState(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByState, value);
	}
	
	public void findByZipcode(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByZipcode, value);
	}
	
	public void findBySignedApplicationReceived(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindBySignedApplicationReceived, value);
	}
	
	public void findByCarrierFormReceived(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByCarrierFormReceived, value);
	}
	
	public void findByDataEntryCompleted(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByDataEntryCompleted, value);
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
	
	public void clickFindByPolicyEffectiveDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByPolicyEffectiveDateAccordion);
	}
	
	public void clickPolicyEffectiveDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(EffectiveDateFrom);
	}
	
	public void clickPolicyEffectiveDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(EffectiveDateTo);
	}
	
	public void clickFindByPolicyExpiryDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByPolicyExpiryDateAccordion);
	}
	
	public void clickPolicyExpiryDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(ExpiryDateFrom);
	}
	
	public void clickPolicyExpiryDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(ExpiryDateTo);
	}
	
	public void clickPolicyNumberLink(String value) throws POMEventException
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
