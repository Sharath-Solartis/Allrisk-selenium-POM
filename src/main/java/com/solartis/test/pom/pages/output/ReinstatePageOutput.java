package com.solartis.test.pom.pages.output;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.common.exception.POMEventException;

public class ReinstatePageOutput extends PomEventsMethodDefinition 
{
	FireEvent FireEventobject = new FireEvent();
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/label")
	public WebElement ReinstateBasePremium;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/label")
	public WebElement ReinstateTaxandFee01;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/label")
	public WebElement ReinstateTaxandFee02;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/label")
	public WebElement ReinstateTaxandFee03;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/label")
	public WebElement ReinstateTaxandFee04;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[6]/td[2]/label")
	public WebElement ReinstateTaxandFee05;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[2]/label")
	public WebElement ReinstateTaxandFee06;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[2]/label")
	public WebElement ReinstateTaxandFee07;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[2]/label")
	public WebElement ReinstateTaxandFee08;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[2]/label")
	public WebElement ReinstateTaxandFee09;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[11]/td[2]/label")
	public WebElement ReinstateTaxandFee10;
	
	@FindBy(xpath = "id('ReinstateTile:ReinstateForm:ReinstatePremium')/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[12]/td[2]/label")
	public WebElement ReinstateTaxandFee11;
	
	public ReinstatePageOutput()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getReinstateBasePremium() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateBasePremium);
	}
	
	public void getReinstateTaxandFee01() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee01);
	}
	
	public void getReinstateTaxandFee02() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee02);
	}
	
	public void getReinstateTaxandFee03() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee03);
	}
	
	public void getReinstateTaxandFee04() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee04);
	}
	
	public void getReinstateTaxandFee05() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee05);
	}
	
	public void getReinstateTaxandFee06() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee06);
	}
	
	public void getReinstateTaxandFee07() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee07);
	}
	
	public void getReinstateTaxandFee08() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee08);
	}
	
	public void getReinstateTaxandFee09() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee09);
	}
	
	public void getReinstateTaxandFee10() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee10);
	}
	
	public void getReinstateTaxandFee11() throws POMEventException
	{
		FireEventobject.getValueByTextInput(ReinstateTaxandFee11);
	}
	
}
