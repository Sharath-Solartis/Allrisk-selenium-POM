package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class Pg01_LoginPage extends PomEventsMethodDefinition 
{

	@FindBy(id="loginForm:login_username")
	public WebElement txtusername;
	
	@FindBy(id="loginForm:login_password")
	public WebElement txtpassword;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public WebElement btnlogin;
	
	@FindBy(xpath="id('loginForm')/table/tbody/tr/td[2]/table/tbody/tr[2]/td/span")
	public WebElement EmptyUserName;
	
	@FindBy(xpath="id('loginForm')/table/tbody/tr/td[2]/table/tbody/tr[3]/td/span")
	public WebElement EmptyPassword;
	
	@FindBy(xpath="id('loginForm')/table/tbody/tr/td[2]/table/tbody/tr/td/div/div/div/ul/li/label")
	public WebElement wrongCredentials;
	
	
	FireEvent FireEventobject = new FireEvent();
	
	
	public Pg01_LoginPage()
	{
		    PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName(String uname) throws POMEventException
	{
		    //System.out.println("Inside user name function of login page value   " + uname);
		    //System.out.println("Inside user name function of login page element   " + txtusername);
		    FireEventobject.EnterTextWithoutEnter(txtusername, uname);
	}
	
	
	public void enterPwd(String pwd) throws POMEventException 
	{
		    FireEventobject.EnterTextWithoutEnter(txtpassword, pwd);
	}
	
	
	public void clickLoginbtn() throws POMEventException 
	{		
			FireEventobject.ClickElement(btnlogin);
	}
	
	
	
	public Pg02_HomePage Login()
	{
			return new Pg02_HomePage();
	}
	
}
