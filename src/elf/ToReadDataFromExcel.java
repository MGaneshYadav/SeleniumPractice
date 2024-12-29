package elf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		File file=new File("./resources/data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		LocalDateTime date = sheet.getRow(13).getCell(1).getLocalDateTimeCellValue();
		String name = sheet.getRow(7).getCell(3).getStringCellValue();
		boolean bool = sheet.getRow(10).getCell(5).getBooleanCellValue();
		double number = sheet.getRow(6).getCell(6).getNumericCellValue();
		
		System.out.print(date +"\n"+name+"\n"+bool+"\n"+number+"\n");
		
		Sheet sheet1 = workbook.getSheet("Sheet2");
		
		String name1 = sheet1.getRow(7).getCell(3).getStringCellValue();
		boolean bool1 = sheet1.getRow(0).getCell(0).getBooleanCellValue();
		String number1 = sheet1.getRow(12).getCell(1).toString();
		
		System.out.print(name1+"\n"+bool1+"\n"+number1+"\n");
		
		System.out.println(sheet1.getRow(0).getCell(2).toString());
		System.out.println(sheet1.getRow(0).getCell(3).toString());
		
		
	}

}
