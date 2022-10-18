package php.crm.Vtiger.Project1.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(IPathConstant.IMPLICITE_WAIT, TimeUnit.SECONDS);
	}

	public void waitForToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,IPathConstant.EXPLICITE_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void waitForTheTitle(WebDriver driver,String title) {
		WebDriverWait wait = new WebDriverWait(driver,IPathConstant.EXPLICITE_WAIT);
		wait.until(ExpectedConditions.titleContains(title));
			
	}
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
}
