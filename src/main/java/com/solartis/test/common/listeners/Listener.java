package com.solartis.test.common.listeners;

import org.openqa.selenium.WebElement;

public interface Listener 
{
	 public void beforeEstablishDBConnection();
	 public void afterEstablishDBConnection();
	 public void beforeClickElement(WebElement element);
	 public void afterClickElement();
	 public void beforeDropdown();
	 public void afterDropdown();
	 public void beforeEnterTextWithoutEnter();
	 public void afterEnterTextWithoutEnter();
	 public void beforeEnterTextWithEnter();
	 public void afterEnterTextWithEnter();
	 public void beforetoggleButton();
	 public void aftertoggleButton();
	 public void beforeclearTextbox();
	 public void afterclearTextbox();
	 public void beforeWaitElementVisibility();
	 public void afterWaitElementVisibility();
	 public void beforeWaitElementClickable();
	 public void afterWaitElementClickable();
	 public void beforeFluentProcessingLoad();
	 public void afterFluentProcessingLoad();
	 public void beforeProcessingLoad();
	 public void afterProcessingLoad();
	 public void beforeProcessingLoadStickyForm();
	 public void afterProcessingLoadStickyForm();
	 public void beforeProcessingLoadCSOverlay();
	 public void afterProcessingLoadCSOverlay();
	 public void beforeAutoComplete();
	 public void afterAutoComplete();
	 public void beforeWaitWithClickable();
	 public void afterWaitWithClickable();
	 public void beforeDatePickerpopup();
	 public void afterDatePickerpopup();
	 public void beforeAssertText();
	 public void afterAssertText();
	 public void beforeTakeScreenShot();
	 public void afterTakeScreenShot();
	 public void beforeJSradioButton();
	 public void afterJSradioButton();
	 public void beforeContSendkeysOperation();
	 public void afterContSendkeysOperation();
	 public void beforeSetTextWithoutEnter();
	 public void afterSetTextWithoutEnter();
	 public void beforeSetTextThenEnter();
	 public void afterSetTextThenEnter();
	 public void beforeSetTextThenTab();
	 public void afterSetTextThenTab();
	 public void beforeCheckProductDisable();
	 public void afterCheckProductDisable();
	 public void beforeGetValueByTextInput();
	 public void afterGetValueByTextInput();
	 public void beforeGetValueByAttributeInput();
	 public void afterGetValueByAttributeInput();
	 public void beforeMouseHover();
	 public void afterMouseHover();
	 public void beforeScreenShot();
	 public void afterScreenShot();
	 public void beforeGetValueByTextOutput();
	 public void afterGetValueByTextOutput();
	 public void beforeGetValueByAttributeOutput();
	 public void afterGetValueByAttributeOutput();
	 public void onError(Exception e);
	 public void onException(Throwable throwable);
	 public void beforeAssertCheck();
	 public void afterAssertCheck();
	 public void beforeLocationProcessingLoad();
	 public void afterLocationProcessingLoad();
	 public void beforeOutsideClick();
	 public void afterOutsideClick();
	 public void beforeJStextbox();
	 public void afterJStextbox();
	 public void beforeJScheckbox();
	 public void afterJScheckbox();
	 public void afterThreadWait();
	 public void beforeThreadWait();
	 public void beforeSyncWait();
	 public void afterSyncWait();
	 public void beforeQuoteOverLay();
	 public void afterQuoteOverLay();
	 public void beforeEndoOverLay();
	 public void afterEndoOverLay();
}