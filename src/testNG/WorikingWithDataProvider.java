package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorikingWithDataProvider {
	
	@Test(dataProvider = "testData")
	public void datadrivenTesting(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@DataProvider(name ="testData")
	public Object[][] testData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="useraname1";
		data[0][1]="password1";
		data[1][0]="useraname2";
		data[1][1]="password2";
		return data;
	}

}
