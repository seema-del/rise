package genericUtilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamapleBaseClass {
	
	@BeforeSuite
	public void BeforeSuiteSetUp() {
		System.out.println("BeforeSuiteSetUp");
	}
	@BeforeTest
	public void BeforeTestSetUp() {
		System.out.println("BeforeTestSetUp");
	}
	
	@BeforeClass
	public void BeforeclassSetUp() {
		System.out.println("BeforeClassSetUp");
	}
	@BeforeMethod
	public void BeforeMethodSetUp() {
		System.out.println("BeforeMethodSetUp");
	}
//	@Test
//	public void Test1()
//	{
//		System.out.println("test1");
//	}
	@AfterMethod
	public void AfterMethodSetUp()
	{
		System.out.println("AfterMethodSetUp");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClassSetUp");
	}
	
	@AfterTest
	public void AfterTestSetUp()
	{
		System.out.println("AfterTestSetUp");
	}
	@AfterSuite
	public void AfterSuiteSetUp()
	{
		System.out.println("AfterSuiteSetUp");
	}

}
