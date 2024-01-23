package extent_report_package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener{
	
	
	//this method will run before every method
	//means running before method , will create test case
	@Override
	public void onTestStart(ITestResult result) 
	{
		ExtentReportUtils.createTest(result.getMethod().getMethodName());
	}


	
	
   //this method will run after Test in testNG.xml file
	//means once all test cases are executed then it will flush report (generate report)
	@Override
	public void onFinish(ITestContext context) 
	{
		ExtentReportUtils.flushReport();
	}

	
	

}
