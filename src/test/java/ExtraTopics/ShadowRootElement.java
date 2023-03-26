package ExtraTopics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * whwenever we failed to identify the elements using locators that time we make
 * use of this shadow root right click on the element code and go to copy and
 * try to copy JSpath and paste it in inspect console then one message will come
 * afterward try to write a scripts in eclipse
 * 
 *--//input[@id='searchInput']- this xpath is not identified -try to inspect searchButton so that u will get shadwow root
 * @author prash
 *
 */
public class ShadowRootElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disbale-notifications");

		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object searchObj = js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\") ");

		WebElement searchTf = (WebElement) searchObj;
		searchTf.sendKeys("advance selenium notes.pdf");

		Thread.sleep(3000);
		Object searchButtonObj = js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#icon\").shadowRoot.querySelector(\"#icon > iron-icon\")");
		WebElement searchButton = (WebElement) searchButtonObj;
		searchButton.click();
		System.out.println("pass");
		driver.quit();

	}
}
