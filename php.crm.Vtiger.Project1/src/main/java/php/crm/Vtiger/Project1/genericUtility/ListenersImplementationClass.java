package php.crm.Vtiger.Project1.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public  class ListenersImplementationClass implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.sDriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destinstion = new File("./screenshots/"+testCaseName+".png");
		try {
			Files.copy(source, destinstion);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
