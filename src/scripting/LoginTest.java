package scripting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomRepo.LoginPage;
import pomRepo.WelcomePage;

public class LoginTest {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage welcome=new WelcomePage(driver);
		welcome.loginLink.click();
		
		LoginPage login=new LoginPage(driver);
		login.emailTextfield.sendKeys("ganagan@gmail.com");
		login.passwordTextfield.sendKeys("gana123");
		login.loginBtn.click();
	}

}
