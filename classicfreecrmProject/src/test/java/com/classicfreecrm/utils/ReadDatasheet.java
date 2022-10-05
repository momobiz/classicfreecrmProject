package com.classicfreecrm.utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatasheet {
	
	public static String[][] data() throws InvalidFormatException, IOException{
		File fs=new File(".\\data\\datasheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Feui1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[rows-1][columns];
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		wb.close();

		return data;
	}

}
