package TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start and details are"+result.getName());

		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and details are"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed and details are"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and details are"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
