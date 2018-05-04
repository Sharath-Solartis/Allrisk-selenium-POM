package com.solartis.test.pom.pages.input;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class FindInsuredConsole extends PomEventsMethodDefinition
{
	@FindBy(xpath = "//button[contains(.,'BY INSURED')]")
	public WebElement ByInsuredButton;

	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Agency__BusinessName_input")
	public WebElement FindByAgent;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Insured__InsuredName")
	public WebElement FindByInsured;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:j_idt150")
	public WebElement FindByCreatedDateAccordion;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Insured__CreatedDateFrom")
	public WebElement CreatedDateFrom;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Insured__CreatedDateTo")
	public WebElement CreatedDateTo;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:j_idt178")
	public WebElement FindByLastModifiedDateAccordion;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Insured__UpdatedDateFrom")
	public WebElement ModifiedDateFrom;
	
	@FindBy(id = "FindInsuredForm:FindInsuredTile:Object__Insured__UpdatedDateTo")
	public WebElement ModifiedDateTo;
	
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElement ResetButton;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement SearchButton;
	
	FireEvent FireEventobject = new FireEvent();
	
	public FindInsuredConsole()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickByInsuredButton() throws POMEventException
	{
		FireEventobject.ClickElement(ByInsuredButton);
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
		//FindByInsured.sendKeys(Keys.ENTER);
	}
	
	public void clickCreatedDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByCreatedDateAccordion);
	}
	
	public void datePicker(String datePicker, String value) throws POMEventException
	{
		FireEventobject.DatePickerpopup(datePicker, value);
	}
	
	public void clickCreatedDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(CreatedDateFrom);
	}
	
	public void clickCreatedDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(CreatedDateTo);
	}
	
	public void clickLastModifiedDateAccordion() throws POMEventException
	{
		FireEventobject.ClickElement(FindByLastModifiedDateAccordion);
	}
	
	public void clickModifiedDateFrom() throws POMEventException
	{
		FireEventobject.ClickElement(ModifiedDateFrom);
	}
	
	public void clickModifiedDateTo() throws POMEventException
	{
		FireEventobject.ClickElement(ModifiedDateTo);
	}
	
	public void clickInsuredNameLink(String value) throws POMEventException
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
