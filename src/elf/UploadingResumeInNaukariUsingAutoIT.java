package elf;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingResumeInNaukariUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("./AutoIT/resume.exe");
		
		Thread.sleep(2000);
		
		WebElement getFile = driver.findElement(By.cssSelector(".file-name.ellipsis"));
		
		System.out.println(getFile.getText());
		
		
	}

}
