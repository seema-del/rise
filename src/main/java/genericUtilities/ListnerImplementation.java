package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener {
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	 System.err.println("ONSTART");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
 System.err.println("ONTESTSTART");	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
System.err.println("ontestsucess");	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
 System.err.println("ontestfailure");	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
 System.err.println("ontestskipped");	}

 

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
 System.err.println("onfinish");	}

}
