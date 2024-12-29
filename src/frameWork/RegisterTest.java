package frameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(frameWork.ListenersImplementation.class)
public class RegisterTest extends BaseTest{
	
	
	@Test(dataProvider = "registerData")
	public void registerTest(String firstName,String lastName,String email,String password,String confirmPassword)
	{
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
	}
	
	@DataProvider(name="registerData")
	public Object[][] registerData() throws EncryptedDocumentException, IOException
	{
		return ReadExcelData.registerData();
	}

}
