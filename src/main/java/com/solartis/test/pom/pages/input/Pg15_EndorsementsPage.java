package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class Pg15_EndorsementsPage  extends PomEventsMethodDefinition
{
	FireEvent FireEventobject = new FireEvent();
	
	@FindBy(xpath="*//h3[7]/table/tbody/tr/td[2]/button")
	public WebElement endorsementsTab;
	
	@FindBy(xpath="id('EndorsementForm')/button")
	public WebElement addEndorsements;
	
	@FindBy(id="EndorsementForm:CreateEndorsementpanelid:Object__Quote__EffectiveDate__Display")
	public WebElement effectiveDateClick;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(xpath="id('EndorsementForm')/button[1]")
	public WebElement proceedToEndorsement;
	
	@FindBy(xpath="id('insuredTile:InsuredForm:QSInsuredSaveButton')/button")
	public WebElement saveInsuredButton;
	
	@FindBy(xpath="//*[contains(text(),'Continue to Underwriting')]")
	public WebElement continueToUnderwriting;
	
	@FindBy(xpath="id('tabContent')/div/button[1]")
	public WebElement continueToCoverages;
	
	
	
	public Pg15_EndorsementsPage() 
	{
		    PageFactory.initElements(driver, this);
	}
		
	public void clickEndorsementsTab() throws POMEventException 
	{		
			FireEventobject.ClickElement(endorsementsTab);	
	}
	
	public void clickAddEndorsements() throws POMEventException 
	{		
			FireEventobject.ClickElement(addEndorsements);	
	}
	
	public void clickEffectiveDateClick() throws POMEventException 
	{		
			FireEventobject.ClickElement(effectiveDateClick);	
	}
	
	public void datePicker(String datePicker,String inputValue) throws POMEventException
	{		   
		    FireEventobject.DatePickerpopup(datePicker, inputValue);
	}
	 
	public void clickProceedToEndorsement() throws POMEventException 
	{		
			FireEventobject.ClickElement(proceedToEndorsement);	
	}
	
	public void clickSaveInsuredButton() throws POMEventException 
	{		
			FireEventobject.ClickElement(saveInsuredButton);	
	}
	
	public void clickContinueToUnderwriting() throws POMEventException 
	{		
			FireEventobject.ClickElement(continueToUnderwriting);	
	}
	
	public void clickContinueToCoverages() throws POMEventException 
	{		
			FireEventobject.ClickElement(continueToCoverages);	
	}
}
