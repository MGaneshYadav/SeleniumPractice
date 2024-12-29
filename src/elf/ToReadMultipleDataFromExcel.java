package elf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		File file=new File("./resources/data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet3");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String arr[][]=new String[rowCount][cellCount];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[i][j]=sheet.getRow(i).getCell(j).toString();	
			}
			
		}
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
			    System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
