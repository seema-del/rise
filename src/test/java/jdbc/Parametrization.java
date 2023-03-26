package jdbc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

//import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

public class Parametrization {
	@Test
	public void LoginTest(XmlTest xml)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(xml.getParameter("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String username=xml.getParameter("user");
		String password=xml.getParameter("password");
		 driver.findElement(By.id("username")).sendKeys(username+Keys.TAB+password+Keys.ENTER );
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean status= wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		// assert.assertTrue(status);
		
		if(status)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		  driver.quit();
		  
		
	}

}
