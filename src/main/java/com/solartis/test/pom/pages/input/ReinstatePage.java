package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.common.exception.POMEventException;

public class ReinstatePage extends PomEventsMethodDefinition 
{
	FireEvent FireEventobject = new FireEvent();
	
	@FindBy(xpath = "*//h3[8]/table/tbody/tr/td[2]/button")
	public WebElement ReinstateTab;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:Object__Plan__PolicyEffectiveDate')")
	public WebElement ReinstateEffectiveDate;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:Object__ReinstateType')")
	public WebElement ReinstateReason;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstateAbortButton')")
	public WebElement ReinstateDiscard;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:reinstateButtonID')/button")
	public WebElement ReinstatePolicyButton;
	
	
	public ReinstatePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickReinstateTab() throws POMEventException
	{
		FireEventobject.ClickElement(ReinstateTab);
	}
	
	public void clickReinstateEffectiveDate() throws POMEventException
	{
		FireEventobject.ClickElement(ReinstateEffectiveDate);
	}
	
	public void DatePicker(String datePicker,String inputValue) throws POMEventException
	{			   
		FireEventobject.DatePickerpopup(datePicker, inputValue);
	}
	
	public void selectReinstateReason(String Value) throws POMEventException
	{
		FireEventobject.Dropdown(ReinstateReason, Value);
	}
	
	public void clickReinstateDiscard() throws POMEventException
	{
		FireEventobject.ClickElement(ReinstateDiscard);
	}
	
	public void clickReinstatePolicyButton() throws POMEventException
	{
		FireEventobject.ClickElement(ReinstatePolicyButton);
	}
}
