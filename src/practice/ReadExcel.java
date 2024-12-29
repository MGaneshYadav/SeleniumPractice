package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public static Object[][] readData() throws EncryptedDocumentException, IOException
	{
		File file=new File("C:\\Users\\Ganesh yadav\\OneDrive\\Desktop\\TestDataFolder\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object data[][]=new Object[rowCount-1][colCount];
		for (int i = 0; i <rowCount-1 ; i++) 
		{
			for (int j = 0; j <colCount ; j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
			
		}
		return data;	
	}

}
