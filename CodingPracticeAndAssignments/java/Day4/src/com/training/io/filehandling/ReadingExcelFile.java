package com.training.io.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		HSSFWorkbook myExcelBook = null;
		InputStream input = null;
		try {
			input = new FileInputStream("/home/moglix/Downloads/poi-test.xls");
			myExcelBook = new HSSFWorkbook(input);
		} catch (IOException e) {
			System.out.println("corrupted");
		}
		HSSFSheet myExcelSheet = myExcelBook.getSheet("POI Worksheet");
		HSSFRow row1 = myExcelSheet.getRow(0);
		HSSFCell cellA1 = row1.getCell((short) 0);
		String a1Val = cellA1.getStringCellValue();
		HSSFCell cellB1 = row1.getCell((short) 1);
		String b1Val = cellB1.getStringCellValue();
		HSSFCell cellC1 = row1.getCell((short) 2);
		boolean c1Val = cellC1.getBooleanCellValue();
		HSSFCell cellD1 = row1.getCell((short) 3);
		Date d1Val = cellD1.getDateCellValue();
		System.out.println(a1Val + "    " + b1Val + "    " + c1Val + "    " + d1Val);
	}

//	
//	
//public static void main(String[] args) throws FileNotFoundException, IOException {
//		
//		HSSFWorkbook myExcelBook = null;
//		InputStream input = null;
//		try {
//		    input = new FileInputStream("/home/moglix/Downloads/Java-Read-Excel-Files-master/readable_writable_excel.xls");
//		    myExcelBook = new HSSFWorkbook(input);
//		} catch(IOException e) {
//		    System.out.println("corrupted");
//		} 
//		HSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
//		
//		System.out.println("name      email      dob    salary       department");
//		System.out.println();
//		
//		for(int i=1; i<=3; i++) {
//			HSSFRow row = myExcelSheet.getRow(i);
//			
//			String a1Val = row.getCell((short) 0).getStringCellValue();
//			String b1Val = row.getCell((short) 1).getStringCellValue();			
//			Date c1Val = row.getCell((short) 2).getDateCellValue();			
//			double d1Val = row.getCell((short) 3).getNumericCellValue();			
//			String d2Val = row.getCell((short) 4).getStringCellValue();
//			
//			System.out.println(a1Val+"    "+b1Val+"    "+c1Val+"    "+d1Val+"    "+d2Val);
//		}
//		
//	}
}
