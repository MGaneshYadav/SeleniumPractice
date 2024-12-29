package practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerImplementstion implements ITestListener 
{
	@Override
	public void onTestFailure(ITestResult result) {
		//UtilityMethods.getScreenshot(result.getName()); 
		System.out.println("Test execution failed");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test execution successful");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test execution skipped");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test sexecution finished");
		
	}
	
}
