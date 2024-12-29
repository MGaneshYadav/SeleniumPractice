package flight;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public static Object[][] multipleRead() throws EncryptedDocumentException, IOException
		{
			File file =new File("./TestData/FlightData.xlxs");
			FileInputStream fis=new FileInputStream(file);
			Workbook book=WorkbookFactory.create(fis);
			Sheet sheet=book.getSheet("Sheet1");
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
}

