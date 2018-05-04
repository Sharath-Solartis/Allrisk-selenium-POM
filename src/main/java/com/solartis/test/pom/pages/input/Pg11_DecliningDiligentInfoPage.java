package com.solartis.test.pom.pages.input;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Pg11_DecliningDiligentInfoPage extends PomEventsMethodDefinition
{
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningCarrier1")
	public WebElement Insurer1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningCarrier2")
	public WebElement Insurer2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningCarrier3")
	public WebElement Insurer3;
	
	@FindBy(xpath=".//*[@id='OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DeclinedDate1']//following-sibling::input")
	public WebElement DateDeclined1;
	
	@FindBy(xpath=".//*[@id='OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DeclinedDate2']//following-sibling::input")
	public WebElement DateDeclined2;
	
	@FindBy(xpath=".//*[@id='OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DeclinedDate3']//following-sibling::input")
	public WebElement DateDeclined3;
	
	public String datePicker = "id('ui-datepicker-div')";
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__CarrierRepresentative1")
	public WebElement CarrierRepresentative1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__CarrierRepresentative2")
	public WebElement CarrierRepresentative2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__CarrierRepresentative3")
	public WebElement CarrierRepresentative3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReason1")
	public WebElement DecliningReason1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReason2")
	public WebElement DecliningReason2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReason3")
	public WebElement DecliningReason3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReasonOther1")
	public WebElement DecliningReasonOther1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReasonOther2")
	public WebElement DecliningReasonOther2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningReasonOther3")
	public WebElement DecliningReasonOther3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningMonth1")
	public WebElement DecliningMonth1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningMonth1")
	public WebElement DecliningMonth2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningMonth1")
	public WebElement DecliningMonth3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningYear1")
	public WebElement DecliningYear1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningYear2")
	public WebElement DecliningYear2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningYear3")
	public WebElement DecliningYear3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__Naic1")
	public WebElement Naic1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__Naic2")
	public WebElement Naic2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__Naic3")
	public WebElement Naic3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__PhoneNum1")
	public WebElement PhoneNumber1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__PhoneNum2")
	public WebElement PhoneNumber2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__PhoneNum3")
	public WebElement PhoneNumber3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningReasonPL1:Object__DecliningCarrier__DecliningReason1")
	public WebElement DecliningReasonDEFL1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningReasonPL2:Object__DecliningCarrier__DecliningReason2")
	public WebElement DecliningReasonDEFL2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningReasonPL3:Object__DecliningCarrier__DecliningReason3")
	public WebElement DecliningReasonDEFL3;
	
	public String Representative1 = "id('OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__RepresentativeType1')";
	public String Representative2 = "id('OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__RepresentativeType2')";
	public String Representative3 = "id('OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__RepresentativeType3')";
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningCarrier1")
	public WebElement OHInsurer1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningCarrier2")
	public WebElement OHInsurer2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningCarrier3")
	public WebElement OHInsurer3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningCarrier4")
	public WebElement OHInsurer4;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningCarrier5")
	public WebElement OHInsurer5;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningReason1")
	public WebElement OHReason1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningReason2")
	public WebElement OHReason2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningReason3")
	public WebElement OHReason3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningReason4")
	public WebElement OHReason4;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:DecliningInfoOH:Object__DecliningCarrier__DecliningReason5")
	public WebElement OHReason5;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__CTAgencyLicense")
	public WebElement CTAgencyLicense;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__CTAgentLicense")
	public WebElement CTAgentLicense;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningResultsCode1")
	public WebElement DecliningResultsCode1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningResultsCode2")
	public WebElement DecliningResultsCode2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DecliningResultsCode3")
	public WebElement DecliningResultsCode3;

	@FindBy(xpath="id('OtherDocumentationTile:OtherDocumentationForm:savepanel')/table/tbody/tr/td/button/span[contains(text(),'Save')]")
	public WebElement DecliningSave;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__SearchDescription")
	public WebElement SearchDescription1;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__SearchDescription1")
	public WebElement SearchDescription2;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__SearchDescription2")
	public WebElement SearchDescription3;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DiligentSearcherName")
	public WebElement DiligentSearcherName;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__DecliningCarrier__DiligentSearcherTitle")
	public WebElement DiligentSearcherTitle;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__IndividualName")
	public WebElement DiligentIndividualName;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__AgencyLicenseNumber")
	public WebElement DiligentAgencyLicenseNumber;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__LicenseNumber")
	public WebElement DiligentLicenseNumber;
	
	@FindBy(id="OtherDocumentationTile:OtherDocumentationForm:Object__Diligent__LicenseType")
	public WebElement DiligentLicenseType;
	
	@FindBy(xpath="//*[@id='OtherDocumentationTile:OtherDocumentationForm:savepanel']/table/tbody/tr/td/div/button/span[contains(text(),'Save')]")
	public WebElement DiligentSave;
	
	FireEvent FireEventobject = new FireEvent();
	
	public Pg11_DecliningDiligentInfoPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterInsurer1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Insurer1);
		FireEventobject.EnterTextWithoutEnter(Insurer1, value);
	
	}
	
	public void enterInsurer2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Insurer2);
		FireEventobject.EnterTextWithoutEnter(Insurer2, value);
	
	}
	
	public void enterInsurer3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Insurer3);
		FireEventobject.EnterTextWithoutEnter(Insurer3, value);
	
	}
	
	public void clickDateDeclined1() throws POMEventException
	{
		
		FireEventobject.ClickElement(DateDeclined1);
		
	}
	
	public void clickDateDeclined2() throws POMEventException
	{
		
		FireEventobject.ClickElement(DateDeclined2);
		
	}
	
	public void clickDateDeclined3() throws POMEventException
	{
		
		FireEventobject.ClickElement(DateDeclined3);
		
	}
	
	public void datePicker(String datePicker, String value) throws POMEventException
	{
		
		FireEventobject.DatePickerpopup(datePicker, value);
		
	}
	
	public void enterCarrierRepresentative1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(CarrierRepresentative1);
		FireEventobject.EnterTextWithoutEnter(CarrierRepresentative1, value);
		
	}
	
	public void enterCarrierRepresentative2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(CarrierRepresentative2);
		FireEventobject.EnterTextWithoutEnter(CarrierRepresentative2, value);
		
	}
	
	public void enterCarrierRepresentative3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(CarrierRepresentative3);
		FireEventobject.EnterTextWithoutEnter(CarrierRepresentative3, value);
		
	}
	
	public void selectDecliningReason1(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningReason1, value);
		
	}
	
	public void selectDecliningReason2(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningReason2, value);
		
	}
	
	public void selectDecliningReason3(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningReason3, value);
		
	}
	
	public void enterDecliningReasonOther1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonOther1);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonOther1, value);
		
	}
	
	public void enterDecliningReasonOther2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonOther2);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonOther2, value);
		
	}
	
	public void enterDecliningReasonOther3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonOther3);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonOther3, value);
		
	}
	
	public void enterDecliningMonth1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningMonth1);
		FireEventobject.EnterTextWithoutEnter(DecliningMonth1, value);
		
	}
	
	public void enterDecliningMonth2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningMonth2);
		FireEventobject.EnterTextWithoutEnter(DecliningMonth2, value);
		
	}
	
	public void enterDecliningMonth3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningMonth3);
		FireEventobject.EnterTextWithoutEnter(DecliningMonth3, value);
		
	}
	
	public void enterDecliningYear1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningYear1);
		FireEventobject.EnterTextWithoutEnter(DecliningYear1, value);
		
	}
	
	public void enterDecliningYear2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningYear2);
		FireEventobject.EnterTextWithoutEnter(DecliningYear2, value);
		
	}
	
	public void enterDecliningYear3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningYear3);
		FireEventobject.EnterTextWithoutEnter(DecliningYear3, value);
		
	}
	
	public void enterNaic1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Naic1);
		FireEventobject.EnterTextWithoutEnter(Naic1, value);
		
	}
	
	public void enterNaic2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Naic2);
		FireEventobject.EnterTextWithoutEnter(Naic2, value);
		
	}
	
	public void enterNaic3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(Naic3);
		FireEventobject.EnterTextWithoutEnter(Naic3, value);
		
	}
	
	public void enterPhoneNumber1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(PhoneNumber1);
		FireEventobject.EnterTextWithoutEnter(PhoneNumber1, value);
		
	}
	
	public void enterPhoneNumber2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(PhoneNumber2);
		FireEventobject.EnterTextWithoutEnter(PhoneNumber2, value);
		
	}
	
	public void enterPhoneNumber3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(PhoneNumber3);
		FireEventobject.EnterTextWithoutEnter(PhoneNumber3, value);
		
	}
	
	public void enterDecliningReasonDEFL1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonDEFL1);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonDEFL1, value);
		
	}
	
	public void enterDecliningReasonDEFL2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonDEFL2);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonDEFL2, value);
		
	}
	
	public void enterDecliningReasonDEFL3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DecliningReasonDEFL3);
		FireEventobject.EnterTextWithoutEnter(DecliningReasonDEFL3, value);
		
	}
	
	public void selectCarrierRepresentativeToggle1(String value) throws POMEventException
	{
		
		FireEventobject.toggleButton(Representative1, value);
		
	}
	
	public void selectCarrierRepresentativeToggle2(String value) throws POMEventException
	{
		
		FireEventobject.toggleButton(Representative2, value);
		
	}
	
	public void selectCarrierRepresentativeToggle3(String value) throws POMEventException
	{
		
		FireEventobject.toggleButton(Representative3, value);
		
	}
	
	public void enterOHInsurer1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHInsurer1);
		FireEventobject.EnterTextWithoutEnter(OHInsurer1, value);
		
	}
	
	public void enterOHInsurer2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHInsurer2);
		FireEventobject.EnterTextWithoutEnter(OHInsurer2, value);
		
	}
	
	public void enterOHInsurer3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHInsurer3);
		FireEventobject.EnterTextWithoutEnter(OHInsurer3, value);
		
	}
	
	public void enterOHInsurer4(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHInsurer4);
		FireEventobject.EnterTextWithoutEnter(OHInsurer4, value);
		
	}
	
	public void enterOHInsurer5(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHInsurer5);
		FireEventobject.EnterTextWithoutEnter(OHInsurer5, value);
		
	}
	
	public void enterOHReason1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHReason1);
		FireEventobject.EnterTextWithoutEnter(OHReason1, value);
		
	}
	
	public void enterOHReason2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHReason2);
		FireEventobject.EnterTextWithoutEnter(OHReason2, value);
		
	}
	
	public void enterOHReason3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHReason3);
		FireEventobject.EnterTextWithoutEnter(OHReason3, value);
		
	}
	
	public void enterOHReason4(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHReason4);
		FireEventobject.EnterTextWithoutEnter(OHReason4, value);
		
	}
	
	public void enterOHReason5(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(OHReason5);
		FireEventobject.EnterTextWithoutEnter(OHReason5, value);
		
	}
	
	public void enterCTAgencyLicense(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(CTAgencyLicense);
		FireEventobject.EnterTextWithoutEnter(CTAgencyLicense, value);
		
	}
	
	public void enterCTAgentLicense(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(CTAgentLicense);
		FireEventobject.EnterTextWithoutEnter(CTAgentLicense, value);
		
	}
	
	public void selectResultsCode1(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningResultsCode1, value);
		
	}
	
	public void selectResultsCode2(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningResultsCode2, value);
		
	}
	
	public void selectResultsCode3(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DecliningResultsCode3, value);
		
	}
	
	public void clickDecliningSave() throws POMEventException
	{
		
		FireEventobject.ClickElement(DecliningSave);
		
	}
	
	public void enterDiligentSearchInformation1(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(SearchDescription1);
		FireEventobject.EnterTextWithoutEnter(SearchDescription1, value);
		
	}
	
	public void enterDiligentSearchInformation2(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(SearchDescription2);
		FireEventobject.EnterTextWithoutEnter(SearchDescription2, value);
		
	}
	
	public void enterDiligentSearchInformation3(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(SearchDescription3);
		FireEventobject.EnterTextWithoutEnter(SearchDescription3, value);
		
	}
	
	public void enterDiligentSearcherName(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DiligentSearcherName);
		FireEventobject.EnterTextWithoutEnter(DiligentSearcherName, value);
		
	}
	
	public void enterDiligentSearcherTitle(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DiligentSearcherTitle);
		FireEventobject.EnterTextWithoutEnter(DiligentSearcherTitle, value);
		
	}
	
	public void enterDiligentIndividualName(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DiligentIndividualName);
		FireEventobject.EnterTextWithoutEnter(DiligentIndividualName, value);
		
	}
	
	public void enterDiligentAgencyLicenseNumber(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DiligentAgencyLicenseNumber);
		FireEventobject.EnterTextWithoutEnter(DiligentAgencyLicenseNumber, value);
		
	}
	
	public void enterDiligentLicenseNumber(String value) throws POMEventException
	{
		
		FireEventobject.clearTextbox(DiligentLicenseNumber);
		FireEventobject.EnterTextWithoutEnter(DiligentLicenseNumber, value);
		
	}
	
	public void selectDiligentLicenseType(String value) throws POMEventException
	{
		
		FireEventobject.Dropdown(DiligentLicenseType, value);
		
	}
	
	public void clickDiligentSave() throws POMEventException
	{
		
		FireEventobject.ClickElement(DiligentSave);
		
	}

}
