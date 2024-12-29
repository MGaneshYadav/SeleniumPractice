package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Ganesh yadav
 *
 */
public class TC_Login_001 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//To Read Data from the Excel sheet
		File file=new File("./resources/LoginData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Login");
		String username = sheet.getRow(0).getCell(2).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		
		//Test Step1: Open Browser and Enter URL in the Browser.
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		WebElement instagramTextIcon = driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
		if(instagramTextIcon.isDisplayed())
		{
			System.out.println("Instagram Login page is displayed.");
		}
		else
		{
			System.out.println("Instagram Login page is not displayed.");
		}
		
		//Test Step 2: Click on Login with Facebook link.
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		WebElement fbloginText = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		if(fbloginText.isDisplayed())
		{
			System.out.println("Facebook Login Page is Displayed.");
		}
		else
		{
			System.out.println("Facebook Login Page is not Displayed.");
		}
		
		//Test Step 3: Click on Username textfield and Enter Username.
		WebElement usernameTextfield = driver.findElement(By.id("email"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(username);
		String usernameEntered = usernameTextfield.getAttribute("value");
		if(username.equals(usernameEntered))
		{
			System.out.println("Username was entered successfully.");
		}
		
		//Test Step 4: Click on Password textfield and Enter Password.
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String passwordEntered = passwordTextField.getAttribute("value");
		if(password.equals(passwordEntered))
		{
			System.out.println("Password was entered successfully.");
		}
		
		//Test Step 5: Click on Login Button.
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		WebElement homeText= driver.findElement(By.xpath("//span[text()='Home']"));
		if(homeText.isDisplayed())
		{
			System.out.println("profile page was displayed");
		}
		else
		{
			System.out.println("profile page was not displayed");

		}
		
		driver.quit();
	}
}
