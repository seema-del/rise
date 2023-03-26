package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class HomePage {

	String headerXpath = "//a[@class='hdrLink']";

	//decalaration
	@FindBy (xpath = "//a[@class='hdrLink']")
	private WebElement  pageHeader;
	
	@FindBy (xpath="//a[.='Leads']")
	private WebElement leadsTab;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
    private WebElement adminIcon;
	
	@FindBy (xpath="//a[.='Sign Out']")
	private WebElement signOutLink;
	
	
	//initalization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	public void clickLeadTab()
	{
		leadsTab.click();
	}
	public void signOutOfVtiger(WebDriverUtility web)
	{
	web.mouseHover(adminIcon);
	signOutLink.click();
	}
}
