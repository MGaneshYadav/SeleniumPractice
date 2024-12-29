package elf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownLoadPopUp {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement fileDownload = driver.findElement(By.xpath("//div/p[contains(.,'C#')]/..//a[contains(text(),'4.16.1 (December 6, 2023)')]"));
		//fileDownload.click();
		fileDownload.sendKeys("C:\\Users\\Ganesh yadav\\OneDrive\\Desktop\\fileDownload.docx)");
	}

}
