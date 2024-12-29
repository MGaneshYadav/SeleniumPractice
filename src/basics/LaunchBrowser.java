package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="E:\\workspace-2022\\programs\\Selenium\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();

	}

}
