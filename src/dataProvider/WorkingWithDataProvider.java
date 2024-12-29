package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	
	
	@Test(dataProvider ="testData")
	public void dataDriven(String firstname, String lastname,String gender,String phno)
	{
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(gender);
		System.out.println(phno);
	}
	
	@DataProvider(name="testData")
	public Object[][] testData()
	{
		Object data[][]=new Object[2][4];
		data[0][0]="ganesh";
		data[0][1]="yadav";
		data[0][2]="male";
		data[0][3]="9182345025";
		data[1][0]="khaja";
		data[1][1]="pinjari";
		data[1][2]="male";
		data[1][3]="8234502591";
		return data;
	}

}
