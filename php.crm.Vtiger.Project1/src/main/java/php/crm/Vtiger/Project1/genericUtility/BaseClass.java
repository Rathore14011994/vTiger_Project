package php.crm.Vtiger.Project1.genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import php.crm.Vtiger.Project1pom.repository.HomePage;
import php.crm.Vtiger.Project1pom.repository.LoginPage;

public class BaseClass {
	 public WebDriver driver;
	 public static WebDriver sDriver;
	 public JavaUtility jutils=new JavaUtility();
	 WebDriverUtility wutils=new WebDriverUtility();
	
	@BeforeSuite
	public void bsconfig() {
		System.out.println("Data base connection has been started");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		String url = jutils.fetchDataFromPropertyFile("url");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wutils.maximizeWindow(driver);
		wutils.implicitWait(driver);
		driver.get(url);
		System.out.println("Chrome Browser is launched");
		System.out.println("Navigated to Vtiger");
		sDriver=driver;
		
	}
	
	@BeforeMethod
	public void bmconfig() throws IOException {
		String username=jutils.fetchDataFromPropertyFile("username");
		String password=jutils.fetchDataFromPropertyFile("password");
		LoginPage login=new LoginPage(driver);
		login.loginAction(username, password);
		System.out.println("Login Action has been Completed");
		
		
	}
	
	@AfterMethod
	public void amConfig() {
	HomePage	home=new HomePage(driver);
	home.logoutAction();
	}

	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("Browser is closed");
		}
	
	@AfterSuite
		public void asConfig() {
			System.out.println("Database connection has been closed");
		}
	}
	

