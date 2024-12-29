import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('email').value='id'");
		js.executeScript("document.getElementById('email').style.border='5px red dashed'");
		js.executeScript("document.getElementById('email').style.background='green'");
		WebElement id = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='ganesh'",id);
		js.executeScript("document.getElementsByClassName('_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')[0].click()");
		js.executeScript("window.scroll(0,200)");
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
