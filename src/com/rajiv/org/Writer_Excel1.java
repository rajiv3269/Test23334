package com.rajiv.org;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writer_Excel1 {
	static int rowNum=0;
	static int colNum=0;
	static String value;
	public static Row row = null;
	public static Cell cell = null;

	public static void main(String[] args) throws IOException {
		Data data = new Data();
		XSSFWorkbook wb = new XSSFWorkbook();
		data.hm.put("1", "rajiv");
		data.hm.put("2", "sarkar");
		data.hm.put("3", "");
		//data.hm.put("4", "sarkar");
		String detail[] = new String[6];
		FileOutputStream fout = new FileOutputStream("t10.xlsx");
		XSSFSheet ws = wb.createSheet("sample");
		detail = data.display();	
		
		for(int i=0;i<detail.length;i++){
			value = detail[i];
			System.out.println(value);
			if(i%2==0 && i>0){
				colNum = 0;
				rowNum++;	
			}
		      	if(colNum == 0){
			 row = ws.createRow(rowNum);
		      	}
			 cell = row.createCell(colNum);
			 cell.setCellValue(value);
		     colNum = colNum+1;
		}
		wb.write(fout);
		wb.close();
		fout.close();
		System.out.println("success");
	}

}
