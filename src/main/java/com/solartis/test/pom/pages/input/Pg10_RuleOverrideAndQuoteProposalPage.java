package com.solartis.test.pom.pages.input;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg10_RuleOverrideAndQuoteProposalPage extends PomEventsMethodDefinition
{
	
	@FindBy(id=".//*[@id='CreateQuoteProposaldialog']/div[2]/form/div/button[1]")
	public WebElement Create_quote_proposal;
	
	@FindBy(xpath = "//button[contains(.,'Return to Carrier Selection')]")
	public WebElement Return_To_Carrier_Selection;
	
	@FindBy(xpath ="id('PLQuoteListinfo:quoteListTile:PLQuoteListDetails')//table//tr[2]/td[3]/label")
	public WebElement QuoteStatus;
	
	@FindBy(xpath = "id('PLQuoteListinfo:quoteListTile:PLQuoteListDetails')//table//tr[2]/td[1]/a")
	public WebElement QuoteNumber;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[3]/span[1]")
	public WebElement Paginator_arrow1;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:0:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride1;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:1:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride2;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:2:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride3;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform')/button")
	public WebElement BusinessRuleForm;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[3]/span[contains(.,'2')]")
	public WebElement Paginator_arrow2;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:3:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride4;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:4:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride5;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:5:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride6;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[3]//span[contains(.,'3')]")
	public WebElement Paginator_arrow3;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:6:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride7;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:7:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride8;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:8:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride9;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[3]//span[contains(.,'4')]")
	public WebElement Paginator_arrow4;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:9:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride10;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:10:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride11;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:11:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride12;
	
	@FindBy(xpath ="id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[3]//span[contains(.,'5')]")
	public WebElement Paginator_arrow5;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:12:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride13;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:13:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride14;
	
	@FindBy(xpath = "id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable:14:Object__BusinessRules__Quote__RuleStatus')")
	public WebElement RuleOverride15;
	
	@FindBy(xpath = "id('QuoteDetails')/table/tbody/tr/td/span/span/button/span[contains(text(),'Create Quote Proposal')]")
	public WebElement CreateQuoteProposalButton;
	
	@FindBy(xpath = ".//*[@id='CreateQuoteProposaldialog']/div[2]/form/div/button[1]")
	public WebElement CreateQuoteProposalDialog;
	
	FireEvent FireEventobject = new FireEvent();
	
	public Pg10_RuleOverrideAndQuoteProposalPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Paginatorclick1() throws POMEventException
	{
		
			FireEventobject.ClickElement(Paginator_arrow1);
		
	}
	
	public void ReturnToCarrierSelection() throws POMEventException
	{
		
			FireEventobject.ClickElement(Return_To_Carrier_Selection);
		
	}
	
	public String GetQuoteStatus() throws POMEventException
	{
		
		String qstatus = FireEventobject.getValueByTextInput(QuoteStatus);
		return qstatus;
		
	}
	
	public String GetQuoteNumber() throws POMEventException
	{
		
		String qnumber = FireEventobject.getValueByTextInput(QuoteNumber);
		return qnumber;
		
	}
	
	public void RuleOverride1(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride1, Value);
		
	}
	
	public void RuleOverride2(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride2, Value);
		
	}
	
	public void RuleOverride3(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride3, Value);
		
	}
	
	public void BusinessRuleForm_Click() throws POMEventException
	{
		
			FireEventobject.ClickElement(BusinessRuleForm);
		
	}
	
	public void Paginatorclick2() throws POMEventException
	{
		
			FireEventobject.JScheckbox(Paginator_arrow2);
		
	}
	
	
	public void RuleOverride4(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride4, Value);
		
	}
	
	public void RuleOverride5(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride5, Value);
		
	}
	
	public void RuleOverride6(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride6, Value);
		
	}
	
	public void Paginatorclick3() throws POMEventException
	{
		
			FireEventobject.ClickElement(Paginator_arrow3);
		
	}
	
	public void RuleOverride7(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride7, Value);
		
	}
	
	public void RuleOverride8(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride8, Value);
		
	}
	
	
	public void RuleOverride9(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride9, Value);
		
	}
	
	public void Paginatorclick4() throws POMEventException
	{
		
			FireEventobject.ClickElement(Paginator_arrow4);
		
	}
	
	public void RuleOverride10(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride10, Value);
		
	}
	
	public void RuleOverride11(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride11, Value);
		
	}
	
	
	public void RuleOverride12(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride12, Value);
		
	}
	
	public void Paginatorclick5() throws POMEventException
	{
		
			FireEventobject.ClickElement(Paginator_arrow5);
		
	}
	
	public void RuleOverride13(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride13, Value);
		
	}
	
	public void RuleOverride14(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride14, Value);
		
	}
	
	
	public void RuleOverride15(String Value) throws POMEventException 
	{
		
			FireEventobject.Dropdown(RuleOverride15, Value);
		
	}
	
	public void clickCreateQuoteProposal() throws POMEventException
	{
		
			FireEventobject.ClickElement(CreateQuoteProposalButton);
		
	}
	
	public void clickCreateQuoteProposalDialogClose() throws POMEventException
	{
		
			FireEventobject.ClickElement(CreateQuoteProposalDialog);
		
	}

	public String formdisable(String p) 
	 {
		    String noformlabel;
		    System.out.println("inside func");
		    try
		    {
		    	driver.findElement(By.xpath(p));
		    	noformlabel="Label Displayed";
		    }
		   	catch(org.openqa.selenium.NoSuchElementException e)
		    {
		   		noformlabel="No Label";
		    }
		    return noformlabel;
	 }
	

	public int gettablerowlist(String p)
	{
		
		int listSize=0;
		List<WebElement> TableElement =driver.findElements(By.xpath(p));
	    System.out.println("NUMBER OF ROWS IN THIS TABLE = "+TableElement.size());
	    listSize = TableElement.size();
	    return listSize;	
	    
	}
	
	
	public int getreferralrulecount(String p) throws POMEventException
	{
		int count=0;
		WebElement element = driver.findElement(By.xpath(p));
	 	String string_temp = element.getText();
	 	String string_val = string_temp.substring(18,20);
	 	String trimmedstr = string_val.replace(" ","");
	 	count=Integer.parseInt(trimmedstr);
		return count;
	}

}
