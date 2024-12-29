import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RhulShettyAssessment {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		WebElement webTable = driver.findElement(By.xpath("(//legend)[8]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", webTable);
		
		List<WebElement> price = driver.findElements(By.xpath("//table[@name='courses']//td[3]"));
		int max=0;
		for(int i=0;i<price.size();i++)
		{
			int priceData=Integer.parseInt(price.get(i).getText());
			if(max<priceData)
			{
				max=priceData;
			}
			
		}
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@name='courses']//td"));
		int count=0;
		String s=Integer.toString(max);
		for(int i=0;i<table.size();i++)
		{
			
			String tableData=table.get(i).getText();
			if(tableData.equals(s))
			{
				System.out.println(table.get(count-1).getText());
				//break;
			}
			count++;
		}
		driver.quit();

	}

}
