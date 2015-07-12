package com.rajiv.excelreadwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_write {
	public static int rowNum,colNum,rowNum1,colNum1;
	 public static String value;
	 static Row row1 = null;
	 Cell cell1 = null;

	public static void main(String[] args) throws IOException {
		
		String path = "D://Data.xlsx";
		FileInputStream fin = new FileInputStream(path);
		FileOutputStream fout = new FileOutputStream("copy1.xlsx");
		XSSFWorkbook wb1 = new XSSFWorkbook();
		XSSFSheet ws1 = wb1.createSheet("rajiv");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheetAt(0);
		rowNum = ws.getLastRowNum()+1;
		//System.out.println(rowNum);
		colNum = ws.getRow(0).getLastCellNum();
		//System.out.println(colNum);
		
		for(int i=0;i<rowNum;i++){
			XSSFRow row = ws.getRow(i);
			for(int j=0;j<colNum;j++){
				XSSFCell cell = row.getCell(j);
				value = cell.toString();
				//System.out.println(value);
			
				if(j==0){
				 row1 = ws1.createRow(i);
				}
				Cell cell1 = row1.createCell(j);
				cell1.setCellValue(value);
				
			}
			
		}
		
		wb1.write(fout);
		wb1.close();
		wb.close();
		
		System.out.println("success");
		
		

	}

}
