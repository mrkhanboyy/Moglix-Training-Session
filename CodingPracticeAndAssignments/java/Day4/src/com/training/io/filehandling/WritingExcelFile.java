package com.training.io.filehandling;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile {
	public static void main(String[] args) {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("JAVA BOOK");
		
		Object[][] bookData= {
				{"JAVA1","ABC",1011},
				{"JAVA1","ABC",1011},
				{"JAVA1","ABC",1011}
		};
		
		int rowCount=0;
		for (Object[] aBook:bookData) {
			XSSFRow row=sheet.createRow(++rowCount);
			int colCount=0;
			for(Object field:aBook) {
				XSSFCell cell=row.createCell(++colCount);
				if(field instanceof String) {
					cell.setCellValue((String)field);
				}
				else if(field instanceof Integer) {
					cell.setCellValue((double)field);
					
				}
			}
			
		}
		
		try {
			FileOutputStream out=new FileOutputStream("javaBook.xlsx");
//			workbook.write(out);
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		
	}
}




