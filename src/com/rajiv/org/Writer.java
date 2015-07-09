package com.rajiv.org;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writer {
	public static int rownum,column_num;

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D://Data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet ws  = wb.getSheetAt(0);
		rownum = ws.getLastRowNum()+1;
		System.out.println(rownum);
		column_num = ws.getRow(0).getLastCellNum();
		System.out.println(column_num);
		
		Row row = ws.getRow(rownum);
		Cell cell = row.createCell(column_num);
		cell.setCellType(cell.CELL_TYPE_NUMERIC);
		cell.setCellValue(3269);
		FileOutputStream fout =new FileOutputStream("D://Data.xlsx");
		wb.write(fout);
		fout.close();
		wb.close();
	}

}
