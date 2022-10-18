package php.crm.Vtiger.Project1pom.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailPage {
	WebDriver driver;
		public CampaignDetailPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
			}
		public String verifyCampignName(String campaignName) {
			return driver.findElement(By.xpath("//span[contains(text(),'"+campaignName+"')]")).getText();
			
		}
}
