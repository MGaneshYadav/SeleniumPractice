package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsFor_Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement DWS_icon = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		if(DWS_icon.isDisplayed())
		{
			System.out.println("DemoWebShop is Launched succesfully");
		}
		driver.findElement(By.linkText("Register")).click();
		
		WebElement register_text = driver.findElement(By.xpath("//h1[text()='Register']"));
		if(register_text.isDisplayed())
		{
			System.out.println("Register is page opened.");
			WebElement male_radiobtn = driver.findElement(By.id("gender-male"));
			male_radiobtn.click();
			if(male_radiobtn.isSelected())
			{
				System.out.println("Male radio button is selected");
			}
			WebElement firstName_textfield = driver.findElement(By.id("FirstName"));
			firstName_textfield.sendKeys("ganesh");
			if(firstName_textfield.isEnabled())
			{
				System.out.println("First name text field is enabled");
			}
			System.out.println(firstName_textfield.getAttribute("value"));
			driver.findElement(By.id("LastName")).sendKeys("yadav");
			driver.findElement(By.cssSelector("#Email")).sendKeys("gana@gmail.com");
			driver.findElement(By.cssSelector("#Password")).sendKeys("ga1234");
			driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("ga1234");
			String registerbtn_font = driver.findElement(By.cssSelector(".button-1.register-next-step-button")).getCssValue("font");
			System.out.println(registerbtn_font);
			driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
			
			String message = driver.findElement(By.xpath("//div[@class='validation-summary-errors']/ul/li")).getText();
			System.out.println(message);
				
		}
		//Thread.sleep(2000);
		driver.quit();
	}

}
