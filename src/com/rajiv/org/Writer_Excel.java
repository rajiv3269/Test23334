package com.rajiv.org;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writer_Excel {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("tes.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("spred sheet");
		Row row = ws.createRow(0);
		Cell cell = row.createCell(0);
	     cell.setCellValue("ktduyffug");
	     wb.write(fout);
	     System.out.println("files writtem");
	     wb.close();
	     fout.close();
	     
		
	}

}
