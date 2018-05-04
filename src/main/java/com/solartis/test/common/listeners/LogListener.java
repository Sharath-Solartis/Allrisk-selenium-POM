package com.solartis.test.common.listeners;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

public class LogListener implements Listener
{
    public static Logger eventlog = Logger.getLogger("SeleniumEventLog");
    @Override
    public void beforeClickElement(WebElement element) 
    {
        // TODO Auto-generated method stub
        eventlog.info("WebElement is about to be clicked = "+element);
    }
    @Override
    public void afterClickElement() 
    {
        // TODO Auto-generated method stub
        eventlog.info("WebElement is clicked");
    }
    @Override
    public void beforeDropdown() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Dropdown value is about to be selected");
    }
    @Override
    public void afterDropdown() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Dropdown value is selected");
    }
    @Override
    public void beforeEnterTextWithoutEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Text value is about to be entered without enter");
    }
    @Override
    public void afterEnterTextWithoutEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Text value is entered without enter");
    }
    
    @Override
    public void beforeEnterTextWithEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Text value is about to be entered with enter");
    }
    @Override
    public void afterEnterTextWithEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Text value is entered with enter");
    }
    
    @Override
	public void beforetoggleButton() 
    {
		// TODO Auto-generated method stub
    	eventlog.info("Before Clicking Toggle button");
	}
	@Override
	public void aftertoggleButton()
	{
		// TODO Auto-generated method stub
		eventlog.info("After Clicking Toggle button");
	}
	
	@Override
	public void beforeclearTextbox() 
	{
		// TODO Auto-generated method stub
		eventlog.info("Before clearing textbox");
	}
	
	@Override
	public void afterclearTextbox()
	{
		// TODO Auto-generated method stub
		eventlog.info("After clearing textbox");
	}
	
	
	@Override
	public void beforeAssertCheck() 
	{
		// TODO Auto-generated method stub
		eventlog.info("Before Assert Equals");
	}
	@Override
	public void afterAssertCheck()
	{
		// TODO Auto-generated method stub
		eventlog.info("After Assert Equals");
	}
	
    @Override
    public void beforeWaitElementVisibility() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Waiting for element to be visible");
    }
    @Override
    public void afterWaitElementVisibility() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Checked element visibility");
    }
    @Override
    public void beforeWaitElementClickable() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Waiting for element to be clickable");
    }
    @Override
    public void afterWaitElementClickable() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Element click wait over");
    }
    @Override
    public void beforeProcessingLoad() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Processing action");
    }
    @Override
    public void afterProcessingLoad() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Processing action done");
    }
    
    @Override
	public void beforeProcessingLoadStickyForm()
    {
		// TODO Auto-generated method stub
    	 eventlog.info("Before Processing Load Sticky Form action");
	}
	@Override
	public void afterProcessingLoadStickyForm()
	{
		// TODO Auto-generated method stub
		eventlog.info("Processing Load Sticky Form action done");
	}
	@Override
	public void beforeProcessingLoadCSOverlay()
	{
		// TODO Auto-generated method stub
		 eventlog.info("Before Processing Load CSOverlay action");
	}
	@Override
	public void afterProcessingLoadCSOverlay()
	{
		// TODO Auto-generated method stub
		eventlog.info("Processing Load CSOverlay action done");
	}
	
    @Override
    public void beforeAutoComplete() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Auto Complete action");
    }
    @Override
    public void afterAutoComplete() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Auto Complete action");
    }
    
    @Override
	public void beforeWaitWithClickable()
    {
		// TODO Auto-generated method stub
    	 eventlog.info("Before Wait With Clickable action");
	}
    
	@Override
	public void afterWaitWithClickable()
	{
		// TODO Auto-generated method stub
		 eventlog.info("After Wait With Clickable action");
	}
	
	@Override
	public void beforeDatePickerpopup()
	{
		// TODO Auto-generated method stub
		 eventlog.info("Before Date Picker action");
	}
	
	@Override
	public void afterDatePickerpopup()
	{
		// TODO Auto-generated method stub
		 eventlog.info("After Date Picker action");
	}
	
    @Override
    public void beforeAssertText() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before assert text method");
    }
    @Override
    public void afterAssertText() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After assert text method");
    }
    @Override
    public void beforeTakeScreenShot() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before taking screenshot");
    }
    @Override
    public void afterTakeScreenShot() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Screenshot taken");
    }
    @Override
    public void beforeJSradioButton() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before JSExecutor Radio");
    }
    @Override
    public void afterJSradioButton() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After JSExecutor Radio");
    }
    @Override
    public void beforeContSendkeysOperation() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Send Keys Operation");
    }
    @Override
    public void afterContSendkeysOperation() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Send Keys Operation");
    }
    @Override
    public void beforeSetTextWithoutEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Setting Value without Enter");
    }
    @Override
    public void afterSetTextWithoutEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Setting Value without Enter");
    }
    @Override
    public void beforeSetTextThenEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Setting Value with Enter");
    }
    @Override
    public void afterSetTextThenEnter() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Setting Value with Enter");
    }
    @Override
    public void beforeSetTextThenTab() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Setting Value with Tab");
    }
    @Override
    public void afterSetTextThenTab() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Setting Value with Tab");
    }
    @Override
    public void beforeCheckProductDisable() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Product disability to be checked");
    }
    @Override
    public void afterCheckProductDisable() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Product disability checked");
    }
    @Override
    public void beforeGetValueByTextInput() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Input text value to be fetched");
    }
    @Override
    public void afterGetValueByTextInput() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Input text value fetched");
    }
    @Override
    public void beforeGetValueByAttributeInput() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Input attibute value to be fetched");
    }
    @Override
    public void afterGetValueByAttributeInput() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Input attibute value fetched");
    }
    @Override
    public void beforeMouseHover() 
    {
        // TODO Auto-generated method stub
        eventlog.info("Before Mouse Hover action");
    }
    @Override
    public void afterMouseHover() 
    {
        // TODO Auto-generated method stub
        eventlog.info("After Mouse Hover action");
    }
    @Override
    public void onException(Throwable throwable) 
    {
        // TODO Auto-generated method stub
        throwable.getStackTrace();
        eventlog.error(throwable);
    }
	@Override
	public void onError(Exception e) 
	{
		e.printStackTrace();
		eventlog.info("Error Message :::::::::");
		eventlog.info(e.getMessage());
		eventlog.info("Error Cause :::::::::");
		eventlog.info(e.getCause());
		System.out.println("Printed by Listener");
		//System.out.println(e.getMessage()+e.getCause().getMessage()+e.getCause().getCause().getMessage());
		
	}
	@Override
	public void beforeScreenShot() 
	{
		eventlog.info("Before Taking Screenshot");
	}
	@Override
	public void afterScreenShot() 
	{
		eventlog.info("After Taking Screenshot");
	}
	
	@Override
	public void beforeGetValueByTextOutput() {
		// TODO Auto-generated method stub
		eventlog.info("About to read Output Value by Text");
	}
	@Override
	public void afterGetValueByTextOutput() {
		// TODO Auto-generated method stub
		eventlog.info("Output Value by Text is read");
	}
	@Override
	public void beforeGetValueByAttributeOutput() {
		// TODO Auto-generated method stub
		eventlog.info("About to read Output Value by Attribute");
	}
	@Override
	public void afterGetValueByAttributeOutput() {
		// TODO Auto-generated method stub
		eventlog.info("Output Value by Attribute is read");
	}
	@Override
	public void beforeEstablishDBConnection() {
		// TODO Auto-generated method stub
		eventlog.info("Before Establishing DB connection in FireEent ");
		
	}
	@Override
	public void afterEstablishDBConnection() {
		// TODO Auto-generated method stub
		eventlog.info("After Establishing DB connection in FireEent ");
	}
	@Override
	public void beforeLocationProcessingLoad() {
		// TODO Auto-generated method stub
		eventlog.info("Before Location Processing ");
	}
	@Override
	public void afterLocationProcessingLoad() {
		// TODO Auto-generated method stub
		eventlog.info("After Location Processing ");
	}
	@Override
	public void beforeOutsideClick() {
		// TODO Auto-generated method stub
		eventlog.info("Before Outside Click ");
	}
	@Override
	public void afterOutsideClick() {
		// TODO Auto-generated method stub
		eventlog.info("After Outside Click ");
	}
	@Override
	public void beforeJStextbox() {
		// TODO Auto-generated method stub
		eventlog.info("Before JSTextBox ");
	}
	@Override
	public void afterJStextbox() {
		// TODO Auto-generated method stub
		eventlog.info("After JSTextBox ");
	}
	@Override
	public void beforeJScheckbox() {
		// TODO Auto-generated method stub
		eventlog.info("Before JSCheckBox ");
	}
	@Override
	public void afterJScheckbox() {
		// TODO Auto-generated method stub
		eventlog.info("After JSCheckBox ");
	}
	@Override
	public void beforeFluentProcessingLoad()
    {
		// TODO Auto-generated method stub
    	eventlog.info("Before Fluent Processing action");
	}
	@Override
	public void afterFluentProcessingLoad() 
	{
		// TODO Auto-generated method stub
		eventlog.info("After Fluent Processing action");
	}
	
	@Override
	public void beforeThreadWait()
	{
		// TODO Auto-generated method stub
		eventlog.info("Before Thread Wait");
	}
	
	@Override
	public void afterThreadWait()
	{
		// TODO Auto-generated method stub
		eventlog.info("After Thread Wait");
	}
	
	@Override
	public void beforeSyncWait()
	{
		// TODO Auto-generated method stub
		eventlog.info("Before Sync Wait");
	}
	@Override
	public void afterSyncWait()
	{
		// TODO Auto-generated method stub
		eventlog.info("After Sync Wait");
	}
	
	@Override
	public void beforeQuoteOverLay() 
	{
		// TODO Auto-generated method stub
		eventlog.info("Before Quote Overlay");
	}
	@Override
	public void afterQuoteOverLay() 
	{
		// TODO Auto-generated method stub
		eventlog.info("After Quote Overlay");
	}
	
	@Override
	public void beforeEndoOverLay() 
	{
		// TODO Auto-generated method stub
		eventlog.info("Before Endo Overlay");
	}
	@Override
	public void afterEndoOverLay()
	{
		// TODO Auto-generated method stub
		eventlog.info("After Endo Overlay");
	}
	
		
}
 