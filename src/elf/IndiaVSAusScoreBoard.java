package elf;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndiaVSAusScoreBoard {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
	    
		List<WebElement> players = driver.findElements(By.xpath("(//tbody)[1]/tr/td/div/a"));
	    int rows=players.size();
	    List<WebElement> runs = driver.findElements(By.xpath("(//tbody)[1]/tr//td[contains(@class,'ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right ds')]"));
	    
	    for(int i=0;i<rows;i++)
	    {
	    	System.out.println(players.get(i).getText()+" ---> "+runs.get(i).getText());
	    }
	    driver.quit();
	    
		
	}

}
