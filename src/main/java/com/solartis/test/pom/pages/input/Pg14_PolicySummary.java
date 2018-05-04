package com.solartis.test.pom.pages.input;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.solartis.test.common.exception.POMEventException;
import com.solartis.test.common.listeners.FireEvent;
import com.solartis.test.pom.common.PomEventsMethodDefinition;
public class Pg14_PolicySummary extends PomEventsMethodDefinition
{
    @FindBy(xpath=".//*[@id='PostBoundCheckForm:PostBoundCheckid:Object__Policy__Issuance__Application__Signed']/div[contains(.,'Yes')]/span")
    public WebElement SignedApplicationReceived;
    @FindBy(xpath=".//*[@id='PostBoundCheckForm:PostBoundCheckid:Object__Policy__Issuance__Application__Proof']/div[contains(.,'Yes')]/span")
    public WebElement DecliningCarrierFormReceived;
    @FindBy(xpath=".//*[@id='PostBoundCheckForm:PostBoundCheckid:Object__Policy__Issuance__Application__Applicat']/div[contains(.,'Yes')]/span")
    public WebElement ApplicationDataEntryCompleted;
    @FindBy(xpath="id('PostBoundCheckForm:PostBoundCheckid:PolicyBound')//tr[3]/td[2]/button/span")
    public WebElement PostboundChecklistSave;
    @FindBy(xpath=" id('updatepanel')/button[2]/span[contains(text(),'Issue Policy')]")
    public WebElement IssuePolicyButton;
    
    FireEvent FireEventobject = new FireEvent();
    
    public Pg14_PolicySummary()
    {
        PageFactory.initElements(driver, this);
    }
    
    public void selectSignedApplicationReceived() throws POMEventException
    {
        FireEventobject.ClickElement(SignedApplicationReceived);
    }
    
    public void selectDecliningCarrierFormReceived() throws POMEventException
    {
        FireEventobject.ClickElement(DecliningCarrierFormReceived);
    }
    
    public void selectApplicationDataEntryCompleted() throws POMEventException
    {
        FireEventobject.ClickElement(ApplicationDataEntryCompleted);
    }
    
    public void savePostboundChecklist() throws POMEventException
    {
        FireEventobject.ClickElement(PostboundChecklistSave);
    }
    
    public void clickIssuePolicy() throws POMEventException
    {
        FireEventobject.ClickElement(IssuePolicyButton);
    }
    
   /* public void Policy(String test_data) throws POMPageException
    {
        try
        {
            select_signed_application_received();
            select_declining_carrier_form_received();
            select_application_data_entry_completed();
            save_postbound_checklist();
            FireEventobject.ProcessingLoad();
            click_issue_policy();
        }
        catch(POMEventException e)
        {
            try 
            {
                FireEventobject.takeScreenshot(test_data);
            } 
            catch (POMEventException e1) 
            {
                throw new POMPageException("Error in Taking ScreenShot in Policy Summary Page", e1);
            }
            throw new POMPageException("Error in Location Page", e);
        }
    }*/
}