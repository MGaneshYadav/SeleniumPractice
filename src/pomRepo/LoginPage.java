package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	public WebElement emailTextfield;
	
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	@FindBy(id = "Password")
	public WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement loginBtn;

}
