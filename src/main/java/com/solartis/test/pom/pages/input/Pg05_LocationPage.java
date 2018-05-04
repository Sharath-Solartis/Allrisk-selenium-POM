package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.exception.POMPageException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;


public class Pg05_LocationPage extends PomEventsMethodDefinition {

	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__BusinessAddress")
	public WebElement LocAddr;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__occupancy2")
	public WebElement OccupancyType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__NumberOfFamilies2")
	public WebElement NoOfFamilies;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ProtectionClass")
	public WebElement ProtClass;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__StoriesNum1")
	public WebElement NoOfStories;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__StoriesNum2")
	public WebElement NoOfStoriesCondo;
	
	@FindBy(name = "locations:LocationListTile:Object__Risk__ResProperty__CondoUnitLocation")
	public WebElement NoOfUnitsCondo;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ConstructionType2")
	public WebElement ConstructionType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__CladdingType")
	public WebElement CladdingType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__SquareFeet")
	public WebElement SquareFeet;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__DateBuilt")
	public WebElement YearBuilt;
	
	@FindBy(xpath = "id('templateBody')")
	public WebElement OutsideClick;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__OverrideSpatial")
	public WebElement SpatialOverride;
	
	@FindBy(xpath = "//input[contains(@value,'Feet')]")
	public WebElement DTCFeet;
	
	@FindBy(xpath = "//input[contains(@value,'Miles')]")
	public WebElement DTCMiles;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__CostalWaterDistance")
	public WebElement DTCValue;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__HeatSource")
	public WebElement HeatingType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__PlumbingType")
	public WebElement PlumbingType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofType2")
	public WebElement RoofCovering;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__WindRatingval")
	public WebElement WindRating;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__SecondaryWaterResistanceval")
	public WebElement SecondaryWaterResistance;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__Fastenersval")
	public WebElement Fasteners;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__GuttersPresentval")
	public WebElement Gutters;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ElectricSerciveType2")
	public WebElement ElectricType;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__HeatingUpdated")
	public WebElement HeatingUpdate;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__PlumbingUpdated")
	public WebElement PlumbingUpdate;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofUpdated")
	public WebElement RoofUpdate;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__WiringUpdated")
	public WebElement WiringUpdate;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofShape")
	public WebElement RoofShape;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofParapets")
	public WebElement RoofParapets;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofBrace")
	public WebElement RoofBrace;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__RoofSlope")
	public WebElement RoofSlope;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__StormHurricane2val")
	public WebElement RoofAnchor;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__HurricaneShutter2val")
	public WebElement OpeningProtection;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ProtectionMissilesSize1")
	public WebElement ProtSizeMissile1;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__ProtectionMissilesSize2")
	public WebElement ProtSizeMissile2;
	
	@FindBy(id = "locations:LocationListTile:Object__Risk__ResProperty__Alarm")
	public WebElement Alarm;
	
	@FindBy(id = "locations:LocationListTile:LossForm:NumberofLosses")
	public WebElement NoOfLosses;
	
	@FindBy(xpath = "id('locations:LocationListTile:LocationSaveButton')")
	public WebElement LocationSave;
	
	@FindBy(xpath = "id('locations:PLMLContinueToUWButton')")
	public WebElement ContinueUW;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__LossDate")
	public WebElement LossDate1;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__LossCause")
	public WebElement LossDesc1;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__AmountPaidReceived__Currency")
	public WebElement LossAmount1;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__InsCompanyName")
	public WebElement LossCompany1;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__LossDate")
	public WebElement LossDate2;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__LossCause")
	public WebElement LossDesc2;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__AmountPaidReceived__Currency")
	public WebElement LossAmount2;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__InsCompanyName")
	public WebElement LossCompany2;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__LossDate")
	public WebElement LossDate3;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__LossCause")
	public WebElement LossDesc3;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__AmountPaidReceived__Currency")
	public WebElement LossAmount3;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__InsCompanyName")
	public WebElement LossCompany3;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__LossDate")
	public WebElement LossDate4;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__LossCause")
	public WebElement LossDesc4;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__AmountPaidReceived__Currency")
	public WebElement LossAmount4;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__InsCompanyName")
	public WebElement LossCompany4;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__LossDate")
	public WebElement LossDate5;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__LossCause")
	public WebElement LossDesc5;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__AmountPaidReceived__Currency")
	public WebElement LossAmount5;
	
	@FindBy(id = "locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__InsCompanyName")
	public WebElement LossCompany5;
	
	@FindBy(xpath = "//span[contains(@id,'BusinessAddressMessage')]")
	public WebElement LocationAddrMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'StreetNumberMessage')]")
	public WebElement StreetNumberMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'StreetNameMessage')]")
	public WebElement StreetNameMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'CountyMessage')]")
	public WebElement CountyMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'ProtectionClassmsg')]")
	public WebElement ProtectionClassMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'StoriesNummsg')]")
	public WebElement StoriesMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'SquareFeetmsg')]")
	public WebElement SqftMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'DateBuiltmsg')]")
	public WebElement YearbuiltMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'CostalWaterDistancemsg')]")
	public WebElement DTCMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'HeatingUpdatedmsg')]")
	public WebElement HeatingUpdateMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'PlumbingUpdatedmsg')]")
	public WebElement PlumbingUpdateMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'RoofUpdatedmsg')]")
	public WebElement RoofingUpdateMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'WiringUpdatedmsg')]")
	public WebElement WiringUpdateMandatory;
	
	@FindBy(xpath = "//span[contains(@id,'locations:LocationListTile:LossForm:HiddenID')]")
	public WebElement LossCountMandatory;
	
	public String LocAddrToggle = "id('locations:LocationListTile:Object__Risk__ResProperty__IsRiskAddressSameAsInsured_input')";
	public String KillQn = "id('locations:LocationListTile:Object__Risk__AnyOtherUsageInLocation')";
	public String LocType = ".//*[@id='locations:LocationListTile:Object__Risk__ResProperty__TypeOfInsurance']";
	public String StructureRented = "id('locations:LocationListTile:Object__Risk__ResProperty__RentedResidence')";
	public String KnobTubeWiring = "locations:LocationListTile:Object__Risk__ResProperty__ElectricSerciveType2";
	public String SprinklerSystem = "id('locations:LocationListTile:Object__Risk__ResProperty__InteriorSprinkler')";
	public String LossType1 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__LossType')";
	public String LossStatus1 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:0:Object__Risk__ResProperty__LossHistory__Status')";
	public String LossType2 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__LossType')";
	public String LossStatus2 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:1:Object__Risk__ResProperty__LossHistory__Status')";
	public String LossType3 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__LossType')";
	public String LossStatus3 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:2:Object__Risk__ResProperty__LossHistory__Status')";
	public String LossType4 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__LossType')";
	public String LossStatus4 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:3:Object__Risk__ResProperty__LossHistory__Status')";
	public String LossType5 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__LossType')";
	public String LossStatus5 = "id('locations:LocationListTile:LossForm:LossHistoryDataTable:4:Object__Risk__ResProperty__LossHistory__Status')";
	
	FireEvent FireEventobject = new FireEvent();

	public Pg05_LocationPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectLocationType(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LocType, value);
	}
	
	public void selectLocationAddrToggle(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LocAddrToggle, value);
	}
	
	public void enterLocAddr(String value) throws POMEventException
	{
			FireEventobject.setTextWithoutEnter(LocAddr, value);
	}
	
	public void clickKillQnYes(String value) throws POMEventException
	{
			FireEventobject.toggleButton(KillQn, value);
	}
	
	public void selectOccupancyType(String value) throws POMEventException
	{
			FireEventobject.Dropdown(OccupancyType, value);
	}
	
	public void selectFamilies(String value) throws POMEventException
	{
			FireEventobject.Dropdown(NoOfFamilies, value);
	}
	
	public void selectStructureRented(String value) throws POMEventException
	{
			FireEventobject.toggleButton(StructureRented, value);
	}
	
	public void selectKnobTube(String value) throws POMEventException
	{
			FireEventobject.toggleButton(KnobTubeWiring, value);
	}
	
	public void selectSprinkler(String value) throws POMEventException
	{
			FireEventobject.toggleButton(SprinklerSystem, value);
	}
	
	public void selectProtclass(String value) throws POMEventException
	{
			FireEventobject.Dropdown(ProtClass, value);
	}
	
	public void selectNoOfStories(String value) throws POMEventException
	{
			FireEventobject.Dropdown(NoOfStories, value);
	}
	
	public void enterCondoStories(String value) throws POMEventException
	{
			FireEventobject.JStextbox(NoOfStoriesCondo, value);
	}
	
	public void enterCondoUnits(String value) throws POMEventException
	{
			FireEventobject.JStextbox(NoOfUnitsCondo, value);
	}
	
	public void selectConstructionType(String value) throws POMEventException
	{
			FireEventobject.Dropdown(ConstructionType, value);
	}
	
	public void selectCladdingType(String value) throws POMEventException
	{
			FireEventobject.Dropdown(CladdingType, value);
	}
	
	public void clickSquareFeet() throws POMEventException
	{				
				FireEventobject.ClickElement(SquareFeet);
	}
	 
	public void clearSquareFeet() throws POMEventException
	{			
				FireEventobject.clearTextbox(SquareFeet);
	}
	
	public void enterSqft(String value) throws POMEventException
	{
			FireEventobject.EnterTextWithoutEnter(SquareFeet, value);
	}
	
	public void clickYearBuilt() throws POMEventException
	{				
				FireEventobject.ClickElement(YearBuilt);
	}
	
	public void clearYearBuilt() throws POMEventException
	{			
				FireEventobject.clearTextbox(YearBuilt);
	}
	
	public void enterYearBuilt(String value) throws POMEventException
	{
			FireEventobject.EnterTextWithoutEnter(YearBuilt, value);
	}
	
	public void clickLocationSave() throws POMEventException
	{
			FireEventobject.ClickElement(LocationSave);
	}
	
	public void clickContToUw() throws POMEventException
	{
			FireEventobject.ClickElement(ContinueUW);
	}
	
	public void clickOutside() throws POMEventException
	{
			FireEventobject.ClickElement(OutsideClick);
	}
	
	public void clickSpatialOverride() throws POMEventException
	{
			FireEventobject.JScheckbox(SpatialOverride);
	}
	
	public void selectDTCFeet() throws POMEventException
	{
			FireEventobject.JSradioButton(DTCFeet);
	}
	
	public void selectDTCMiles() throws POMEventException
	{
			FireEventobject.JSradioButton(DTCMiles);
	}
	
	public void enterDTCValue(String value) throws POMEventException
	{
		FireEventobject.JStextbox(DTCValue, value);
	}
	
	public void selectHeatingType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(HeatingType, value);
	}
	
	public void selectPlumbingType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(PlumbingType, value);
	}
	
	public void selectRoofType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofCovering, value);
	}
	
	public void selectWindRating(String value) throws POMEventException
	{
		FireEventobject.Dropdown(WindRating, value);
	}
	
	public void selectSecWaterResistance(String value) throws POMEventException
	{
		FireEventobject.Dropdown(SecondaryWaterResistance, value);
	}
	
	public void selectFastener(String value) throws POMEventException
	{
		FireEventobject.Dropdown(Fasteners, value);
	}
	
	public void selectGutters(String value) throws POMEventException
	{
		FireEventobject.Dropdown(Gutters, value);
	}
	
	public void selectElectricType(String value) throws POMEventException
	{
		FireEventobject.Dropdown(ElectricType, value);
	}
	
	public void enterHeatingUpdate(String value) throws POMEventException
	{
		FireEventobject.JStextbox(HeatingUpdate, value);
	}
	
	public void enterPlumbingUpdate(String value) throws POMEventException
	{
		FireEventobject.JStextbox(PlumbingUpdate, value);
	}
	
	public void enterRoofingUpdate(String value) throws POMEventException
	{
		FireEventobject.JStextbox(RoofUpdate, value);
	}
	
	public void enterWiringUpdate(String value) throws POMEventException
	{
		FireEventobject.JStextbox(WiringUpdate, value);
	}
	
	public void selectRoofShape(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofShape, value);
	}
	
	public void selectRoofParapets(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofParapets, value);
	}
	
	public void selectRoofBrace(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofBrace, value);
	}
	
	public void selectRoofSlope(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofSlope, value);
	}
	
	public void selectRoofAnchor(String value) throws POMEventException
	{
		FireEventobject.Dropdown(RoofAnchor, value);
	}
	
	public void selectOpeningProtection(String value) throws POMEventException
	{
		FireEventobject.Dropdown(OpeningProtection, value);
	}
	
	public void selectMissileSizeAllOpeningsProtected(String value) throws POMEventException
	{
		FireEventobject.Dropdown(ProtSizeMissile1, value);
	}
	
	public void selectMissileSizeOnlyGlassOpeningsProtected(String value) throws POMEventException
	{
		FireEventobject.Dropdown(ProtSizeMissile2, value);
	}
	
	public void selectAlarm(String value) throws POMEventException
	{
		FireEventobject.Dropdown(Alarm, value);
	}
	
	public void selectNoOfLosses(String value) throws POMEventException
	{
		FireEventobject.Dropdown(NoOfLosses, value);
	}
	
	public void datePicker(String datePicker, String value) throws POMEventException
	{
		FireEventobject.DatePickerpopup(datePicker, value);
	}
	
	public void enterLossDate1() throws POMEventException
	{
		FireEventobject.ClickElement(LossDate1);
	}
	
	public void selectLossType1(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossType1, value);
	}

	public void enterLossDesc1(String value) throws POMEventException
	{
			FireEventobject.EnterTextWithoutEnter(LossDesc1, value);
	}
	
	public void selectLossStatus1(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossStatus1, value);
	}
	
	public void enterLossAmount1(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossAmount1, value);
    }
	
	public void enterLossCompany1(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossCompany1, value);
    }
	
	public void enterLossDate2() throws POMEventException
	{
		FireEventobject.ClickElement(LossDate2);
	}
	
	public void selectLossType2(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossType2, value);
	}

	public void enterLossDesc2(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(LossDesc2, value);
	}
	
	public void selectLossStatus2(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossStatus2, value);
	}
	
	public void enterLossAmount2(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossAmount2, value);
    }
	
	public void enterLossCompany2(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossCompany2, value);
    }
	
	public void enterLossDate3() throws POMEventException
	{
		FireEventobject.ClickElement(LossDate3);
	}
	
	public void selectLossType3(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossType3, value);
	}

	public void enterLossDesc3(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(LossDesc3, value);
	}
	
	public void selectLossStatus3(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossStatus3, value);
	}
	
	public void enterLossAmount3(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossAmount3, value);
    }
	
	public void enterLossCompany3(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossCompany3, value);
    }
	
	public void enterLossDate4() throws POMEventException
	{
		FireEventobject.ClickElement(LossDate4);
	}
	
	public void selectLossType4(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossType4, value);
	}

	public void enterLossDesc4(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(LossDesc4, value);
	}
	
	public void selectLossStatus4(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossStatus4, value);
	}
	
	public void enterLossAmount4(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossAmount4, value);
    }
	
	public void enterLossCompany4(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossCompany4, value);
    }
	
	public void enterLossDate5() throws POMEventException
	{
		FireEventobject.ClickElement(LossDate5);
	}
	
	public void selectLossType5(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossType5, value);
	}

	public void enterLossDesc5(String value) throws POMEventException
	{
		FireEventobject.EnterTextWithoutEnter(LossDesc5, value);
	}
	
	public void selectLossStatus5(String value) throws POMEventException
	{
			FireEventobject.toggleButton(LossStatus5, value);
	}
	
	public void enterLossAmount5(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossAmount5, value);
    }
	
	public void enterLossCompany5(String value) throws POMEventException
    {                                           
           FireEventobject.EnterTextWithoutEnter(LossCompany5, value);
    }
	
	public void validateLocationAddress(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, LocationAddrMandatory);
	}
	
	public void validateStreetNumber(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, StreetNumberMandatory);
	}
	
	public void validateStreetName(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, StreetNameMandatory);
	}
	
	public void validateCounty(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, CountyMandatory);
	}
	
	public void validateProtectionClass(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, ProtectionClassMandatory);
	}
	
	public void validateStories(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, StoriesMandatory);
	}
	
	public void validateSqFt(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, SqftMandatory);
	}
	
	public void validateYrBuilt(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, YearbuiltMandatory);
	}
	
	public void validateDTC(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, DTCMandatory);
	}
	
	public void validateHeatingUpdate(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, HeatingUpdateMandatory);
	}
	
	public void validatePlumbingUpdate(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, PlumbingUpdateMandatory);
	}
	
	public void validateRoofingUpdate(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, RoofingUpdateMandatory);
	}
	
	public void validateWiringUpdate(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, WiringUpdateMandatory);
	}
	
	public void validateLossCount(String value) throws POMEventException
	{
			FireEventobject.AssertCheck(value, LossCountMandatory);
	}
	
	public Pg06_UnderwritingPage Location()throws POMPageException 
	{
		
		return new Pg06_UnderwritingPage();
	}
}
