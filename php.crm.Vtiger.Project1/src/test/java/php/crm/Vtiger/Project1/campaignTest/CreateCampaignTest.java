package php.crm.Vtiger.Project1.campaignTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import php.crm.Vtiger.Project1.genericUtility.BaseClass;
import php.crm.Vtiger.Project1.genericUtility.ExcelUtility;
import php.crm.Vtiger.Project1.genericUtility.IPathConstant;
import php.crm.Vtiger.Project1pom.repository.CampaignDetailPage;
import php.crm.Vtiger.Project1pom.repository.CampaignPage;
import php.crm.Vtiger.Project1pom.repository.CreatingNewCampaignPage;
import php.crm.Vtiger.Project1pom.repository.HomePage;



@Listeners(php.crm.Vtiger.Project1.genericUtility.ListenersImplementationClass.class)
public class CreateCampaignTest extends BaseClass {
	@Test
	public void createCampaignAndVerifyCampaignNameTest() throws EncryptedDocumentException, IOException {
		HomePage home=new HomePage(driver);
		home.clickOnCampaignAction();
		
		CampaignPage campaign=new CampaignPage(driver);
		campaign.clickOnAddCampaign();
		
		int randomNo=jutils.generateRandomNumber(IPathConstant.RANDOM_NUMBER);
		
		ExcelUtility eUtils=new ExcelUtility();
		String campaignName = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 0);
		String expectedCampaignName = campaignName+randomNo;
		 String date = eUtils.fetchDataFromExcelFile(IPathConstant.SHEET_NAME, 1, 1);
		 
		 CreatingNewCampaignPage newCampaign = new CreatingNewCampaignPage(driver);
		 newCampaign.createNewCampaignAction(expectedCampaignName, date);
		 
		 
		 CampaignDetailPage campaignDetails = new CampaignDetailPage(driver);
		 String actualCampaignName = campaignDetails.verifyCampignName(campaignName);
		 
		 System.out.println(actualCampaignName);
		 System.out.println(expectedCampaignName);
		 
		 
		 
		 
		 
		 Assert.assertEquals(actualCampaignName, expectedCampaignName);
		 System.out.println("Campaign Name is verified");
		
		
	}

}
