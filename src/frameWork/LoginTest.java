package frameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(frameWork.ListenersImplementation.class)
public class LoginTest extends BaseTest{
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password)
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();

	}
	@DataProvider(name="loginData")
	public Object[][] loginData() throws EncryptedDocumentException, IOException
	{
		return ReadExcelData.multipleRead();
	}

}
