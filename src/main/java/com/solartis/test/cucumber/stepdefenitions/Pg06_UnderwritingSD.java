package com.solartis.test.cucumber.stepdefenitions;

import org.apache.log4j.Logger;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
import com.solartis.test.pom.pages.input.Pg06_UnderwritingPage;
import cucumber.api.java.en.Then;

public class Pg06_UnderwritingSD extends PomEventsMethodDefinition
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg06_UnderwritingPage uwpage = new Pg06_UnderwritingPage();
	
	
	@Then("^click Add button Additional Interest Type \"([^\"]*)\" without filling data Then Click Save button in Underwriting page for \"([^\"]*)\"$")
	public void emptyAdditionalInterests(String AdditionalInterestType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(AdditionalInterestType.equals("Mortgagee") | AdditionalInterestType.equals("Loss Payee") | AdditionalInterestType.equals("Others"))
			{
				uwpage.clickAddButton();
				//Thread.sleep(3000);
				uwpage.clickSaveButton();
				//Thread.sleep(2000);
				
				AssertCheck("Please select AI Type", uwpage.emptyAdditionalInterestType);
			    System.out.println("Select Additional Interest Type - Additional Interest Type is empty");
			    scenariolog.info("Select Additional Interest Type - Additional Interest Type is empty for testdata  " + SNo);
			    
     			AssertCheck("Please enter Name",uwpage.emptyAdditionalInterestName);
			    System.out.println("Select Additional Interest Name - Type of Renovation is empty");
			    scenariolog.info("Select BR que Type of Renovation - Type of Renovation is empty for testdata  " + SNo);
			    
			    uwpage.clickCloseButton();
			   // Thread.sleep(2000);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in Additional Interest mandatory data validation in Underwriting Page", e);
			throw new POMPageException("Error in Additional Interest mandatory data validation in Underwriting Page", e);
		}
		
		scenariolog.info("Additional interests page is saved in Underwriting Page without filling data for Testdata " + SNo);
	
	}
	
	
	
	
	@Then("^continue to csp page for Occupancy Type \"([^\"]*)\" product without filling data for \"([^\"]*)\"$")
	public void continueToCSPForBRWithoutData(String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
				
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				uwpage.clickContCSP();
				//Thread.sleep(2000);
				
				AssertCheck("Please select This location is/was", uwpage.emptyBRLocationIsWas);
			    System.out.println("Select BR que Location is/was - Location is/was is empty");
			    scenariolog.info("Select BR que Location is/was - Location is/was is empty for testdata  " + SNo);
			    
			   	AssertCheck("Please select Type of Renovation", uwpage.emptyBRTypeOfRenovation);
			    System.out.println("Select BR que Type of Renovation - Type of Renovation is empty");
			    scenariolog.info("Select BR que Type of Renovation - Type of Renovation is empty for testdata  " + SNo);
			    
			    AssertCheck("Please enter the estimated completion date", uwpage.emptyBREstimatedCompletionDate);
			    System.out.println("Select BR que estimated completion date - estimated completion date is empty");
			    scenariolog.info("Select BR que estimated completion date - estimated completion date is empty for testdata  " + SNo);
			    
			   	AssertCheck("Please answer Are any of the below renovations being completed?", uwpage.emptyRenovationCompletedBR);
			    System.out.println("Select BR que value for renovations being completed - renovations being completed is empty");
			    scenariolog.info("Select BR que value for renovations being completed - renovations being completed is empty for testdata  " + SNo);
			    
			   	AssertCheck("Please select What is the intention for this property?", uwpage.emptyBRIntentionOfProperty);
			    System.out.println("Select BR que Intention for this Property - Intention for this Property is empty");
			    scenariolog.info("Select BR que Intention for this Property - Intention for this Property is empty for testdata  " + SNo);
			}
			
			else if(OccupancyType.equals("Vacant (including cosmetic/non-structural renovations)")) 
			{
				uwpage.clickContCSP();
				//Thread.sleep(2000);
				
				AssertCheck("Please enter Date location became/will become vacant", uwpage.emptyVacantDate);
			    System.out.println("Select Vacant que Vacant date - Vacant date is empty");
			    scenariolog.info("Select Vacant que Vacant date - Vacant date is empty for testdata  " + SNo);
			    
			    AssertCheck("Please answer Are any of the below renovations being completed?", uwpage.emptyVacantRenovationCompleted);
			    System.out.println("Select Vacant que Renovation Completed - Renovation Completed is empty");
			    scenariolog.info("Select Vacant que Renovation Completed - Renovation Completed is empty for testdata  " + SNo);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in validating mandatory data for BR/ Vacant products in Underwriting Page", e);
			throw new POMPageException("Error in validating mandatory data for BR/ Vacant products in Underwriting Page", e);
		}
		
		scenariolog.info("Click continue to carrier selection page in Underwriting Page without filling data for Testdata " + SNo);
	
	}
	
	
	
	
	@Then("^enter the Business Childcare \"([^\"]*)\" Then Desc Business Activities \"([^\"]*)\" Then Any Employees \"([^\"]*)\" Then Daycare Attending Children \"([^\"]*)\" in location page for \"([^\"]*)\"$")
	public void ChildCareAndSubQue(String BusinessChildcare, String DescBusinessActivities, String AnyEmployees, String DaycareAttendingChildren, String SNo) throws POMPageException
	{
		
		try 
		{
			uwpage.clickBusinessChildcare(BusinessChildcare);
			if (BusinessChildcare.equals("Yes"))
			{
				uwpage.clickDescBusinessActivities(DescBusinessActivities);
				uwpage.clickAnyEmployees(AnyEmployees);
				uwpage.clickDaycareAttendingChildren(DaycareAttendingChildren);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in  Underwriting Page", e1);
			}
			errorlog.info("Error in Business Childcare and its Sub Qns in Underwriting Page", e);
			throw new POMPageException("Error in Business Childcare and its Sub Qns in Underwriting Page", e);
		}
		
		scenariolog.info("Childcare and sub question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^enter the Swimming Pool \"([^\"]*)\" Then enter Fully Fenced \"([^\"]*)\" in Underwriting page for \"([^\"]*)\"$")
	public void swimmingPoolAndSubQue(String SwimmingPool, String FullyFenced, String SNo) throws POMPageException
	{
		
		try 
		{
			uwpage.clickSwimmingPool(SwimmingPool);
			if (SwimmingPool.equals("Yes"))
			{
				uwpage.clickFullyFenced(FullyFenced);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in  Underwriting Page", e1);
			}
			errorlog.info("Error in Swimming Pool and its Sub Qn in Underwriting Page", e);
			throw new POMPageException("Error in Swimming Pool and its Sub Qn in Underwriting Page", e);
		}
		
		scenariolog.info("Swimming pool and sub question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^enter the Animal Bite \"([^\"]*)\" Then enter the Trust Estate \"([^\"]*)\" in Underwriting page for \"([^\"]*)\"$")
	public void animalBiteAndTrustEstate(String AnimalBite, String TrustEstate, String SNo) throws POMPageException
	{
		
		try 
		{
			uwpage.clickAnimalBite(AnimalBite);
			uwpage.clickTrustEstate(TrustEstate);
			
		}
		catch (POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in  Underwriting Page", e1);
			}
			errorlog.info("Error in Animal Bite/ Trust Estate Qn in Underwriting Page", e);
			throw new POMPageException("Error in Animal Bite/ Trust Estate Qn in Underwriting Page", e);
		}
		
		scenariolog.info("Animal bite and trust estate question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^enter the National Register Historic \"([^\"]*)\" Then Tours Conducted \"([^\"]*)\" in Underwriting page for \"([^\"]*)\"$")
	public void historicPlaceAndSubQue(String NationalRegisterHistoric, String ToursConducted, String SNo) throws POMPageException
	{
		
		try 
		{
			uwpage.clickNationalRegisterHistoric(NationalRegisterHistoric);
			if (NationalRegisterHistoric.equals("Yes"))
			{				
				uwpage.clickToursConducted(ToursConducted);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in  Underwriting Page", e1);
			}
			errorlog.info("Error in National Register Historic/ Tours Conducted Qn in Underwriting Page", e);
			throw new POMPageException("Error in National Register Historic/ Tours Conducted Qn in Underwriting Page", e);
		}
		
		scenariolog.info("Historic Place and Sub question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	@Then("^enter the High Profile Individual \"([^\"]*)\" And Location In Past \"([^\"]*)\" in Underwriting page for \"([^\"]*)\"$")
	public void highProfileAndLocationInPast(String HighProfileIndividual, String LocationInPast, String SNo) throws POMPageException
	{
		
		try 
		{
			uwpage.clickHighProfileIndividual(HighProfileIndividual);
			uwpage.clickLocationinPast(LocationInPast);	
			
		}
		catch (POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in High Profile Individual/ Location in Past Qn in Underwriting Page", e);
			throw new POMPageException("Error in High Profile Individual/ Location in Past Qn in Underwriting Page", e);
		}
		
		scenariolog.info("High Profile and location in past question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	 
	@Then("^enter the Location Is Was \"([^\"]*)\" Then Purchase PriceBR \"([^\"]*)\" Then enter Date Of PurchaseBR \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void BRLocationIsWasAndSubQue(String LocationIsWas, String PurchasePriceBR, String DateOfPurchaseBR, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				
				uwpage.selectBRLocationIsWas(LocationIsWas);
				
				if(LocationIsWas.equals("Purchased within the last 12 months (includes future purchase date)"))
				{
					uwpage.clickBRPurchasePrice(PurchasePriceBR);
					uwpage.clickBRDateOfPurchase();
					uwpage.datePicker(uwpage.datePicker, DateOfPurchaseBR);
				}
				
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in BR Location Is Was/ Purchase Price/ Date of Purchase in Underwriting Page", e);
			throw new POMPageException("Error in BR Location Is Was/ Purchase Price/ Date of Purchase in Underwriting Page", e);
		}
		
		scenariolog.info("BR Location is was and Sub question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	@Then("^enter the Type Of Renovation \"([^\"]*)\" Then Cost Of Renovations \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void typeAndCostOfRenovation(String TypeOfRenovation, String CostOfRenovations, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				
				uwpage.selectBRTypeOfRenovation(TypeOfRenovation);
				uwpage.enterBRCostOfRenovations(CostOfRenovations);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in BR Type of Renovation/ Cost of Renovations in Underwriting Page", e);
			throw new POMPageException("Error in BR Type of Renovation/ Cost of Renovations in Underwriting Page", e);
		}
		
		scenariolog.info("BR Type and cost of renovation in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^enter the Construction Begun \"([^\"]*)\" Then Estimated Completion Date \"([^\"]*)\" Then enter the Renovation Within 3months \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void BRConstBegunAndCompletionDate(String ConstructionBegun, String EstimatedCompletionDate, String RenovationWithin3months, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				
				uwpage.clickBRConstructionBegan(ConstructionBegun);
							
				if(ConstructionBegun.equals("No"))
					uwpage.clickBRRenovationWitin3months(RenovationWithin3months);

				uwpage.clickBREstimatedCompletionDate();
				uwpage.datePicker(uwpage.datePicker, EstimatedCompletionDate);
				//FireEventobject.SyncWait(1000);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in BR Construction Begun/ Estimated Completion Date/ Renovations within 3 months in Underwriting Page", e);
			throw new POMPageException("Error in BR Construction Begun/ Estimated Completion Date/ Renovations within 3 months in Underwriting Page", e);
		}
		
		scenariolog.info("BR Renovation already begun and completion date question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	@Then("^enter the Renovations CompletedBR \"([^\"]*)\" Then Entity Owned \"([^\"]*)\" And Licensed Contracter \"([^\"]*)\"  in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void BRRenovationCompletedAndSubQue(String RenovationsCompletedBR, String EntityOwned, String LicensedContracter, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				uwpage.clickBRRenovationsCompleted(RenovationsCompletedBR);
				if(RenovationsCompletedBR.equals("Yes"))
					{
						uwpage.clickBREntityOwned(EntityOwned);
						uwpage.clickBRLicensedContracter(LicensedContracter);
					}
				
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in BR Renovations Completed/ Entity Owned/ Licensed Contracter Qn in Underwriting Page", e);
			throw new POMPageException("Error in BR Renovations Completed/ Entity Owned/ Licensed Contracter Qn in Underwriting Page", e);
		}
		
		scenariolog.info("BR Renovation Completed and sub question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^enter the Locked Fenced BoardedBR \"([^\"]*)\" And Intention For Property \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void BRFencedAndIntentionForProperty(String LockedFencedBoardedBR, String IntentionForProperty, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Builders Risk (Structural Renovations & Ground Up Construction)"))
			{
				
				uwpage.clickBRLockedFencedBoarded(LockedFencedBoardedBR);
				uwpage.selectBRIntentionForProperty(IntentionForProperty);
				
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in BR Locked Fenced/ Intention for Property in Underwriting Page", e);
			throw new POMPageException("Error in BR Locked Fenced/ Intention for Property in Underwriting Page", e);
		}
		
		scenariolog.info("BR Renovation fenced and intention for the property Question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	
	@Then("^enter the Purchased Last 12months \"([^\"]*)\" Then Purchase Price Vacant \"([^\"]*)\" Then Date Of Purchase Vacant \"([^\"]*)\" Then Location Became Vacant \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void vacLoactionPurchasedAndSubQue(String PurchasedLast12months, String PurchasePriceVacant, String DateOfPurchaseVacant, String LocationBecameVacant, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Vacant (including cosmetic/non-structural renovations)"))
			{
				uwpage.clickVacPurchasedLast12months(PurchasedLast12months);
								
				if(PurchasedLast12months.equals("Yes"))
				{
					uwpage.enterVacPurchasePriceVacant(PurchasePriceVacant);
					uwpage.clickVacDateOfPurchaseVacant();
					uwpage.datePicker(uwpage.datePicker, DateOfPurchaseVacant);
				}
				else
				{
					uwpage.clickVacLocationBecameVacant();
					uwpage.datePicker(uwpage.datePicker, LocationBecameVacant);
				}
				FireEventobject.SyncWait(750);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in Vacant Purchased Last 12 months/ Purchase Price/ Date of Purchase/ Location Became Vacant in Underwriting Page", e);
			throw new POMPageException("Error in Vacant Purchased Last 12 months/ Purchase Price/ Date of Purchase/ Location Became Vacant in Underwriting Page", e);
		}
		
		scenariolog.info("Vacant Location Purchased and sub Question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	@Then("^enter the Renovations Completed \"([^\"]*)\" And Locked Fenced BoardedVacant \"([^\"]*)\" Then Plan To Occupy \"([^\"]*)\" in Underwriting page only for Occupancy Type \"([^\"]*)\" for \"([^\"]*)\"$")
	public void vacLoactionPurchasedAndSubQue(String RenovationsCompleted, String LockedFencedBoardedVacant, String PlanToOccupy, String OccupancyType, String SNo) throws POMPageException
	{
		
		try 
		{
			if(OccupancyType.equals("Vacant (including cosmetic/non-structural renovations)"))
			{
				uwpage.clickVacRenovationsCompleted(RenovationsCompleted);
				uwpage.clickVacLockedFencedBoardedVacant(LockedFencedBoardedVacant);
				uwpage.clickVacPlanToOccupancy(PlanToOccupy);
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in Vacant Renovations Completed/ Locked Fenced Boarded Vacant/ Plan to Occupy in Underwriting Page", e);
			throw new POMPageException("Error in Underwriting Page", e);
		}
		
		scenariolog.info("Vacant Location Purchased and sub Question in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	
	@Then("^click Add button and enter the Additional Interest Type \"([^\"]*)\" Then Additional Interest Name \"([^\"]*)\" Then Click Save button in Underwriting page for \"([^\"]*)\"$")
	public void additionalInterests(String AdditionalInterestType, String AdditionalInterestName, String SNo) throws POMPageException
	{
		
		try 
		{
			if(AdditionalInterestType.equals("Mortgagee") | AdditionalInterestType.equals("Loss Payee") | AdditionalInterestType.equals("Others"))
			{
				uwpage.clickAddButton();				
				FireEventobject.ProcessingLoad();		
				uwpage.selectAdditionalInterestType(AdditionalInterestType);
				uwpage.enterAdditionalInterestName(AdditionalInterestName);
				uwpage.clickSaveButton();
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
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in Addtional Interest Add and Save in Underwriting Page", e);
			throw new POMPageException("Error in Addtional Interest Add and Save in Underwriting Page", e);
		}
		
		scenariolog.info("Additional interests in Underwriting Page has been entered for Testdata " + SNo);
	
	}
	
	
	@Then("^continue to csp page for \"([^\"]*)\"$")
	public void continueToCSP(String SNo) throws POMPageException
	{
		try 
		{			
			uwpage.clickContCSP();
			FireEventobject.ProcessingLoad();			
		}
		catch (POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Underwriting Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Underwriting Page", e1);
			}
			errorlog.info("Error in clicking Cont to CSP in Underwriting Page", e);
			throw new POMPageException("Error in clicking Cont to CSP in Underwriting Page", e);
		}
		
		scenariolog.info("Click continue to carrier selection page in Underwriting Page for Testdata " + SNo);
	
	}
	
}
