package com.demoaut.tours.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriteUtil {

	HSSFWorkbook workbook;
	HSSFSheet worksheet;
	FileInputStream fis;
	FileOutputStream fos;

	public ExcelWriteUtil(String filePath, String sheetName) {
		try {
			fis = new FileInputStream(filePath);
			workbook = new HSSFWorkbook(fis);
			worksheet = workbook.getSheet(sheetName);
			fos = new FileOutputStream(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void WriteinToExcelString(int rowNo, int colNo, String value) {
		try {

			HSSFRow row = worksheet.getRow(rowNo);
			HSSFCell cell = row.getCell(colNo);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(value);
			workbook.write(fos);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
