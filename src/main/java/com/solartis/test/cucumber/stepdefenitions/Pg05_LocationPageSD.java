package com.solartis.test.cucumber.stepdefenitions;

import java.util.Calendar;

import org.apache.log4j.Logger;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.common.operations.ConditionVerify;
import com.solartis.test.pom.pages.input.Pg05_LocationPage;

import cucumber.api.java.en.Then;

public class Pg05_LocationPageSD 
{
	public static Logger scenariolog = Logger.getLogger("ScenarioLog");
	public static Logger errorlog = Logger.getLogger("ErrorLog");
	FireEvent FireEventobject = new FireEvent();
	Pg05_LocationPage location = new Pg05_LocationPage();
	protected ConditionVerify objectconditions = new ConditionVerify();

	@Then("^choose \"([^\"]*)\" enter the \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
	public void enter_the_Then_Then_in_location_page(String loc_addrtoggle, String protection_class, String number_of_stories , String number_loss, String SNo) throws Throwable {
		Pg05_LocationPage location = new Pg05_LocationPage();
		location.Location();
		scenariolog.info("Entering Location Details for Testdata " + SNo);
	}
	
	@Then("^enter location type \"([^\"]*)\" Then \"([^\"]*)\" Then location address \"([^\"]*)\" select occupancy type \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLocTypeAddrOccupancy(String LocationType, String SameAsInsuredMailingAddress, String LocationAddress, String occupancyType, String SNo) throws POMPageException
    {
    	try
		{
	        
	    	FireEventobject.ProcessingLoad();
	    	
	    	if(SameAsInsuredMailingAddress=="Yes")
			{
				location.selectLocationAddrToggle(SameAsInsuredMailingAddress);
				FireEventobject.ProcessingLoad();	
				//FireEventobject.LocationProcessingLoad();
			}
			else
			{
				location.selectLocationAddrToggle(SameAsInsuredMailingAddress);
				location.enterLocAddr(LocationAddress);
				FireEventobject.ProcessingLoad();					
		    	//FireEventobject.LocationProcessingLoad();		    	
			}
			
			location.selectOccupancyType(occupancyType);
			
		}
		catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting Loc Type/ Loc Addr/ Occupancy Type in Location Page", e);
			throw new POMPageException("Error in selecting Loc Type/ Loc Addr/ Occupancy Type in Location Page", e);
		}
    	scenariolog.info("Location Type, Location Address and Occupancy Type has been entered for " + SNo);
	
	}
    
    @Then("^enter number of units \"([^\"]*)\" Then click structure rented \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterNoOfUnitsStructureRented(String NumberOfUnits, String StructuresRentedToOthers, String SNo) throws POMPageException
    {
    	try
    	{
	    	location.selectFamilies(NumberOfUnits);
	    	FireEventobject.SyncWait(2000);
	    	location.selectStructureRented(StructuresRentedToOthers);
	    	
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting Number Of Units/ Structure Rented Qn in Location Page", e);
			throw new POMPageException("Error in selecting Number Of Units/ Structure Rented Qn in Location Page", e);
		}
    	scenariolog.info("No. Of Units, Structures Rented To Others has been entered for " + SNo);
    }
    
    @Then("^enter the protection class \"([^\"]*)\" Then number of stories \"([^\"]*)\" And number of condo stories \"([^\"]*)\" And condo unit \"([^\"]*)\" based on \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterProtectionClassStories(String ProtectionClass, String NumberOfStories, String NumberOfStoriesCondo, String CondoUnit, String LocationType, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectProtclass(ProtectionClass);
    		if(objectconditions.ConditionReading("LocationType=Homeowner/Dwelling", LocationType))
    		location.selectNoOfStories(NumberOfStories);
    		else
    		{
    			location.enterCondoStories(NumberOfStoriesCondo);
    			location.enterCondoUnits(CondoUnit);
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
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Prot Class/ Number of Stories/ Number of Condo Stories/ Condo Units in Location Page", e);
			throw new POMPageException("Error in selecting the Prot Class/ Number of Stories/ Number of Condo Stories/ Condo Units in Location Page", e);
		}
    	scenariolog.info("Protection Class, Number Of Stories has been entered for " + SNo);
    }
    
    @Then("^enter the construction type \"([^\"]*)\" Then cladding type \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterConstructionCladding(String ConstructionType, String CladdingType, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectConstructionType(ConstructionType);
    		location.selectCladdingType(CladdingType);
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Construction Type/ Cladding Type in Location Page", e);
			throw new POMPageException("Error in selecting the Construction Type/ Cladding Type in Location Page", e);
		}
    	scenariolog.info("Construction Type, Cladding Type has been entered for " + SNo);
    }
    
    @Then("^enter the square feet \"([^\"]*)\" Then year built \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterSquareFtYearBuilt(String SqFeet, String YearBuilt, String SNo) throws POMPageException
    {
    	try
    	{
    		
    		location.clickSquareFeet();
    		location.clearSquareFeet();
    		location.enterSqft(SqFeet);
    		
    		location.clickYearBuilt();
    		location.clearYearBuilt();
    		location.enterYearBuilt(YearBuilt);
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in entering the Square Feet/ Year Built in Location Page", e);
			throw new POMPageException("Error in entering the Square Feet/ Year Built in Location Page", e);
		}
    	scenariolog.info("Sq Feet, Year Built has been entered for " + SNo);
    }
    
    @Then("^click Override DTC \"([^\"]*)\" Then enter Unit of Measurement \"([^\"]*)\" Then DTC \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterDTC(String OverrideDTC, String UnitOfMeasurement, String DistanceToCoast, String SNo) throws POMPageException
    {
    	try
    	{
    		if(OverrideDTC.equals("Yes"))
    		{
    			location.clickSpatialOverride();
    			FireEventobject.SyncWait(2000);
    			if(UnitOfMeasurement.equals("In Miles"))
    			{
    				location.selectDTCMiles();
    				FireEventobject.SyncWait(6000);
    				location.enterDTCValue(DistanceToCoast);
    			}
    			else if(UnitOfMeasurement.equals("In Feet"))
    			{
    				FireEventobject.SyncWait(3000);
    				location.selectDTCFeet();
    				FireEventobject.SyncWait(3000);
    				location.enterDTCValue(DistanceToCoast);
    			}
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
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in DTC Override in Location Page", e);
			throw new POMPageException("Error in DTC Override in Location Page", e);
		}
    	scenariolog.info("DTC has been entered for " + SNo);
    }
    
    @Then("^enter the Heating Type \"([^\"]*)\" Then Heating Update \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterHeatingTypeandUpdate(String HeatingType, String HeatingTypeYearOfUpdate, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectHeatingType(HeatingType);
    		FireEventobject.SyncWait(1000);
    		location.enterHeatingUpdate(HeatingTypeYearOfUpdate);
    		location.OutsideClick();
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Heating Type/ Heating Update in Location Page", e);
			throw new POMPageException("Error in selecting the Heating Type/ Heating Update in Location Page", e);
		}
    	scenariolog.info("Heating Type, Update has been entered for " + SNo);
    }
    
    @Then("^enter the Plumbing Type \"([^\"]*)\" Then Plumbing Update \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterPlumbingTypeandUpdate(String PlumbingType, String PlumbingTypeYearOfUpdate, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectPlumbingType(PlumbingType);
    		FireEventobject.SyncWait(250);
    		location.enterPlumbingUpdate(PlumbingTypeYearOfUpdate);
    		location.OutsideClick();
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Plumbing Type/ Plumbing Update in Location Page", e);
			throw new POMPageException("Error in selecting the Plumbing Type/ Plumbing Update in Location Page", e);
		}
    	scenariolog.info("Plumbing Type, Update has been entered for " + SNo);
    }
    
    @Then("^enter the Roof Covering \"([^\"]*)\" Then Roofing Update \"([^\"]*)\" Then for wind territory \"([^\"]*)\" enter \"([^\"]*)\" Then Secondary Water Resistance \"([^\"]*)\" Then Fasteners \"([^\"]*)\" Then Gutters \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterRoofCoveringandSubQns(String RoofCovering, String RoofCoveringYearOfUpdate, String WindTerritory, String WindRating, String SecondaryWaterResistance, String Fasteners, String GuttersPresent, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectRoofType(RoofCovering);
    		FireEventobject.SyncWait(200);
    		location.enterRoofingUpdate(RoofCoveringYearOfUpdate);
    		location.OutsideClick();
     		if(objectconditions.ConditionReading("WindTerritory=Yes", WindTerritory))
    		{
    			if(objectconditions.ConditionReading("RoofCovering=Shingle", RoofCovering) || objectconditions.ConditionReading("RoofCovering=Architectural Shingle", RoofCovering))
    			{
    				location.selectWindRating(WindRating);
        			location.selectSecWaterResistance(SecondaryWaterResistance);
    			}
    			else if(objectconditions.ConditionReading("RoofCovering=Metal Roof", RoofCovering))
    			{
    			location.selectFastener(Fasteners);
    			}
    			else if(objectconditions.ConditionReading("RoofCovering=Built-up roof or Single-Ply Membrane Roof (Tar/Gravel Roof)", RoofCovering))
    			{
    			location.selectGutters(GuttersPresent);
    			}
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
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Roof Covering/ Roofing Update and if Wind Territory, error in selecting the Wind Rating, Secondary Water Resistance, Fasteners, Gutters in Location Page", e);
			throw new POMPageException("Error in selecting the Roof Covering/ Roofing Update and if Wind Territory, error in selecting the Wind Rating, Secondary Water Resistance, Fasteners, Gutters in Location Page", e);
		}
    	scenariolog.info("Roof Covering and sub wind qns has been entered for " + SNo);
    	
    }
    
    @Then("^enter the Roof Shape \"([^\"]*)\" Then for wind territory \"([^\"]*)\" enter Parapets \"([^\"]*)\" Then RoofBracedUnbraced \"([^\"]*)\" Then RoofSlope \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterRoofShapeandSubQns(String RoofShape, String WindTerritory, String RoofHaveParapets, String RoofBracedOrUnbraced, String SlopeOfRoof, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectRoofShape(RoofShape);
      		if(objectconditions.ConditionReading("WindTerritory=Yes", WindTerritory))
    		{
    			if(objectconditions.ConditionReading("RoofShape=Flat Roof", RoofShape))
    			{
    			location.selectRoofParapets(RoofHaveParapets);
    			}
    			else if(objectconditions.ConditionReading("RoofShape=Gable Roof", RoofShape))
    			{
    			location.selectRoofBrace(RoofBracedOrUnbraced);
        		location.selectRoofSlope(SlopeOfRoof);
    			}
    			else if(objectconditions.ConditionReading("RoofShape=Hip Roof", RoofShape))
    			{
    			location.selectRoofSlope(SlopeOfRoof);
    			}
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
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Roof Shape and if wind territory, error in selecting Parapets, Roof Brace and Roof Slope in Location Page", e);
			throw new POMPageException("Error in selecting the Roof Shape and if wind territory, error in selecting Parapets, Roof Brace and Roof Slope in Location Page", e);
		}
    	scenariolog.info("Roof Shape and sub wind qns has been entered for " + SNo);
    }
    
    @Then("^for wind territory \"([^\"]*)\" enter the Roof Anchor \"([^\"]*)\" Then Opening Protection \"([^\"]*)\" enter Protection Size Missiles \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterRoofAnchOpeningProtection(String WindTerritory, String RoofAnchor, String OpeningProtection, String ProtectionSizeMissiles, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("WindTerritory=Yes", WindTerritory))
    		{
    			
    			location.selectRoofAnchor(RoofAnchor);
    			location.selectOpeningProtection(OpeningProtection);
    		if(objectconditions.ConditionReading("OpeningProtection=Only glass opening are protected", OpeningProtection))
    		{
    			location.selectMissileSizeOnlyGlassOpeningsProtected(ProtectionSizeMissiles);
    		}
    		else if(objectconditions.ConditionReading("OpeningProtection=All Openings are protected", OpeningProtection))
    		{
    			location.selectMissileSizeAllOpeningsProtected(ProtectionSizeMissiles);
    		}
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
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Roof Anchor/ Opening Protection/ Protection Size Missiles in Location Page", e);
			throw new POMPageException("Error in selecting the Roof Anchor/ Opening Protection/ Protection Size Missiles in Location Page", e);
		}
    	scenariolog.info("Roof Anchor, Opening Protection and sub wind qns has been entered for " + SNo);
    }
    
    
    @Then("^enter the Electric Type \"([^\"]*)\" Then Electric Update \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterElectricTypeandUpdate(String ElectricType, String ElectricTypeYearOfUpdate, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectElectricType(ElectricType);
    		FireEventobject.SyncWait(100);
    		location.enterWiringUpdate(ElectricTypeYearOfUpdate);
    		location.OutsideClick();
    	}
    	catch(POMEventException e)
		{
			try 
			{
				FireEventobject.takeScreenshot(SNo);
			} 
			catch (POMEventException e1) 
			{
				errorlog.info("Error in Taking ScreenShot in Location Page", e1);
				throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
			}
			errorlog.info("Error in selecting the Electric Type/ Electric Update in Location Page", e);
			throw new POMPageException("Error in selecting the Electric Type/ Electric Update in Location Page", e);
		}
    	scenariolog.info("Electric Type, Update has been entered for " + SNo);
    }
    
    
    @Then("^based on \"([^\"]*)\" enter the Knob Tube \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void selectKnobTube(String ElectricTypeYearOfUpdate, String KnobTubeAluminium, String SNo) throws POMPageException
    {
    	int CurrYear = Calendar.getInstance().get(Calendar.YEAR);
    	int WiringUpdate = Integer.parseInt(ElectricTypeYearOfUpdate);
    	try
    	{
    		if(CurrYear-WiringUpdate>40)
    		{
    			location.selectKnobTube(KnobTubeAluminium);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in answering the Knob and Tube Qn in Location Page", e);
    		throw new POMPageException("Error in answering the Knob and Tube Qn in Location Page", e);
    	}
    	scenariolog.info("Knob and Tube has been entered for " + SNo);
    }
    
    @Then("^enter the Alarm \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void selectAlarm(String Alarm, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectAlarm(Alarm);
    	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in selecting Alarm Type in Location Page", e);
    		throw new POMPageException("Error in selecting Alarm Type in Location Page", e);
    	}
    	scenariolog.info("Alarm has been entered for " + SNo);
    }
    
    @Then("^enter the Sprinkler \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void selectSprinkler(String FullInteriorSprinklerSystem, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectSprinkler(FullInteriorSprinklerSystem);
    	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in selecting the Sprinkler Type in Location Page", e);
    		throw new POMPageException("Error in selecting the Sprinkler Type in Location Page", e);
    	}
    	scenariolog.info("Sprinkler System has been entered for " + SNo);
    }
    
    @Then("^enter the Loss Count \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void selectNoOfLosses(String NoOfLosses, String SNo) throws POMPageException
    {
    	try
    	{
    		location.selectNoOfLosses(NoOfLosses);
       	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in selecting the Loss Count in Location Page", e);
    		throw new POMPageException("Error in selecting the Loss Count in Location Page", e);
    	}
    	scenariolog.info("Loss Count has been entered for " + SNo);
    }
    
    @Then("^based on \"([^\"]*)\" enter the Loss Data 1 \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLoss1Data(String NoOfLosses, String DateOfLoss1, String TypeOfLoss1, String DescriptionOfLoss1, String OpenClosed1, String AmountPaid1, String InsuranceCompany1, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("NoOfLosses=1|2|3|4|5+", NoOfLosses))
    		{
    			location.enterLossDate1();
    			location.datePicker(location.datePicker, DateOfLoss1);
    			location.selectLossType1(TypeOfLoss1);
    			location.enterLossDesc1(DescriptionOfLoss1);
    			location.selectLossStatus1(OpenClosed1);
    			location.enterLossAmount1(AmountPaid1);
    			location.enterLossCompany1(InsuranceCompany1);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in entering the Loss Data 1 in Location Page", e);
    		throw new POMPageException("Error in entering the Loss Data 1 in Location Page", e);
    	}
    	scenariolog.info("Loss Data 1 has been entered for " + SNo);
    }
    
    @Then("^based on \"([^\"]*)\" enter the Loss Data 2 \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLoss2Data(String NoOfLosses, String DateOfLoss2, String TypeOfLoss2, String DescriptionOfLoss2, String OpenClosed2, String AmountPaid2, String InsuranceCompany2, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("NoOfLosses=2|3|4|5+", NoOfLosses))
    		{
    			location.enterLossDate2();
    			location.datePicker(location.datePicker,DateOfLoss2);
    			FireEventobject.SyncWait(1000);
    			location.selectLossType2(TypeOfLoss2);
    			location.enterLossDesc2(DescriptionOfLoss2);
    			location.selectLossStatus2(OpenClosed2);
    			location.enterLossAmount2(AmountPaid2);
    			location.enterLossCompany2(InsuranceCompany2);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in entering the Loss Data 2 in Location Page", e);
    		throw new POMPageException("Error in entering the Loss Data 2 in Location Page", e);
    	}
    	scenariolog.info("Loss Data 2 has been entered for " + SNo);
    }
    
    @Then("^based on \"([^\"]*)\" enter the Loss Data 3 \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLoss3Data(String NoOfLosses, String DateOfLoss3, String TypeOfLoss3, String DescriptionOfLoss3, String OpenClosed3, String AmountPaid3, String InsuranceCompany3, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("NoOfLosses=3|4|5+", NoOfLosses))
    		{
    			location.enterLossDate3();
    			location.datePicker(location.datePicker,DateOfLoss3);
    			FireEventobject.SyncWait(1000);
    			location.selectLossType3(TypeOfLoss3);
    			location.enterLossDesc3(DescriptionOfLoss3);
    			location.selectLossStatus3(OpenClosed3);
    			location.enterLossAmount3(AmountPaid3);
    			location.enterLossCompany3(InsuranceCompany3);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in entering the Loss Data 3 in Location Page", e);
    		throw new POMPageException("Error in entering the Loss Data 3 in Location Page", e);
    	}
    	scenariolog.info("Loss Data 3 has been entered for " + SNo);
    }
    
    @Then("^based on \"([^\"]*)\" enter the Loss Data 4 \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLoss4Data(String NoOfLosses, String DateOfLoss4, String TypeOfLoss4, String DescriptionOfLoss4, String OpenClosed4, String AmountPaid4, String InsuranceCompany4, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("NoOfLosses=4|5+", NoOfLosses))
    		{
    			location.enterLossDate4();
    			location.datePicker(location.datePicker,DateOfLoss4);
    			FireEventobject.SyncWait(1000);
    			location.selectLossType4(TypeOfLoss4);
    			location.enterLossDesc4(DescriptionOfLoss4);
    			location.selectLossStatus4(OpenClosed4);
    			location.enterLossAmount4(AmountPaid4);
    			location.enterLossCompany4(InsuranceCompany4);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in entering the Loss Data 4 in Location Page", e);
    		throw new POMPageException("Error in entering the Loss Data 4 in Location Page", e);
    	}
    	scenariolog.info("Loss Data 4 has been entered for " + SNo);
    }
    
    @Then("^based on \"([^\"]*)\" enter the Loss Data 5 \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" Then \"([^\"]*)\" in location page for \"([^\"]*)\"$")
    public void enterLoss5Data(String NoOfLosses, String DateOfLoss5, String TypeOfLoss5, String DescriptionOfLoss5, String OpenClosed5, String AmountPaid5, String InsuranceCompany5, String SNo) throws POMPageException
    {
    	try
    	{
    		if(objectconditions.ConditionReading("NoOfLosses=5+", NoOfLosses))
    		{
    			location.enterLossDate5();
    			location.datePicker(location.datePicker,DateOfLoss5);
    			FireEventobject.SyncWait(1000);
    			location.selectLossType5(TypeOfLoss5);
    			location.enterLossDesc5(DescriptionOfLoss5);
    			location.selectLossStatus5(OpenClosed5);
    			location.enterLossAmount5(AmountPaid5);
    			location.enterLossCompany5(InsuranceCompany5);
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
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in entering the Loss Data 5 in Location Page", e);
    		throw new POMPageException("Error in entering the Loss Data 5 in Location Page", e);
    	}
    	scenariolog.info("Loss Data 5 has been entered for " + SNo);
    }
    
    @Then("^click save button and Continue to Underwriting button in location Page for \"([^\"]*)\"$")
    public void clickLocSaveandContinue(String SNo) throws POMPageException
    {
    	try
    	{
    		location.clickLocationSave();
    		FireEventobject.ProcessingLoad();
    		
    		
    		location.clickContToUw();
    		FireEventobject.SyncWait(3000);
    		location.clickContToUw();
    		//location.clickContToUw();
    		FireEventobject.ProcessingLoad();
    		
    	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in clicking Save Button/ Cont to Underwriting Button in Location Page", e);
    		throw new POMPageException("Error in clicking Save Button/ Cont to Underwriting Button in Location Page", e);
    	}
    	scenariolog.info("Location Data has been saved and Continue to Underwriting button has been clicked for " + SNo);
    }
    
    @Then("^click Continue to Underwriting button for \"([^\"]*)\"$")
    public void clickContinueToUnderwriting(String SNo) throws POMPageException
    {
    	try
    	{
    		//location.clickContToUw();
    		FireEventobject.SyncWait(3000);
    		location.clickContToUw();
    		FireEventobject.ProcessingLoad();
    	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in clicking Cont to Underwriting Button in Location Page", e);
    		throw new POMPageException("Error in clicking Cont to Underwriting Button in Location Page", e);
    	}
    	scenariolog.info("Continue to Underwriting button has been clicked for " + SNo);
    }
    
    @Then("^click save button in location page for \"([^\"]*)\"$")
    public void validateMandatory(String SNo) throws POMPageException
    {
    	try
    	{
    		location.clickLocationSave();
    		//Thread.sleep(15000);
    		
    		location.validateLocationAddress("Please enter a Location");
    		System.out.println("Enter Location Address - Location Address is empty");
		    scenariolog.info("Enter Location Address - Location Address is empty for testdata  " + SNo);
		    
    		location.validateStreetNumber("Please enter Street Number");
    		System.out.println("Enter Street Number - Street Number is empty");
		    scenariolog.info("Enter Street Number - Street Number is empty for testdata  " + SNo);
    		
    		location.validateStreetName("Please enter Street Name");
    		System.out.println("Enter Street Name - Street Name is empty");
		    scenariolog.info("Enter Street Name - Street Name is empty for testdata  " + SNo);
    		
    		location.validateCounty("County Name is not saved. Please reselect the address");
    		System.out.println("Enter County Name - County Name is empty");
		    scenariolog.info("Enter County Name - County Name is empty for testdata  " + SNo);
    		
    		location.validateProtectionClass("Please select Protection Class");
    		System.out.println("Enter Protection Class - Protection Class is empty");
		    scenariolog.info("Enter Protection Class - Protection Class is empty for testdata  " + SNo);
		    
    		location.validateStories("Please select Number of Stories");
    		System.out.println("Enter Number of Stories - Number of Stories is empty");
		    scenariolog.info("Enter Number of Stories - Number of Stories is empty for testdata  " + SNo);
    		
    		location.validateSqFt("Please enter Square Feet");
    		System.out.println("Enter Square Feet - Square Feet is empty");
		    scenariolog.info("Enter Square Feet - Square Feet is empty for testdata  " + SNo);
    		
    		location.validateYrBuilt("Please enter Year Built");
    		System.out.println("Enter Year Built - Year Built is empty");
		    scenariolog.info("Enter Year Built - Year Built is empty for testdata  " + SNo);
    		
    		location.validateDTC("Please Enter the DTC Value");
    		System.out.println("Enter DTC - DTC is empty");
		    scenariolog.info("Enter DTC - DTC is empty for testdata  " + SNo);
    		
    		location.validateHeatingUpdate("Please enter Year of Update");
    		System.out.println("Enter Year of Heating Update - Year of Heating Update is empty");
		    scenariolog.info("Enter Year of Heating Update - Year of Heating Update is empty for testdata  " + SNo);
    		
    		location.validatePlumbingUpdate("Please enter Year of Update");
    		System.out.println("Enter Year of Plumbing Update - Year of Plumbing Update is empty");
		    scenariolog.info("Enter Year of Plumbing Update - Year of Plumbing Update is empty for testdata  " + SNo);
    		
    		location.validateRoofingUpdate("Please enter Year of Update");
    		System.out.println("Enter Year of Roofing Update - Year of Roofing Update is empty");
		    scenariolog.info("Enter Year of Roofing Update - Year of Roofing Update is empty for testdata  " + SNo);
    		
    		location.validateWiringUpdate("Please enter Year of Update");
    		System.out.println("Enter Year of Roofing Update - Year of Wiring Update is empty");
		    scenariolog.info("Enter Year of Roofing Update - Year of Wiring Update is empty for testdata  " + SNo);
    		
    		location.validateLossCount("Please enter Number of losses in last 3 years");
    		System.out.println("Enter Year of Number of losses - Number of losses is empty");
		    scenariolog.info("Enter Number of losses - Number of losses is empty for testdata  " + SNo);
    		
    	}
    	catch(POMEventException e)
    	{
    		try 
    		{
    			FireEventobject.takeScreenshot(SNo);
    		} 
    		catch (POMEventException e1) 
    		{
    			errorlog.info("Error in Taking ScreenShot in Location Page", e1);
    			throw new POMPageException("Error in Taking ScreenShot in Location Page", e1);
    		}
    		errorlog.info("Error in mandatory data validation in Location Page", e);
    		throw new POMPageException("Error in mandatory data validation in Location Page", e);
    	}
    }
}