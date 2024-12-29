package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners(ListenerImplementstion.class)
public class SS_Login {
	static WebDriver driver;
	@Test(dataProvider = "loginData")
	public void login(String username,String pwd) throws InterruptedException, IOException
	{
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReports/report5.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("LoginTest");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();

		String shopperLogin=driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(shopperLogin, "Shopper Login","Shopper Login page is not displayed");
		test.log(Status.INFO, "Shopper login page is displayed");

		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Login']")).click();

		try
		{
			if(driver.findElement(By.xpath("//h3")).isDisplayed())
			{
				test.log(Status.INFO,"Home page is displayed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			test.log(Status.INFO,"Home page is not displayed");
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build());
		}
		driver.quit();
		report.flush();
	}

	@Test
	public static String captureScreenshot() throws IOException
	{
		LocalDateTime dateTime=LocalDateTime.now();
		String dateStamp=dateTime.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path="./CaptureScreenshot/"+dateStamp+".png";
		File source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		try {
			FileHandler.copy(source, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "."+path;

	}


	@DataProvider
	public Object[][] loginData() throws EncryptedDocumentException, IOException
	{
		return ReadExcel.readData();
	}


}
