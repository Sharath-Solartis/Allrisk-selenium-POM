package com.solartis.test.pom.common;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.operations.DatabaseOperation;

public interface PomEvents 
{
	
	public DatabaseOperation establishDBConnection() throws POMEventException;
	public void ClickElement(WebElement element) throws POMEventException;
	public void Dropdown(WebElement element, String value) throws POMEventException;
	public void EnterTextWithoutEnter(WebElement element, String value) throws POMEventException;
	public void EnterTextWithEnter(WebElement element, String value) throws POMEventException;
	public void toggleButton(String p, String inputValue) throws POMEventException;	
	public void clearTextbox(WebElement element) throws POMEventException;
	public void AssertCheck(String value, WebElement element) throws POMEventException;
	public void WaitElementVisibility(WebElement element) throws POMEventException;
	public void WaitElementClickable(WebElement element) throws POMEventException;
	public void WaitElementClickable(String p) throws POMEventException;
	public void ProcessingLoad() throws POMEventException;
	public void ProcessingLoadStickyForm() throws POMEventException;
	public void ProcessingLoadCSOverlay() throws POMEventException;
	public void LocationProcessingLoad() throws POMEventException;
	public void autoComplete(WebElement element, String value) throws POMEventException;
	public void waitWithClickable(String p) throws POMEventException;
	public void DatePickerpopup(String p, String inputValue)throws POMEventException;
	public boolean assertText(WebElement element, String value) throws POMEventException;
	public void takeScreenShot() throws IOException, POMEventException;
	public void JSradioButton(WebElement element) throws POMEventException;
	public void JStextbox(WebElement element, String value) throws POMEventException;
	public void JScheckbox(WebElement element) throws POMEventException;
	public void contSendkeysOperation(WebElement element, String value) throws POMEventException;
	public void setTextWithoutEnter(WebElement element, String value) throws POMEventException;
	public void setTextThenEnter(WebElement element, String value) throws POMEventException;
	public void setTextThenTab(WebElement element, String value) throws POMEventException;
	public int checkProductDisable(WebElement element, String value) throws POMEventException;
	public String getValueByTextInput(WebElement element) throws POMEventException;
	public String getValueByAttributeInput(WebElement element) throws POMEventException;
	public void mouseHover(WebElement element) throws POMEventException;
	public void takeScreenshot(String filename) throws POMEventException;
	public String getValueByTextOutput(WebElement element) throws POMEventException;
	public String getValueByAttributeOutput(WebElement element) throws POMEventException;
	public void OutsideClick() throws POMEventException;
	public void fluentProcessingLoad(WebElement element) throws POMEventException;
	public void SyncWait(int time) throws POMEventException;
	public void ThreadWait(int time) throws POMEventException;
	public void QuoteOverLay() throws POMEventException;
	public void EndoOverLay() throws POMEventException;
							
}
