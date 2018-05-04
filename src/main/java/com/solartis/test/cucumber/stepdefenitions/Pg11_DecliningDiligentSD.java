package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.Pg11_DecliningDiligentInfoPage;
import cucumber.api.java.en.Then;


public class Pg11_DecliningDiligentSD 
{
	
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg11_DecliningDiligentInfoPage declininginfo = new Pg11_DecliningDiligentInfoPage();
	protected ConditionVerify objectconditions = new ConditionVerify();
	
	@Then("^enter Declining carrier1 \"([^\"]*)\" Then Declining carrier2 \"([^\"]*)\" Then Declining carrier3 \"([^\"]*)\" information for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDecliningCarrierInfo(String Decliningcarrier1, String Decliningcarrier2, String Decliningcarrier3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|CA|DC|DE|IN|MD|TN|WV|IL|MI|NJ|FL|IL", State))
			{
			declininginfo.enterInsurer1(Decliningcarrier1);
			declininginfo.enterInsurer2(Decliningcarrier2);
			declininginfo.enterInsurer3(Decliningcarrier3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Declining Carrier data in Quote Summary Page", e);
			throw new POMPageException("Error in entering Declining Carrier data in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Carrier Data has been entered for " + SNo);
	
	}
	
	@Then("^select Date Declined1 \"([^\"]*)\" Then Date Declined2 \"([^\"]*)\" Then Date Declined3 \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDateDeclined(String Datedeclined1, String Datedeclined2, String Datedeclined3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|DC|MD|WV|IL|MI|NJ|FL|IL", State))
			{
				declininginfo.clickDateDeclined1();
				declininginfo.datePicker(declininginfo.datePicker, Datedeclined1);
				declininginfo.clickDateDeclined2();
				declininginfo.datePicker(declininginfo.datePicker, Datedeclined2);
				declininginfo.clickDateDeclined3();
				declininginfo.datePicker(declininginfo.datePicker, Datedeclined3);
				
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Date Declined in Quote Summary Page", e);
			throw new POMPageException("Error in entering Date Declined in Quote Summary Page", e);
		}
    	scenariolog.info("Date Declined has been entered for " + SNo);
	}
	
	@Then("^enter Carrier Representative1 \"([^\"]*)\" Then Carrier Representative2 \"([^\"]*)\" Then Carrier Representative3 \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterCarrierRepresentative(String Carrierrep1, String Carrierrep2, String Carrierrep3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|CA|DE|MD|WV|NJ|FL", State))
			{
				declininginfo.enterCarrierRepresentative1(Carrierrep1);
				declininginfo.enterCarrierRepresentative2(Carrierrep2);
				declininginfo.enterCarrierRepresentative3(Carrierrep3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Carrier Representative data in Quote Summary Page", e);
			throw new POMPageException("Error in entering Carrier Representative data in Quote Summary Page", e);
		}
    	scenariolog.info("Carrier Representative info has been entered for " + SNo);
	}
	
	@Then("^select Declining reason1 \"([^\"]*)\" Then Declining reason2 \"([^\"]*)\" Then Declining reason3 \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void selectDecliningReasons(String Decreason1, String Decreason2, String Decreason3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=WV|CA", State))
			{
				declininginfo.selectDecliningReason1(Decreason1);
				declininginfo.selectDecliningReason2(Decreason2);
				declininginfo.selectDecliningReason3(Decreason3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Declining reason data in Quote Summary Page", e);
			throw new POMPageException("Error in entering Declining reason data in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Reasons has been chosen for " + SNo);
	}
	
	@Then("^enter Declining reason other1 \"([^\"]*)\" Then Declining reason other2 \"([^\"]*)\" Then Declining reason other3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void selectOtherDecliningReason(String DecliningReasonOther1, String DecliningReasonOther2, String DecliningReasonOther3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=WV", State))
			{
				declininginfo.enterDecliningReasonOther1(DecliningReasonOther1);
				declininginfo.enterDecliningReasonOther2(DecliningReasonOther2);
				declininginfo.enterDecliningReasonOther3(DecliningReasonOther3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Declining reason data in Quote Summary Page", e);
			throw new POMPageException("Error in entering Declining reason data in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Other Reasons has been chosen for " + SNo);
	}
	
	@Then("^enter the Declining month1 \"([^\"]*)\" Then Declining month2 \"([^\"]*)\" Then Declining month3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDecliningMonth(String Decliningmonth1, String Decliningmonth2, String Decliningmonth3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA", State))
			{
				declininginfo.enterDecliningMonth1(Decliningmonth1);
				declininginfo.enterDecliningMonth2(Decliningmonth2);
				declininginfo.enterDecliningMonth3(Decliningmonth3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Declining month in Quote Summary Page", e);
			throw new POMPageException("Error in entering Declining month in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Month has been chosen for " + SNo);
	}
	
	@Then("^enter the Declining year1 \"([^\"]*)\" Then Declining year2 \"([^\"]*)\" Then Declining year3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDecliningYear(String Decliningyear1, String Decliningyear2, String Decliningyear3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA", State))
			{
				declininginfo.enterDecliningYear1(Decliningyear1);
				declininginfo.enterDecliningYear2(Decliningyear2);
				declininginfo.enterDecliningYear3(Decliningyear3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Declining year in Quote Summary Page", e);
			throw new POMPageException("Error in entering Declining year in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Year has been chosen for " + SNo);
	}
	
	@Then("^enter Naic1 \"([^\"]*)\" Then Naic2 \"([^\"]*)\" Then Naic3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterNAIC(String Naic1, String Naic2, String Naic3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA|DE|IN|TN|WV", State))
			{
			declininginfo.enterNaic1(Naic1);
			declininginfo.enterNaic2(Naic2);
			declininginfo.enterNaic3(Naic3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Naic data in Quote Summary Page", e);
			throw new POMPageException("Error in entering Naic data in Quote Summary Page", e);
		}
    	scenariolog.info("NAIC info has been entered for " + SNo);
	}
	
	@Then("^enter PhoneNumber1 \"([^\"]*)\" Then PhoneNumber2 \"([^\"]*)\" Then PhoneNumber3 \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterPhoneNumber(String PhoneNumber1, String PhoneNumber2, String PhoneNumber3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA|DE|WV|NJ|FL", State))
			{
			declininginfo.enterPhoneNumber1(PhoneNumber1);
			declininginfo.enterPhoneNumber2(PhoneNumber2);
			declininginfo.enterPhoneNumber3(PhoneNumber3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering PhoneNumber in Quote Summary Page", e);
			throw new POMPageException("Error in entering PhoneNumber in Quote Summary Page", e);
		}
    	scenariolog.info("Phone Numbers has been entered for " + SNo);
	}
	
	@Then("^enter DecliningReasonDEFL1 \"([^\"]*)\" Then DecliningReasonDEFL2 \"([^\"]*)\" Then DecliningReasonDEFL3 \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDecliningReasonDEFL(String DecliningReasonDEFL1, String DecliningReasonDEFL2, String DecliningReasonDEFL3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=DE|FL", State))
			{
			declininginfo.enterDecliningReasonDEFL1(DecliningReasonDEFL1);
			declininginfo.enterDecliningReasonDEFL2(DecliningReasonDEFL2);
			declininginfo.enterDecliningReasonDEFL3(DecliningReasonDEFL3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering DecliningReasonDEFL in Quote Summary Page", e);
			throw new POMPageException("Error in entering DecliningReasonDEFL in Quote Summary Page", e);
		}
    	scenariolog.info("Declining Reasons for DE and FL has been entered for " + SNo);
	}
	
	@Then("^enter RepType1 \"([^\"]*)\" Then RepType2 \"([^\"]*)\" Then RepType3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void chooseRepType(String RepType1, String RepType2, String RepType3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA", State))
			{
			declininginfo.selectCarrierRepresentativeToggle1(RepType1);
			declininginfo.selectCarrierRepresentativeToggle2(RepType2);
			declininginfo.selectCarrierRepresentativeToggle3(RepType3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering RepType in Quote Summary Page", e);
			throw new POMPageException("Error in entering RepType in Quote Summary Page", e);
		}
    	scenariolog.info("Carrier Representative Type has been chosen for " + SNo);
	}
	
	@Then("^enter OHInsurer1 \"([^\"]*)\" Then OHInsurer2 \"([^\"]*)\" Then OHInsurer3 \"([^\"]*)\" Then OHInsurer4 \"([^\"]*)\" Then OHInsurer5 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterOHInsurers(String OHInsurer1, String OHInsurer2, String OHInsurer3, String OHInsurer4, String OHInsurer5, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=OH", State))
			{
				declininginfo.enterOHInsurer1(OHInsurer1);
				declininginfo.enterOHInsurer2(OHInsurer2);
				declininginfo.enterOHInsurer3(OHInsurer3);
				declininginfo.enterOHInsurer4(OHInsurer4);
				declininginfo.enterOHInsurer5(OHInsurer5);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering OHInsurer in Quote Summary Page", e);
			throw new POMPageException("Error in entering OHInsurer in Quote Summary Page", e);
		}
    	scenariolog.info("OH Insurers has been added for " + SNo);
	}
	
	@Then("^enter OHReasons1 \"([^\"]*)\" Then OHReasons2 \"([^\"]*)\" Then OHReasons3 \"([^\"]*)\" Then OHReasons4 \"([^\"]*)\" Then OHReasons5 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterOHReasons(String OHReasons1, String OHReasons2, String OHReasons3, String OHReasons4, String OHReasons5, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=OH", State))
			{
				declininginfo.enterOHReason1(OHReasons1);
				declininginfo.enterOHReason2(OHReasons2);
				declininginfo.enterOHReason3(OHReasons3);
				declininginfo.enterOHReason4(OHReasons4);
				declininginfo.enterOHReason5(OHReasons5);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering OHReasons in Quote Summary Page", e);
			throw new POMPageException("Error in entering OHReasons in Quote Summary Page", e);
		}
    	scenariolog.info("OH Reasons has been added for " + SNo);
	}
	
	@Then("^enter CTAgencyLicense \"([^\"]*)\" Then CTAgentLicense \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterCTAgencyAgentLicense(String CTAgencyLicense, String CTAgentLicense, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CT", State))
			{
				declininginfo.enterCTAgencyLicense(CTAgencyLicense);
				declininginfo.enterCTAgentLicense(CTAgentLicense);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering CTAgencyLicense and CTAgentLicense in Quote Summary Page", e);
			throw new POMPageException("Error in entering CTAgencyLicense and CTAgentLicense in Quote Summary Page", e);
		}
    	scenariolog.info("CT Agency and Agent License has been entered for " + SNo);
	}
	
	@Then("^select the Resultcode1 \"([^\"]*)\" Then Resultcode2 \"([^\"]*)\" Then Resultcode3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterResultsCode(String Resultcode1, String Resultcode2, String Resultcode3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=NJ", State))
			{
				declininginfo.selectResultsCode1(Resultcode1);
				declininginfo.selectResultsCode2(Resultcode2);
				declininginfo.selectResultsCode3(Resultcode3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in selecting Resultcode in Quote Summary Page", e);
			throw new POMPageException("Error in selecting Resultcode in Quote Summary Page", e);
		}
    	scenariolog.info("Results Code has been selected for " + SNo);
	}
	
/*	@Then("^save Declining data for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void saveDecliningData(String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|DC|DE|IN|TN|WV", State))
			declininginfo.clickDecliningSave();
			Thread.sleep(5000);
		}
		catch(POMEventException | InterruptedException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			throw new POMPageException("Error in Declining Carrier Page", e);
		}
    	scenariolog.info("Declining data has been saved for " + SNo);
	}*/
	
	@Then("^enter Diligentsearch1 \"([^\"]*)\" Then Diligentsearch2 \"([^\"]*)\" Then Diligentsearch3 \"([^\"]*)\" for the state \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentSearch(String Diligentsearch1, String Diligentsearch2, String Diligentsearch3, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA", State))
			{
				declininginfo.enterDiligentSearchInformation1(Diligentsearch1);
				declininginfo.enterDiligentSearchInformation2(Diligentsearch2);
				declininginfo.enterDiligentSearchInformation3(Diligentsearch3);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligentsearch information in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligentsearch information in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent search info has been entered for " + SNo);
	}
	
	@Then("^enter Diligent Searcher Name \"([^\"]*)\" Then Diligent Searcher Title \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentSearcherNameTitle(String Diligentsearchername, String Diligentsearchertitle, String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|DC|IN|MD|TN|IL|MI", State))
			{
				declininginfo.enterDiligentSearcherName(Diligentsearchername);
				declininginfo.enterDiligentSearcherTitle(Diligentsearchertitle);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligent Searcher Name and Diligent Searcher Title in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligent Searcher Name and Diligent Searcher Title in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent searcher name and title info has been entered for " + SNo);
	}
	
	@Then("^enter Diligent Individual name \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentIndividualName(String DiligentIndividualName ,String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA|DE", State))
			declininginfo.enterDiligentIndividualName(DiligentIndividualName);
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligent Individual Name in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligent Individual Name in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent individual name has been entered for " + SNo);
	}
	
	@Then("^enter Diligent Agency License number \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentAgencyLicenseNumber(String DiligentAgencyLicenseNumber ,String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=DE|PA", State))
			declininginfo.enterDiligentAgencyLicenseNumber(DiligentAgencyLicenseNumber);
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligent Agency License number in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligent Agency License number in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent Agency License Number has been entered for " + SNo);
	}
	
	@Then("^enter Diligent License number \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentLicenseNumber(String DiligentLicenseNumber ,String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA|DE|MA", State))
			declininginfo.enterDiligentLicenseNumber(DiligentLicenseNumber);
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligent License number in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligent License number in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent License Number has been entered for " + SNo);
	}
	
	@Then("^enter Diligent License type \"([^\"]*)\" for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void enterDiligentLicenseType(String DiligentLicenseType ,String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=CA", State))
			declininginfo.selectDiligentLicenseType(DiligentLicenseType);
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in entering Diligent License Type in Quote Summary Page", e);
			throw new POMPageException("Error in entering Diligent License Type in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent License Type has been chosen for " + SNo);
	}
	
	@Then("^save Declining data for the states \"([^\"]*)\" for \"([^\"]*)\"$")
	public void saveDiligentData(String State, String SNo) throws POMPageException
	{
		try
		{
			if(objectconditions.ConditionReading("State=AZ|CA|DC|DE|IN|MD|MA|PA|TN|OH|IL|MI|FL|NJ|TN|WV|MA|CT", State))
			{
			declininginfo.clickDiligentSave();
			FireEventobject.ProcessingLoad();
			FireEventobject.ThreadWait(5000);
			}
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Declining Carrier Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Declining Carrier Page", e1);
			}
			errorlog.info("Error in saving Declining Data in Quote Summary Page", e);
			throw new POMPageException("Error in saving Declining Data in Quote Summary Page", e);
		}
    	scenariolog.info("Diligent data has been saved for " + SNo);
	}
}