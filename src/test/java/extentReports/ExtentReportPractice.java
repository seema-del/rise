package extentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportPractice {
	public static void main(String[] args) throws IOException {
		ExtentReports report=new ExtentReports();
		File file=new File("./report.html");
		
		ExtentSparkReporter spark=new ExtentSparkReporter(file);
		  spark.config().setReportName("sample Test");	
		spark.config().setDocumentTitle("Extent reporting  practice");
		spark.config().setTheme(Theme.STANDARD);
		
		report.attachReporter(spark);
		report.setSystemInfo("Author", "seema");
		report.setSystemInfo("OS", "windows");
		
		ExtentTest Test=report.createTest("Test 1");
		Test.log(Status.INFO,"this is sample Test");
		
		report.createTest("Test 2")
		        .pass("this is passed Test")
		        .info("this is info");
		
		report.flush();
		//Desktop.getDesktop().browser(new file("report.html").toURI());
		Desktop.getDesktop().browse(new File("report.html").toURI());//
		
     
	}

}
