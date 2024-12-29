package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithExcel {
	@Test(dataProvider = "loginData")
	public void datadrivenTesting(String username,String password) throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.quit();
	}

	@DataProvider(name="loginData")
	public static Object[][] multipleData() throws EncryptedDocumentException, IOException
	{
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		int row_count = sheet.getPhysicalNumberOfRows();
		int col_count = sheet.getRow(0).getPhysicalNumberOfCells();
		Object data[][]=new Object[row_count][col_count];
		for(int i=0;i<row_count;i++)
		{
			for(int j=0;j<col_count;j++) 
			{
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}	
		return data;
	}
}

