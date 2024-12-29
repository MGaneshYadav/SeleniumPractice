import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGet_OddIndex_Text_FromDropDown {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ganesh%20yadav/OneDrive/Desktop/HTML%20Custom%20Pages/demo%20(1).html");
//		List<WebElement> carsDropdown = driver.findElements(By.xpath("(//option/parent::select)[1]"));
//		for(WebElement ele: carsDropdown)
//		{
//			System.out.println(ele.getText());
//		}
		WebElement cars = driver.findElement(By.xpath("(//option/parent::select)[1]"));
		Select select=new Select(cars);
		select.selectByIndex(3);
		
		driver.quit();
	}

}
