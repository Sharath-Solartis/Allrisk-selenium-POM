package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg16_EndoAdditionalInterestPage extends PomEventsMethodDefinition
{

	@FindBy(xpath ="//button[contains(.,'+  Add')]")
	public WebElement endoAddButton;
	
	@FindBy(xpath ="id('additionalinteresttile1:AIForm:Object__Risk__ResProperty__AdditionalInterest__InterestType')")
	public WebElement endoAdditionalInterestType;
	
	@FindBy(xpath ="id('additionalinteresttile1:AIForm:Object__Risk__ResProperty__AdditionalInterest__InterestCompanyName')")
	public WebElement endoAdditionalInterestName;
	
	@FindBy(xpath ="//button[contains(.,'Save')]")
	public WebElement endoSaveButton;
	
	
	FireEvent FireEventobject = new FireEvent();
		
	
	public Pg16_EndoAdditionalInterestPage() 
	{
		   PageFactory.initElements(driver, this);
	}
		
	public void clickEndoAddButton() throws POMEventException
	{				
			FireEventobject.ClickElement(endoAddButton);				
	}
	
	public void selectEndoAdditionalInterestType(String inputValue) throws POMEventException
	{				
			FireEventobject.Dropdown(endoAdditionalInterestType, inputValue);				
	}
		
	public void enterEndoAdditionalInterestName(String inputValue) throws POMEventException
	{			    	
		    FireEventobject.EnterTextWithoutEnter(endoAdditionalInterestName, inputValue);		    		
	} 
	 
	public void clickEndoSaveButton() throws POMEventException
	{				
			FireEventobject.ClickElement(endoSaveButton);				
	}
	
}
