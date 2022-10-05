package com.classicfreecrm.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PourTester {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File fs=new File(".\\data\\dataSheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Feuil1");
		
		int Rows=sheet.getPhysicalNumberOfRows();
		int Columns=sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[Rows-1][Columns];
		
		for(int i=0; i<Rows-1;i++) {
			for(int j=0;j<Columns;j++) {
				
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
			
		}	
	}

	
	
	

}
