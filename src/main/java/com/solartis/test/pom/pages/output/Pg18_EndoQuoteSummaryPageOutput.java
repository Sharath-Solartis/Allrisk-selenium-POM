package com.solartis.test.pom.pages.output;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class Pg18_EndoQuoteSummaryPageOutput extends PomEventsMethodDefinition 
{
	
	@FindBy(xpath="substring-before(substring-after(.,'PRORATA FACTOR- '),' ')")
    public WebElement endoProratafactor;
	
	@FindBy(xpath="id('CompareTile:PremiumPanel')/table[3]/tbody/tr/td[2]")
    public WebElement endoPolicyPremium;
	
	@FindBy(xpath="id('CompareTile:PremiumPanel')/table[3]/tbody/tr/td[3]")
    public WebElement endoNewPremium;

	@FindBy(xpath="id('CompareTile:PremiumPanel')/table[3]/tbody/tr/td[4]")
    public WebElement endoPremiumDifference;
	
	@FindBy(xpath="id('CompareTile:PremiumPanel')/table[3]/tbody/tr/td[5]")
    public WebElement endoProrataPremium;

	@FindBy(xpath="id('CompareTile:FeeList')/table[1]//td[5]")
    public WebElement endoPolicyFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[2]//td[5]")
    public WebElement endoInspectionFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[3]//td[5]")
    public WebElement endoFilingFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[4]//td[5]")
    public WebElement endoStampFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[5]//td[5]")
    public WebElement endoDCAEMPAFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[6]//td[5]")
    public WebElement endoCitizenFee;
	
	@FindBy(xpath="id('CompareTile:FeeList')/table[7]//td[5]")
    public WebElement endoHurricaneFee;
	
	@FindBy(xpath="id('CompareTile:TaxList')/table//td[5]")
    public WebElement endoSurplusLineTax;
	
	@FindBy(xpath="//button/*[contains(text(),'Issue Endorsement')]")
    public WebElement issueEndorsement;
	
	FireEvent FireEventobject = new FireEvent();
	
	HashMap<Object, Object> outputMap = new HashMap<Object, Object>();
	
	public Pg18_EndoQuoteSummaryPageOutput()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getEndoProratafactor() throws POMEventException
	{
		outputMap.put("EndoProrataFactorQSActual", FireEventobject.getValueByTextOutput(endoProratafactor));
	}
	
	public void getEndoPolicyPremium() throws POMEventException
	{
		outputMap.put("EndoPolicyPremiumQSActual", FireEventobject.getValueByTextOutput(endoPolicyPremium));
	}
	
	public void getEndoNewPremium() throws POMEventException
	{
		outputMap.put("EndoNewPremiumQSActual", FireEventobject.getValueByTextOutput(endoNewPremium));
	}
	
	public void getEndoPremiumDifference() throws POMEventException
	{
		outputMap.put("EndoPremiumDifferenceQSActual", FireEventobject.getValueByTextOutput(endoPremiumDifference));
	}
	
	public void getEndoProrataPremium() throws POMEventException
	{
		outputMap.put("EndoProrataPremiumQSActual", FireEventobject.getValueByTextOutput(endoProrataPremium));
	}
	
	public void getEndoPolicyFee() throws POMEventException
	{
		outputMap.put("EndoPolicyFeeQSActual", FireEventobject.getValueByTextOutput(endoPolicyFee));
	}
	
	public void getEndoInspectionFee() throws POMEventException
	{
		outputMap.put("EndoInspectionFeeQSActual", FireEventobject.getValueByTextOutput(endoInspectionFee));
	}
	
	public void getEndoFilingFee() throws POMEventException
	{
		outputMap.put("EndoFilingFeeQSActual", FireEventobject.getValueByTextOutput(endoFilingFee));
	}
	
	public void getEndoStampFee() throws POMEventException
	{
		outputMap.put("EndoStampFeeQSActual", FireEventobject.getValueByTextOutput(endoStampFee));
	}
	
	public void getEndoDCAEMPAFee() throws POMEventException
	{
		outputMap.put("EndoDCAEMPAFeeQSActual", FireEventobject.getValueByTextOutput(endoDCAEMPAFee));
	}
	
	public void getEndoCitizenFee() throws POMEventException
	{
		outputMap.put("EndoCitizenFeeQSActual", FireEventobject.getValueByTextOutput(endoCitizenFee));
	}
	
	public void getEndoHurricaneFee() throws POMEventException
	{
		outputMap.put("EndoHurricaneFeeQSActual", FireEventobject.getValueByTextOutput(endoHurricaneFee));
	}
	
	public void getEndoSurplusLineTax() throws POMEventException
	{
		outputMap.put("EndoSurplusLineTaxQSActual", FireEventobject.getValueByTextOutput(endoSurplusLineTax));
	}
	
	public void clickIssueEndorsement() throws POMEventException
	{
		    FireEventobject.ClickElement(issueEndorsement);
	}
	
	public HashMap<Object, Object> getEndoQuoteSummaryPageOutput()
	{
		System.out.println("Coverages HashMap :" +outputMap);
		return outputMap;
	}
	
	
}
