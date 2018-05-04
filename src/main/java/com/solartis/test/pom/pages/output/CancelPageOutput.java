package com.solartis.test.pom.pages.output;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.common.exception.POMEventException;

public class CancelPageOutput extends PomEventsMethodDefinition 
{
	FireEvent FireEventobject = new FireEvent();
	
	//String[] outputArray = null;
	
	HashMap<Object, Object> outputMap = new HashMap<Object, Object>();
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/label")
	public WebElement CancelBasePremium;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/label")
	public WebElement CancelProrataFactor;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/label")
	public WebElement TaxandFee01;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/label")
	public WebElement TaxandFee02;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[2]/label")
	public WebElement TaxandFee03;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[6]/td[2]/label")
	public WebElement TaxandFee04;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[2]/label")
	public WebElement TaxandFee05;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[2]/label")
	public WebElement TaxandFee06;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[9]/td[2]/label")
	public WebElement TaxandFee07;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[2]/label")
	public WebElement TaxandFee08;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[11]/td[2]/label")
	public WebElement TaxandFee09;
	
	@FindBy(xpath = ".//*[@id='CancelTile:cancelForm:CancelPremium']/table[1]/tbody/tr[2]/td[1]/table/tbody/tr[12]/td[2]/label")
	public WebElement TaxandFee10;
	
	public CancelPageOutput()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getCancelBasePremium() throws POMEventException
	{
		outputMap.put("cancelBasePremium", FireEventobject.getValueByTextOutput(CancelBasePremium));
		/*outputArray = new String[2];
		outputArray[1] = FireEventobject.getValueByTextOutput(CancelBasePremium);
		outputArray[2] = "CancelBasePremium";
		return outputArray;*/
		//return FireEventobject.getValueByTextOutput(CancelBasePremium);
	}
	
	public void getCancelProrataFactor() throws POMEventException
	{
		outputMap.put("CancelProrataFactor", FireEventobject.getValueByTextOutput(CancelProrataFactor));
		/*outputArray = new String[2];
		outputArray[1] = FireEventobject.getValueByTextOutput(CancelProrataFactor);
		outputArray[2] = "CancelProrataFactor";
		return outputArray;*/
		//return FireEventobject.getValueByTextOutput(CancelProrataFactor);
	}
	
	public void getTaxandFee01() throws POMEventException
	{
		outputMap.put("TaxandFee01", FireEventobject.getValueByTextOutput(TaxandFee01));
		/*outputArray = new String[2];
		outputArray[1] = FireEventobject.getValueByTextOutput(TaxandFee01);
		outputArray[2] = "TaxandFee01";
		return outputArray;*/
		//return FireEventobject.getValueByTextOutput(TaxandFee01);
	}
	
	public String getTaxandFee02() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee02);
	}
	
	public String getTaxandFee03() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee03);
	}
	
	public String getTaxandFee04() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee04);
	}
	
	public String getTaxandFee05() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee05);
	}
	
	public String getTaxandFee06() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee06);
	}
	
	public String getTaxandFee07() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee07);
	}
	
	public String getTaxandFee08() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee08);
	}
	
	public String getTaxandFee09() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee09);
	}
	
	public String getTaxandFee10() throws POMEventException
	{
		return FireEventobject.getValueByTextOutput(TaxandFee10);
	}

}
