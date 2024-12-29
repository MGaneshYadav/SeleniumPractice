package frameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(frameWork.ListenersImplementation.class)
public class ShoppingCartTest extends BaseTest {
	
	@Test(dataProvider = "loginData")
	public void shoppingCartTest(String username,String password)
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'button-2 product-box-add-to-cart-button')])[1]")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		String productText=driver.findElement(By.className("product-name")).getText();
		Assert.assertTrue(productText.equalsIgnoreCase("Computing and Internet"),"product not added in cart");
	}
	
	@DataProvider(name="loginData")
	public Object[][] shoppingCartTest() throws EncryptedDocumentException, IOException
	{
		return ReadExcelData.shoppingCartData();
	}

}
