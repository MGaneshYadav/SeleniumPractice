package basics;

import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement icon = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		if(icon.isDisplayed())
		{
			System.out.println("DemoWebShop is Launched");
		}
		
		WebElement Search_Textfield = driver.findElement(By.id("small-searchterms"));
		if(Search_Textfield.isEnabled())
		{
			System.out.println("Search textfield is enabled");
		}
		
		WebElement Excellent_radiobtn = driver.findElement(By.id("pollanswers-1"));
		Excellent_radiobtn.click();
		if(Excellent_radiobtn.isSelected())
		{
			System.out.println("Excellent radio button selected");
		}
		
		String register_Text = driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
		System.out.println(register_Text);
		
		System.out.println(driver.findElement(By.xpath("//a[@class='ico-cart']")).getText());
		
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		
		String wishlist_cssvalue = driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).getCssValue("vertical-align");
		System.out.println(wishlist_cssvalue); 
		
		driver.quit();

	}
}
