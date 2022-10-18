package php.crm.Vtiger.Project1pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	public CampaignPage(WebDriver driver){
		PageFactory.initElements(driver, this);

}
 @FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
 private WebElement addCampaignButton;
 

 public WebElement getAddCampaignButton() {
	return addCampaignButton;
}


public void clickOnAddCampaign() {
	 addCampaignButton.click();
	 
 }













}
