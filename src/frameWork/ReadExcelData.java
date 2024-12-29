package frameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	public static String singleRead(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		File file =new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}
		
	public static Object[][] multipleRead() throws EncryptedDocumentException, IOException
	{
		File file =new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Login");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<data.length;i++) 
		{
			for(int j=0;j<data[i].length;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	
	public static Object[][] registerData() throws EncryptedDocumentException, IOException
	{
		File file =new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Register");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<data.length;i++) 
		{
			for(int j=0;j<data[i].length;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	public static Object[][] shoppingCartData() throws EncryptedDocumentException, IOException
	{
		File file =new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Cart");
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<(data.length-(data.length-1));i++) 
		{
			for(int j=0;j<data[i].length;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
}

