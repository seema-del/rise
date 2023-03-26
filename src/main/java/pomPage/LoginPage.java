package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//declaration
public class LoginPage {
@FindBy (id="submitButton")
private WebElement loginButton;

@FindBy (name= "user_name")
private WebElement usernameTF;

@FindBy (name="user_password")
private WebElement passwordTF;

//intilization
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//utilization
public WebElement getLoginButton()
{
	return loginButton;
}

//public WebElement getUsernameTF()
//{
//	return usernameTF;
//	
//}
//public WebElement getPAsswordTF()
//{
//	//return passwordTF;
//	
//}

public void loginIntoVtiger(CharSequence username, CharSequence password)
{
	usernameTF.sendKeys(username);
	passwordTF.sendKeys(password);
	loginButton.click();
}
}
