package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class NaukariActionsScroll {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		Actions action=new Actions(driver);
		//action.scrollByAmount(0, 2700).perform();
//		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		WebElement resumeWriting = driver.findElement(By.linkText("Resume writing"));
		ScrollOrigin ele=ScrollOrigin.fromElement(resumeWriting);
		action.scrollFromOrigin(ele, 0, 500).perform();
	}

}
