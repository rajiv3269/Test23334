package com.rajiv.org;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reader_Excel1 {

	public static void main(String[] args) throws IOException {
		
		String path = "D://Data.xlsx";
		FileInputStream fin =new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet ws = wb.getSheetAt(0);
		Iterator<Row> row_iterator = ws.iterator();
		    while(row_iterator.hasNext()){
		    Row row = row_iterator.next();
		    Iterator<Cell> column_iterator = row.iterator();
		    while(column_iterator.hasNext()){
		    	Cell cell = column_iterator.next();
		    	
		    	switch(cell.getCellType()){
		    	case (Cell.CELL_TYPE_NUMERIC):
		    		System.out.print(cell.getNumericCellValue()+ "\t\t");
		    	break;
		    	
		    	case(Cell.CELL_TYPE_STRING):
		    		System.out.print(cell.getStringCellValue()+ "\t\t");
		    		break;
		    	
		    	}
		    	
		    }
		    System.out.println("");
		    	
		    }
		fin.close();
		wb.close();

	}

}
