package frameWork;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case Execution Started");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test execution finished");
	}
	

}
