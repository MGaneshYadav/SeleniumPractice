package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="E:\\workspace-2022\\programs\\Selenium\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.close();

	}
}
