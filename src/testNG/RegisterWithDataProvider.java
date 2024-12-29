package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterWithDataProvider {
	
	@Test(dataProvider = "registerData")
	public void datadrivenTesting(String firstname,String lastname,String email,String passsword, String confirmpassword)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("#gender-male")).click();
		driver.findElement(By.cssSelector("#FirstName")).sendKeys(firstname);
		driver.findElement(By.cssSelector("#LastName")).sendKeys(lastname);
		driver.findElement(By.cssSelector("#Email")).sendKeys(email);
		driver.findElement(By.cssSelector("#Password")).sendKeys(passsword);
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys(confirmpassword);
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
		driver.quit();
	}
	
	@DataProvider(name ="registerData")
	public Object[][] registerData()
	{
		Object data[][]=new Object[2][5];
		data[0][0]="Ganesh";
		data[0][1]="yadav";
		data[0][2]="ganesh@gmail.com";
		data[0][3]="gana123";
		data[0][4]="gana123";
		data[1][0]="pranith";
		data[1][1]="reddy";
		data[1][2]="pranith@gmail.com";
		data[1][3]="pranith123";
		data[1][4]="pranith123";
		return data;
	}

}
