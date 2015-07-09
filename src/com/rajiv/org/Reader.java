package com.rajiv.org;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader {

	public static void main(String[] args) throws IOException {
		
		    
		String path="D://Data.xlsx";
		FileInputStream fin = new FileInputStream(path); 
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet ws=wb.getSheetAt(0);
		
		int rownum = ws.getLastRowNum()+1;
		//System.out.println(row);
		int columnum = ws.getRow(0).getLastCellNum();
		//System.out.println(column);
		 String data[][]= new String[rownum][columnum];
		 wb.close();
		 
		 for(int i=0;i<rownum;i++){
			 XSSFRow row = ws.getRow(i);
			 
			  for(int j=0;j<columnum;j++){
				  XSSFCell cell = row.getCell(j);
				  String value = cell.toString();
				  System.out.println(value);
				  data[i][j] = value;	 
			 }
		 }	
	}

}
