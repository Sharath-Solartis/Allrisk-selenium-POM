package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.DatabaseException;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.common.operations.DatabaseOperation;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg10_RuleOverrideAndQuoteProposalPage;

import cucumber.api.java.en.Then;

public class Pg10_RuleOverrideAndQuoteProposalSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg10_RuleOverrideAndQuoteProposalPage RuleOverridePage = new Pg10_RuleOverrideAndQuoteProposalPage();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^get Quote status and Quote number and write those in DB \"([^\"]*)\" And Override rules for \"([^\"]*)\"$")
	public void overrideRules(String tableName, String SNo) throws POMPageException
	{
		try 
    	{
			
			//FireEventobject.QuoteOverLay();
			FireEventobject.SyncWait(4000);
			DatabaseOperation DB = FireEventobject.establishDBConnection();	
			String QuoteStatus = RuleOverridePage.GetQuoteStatus();
			System.out.println("QuoteStatus  " + QuoteStatus);
			DB.InserValueWithRowNumber(tableName, "QuoteStatus", QuoteStatus, Integer.parseInt(SNo));
			String QuoteNumber = RuleOverridePage.GetQuoteNumber();
			DB.InserValueWithRowNumber(tableName, "QuoteNumber", QuoteNumber, Integer.parseInt(SNo));	
			int tablerowsize; 
			String rulecount;
			
			
			   if(QuoteStatus.equals("Referred"))
			   {
				   	   String Rule_Label = RuleOverridePage.formdisable("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[contains(text(),'Showing')]");
					   System.out.println(Rule_Label);
					   
						if(Rule_Label.equals("No Label"))
						{
								tablerowsize = RuleOverridePage.gettablerowlist("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable')/div/table/tbody/tr/td[2]/label");
								rulecount = Integer.toString(tablerowsize);
								DB.InserValueWithRowNumber(tableName, "Rule_Count", rulecount, Integer.parseInt(SNo));
								System.out.println("rulecount " + rulecount);
								System.out.println("tablerow " +tablerowsize);
						}
						else
						{
								tablerowsize = RuleOverridePage.getreferralrulecount("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[contains(text(),'Showing')]");
								rulecount = Integer.toString(tablerowsize);
								DB.InserValueWithRowNumber(tableName, "Rule_Count", rulecount, Integer.parseInt(SNo));
								System.out.println("rulecount " + rulecount);
								System.out.println("tablerow " +tablerowsize);
								RuleOverridePage.Paginatorclick1();
						}
						
						if(tablerowsize == 1 | tablerowsize == 2 | tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride1("Override");
						
						if(tablerowsize == 2 | tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride2("Override");
						
						if(tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride3("Override");
						
						RuleOverridePage.BusinessRuleForm_Click();
						FireEventobject.ProcessingLoad();
						//FireEventobject.QuoteOverLay();		
						
						if(tablerowsize > 3)
						{
								RuleOverridePage.Paginatorclick2();
								FireEventobject.SyncWait(2000);
								
								RuleOverridePage.Paginatorclick2();
								FireEventobject.SyncWait(2000);
								
								RuleOverridePage.Paginatorclick2();
								FireEventobject.SyncWait(2000);
							
								if(tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride4("Override");
								
								if(tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride5("Override");
								
								if(tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride6("Override");
								
								RuleOverridePage.BusinessRuleForm_Click();
								FireEventobject.ProcessingLoad();
						}
						
						
						if(tablerowsize > 6)
						{
								RuleOverridePage.Paginatorclick3();
								FireEventobject.SyncWait(2000);
								
								RuleOverridePage.Paginatorclick3();
								FireEventobject.SyncWait(2000);
				
								RuleOverridePage.Paginatorclick3();
								FireEventobject.SyncWait(2000);
							
								if(tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride7("Override");
								
								if(tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride8("Override");
								
								if(tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride9("Override");
								
								RuleOverridePage.BusinessRuleForm_Click();
								FireEventobject.ProcessingLoad();
						
						}
						
						
						if(tablerowsize > 9)
						{
								RuleOverridePage.Paginatorclick4();
								FireEventobject.SyncWait(2000);
								RuleOverridePage.Paginatorclick4();
								FireEventobject.SyncWait(2000);
								RuleOverridePage.Paginatorclick4();
								FireEventobject.SyncWait(2000);
							
								if(tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride10("Override");
								
								if(tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride11("Override");
								
								if(tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride12("Override");
								
								RuleOverridePage.BusinessRuleForm_Click();
								FireEventobject.ProcessingLoad();
						}
						
						
						if(tablerowsize > 12)
						{
								RuleOverridePage.Paginatorclick5();
								FireEventobject.SyncWait(2000);
								RuleOverridePage.Paginatorclick5();
								FireEventobject.SyncWait(2000);
								RuleOverridePage.Paginatorclick5();
								FireEventobject.SyncWait(2000);
											
								if(tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride13("Override");
								
								if(tablerowsize == 14 | tablerowsize == 15)
									RuleOverridePage.RuleOverride14("Override");
								
								if(tablerowsize == 15)
									RuleOverridePage.RuleOverride15("Override");
								
								RuleOverridePage.BusinessRuleForm_Click();
								FireEventobject.ProcessingLoad();
						}
			   }
			   else
			   {
				   System.out.println("QuoteStatus  " + QuoteStatus);
			   }
			   
    	} 
    	catch (POMEventException | DatabaseException e) 
    	{
    		try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Quote Summary Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Quote Summary Page", e1);
			}
    		errorlog.info("Error in Rule Override in Quote Summary Page", e);
			throw new POMPageException("Error in Rule Override in Quote Summary Page", e);
		}
	}
	
	@Then("^offer quote \"([^\"]*)\" for \"([^\"]*)\"$")
	public void offerQuote(String tableName, String SNo) throws POMPageException
	{
		try
		{	
			DatabaseOperation DB = FireEventobject.establishDBConnection();	
			String QuoteStatus = DB.getValueWithRowNumber(tableName, "QuoteStatus", Integer.parseInt(SNo));
			System.out.println("QUOTE STATUS" +QuoteStatus);
			 if(QuoteStatus.equals("Referred"))
			{
				FireEventobject.ThreadWait(5000);
				RuleOverridePage.clickCreateQuoteProposal();	
				FireEventobject.ProcessingLoad();
				RuleOverridePage.clickCreateQuoteProposalDialogClose();
				FireEventobject.ProcessingLoad();
				FireEventobject.ThreadWait(5000);
			}
		}
		catch (POMEventException | DatabaseException e) 
    	{
    		try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Quote Summary Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Quote Summary Page", e1);
			}
    		errorlog.info("Error in Offering Quote in Quote Summary Page", e);
			throw new POMPageException("Error in Offering Quote in Quote Summary Page", e);
	}
 }
	
	@Then("^get the rule count and write in DB \"([^\"]*)\" and override the rules for \"([^\"]*)\"$")
	public void getRuleCountOverrideRules(String tableName, String SNo) throws POMPageException
	{
		try
		{
			   DatabaseOperation DB = FireEventobject.establishDBConnection();
			   int tablerowsize;
			   String rulecount;
			   String Rule_Label = RuleOverridePage.formdisable("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[contains(text(),'Showing')]");
			   System.out.println(Rule_Label);
			   
			   if(Rule_Label.equals("No Label"))
				{
						tablerowsize = RuleOverridePage.gettablerowlist("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable')/div/table/tbody/tr/td[2]/label");
						rulecount = Integer.toString(tablerowsize);
						DB.InserValueWithRowNumber(tableName, "Rule_Count", rulecount, Integer.parseInt(SNo));
						System.out.println("rulecount " + rulecount);
						System.out.println("tablerow " +tablerowsize);
				}
				else
				{
						tablerowsize = RuleOverridePage.getreferralrulecount("id('BusinessRuleTile:BusinessRuleform:HamburgerBusinssRuleDatatable_paginator_bottom')/span[contains(text(),'Showing')]");
						rulecount = Integer.toString(tablerowsize);
						DB.InserValueWithRowNumber(tableName, "Rule_Count", rulecount, Integer.parseInt(SNo));
						System.out.println("rulecount " + rulecount);
						System.out.println("tablerow " +tablerowsize);
						RuleOverridePage.Paginatorclick1();
				}
				
				if(tablerowsize == 1 | tablerowsize == 2 | tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
					RuleOverridePage.RuleOverride1("Override");
				
				if(tablerowsize == 2 | tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
					RuleOverridePage.RuleOverride2("Override");
				
				if(tablerowsize == 3 | tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
					RuleOverridePage.RuleOverride3("Override");
				
				RuleOverridePage.BusinessRuleForm_Click();
				FireEventobject.ProcessingLoad();
				//FireEventobject.QuoteOverLay();		
				
				if(tablerowsize > 3)
				{
						RuleOverridePage.Paginatorclick2();
						FireEventobject.SyncWait(2000);
						
						RuleOverridePage.Paginatorclick2();
						FireEventobject.SyncWait(2000);
						
						RuleOverridePage.Paginatorclick2();
						FireEventobject.SyncWait(2000);
					
						if(tablerowsize == 4 | tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride4("Override");
						
						if(tablerowsize == 5 | tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride5("Override");
						
						if(tablerowsize == 6 | tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride6("Override");
						
						RuleOverridePage.BusinessRuleForm_Click();
						FireEventobject.ProcessingLoad();
				}
				
				
				if(tablerowsize > 6)
				{
						RuleOverridePage.Paginatorclick3();
						FireEventobject.SyncWait(2000);
						
						RuleOverridePage.Paginatorclick3();
						FireEventobject.SyncWait(2000);
		
						RuleOverridePage.Paginatorclick3();
						FireEventobject.SyncWait(2000);
					
						if(tablerowsize == 7 | tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride7("Override");
						
						if(tablerowsize == 8 | tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride8("Override");
						
						if(tablerowsize == 9 | tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride9("Override");
						
						RuleOverridePage.BusinessRuleForm_Click();
						FireEventobject.ProcessingLoad();
				
				}
				
				
				if(tablerowsize > 9)
				{
						RuleOverridePage.Paginatorclick4();
						FireEventobject.SyncWait(2000);
						RuleOverridePage.Paginatorclick4();
						FireEventobject.SyncWait(2000);
						RuleOverridePage.Paginatorclick4();
						FireEventobject.SyncWait(2000);
					
						if(tablerowsize == 10 | tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride10("Override");
						
						if(tablerowsize == 11 | tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride11("Override");
						
						if(tablerowsize == 12 | tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride12("Override");
						
						RuleOverridePage.BusinessRuleForm_Click();
						FireEventobject.ProcessingLoad();
				}
				
				
				if(tablerowsize > 12)
				{
						RuleOverridePage.Paginatorclick5();
						FireEventobject.SyncWait(2000);
						RuleOverridePage.Paginatorclick5();
						FireEventobject.SyncWait(2000);
						RuleOverridePage.Paginatorclick5();
						FireEventobject.SyncWait(2000);
									
						if(tablerowsize == 13 | tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride13("Override");
						
						if(tablerowsize == 14 | tablerowsize == 15)
							RuleOverridePage.RuleOverride14("Override");
						
						if(tablerowsize == 15)
							RuleOverridePage.RuleOverride15("Override");
						
						RuleOverridePage.BusinessRuleForm_Click();
						FireEventobject.ProcessingLoad();
				}
				
		}
		catch (POMEventException | NumberFormatException | DatabaseException e) 
    	{
    		try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Quote Summary Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Quote Summary Page", e1);
			}
    		errorlog.info("Error in Rule Override in Quote Summary Page", e);
			throw new POMPageException("Error in Rule Override in Quote Summary Page", e);
		}
	}
	
	@Then("^click on Return to Carrier Selection button for \"([^\"]*)\"$")
	public void clickReturnToCS(String SNo) throws POMPageException
	{
		try
		{
			RuleOverridePage.ReturnToCarrierSelection();
			Thread.sleep(35000);
		}
		catch (POMEventException | InterruptedException e) 
    	{
    		try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Quote Summary Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Quote Summary Page", e1);
			}
    		errorlog.info("Error in clicking Return To Carrier Selection in Quote Summary Page", e);
			throw new POMPageException("Error in clicking Return To Carrier Selection in Quote Summary Page", e);
    	}
	}
}
