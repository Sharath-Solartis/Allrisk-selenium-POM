package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg04_InsuredPage extends PomEventsMethodDefinition
{
	@CacheLookup
	@FindBy(id="insuredTile:InsuredForm:Object__Customer__CustomerName")
	public WebElement insuredName;
	
	@CacheLookup
	@FindBy(id= "insuredTile:InsuredForm:Object__Customer__BusinessAddress")
	public WebElement insuredAddress;
	
	@CacheLookup
	@FindBy(xpath= "id('insuredTile:InsuredForm:Object__Customer__Phone')")
	public WebElement phoneNumber;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__PrinciplesDescriptionn')")
	public WebElement principlesDesc;
	@FindBy(xpath = "//*[contains(text(),'Continue To Location')]")
	public WebElement locationCont;
	@FindBy(xpath = "id('msgspan')")
	public WebElement processingLoad;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Newname')")
	public WebElement emptyInsuredName;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Insured__Message1')")
	public WebElement emptyInsuredAddress;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Location__StreetNumberMessage')")
	public WebElement emptyStreetNumber;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Location__StreetNameMessage')")
	public WebElement emptyStreetName;
	@FindBy(xpath = "id('insuredTile:InsuredForm:ziplookupmsg')")
	public WebElement emptyZipcode;
	@FindBy(xpath = "id('insuredTile:InsuredForm:Object__Customer__PhoneMsg')")
	public WebElement emptyPhoneNumber;
	
	FireEvent FireEventobject = new FireEvent();
	public String llcQn = "id('insuredTile:InsuredForm:Object__Customer__LLC')";
	public String principlesQn = "id('insuredTile:InsuredForm:Object__Customer__Principles')";
		
		
	public Pg04_InsuredPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void clearInsuredName() throws POMEventException
	{				
			FireEventobject.clearTextbox(insuredName);
	}
	    
	public void clickInsuredName() throws  POMEventException
	{	
			FireEventobject.ClickElement(insuredName);	
	}
	
	public void enterInsuredName(String inputValue) throws POMEventException 
	{
			FireEventobject.EnterTextWithoutEnter(insuredName, inputValue);
	}
	
	public void clickInsuredAddress() throws POMEventException
	{			
			FireEventobject.ClickElement(insuredAddress);
	}
 
    public void clearInsuredAddress() throws POMEventException
	{				
			FireEventobject.clearTextbox(insuredAddress);
	}
    
	public void enterInsuredAddr(String inputValue) throws  POMEventException
	{	
			FireEventobject.EnterTextWithoutEnter(insuredAddress, inputValue);	
	}
	
	public void clickPhoneNumber() throws POMEventException
	{			
			FireEventobject.ClickElement(phoneNumber);
	}
 
    public void clearPhoneNumber() throws POMEventException
	{				
			FireEventobject.clearTextbox(phoneNumber);
	}
    
	public void enterPhNumber(String inputValue) throws POMEventException
	{
			FireEventobject.EnterTextWithoutEnter(phoneNumber, inputValue);
	}
	
	public void llc(String p,String inputValue) throws  POMEventException
	{		
			FireEventobject.toggleButton(p, inputValue);	
	}
	
	public void enterLLCPrincipals(String inputValue) throws POMEventException
	{
			FireEventobject.EnterTextWithoutEnter(principlesDesc, inputValue);
	}
	
	public void clickContToLoc() throws POMEventException 
	{		
			FireEventobject.ClickElement(locationCont);	
	}
		
	public Pg05_LocationPage Insured()
	{		
			return new Pg05_LocationPage();
	}
	
}