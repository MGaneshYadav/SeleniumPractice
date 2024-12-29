package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukariFileUploadPopUP {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount");
		WebElement uploadButton = driver.findElement(By.id("resumeUpload"));
		Actions action=new Actions(driver);
		action.scrollToElement(uploadButton).scrollByAmount(0, 100).perform();
		uploadButton.sendKeys("C:\\Users\\Ganesh yadav\\OneDrive\\Desktop\\GaneshMekala.docx");
	}

}
