package com.solartis.test.common.listeners;

import java.io.IOException;
import java.util.LinkedList;

import org.openqa.selenium.WebElement;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.common.PomEvents;


	public class FireEvent implements PomEvents
	{
	 protected static DatabaseOperation DB = null;
	 protected static PomEvents pomevents = null;
	 protected static Listener listener = null; 
	 protected LinkedList<Listener> listeners1 = new LinkedList<Listener>();
	 
	public FireEvent()
	{
		pomevents = new PomEventsMethodDefinition();
		listener = new LogListener();
		listeners1.add((Listener) listener);
	}

	//protected LinkedList<Listener> listeners1 = new LinkedList<Listener>();
	
	public void addListener(Listener listener)
	{
    listeners1.add((Listener) listener);
	}
	
	public boolean removeListener(Listener listener)
	{
	    return listeners1.remove(listener);
	}
	
	@Override
	public void ClickElement(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		//System.out.println("inside fire event click");
		for (Listener listen : listeners1)
            listen.beforeClickElement(element);
		try
		{
        pomevents.ClickElement(element);
		}
		catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
		
        for (Listener listen : listeners1)
            listen.afterClickElement();
	}

	@Override
	public void Dropdown(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeDropdown();
        try
        {
        	pomevents.Dropdown(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterDropdown();
	}

	@Override
	public void EnterTextWithoutEnter(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeEnterTextWithoutEnter();
        try
        {
        	pomevents.EnterTextWithoutEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterEnterTextWithoutEnter();
	}
	
	@Override
	public void EnterTextWithEnter(WebElement element, String value) throws POMEventException
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeEnterTextWithEnter();
        try
        {
        	pomevents.EnterTextWithEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterEnterTextWithEnter();
	}


	
	@Override
	public void toggleButton(String p,String inputValue) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforetoggleButton();
        try
        {
        	pomevents.toggleButton(p, inputValue);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.aftertoggleButton();
	}

	@Override
	public void clearTextbox(WebElement p) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeclearTextbox();
        try
        {
        	pomevents.clearTextbox(p);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterclearTextbox();
	}
	
	@Override
	public void AssertCheck(String value, WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeAssertCheck();
        try
        {
        	pomevents.AssertCheck(value, element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterAssertCheck();
	}

	
	@Override
	public void WaitElementVisibility(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeWaitElementVisibility();
        try
        {
        	pomevents.WaitElementVisibility(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitElementVisibility();
	}

	@Override
	public void WaitElementClickable(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeWaitElementClickable();
        try
        {
        	pomevents.WaitElementClickable(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitElementClickable();
	}

	@Override
	public void ProcessingLoad() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeProcessingLoad();
        try
        {
        	pomevents.ProcessingLoad();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterProcessingLoad();
	}
	
	@Override
	public void ProcessingLoadStickyForm() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeProcessingLoadStickyForm();
        try
        {
        	pomevents.ProcessingLoadStickyForm();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterProcessingLoadStickyForm();
	}

	@Override
	public void ProcessingLoadCSOverlay() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeProcessingLoadCSOverlay();
        try
        {
        	pomevents.ProcessingLoadCSOverlay();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterProcessingLoadCSOverlay();
	}

	
	

	@Override
	public void autoComplete(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeAutoComplete();
        try
        {
        	pomevents.autoComplete(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterAutoComplete();
	}
	
	
	@Override
	public void waitWithClickable(String p) throws POMEventException 
	{
		for (Listener listen : listeners1)
            listen.beforeWaitWithClickable();
        try
        {
        	pomevents.waitWithClickable(p);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitWithClickable();
		
	}

	@Override
	public void DatePickerpopup(String p, String inputValue) throws POMEventException 
	{
		for (Listener listen : listeners1)
            listen.beforeDatePickerpopup();
        try
        {
        	pomevents.DatePickerpopup(p , inputValue);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterDatePickerpopup();
		
	}



	@Override
	public boolean assertText(WebElement element, String value) throws POMEventException 
	{
		boolean output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeAssertText();
        try
        {
        	output = pomevents.assertText(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterAssertText();
		return output;
	}

	@Override
	public void takeScreenShot() throws IOException, POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeTakeScreenShot();
        try
        {
        	pomevents.takeScreenShot();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterTakeScreenShot();
	}

	@Override
	public void JSradioButton(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeJSradioButton();
        try
        {
        	pomevents.JSradioButton(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterJSradioButton();
	}

	@Override
	public void contSendkeysOperation(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeContSendkeysOperation();
        try
        {
        	pomevents.contSendkeysOperation(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterContSendkeysOperation();
	}

	@Override
	public void setTextWithoutEnter(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextWithoutEnter();
        try
        {
        	pomevents.setTextWithoutEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextWithoutEnter();
	}

	@Override
	public void setTextThenEnter(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextThenEnter();
        try
        {
        	pomevents.setTextThenEnter(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextThenEnter();
	}

	@Override
	public void setTextThenTab(WebElement element, String value) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeSetTextThenTab();
        try
        {
        	pomevents.setTextThenTab(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSetTextThenTab();
	}

	@Override
	public int checkProductDisable(WebElement element, String value) throws POMEventException 
	{
		int output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeCheckProductDisable();
        try
        {
        	output = pomevents.checkProductDisable(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterCheckProductDisable();
		return output;
	}

	@Override
	public String getValueByTextInput(WebElement element) throws POMEventException 
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByTextInput();
        try
        {
        	output = pomevents.getValueByTextInput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByTextInput();
		return output;
	}

	@Override
	public String getValueByAttributeInput(WebElement element) throws POMEventException 
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByAttributeInput();
        try
        {
        	output = pomevents.getValueByAttributeInput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByAttributeInput();
		return output;
	}

	@Override
	public void mouseHover(WebElement element) throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeMouseHover();
        try
        {
        	pomevents.mouseHover(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterMouseHover();
	}
	
	@Override
	public void takeScreenshot(String filename) throws POMEventException 
	{
		for (Listener listen : listeners1)
            listen.beforeScreenShot();
        try
        {
        	pomevents.takeScreenshot(filename);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterScreenShot();
		
	}
	
	@Override
	public String getValueByTextOutput(WebElement element) throws POMEventException
	{
		String output;
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByTextOutput();
        try
        {
        	output = pomevents.getValueByTextOutput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByTextOutput();
		return output;
	}

	@Override
	public String getValueByAttributeOutput(WebElement element) throws POMEventException
	{
		String output="";
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeGetValueByAttributeOutput();
        try
        {
        	output=pomevents.getValueByAttributeOutput(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterGetValueByAttributeOutput();
		return output;
	}

	@Override
	public DatabaseOperation establishDBConnection() throws POMEventException 
	{
		DB = new DatabaseOperation();
		for (Listener listen : listeners1)
            listen.beforeEstablishDBConnection();
        try
        {
        	DB = pomevents.establishDBConnection();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterEstablishDBConnection();
        return DB;
	}

	@Override
	public void LocationProcessingLoad() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeLocationProcessingLoad();
        try
        {
        	pomevents.LocationProcessingLoad();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterLocationProcessingLoad();
	}

	@Override
	public void OutsideClick() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeOutsideClick();
        try
        {
        	pomevents.OutsideClick();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterOutsideClick();
	}

	@Override
	public void WaitElementClickable(String p) throws POMEventException {
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeWaitWithClickable();
        try
        {
        	pomevents.WaitElementClickable(p);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterWaitWithClickable();
		
	}

	@Override
	public void JStextbox(WebElement element, String value) throws POMEventException {
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeJStextbox();
        try
        {
        	pomevents.JStextbox(element, value);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterJStextbox();
		
	}

	@Override
	public void JScheckbox(WebElement element) throws POMEventException {
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeJScheckbox();
        try
        {
        	pomevents.JScheckbox(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterJScheckbox();
	}

	@Override
	public void fluentProcessingLoad(WebElement element) throws POMEventException
	{
		for (Listener listen : listeners1)
            listen.beforeFluentProcessingLoad();
        try
        {
        	pomevents.fluentProcessingLoad(element);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterFluentProcessingLoad();
		
	}

	@Override
	public void SyncWait(int time) throws POMEventException
	{
		for (Listener listen : listeners1)
            listen.beforeSyncWait();
        try
        {
        	pomevents.SyncWait(time);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterSyncWait();
		
	}

	@Override
	public void ThreadWait(int time) throws POMEventException 
	{
		for (Listener listen : listeners1)
            listen.beforeThreadWait();
        try
        {
        	pomevents.ThreadWait(time);
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterThreadWait();
	}

	@Override
	public void QuoteOverLay() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeQuoteOverLay();
        try
        {
        	pomevents.QuoteOverLay();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterQuoteOverLay();
	}

	@Override
	public void EndoOverLay() throws POMEventException 
	{
		// TODO Auto-generated method stub
		for (Listener listen : listeners1)
            listen.beforeEndoOverLay();
        try
        {
        	pomevents.EndoOverLay();
        }
        catch(POMEventException e)
        {
            for (Listener listen : listeners1)
                listen.onError(e);
            throw new POMEventException(e);
        }
        for (Listener listen : listeners1)
            listen.afterEndoOverLay();
	}
	
	
}
