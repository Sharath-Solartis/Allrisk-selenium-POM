package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg07_CarrierSelectionPage;
import com.solartis.test.pom.pages.input.Pg12_PaymentPageAndIssueBinder;
import com.solartis.test.pom.pages.input.Pg10_RuleOverrideAndQuoteProposalPage;

public class Pg12_PaymentPageAndIssueBinderSD extends PomEventsMethodDefinition 

{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	Pg12_PaymentPageAndIssueBinder Payment = new Pg12_PaymentPageAndIssueBinder();
	FireEvent FireEventobject = new FireEvent();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	
	@Then("^payNow button or issue binder button according to \"([^\"]*)\" for \"([^\"]*)\"$")
	public void PayNowOrIssueBinderButton(String billingType, String SNo) throws Throwable 
	{
		
		try 
    	{
			//FireEventobject.QuoteOverLay();
		
			if(billingType.equals("Direct Bill"))
			{					
				 Payment.paynowButtonClick();
				 FireEventobject.ProcessingLoad();				
			}
			else if(billingType.equals("Agency Bill"))
			{				
				Payment.clickBindRequest();
				FireEventobject.ProcessingLoad();
				FireEventobject.QuoteOverLay();
				
				Payment.clickIssueBinderOptions();
				Payment.clickIssueBinderInHeader();
				FireEventobject.ProcessingLoad();
			}			
			
    	}
		catch (POMEventException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment or issue binder Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment or issue binder Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment or issue binder Page", e);
		}
		scenariolog.info("Payment details and issue binder details has been entered for Testdata" + SNo);
	}	


	@Then("^click whether ITP \"([^\"]*)\" for \"([^\"]*)\" When \"([^\"]*)\" Then enter Payment Method \"([^\"]*)\" Then enter card type \"([^\"]*)\" Then enter expiration month and year \"([^\"]*)\" Then \"([^\"]*)\" And enter error message in \"([^\"]*)\" when error triggers for \"([^\"]*)\"$")
	public void PaymentPage(String additionalProductITP, String policyForm, String billingType, String paymentMethod ,String cardType ,String expirationMonth,String expirationYear,String TableName, String SNo) throws Throwable 
	{
		DatabaseOperation DB = FireEventobject.establishDBConnection();
		try 
    	{
			Payment.clickInspectionFeeDownArrow();
			String inspectionFee = Payment.getInspectionFee();
						
			if(billingType.equals("Direct Bill"))
			{
			
				    Payment.paynowButtonClick();
				    
					if(additionalProductITP.equals("Excluded") && objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3", policyForm))
						Payment.clickincludeITP();
					
					
					if(!"$0.00".equals(inspectionFee))
					{
						System.out.println("ins fee zero");
						Payment.enterContactFirstNameInDirectBill("John");
						Payment.enterContactLastNameInDirectBill("Doe");
					}
					
					
					Payment.selectPaymentMethod(paymentMethod);
		    	
					
					if (paymentMethod.equals("Paper Check"))
					{
						Payment.enterCheckNumber("12345678");
						Payment.enterBankName("TEST");
						Payment.clickCheckDate();
						Payment.DatePicker(Payment.CheckDate,"01/01/2018");
					}
					else if (paymentMethod.equals("ACH/Echeck"))
					{
						Payment.enterABARoutingNumber("011000015");
						Payment.enterABARoutingNumber("011000015");
						Payment.enterNameOfFinancialInstitution("TEST");
						Payment.selectAccountType("Savings");
						Payment.enterAccountNumber("41111111111");
						Payment.enterConfirmAccountNumber("41111111111");
					}
					
					else if (paymentMethod.equals("Credit Card"))
					{
						Payment.selectCardType(cardType);
						Thread.sleep(3000);
						if(cardType.equals("VISA"))
							Payment.enterCardNumber("4111111111111111");
						else if(cardType.equals("Master Card"))
							Payment.enterCardNumber("5105105105105100");
						else if(cardType.equals("Discover"))
							Payment.enterCardNumber("6011000990139424");
						else if(cardType.equals("American Express"))
							Payment.enterCardNumber("378282246310005");
						
						Payment.selectExpirationMonth(expirationMonth);
						Payment.selectExpirationYear(expirationYear);
						
						if(cardType.equals("American Express"))
							Payment.enterCardVerificationNumber("1234");
						else
							Payment.enterCardVerificationNumber("123");
					}
					
					Payment.clickUseInsuredInformation();
					Payment.clickAcceptTermsAndConditions();
					Payment.clickBuyNow();
					FireEventobject.ProcessingLoad();
					/*if(Payment.ErrorMessage.isDisplayed())
					{
						DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
						driver.quit();
					}*/
					//FireEventobject.QuoteOverLay();
					FireEventobject.ThreadWait(5000);
					Payment.clickGoToPolicySummaryButton();
					FireEventobject.ProcessingLoad();
			}
			
			else if(billingType.equals("Agency Bill"))
			{
				Payment.clickBindRequest();
				Payment.clickIssueBinderOptions();
				Payment.clickIssueBinderInHeader();
				FireEventobject.ProcessingLoad();
				Payment.clickEffectiveDate();
				Payment.DatePicker(Payment.CheckDate,"01/01/2018");
				if(!"$0.00".equals(inspectionFee))
				{
					System.out.println("ins fee zero");
					Payment.enterContactFirstNameInAgencyBill("John");
					Payment.enterContactLastNameInAgencyBill("Doe");
				}
				Payment.clickIssueBinderButton();
				FireEventobject.ProcessingLoad();
				if(Payment.ErrorMessage.isDisplayed())
				{
					DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
					driver.quit();
				}
			}
			
			
		} 
		
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment or issue binder Page", e);
		}
		scenariolog.info("Payment details has been entered for Testdata" + SNo);
	}
	
	/*@Then("^proceed without filling Payment Details for \"([^\"]*)\"$")
	public void PaymentPageNegative(String additionalProductITP, String policyForm, String billingType, String paymentMethod ,String cardType ,String expirationMonth,String expirationYear,String SNo) throws Throwable 
	{
		
		try 
    	{
			
    	}
		catch (POMEventException | InterruptedException e) 
		{
				try 
				{
					FireEventobject.takeScreenshot(SNo);
				} 
				catch (POMEventException e1) 
				{
					throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
				}
				throw new POMPageException("Error in Payment Page", e);
		}
	//Payment.PaymentMethod(AdditionalProductITP ,PaymentMethod ,CardType,expirationMonth,expirationYear, SNo);
	scenariolog.info("Payment details has been entered for Testdata" + SNo);
}*/
	
	@Then("^check whether ITP \"([^\"]*)\" for \"([^\"]*)\" for Direct Bill Then enter Payment Method \"([^\"]*)\" Then enter card type \"([^\"]*)\" Then enter expiration month and year \"([^\"]*)\" Then \"([^\"]*)\" And enter error message in \"([^\"]*)\" when error triggers for \"([^\"]*)\"$")
	public void PaymentBindRequest(String additionalProductITP, String policyForm, String paymentMethod ,String cardType ,String expirationMonth,String expirationYear,String TableName, String SNo) throws Throwable
	{
		DatabaseOperation DB = FireEventobject.establishDBConnection();
		try
		{

			Payment.clickInspectionFeeDownArrow();
			String inspectionFee = Payment.getInspectionFee();
			String BillType = Payment.getBillingType();
			
			if(BillType.equals("DirectBill"))
			{
				
			    Payment.paynowButtonClick();
			    
				if(additionalProductITP.equals("Excluded") && objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3", policyForm))
					Payment.clickincludeITP();
				
				
				if(!"$0.00".equals(inspectionFee))
				{
					System.out.println("ins fee zero");
					Payment.enterContactFirstNameInDirectBill("John");
					Payment.enterContactLastNameInDirectBill("Doe");
				}
				
				
				Payment.selectPaymentMethod(paymentMethod);
	    	
				
				if (paymentMethod.equals("Paper Check"))
				{
					Payment.enterCheckNumber("12345678");
					Payment.enterBankName("TEST");
					Payment.clickCheckDate();
					Payment.DatePicker(Payment.CheckDate,"01/01/2018");
				}
				else if (paymentMethod.equals("ACH/Echeck"))
				{
					Payment.enterABARoutingNumber("011000015");
					Payment.enterABARoutingNumber("011000015");
					Payment.enterNameOfFinancialInstitution("TEST");
					Payment.selectAccountType("Savings");
					Payment.enterAccountNumber("41111111111");
					Payment.enterConfirmAccountNumber("41111111111");
				}
				
				else if (paymentMethod.equals("Credit Card"))
				{
					Payment.selectCardType(cardType);
					Thread.sleep(3000);
					if(cardType.equals("VISA"))
						Payment.enterCardNumber("4111111111111111");
					else if(cardType.equals("Master Card"))
						Payment.enterCardNumber("5105105105105100");
					else if(cardType.equals("Discover"))
						Payment.enterCardNumber("6011000990139424");
					else if(cardType.equals("American Express"))
						Payment.enterCardNumber("378282246310005");
					
					Payment.selectExpirationMonth(expirationMonth);
					Payment.selectExpirationYear(expirationYear);
					
					if(cardType.equals("American Express"))
						Payment.enterCardVerificationNumber("1234");
					else
						Payment.enterCardVerificationNumber("123");
				}
				
				Payment.clickUseInsuredInformation();
				Payment.clickAcceptTermsAndConditions();
				Payment.clickBuyNow();
				FireEventobject.ProcessingLoad();
				if(Payment.ErrorMessage.isDisplayed())
				{
					DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
					driver.quit();
				}
				else
				{
				Payment.clickGoToPolicySummaryButton();
				FireEventobject.ProcessingLoad();
				}
		}
		
		else if(BillType.equals("AgencyBill"))
		{
			Payment.clickBindRequest();
			FireEventobject.ProcessingLoad();
			FireEventobject.QuoteOverLay();
			
			Payment.clickIssueBinderOptions();
			Payment.clickIssueBinderInHeader();
			FireEventobject.ProcessingLoad();
			if(!"$0.00".equals(inspectionFee))
			{
				System.out.println("ins fee zero");
				Payment.enterContactFirstNameInAgencyBill("John");
				Payment.enterContactLastNameInAgencyBill("Doe");
			}
			Payment.clickIssueBinderButton();
			FireEventobject.ProcessingLoad();
			if(Payment.ErrorMessage.isDisplayed())
			{
				DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
				driver.quit();
			}
		}
		}
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment Page", e);
		}
		scenariolog.info("Payment details has been entered for Testdata" + SNo);
	}
	
	@Then("^check whether ITP \"([^\"]*)\" for \"([^\"]*)\" for Direct Bill Then enter Payment Method \"([^\"]*)\" Then enter card type \"([^\"]*)\" Then enter expiration month and year \"([^\"]*)\" Then \"([^\"]*)\" with Effective Date change \"([^\"]*)\" And enter error message in \"([^\"]*)\" when error triggers for \"([^\"]*)\"$")
	public void PaymentBindRequestEffDateChange(String additionalProductITP, String policyForm, String paymentMethod ,String cardType ,String expirationMonth,String expirationYear, String effectiveDate,String TableName, String SNo) throws Throwable
	{
		DatabaseOperation DB = FireEventobject.establishDBConnection();
		try
		{
			Payment.clickInspectionFeeDownArrow();
			String inspectionFee = Payment.getInspectionFee();
			String BillType = Payment.getBillingType();
			
			if(BillType.equals("DirectBill"))
			{
				
			    Payment.paynowButtonClick();
			    
				if(additionalProductITP.equals("Excluded") && objectconditions.ConditionReading("policyForm=HO3|HO5|HO8|DP1|DP3", policyForm))
					Payment.clickincludeITP();
				
				
				if(!"$0.00".equals(inspectionFee))
				{
					System.out.println("ins fee zero");
					Payment.enterContactFirstNameInDirectBill("John");
					Payment.enterContactLastNameInDirectBill("Doe");
				}
				
				
				Payment.selectPaymentMethod(paymentMethod);
	    	
				
				if (paymentMethod.equals("Paper Check"))
				{
					Payment.enterCheckNumber("12345678");
					Payment.enterBankName("TEST");
					Payment.clickCheckDate();
					Payment.DatePicker(Payment.CheckDate,"01/01/2018");
				}
				else if (paymentMethod.equals("ACH/Echeck"))
				{
					Payment.enterABARoutingNumber("011000015");
					Payment.enterABARoutingNumber("011000015");
					Payment.enterNameOfFinancialInstitution("TEST");
					Payment.selectAccountType("Savings");
					Payment.enterAccountNumber("41111111111");
					Payment.enterConfirmAccountNumber("41111111111");
				}
				
				else if (paymentMethod.equals("Credit Card"))
				{
					Payment.selectCardType(cardType);
					if(cardType.equals("VISA"))
						Payment.enterCardNumber("4111111111111111");
					else if(cardType.equals("Master Card"))
						Payment.enterCardNumber("5105105105105100");
					else if(cardType.equals("Discover"))
						Payment.enterCardNumber("6011000990139424");
					else if(cardType.equals("American Express"))
						Payment.enterCardNumber("378282246310005");
					
					Payment.selectExpirationMonth(expirationMonth);
					Payment.selectExpirationYear(expirationYear);
					
					if(cardType.equals("American Express"))
						Payment.enterCardVerificationNumber("1234");
					else
						Payment.enterCardVerificationNumber("123");
				}
				
				Payment.clickUseInsuredInformation();
				Payment.clickAcceptTermsAndConditions();
				Payment.clickBuyNow();
				FireEventobject.ProcessingLoad();
				if(Payment.ErrorMessage.isDisplayed())
				{
					DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
					driver.quit();
				}
				FireEventobject.QuoteOverLay();
				Payment.clickGoToPolicySummaryButton();
				FireEventobject.ProcessingLoad();
		}
		
		else if(BillType.equals("AgencyBill"))
		{
			Payment.clickBindRequest();
			Payment.clickIssueBinderOptions();
			Payment.clickIssueBinderInHeader();
			Thread.sleep(4000);
			Payment.clickEffectiveDate();
			Payment.DatePicker(Payment.CheckDate,effectiveDate);
			if(!"$0.00".equals(inspectionFee))
			{
				System.out.println("ins fee zero");
				Payment.enterContactFirstNameInAgencyBill("John");
				Payment.enterContactLastNameInAgencyBill("Doe");
			}
			Payment.clickIssueBinderButton();
			FireEventobject.ProcessingLoad();
			if(Payment.ErrorMessage.isDisplayed())
			{
				DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
				driver.quit();
			}
		}
		}
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment Page", e);
		}
		scenariolog.info("Payment details has been entered for Testdata" + SNo);
	}
	
	@Then("^Issue Binder without change in Effective Date And enter error message in \"([^\"]*)\" when error triggers for \"([^\"]*)\"$")
	public void issueBinderWithoutDateChange(String TableName, String SNo) throws Throwable
	{
		DatabaseOperation DB = FireEventobject.establishDBConnection();
		try
		{
			Payment.clickInspectionFeeDownArrow();
			String inspectionFee = Payment.getInspectionFee();
			Payment.clickIssueBinderOptions();
			Payment.clickIssueBinderInHeader();
			Thread.sleep(4000);
			if(!"$0.00".equals(inspectionFee))
			{
				System.out.println("ins fee zero");
				Payment.enterContactFirstNameInAgencyBill("John");
				Payment.enterContactLastNameInAgencyBill("Doe");
			}
			Payment.clickIssueBinderButton();
			FireEventobject.ProcessingLoad();
			if(Payment.ErrorMessage.isDisplayed())
			{
				DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
				driver.quit();
			}
		}
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment Page", e);
		}
		scenariolog.info("Payment details has been entered for Testdata" + SNo);
	}
	
	@Then("^Issue Binder with change in Effective Date \"([^\"]*)\" And enter error message in \"([^\"]*)\" when error triggers for \"([^\"]*)\"$")
	public void issueBinderWithDateChange(String effectiveDate, String TableName, String SNo) throws Throwable
	{
		DatabaseOperation DB = FireEventobject.establishDBConnection();
		try
		{
			Payment.clickInspectionFeeDownArrow();
			String inspectionFee = Payment.getInspectionFee();
			Payment.clickIssueBinderOptions();
			Payment.clickIssueBinderInHeader();
			Thread.sleep(4000);
			Payment.clickEffectiveDate();
			Payment.DatePicker(Payment.CheckDate,effectiveDate);
			if(!"$0.00".equals(inspectionFee))
			{
				System.out.println("ins fee zero");
				Payment.enterContactFirstNameInAgencyBill("John");
				Payment.enterContactLastNameInAgencyBill("Doe");
			}
			Payment.clickIssueBinderButton();
			FireEventobject.ProcessingLoad();
			if(Payment.ErrorMessage.isDisplayed())
			{
				DB.InserValueWithRowNumber(TableName, "Error_Label", "Error Message Displayed", Integer.parseInt(SNo));
				driver.quit();
			}
		}
		catch (POMEventException | InterruptedException e) 
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Payment Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Payment Page", e1);
			}
			errorlog.info("Error in Payment or issue binder Page", e);
			throw new POMPageException("Error in Payment Page", e);
		}
		scenariolog.info("Payment details has been entered for Testdata" + SNo);
	}
}
