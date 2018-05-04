package com.solartis.test.pom.pages.input;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class FindRiskConsole extends PomEventsMethodDefinition 
{
	@FindBy(xpath = "//button[contains(.,'BY RISK')]")
	public WebElement ByRiskButton;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__InsuredName")
	public WebElement FindByInsured;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__RiskType")
	public WebElement FindByRiskType;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__Occupancy")
	public WebElement FindByOccupancyType;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__City")
	public WebElement FindByCity;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__County")
	public WebElement FindByCounty;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__State")
	public WebElement FindByState;
	
	@FindBy(id = "FindRiskForm:FindRiskTile:Object__Risk__ZipCode")
	public WebElement FindByZipcode;
	
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElement ResetButton;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement SearchButton;
	
	@FindBy(xpath = "id('FindRiskForm:RiskSearchResultTile:riskListDataTable:0:RiskNavPanel')/a")
	public WebElement SearchResult1;
	
	@FindBy(xpath = "id('FindRiskForm:RiskSearchResultTile:riskListDataTable:1:RiskNavPanel')/a")
	public WebElement SearchResult2;
	
	@FindBy(xpath = "id('FindRiskForm:RiskSearchResultTile:riskListDataTable:2:RiskNavPanel')/a")
	public WebElement SearchResult3;
	
	FireEvent FireEventobject = new FireEvent();
	
	public FindRiskConsole()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickByRiskButton() throws POMEventException
	{
		FireEventobject.ClickElement(ByRiskButton);
	}
	
	public void findByInsured(String value) throws POMEventException, InterruptedException
	{
		FireEventobject.ClickElement(FindByInsured);
		FireEventobject.EnterTextWithoutEnter(FindByInsured, value);
		Thread.sleep(2000);
		//FindByInsured.sendKeys(Keys.ENTER);
	}
	
	public void findByRiskType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByRiskType, value);
	}
	
	public void findByOccupancyType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByOccupancyType, value);
	}
	
	public void findByCity(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByCity, value);
	}
	
	public void findByCounty(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByCounty, value);
	}
	
	public void findByState(String value) throws POMEventException
	{
		FireEventobject.Dropdown(FindByState, value);
	}
	
	public void findByZipcode(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(FindByZipcode, value);
	}
	
	public void clickResetButton() throws POMEventException
	{
		FireEventobject.ClickElement(ResetButton);
	}
	
	public void clickSearchButton() throws POMEventException
	{
		FireEventobject.ClickElement(SearchButton);
	}
	
	public void clickSearchResult1() throws POMEventException
	{
		FireEventobject.ClickElement(SearchResult1);
	}
	
	public void clickSearchResult2() throws POMEventException
	{
		FireEventobject.ClickElement(SearchResult2);
	}
	
	public void clickSearchResult3() throws POMEventException
	{
		FireEventobject.ClickElement(SearchResult3);
	}

}
