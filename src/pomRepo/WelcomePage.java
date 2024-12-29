package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage  extends BasePage
{
	
	public WelcomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(linkText = "Log in")
	public WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}

}
