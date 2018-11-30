package com.mortgaecalculator.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData
{
	
	HSSFWorkbook  workbook;
	HSSFSheet worksheet;
	
	public ExcelData(String filePath,String sheetName) 
	{
		try
		{
			FileInputStream fis = new FileInputStream(filePath);
			workbook = new HSSFWorkbook(fis);
			worksheet = workbook.getSheet(sheetName);
			
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public int getNoOfRows()
	{
		int noOfRows = worksheet.getLastRowNum();
		return noOfRows;
	}
	
	
	public String getCellValue(int rowNo, int colNo)
	{
		
		HSSFRow row = worksheet.getRow(rowNo);
		HSSFCell cell = row.getCell(colNo);
		return (cell.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
