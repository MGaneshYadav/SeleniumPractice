package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithExcelDataUsingDataProvider {
	
		@Test(dataProvider  ="loginData")
		public void loginTest(String userName,String Password) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.id("Email")).sendKeys(userName);
			driver.findElement(By.id("Password")).sendKeys(Password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		    driver.quit();
		}
		
		
		@DataProvider(name = "loginData",parallel = true )
		public Object[][] loginData() throws EncryptedDocumentException, IOException {
			File file =new File("./TestData/TestData.xlsx");
			FileInputStream fis=new FileInputStream(file);
			Workbook book=WorkbookFactory.create(fis);
			Sheet sheet=book.getSheet("Login");
			int row=sheet.getPhysicalNumberOfRows();
			int col=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data=new Object[row-1][col];
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
