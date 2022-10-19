package php.crm.Vtiger.Project1pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//div[@id='appnavigator']/div")
private WebElement threeDashButton;



@FindBy(xpath="//span[text()=' MARKETING']")
private WebElement marketingOption;

@FindBy(xpath="//span[text()=' Campaigns']")
private WebElement campaignOption;

@FindBy(xpath="//a[@class='userName dropdown-toggle pull-right']")
private WebElement logoutButton;

@FindBy(xpath="//a[text()= 'Sign Out']")
private WebElement signOutButton;

@FindBy(xpath="//span[text()=' Leads']")
private WebElement leadsOption;


public WebElement getLeadsOption() {
	return leadsOption;
}

public WebElement getThreeDashButton() {
	return threeDashButton;
}

public WebElement getMarketingOption() {
	return marketingOption;
}

public WebElement getCampaignOption() {
	return campaignOption;
}

public WebElement getLogoutButton() {
	return logoutButton;
}

public WebElement getSignOutButton() {
	return signOutButton;
}
public void clickOnCampaignAction() {
	threeDashButton.click();
	marketingOption.click();
	campaignOption.click();
	System.out.println("this is just for fun");
	System.out.println("dont take it seriously");
	System.out.println("this is again local change");

	System.out.println("this is global change");

	

}

public void clickOnLeadsOption() {
	threeDashButton.click();
	marketingOption.click();
	leadsOption.click();
}

public void logoutAction()
{
	logoutButton.click();
	signOutButton.click();
}


}
