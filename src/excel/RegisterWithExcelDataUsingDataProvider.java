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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterWithExcelDataUsingDataProvider {
	
	@Test(dataProvider  ="registerData")
	public void loginTest(String firstname,String lastname,String email,String password,String cofirmPassword) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("#gender-male")).click();
		driver.findElement(By.cssSelector("#FirstName")).sendKeys(firstname);
		driver.findElement(By.cssSelector("#LastName")).sendKeys(lastname);
		driver.findElement(By.cssSelector("#Email")).sendKeys(email);
		driver.findElement(By.cssSelector("#Password")).sendKeys(password);
		driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys(cofirmPassword);
		driver.findElement(By.cssSelector(".button-1.register-next-step-button")).click();
		driver.quit();
	}
	
	
	@DataProvider(name = "registerData")
	public Object[][] registerData() throws EncryptedDocumentException, IOException {
		File file =new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Register");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<rowNum-1;i++) 
		{
			for(int j=0;j<colNum;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}
	

}
