package elf;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AunthenticationPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
//		Robot robot=new Robot();
//		
//		robot.keyPress(KeyEvent.VK_G);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_A);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		
//		robot.keyPress(KeyEvent.VK_1);
//		robot.keyPress(KeyEvent.VK_2);
//		robot.keyPress(KeyEvent.VK_3);
//		robot.keyPress(KeyEvent.VK_4);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		
//		robot.keyRelease(KeyEvent.VK_G);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_N);
//		
//		robot.keyRelease(KeyEvent.VK_TAB);
//		
//		robot.keyRelease(KeyEvent.VK_1);
//		robot.keyRelease(KeyEvent.VK_2);
//		robot.keyRelease(KeyEvent.VK_3);
//		robot.keyRelease(KeyEvent.VK_4);
//		
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
