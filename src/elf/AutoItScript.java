package elf;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItScript {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.totaljobs.com/Account/Register");
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
		driver.findElement(By.xpath("//div[text()='Upload your CV']")).click();
		driver.findElement(By.xpath("//label[text()='from this device']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/Totaljobs.exe");
		Thread.sleep(2000);
		WebElement getfile = driver.findElement(By.id("cvFileName"));
		Thread.sleep(2000);
		
		System.out.println(getfile.getText());
		driver.quit();		
		
	}

}
