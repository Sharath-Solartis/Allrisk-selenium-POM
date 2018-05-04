package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg02_HomePage extends PomEventsMethodDefinition 
{
	
	@FindBy(xpath="//table//button/span[contains(text(),'Homeowners / Dwelling / Condo Quote')]")
	protected WebElement btnPLQuote;
	
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	FireEvent FireEventobject = new FireEvent();
	
	
	public Pg02_HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickHoDpButton() throws POMEventException 
	{
	    FireEventobject.ClickElement(btnPLQuote);
	}
	
		
	public Pg03_AgencyPage Home()
	{
		return new Pg03_AgencyPage();
	}
}
