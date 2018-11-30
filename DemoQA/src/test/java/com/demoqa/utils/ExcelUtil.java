package com.demoqa.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil {
	
	
	HSSFWorkbook workbook;
	HSSFSheet worksheet;
	public ExcelUtil(String filePath,String sheetName)
	{
		try
		{
			FileInputStream fis = new  FileInputStream(filePath);
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
		int lastRowNum = worksheet.getLastRowNum();
		return lastRowNum;
	}
	
	public String getCellValue(int rowNo,int colNo)
	{
		HSSFRow row = worksheet.getRow(rowNo);
		HSSFCell cell = row.getCell(colNo);
		return (cell.toString());
		
	}

}
