package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcelForRegisterSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("./TestData/TestData.xlsx") ;
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Register");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell.toString());
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < rowNum; i++) 
		{
			for (int j = 0; j < colNum; j++) 
			{
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
	}

}
