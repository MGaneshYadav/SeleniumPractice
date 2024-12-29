package flight;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlightBookingTask 
{

	@Test(dataProvider = "testData")
	public void flightBookTest(String Source, String Destination) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys(Source);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='m-1']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys(Destination);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='m-1']")).click();
		
		driver.findElement(By.xpath("//span[text()='Search flights']")).click();
		
		LocalDateTime sysdate=LocalDateTime.now();
		System.out.println(sysdate);
		
		
		Thread.sleep(5000);
		//
		driver.quit();
		
	}
	
	
	@DataProvider(name="testData")
	public static Object[][] multipleRead() throws EncryptedDocumentException, IOException
	{
		File file =new File("./TestData/FlightData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<data.length;i++) 
		{
			for(int j=0;j<data[i].length;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}
