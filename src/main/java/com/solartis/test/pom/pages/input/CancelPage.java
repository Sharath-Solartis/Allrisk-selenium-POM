package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.common.exception.POMEventException;

public class CancelPage extends PomEventsMethodDefinition 
{
	FireEvent FireEventobject = new FireEvent();
	
	@FindBy(xpath = "*//h3[8]/table/tbody/tr/td[2]/button")
	public WebElement CancelTab;
	
	@FindBy(xpath = "id('CancelTile:cancelForm:Object__Quote__EffectiveDate')")
	public WebElement CancelEffectiveDate;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(xpath = "id('CancelTile:cancelForm:Object__Plan__CancelType')")
	public WebElement CancelType;
	
	public String MinEarnedInforced = "id('CancelTile:cancelForm:Object__Plan__MinEarnedEnforced')";
	
	public String IsPolicyFeeReturned = "id('CancelTile:cancelForm:Object__Plan__IsPolicyFeeReturned')";
	
	@FindBy(xpath = "id('CancelTile:cancelForm:Object__Cancel__Reason')")
	public WebElement CancelReason;
	
	@FindBy(xpath = "id('CancelTile:cancelForm:CancelAbortButton')")
	public WebElement CancelAbort;
	
	@FindBy(xpath = "id('CancelTile:cancelForm:cancelButtonID')/button")
	public WebElement CancelPolicyButton;
	
	
	public CancelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCancelTab() throws POMEventException
	{
		FireEventobject.ClickElement(CancelTab);
	}
	
	public void clickCancelEffectiveDate() throws POMEventException
	{
		FireEventobject.ClickElement(CancelEffectiveDate);
	}
	
	public void DatePicker(String datePicker,String inputValue) throws POMEventException
	{			   
		FireEventobject.DatePickerpopup(datePicker, inputValue);
	}
	
	public void selectCancelType(String Value) throws POMEventException
	{
		FireEventobject.Dropdown(CancelType, Value);
	}
	
	public void selectMinEarnedInforced(String Value) throws POMEventException
	{
		FireEventobject.toggleButton(MinEarnedInforced, Value);
	}
	
	public void selectIsPolicyFeeReturned(String Value) throws POMEventException
	{
		FireEventobject.toggleButton(IsPolicyFeeReturned, Value);
	}
	
	public void selectCancelReason(String Value) throws POMEventException
	{
		FireEventobject.Dropdown(CancelReason, Value);
	}
	
	public void clickCancelAbort() throws POMEventException
	{
		FireEventobject.ClickElement(CancelAbort);
	}
	
	public void clickCancelButton() throws POMEventException
	{
		FireEventobject.ClickElement(CancelPolicyButton);
	}
	
}
