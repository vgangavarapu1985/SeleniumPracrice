package com.demoaut.tours.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadUtil {

	HSSFWorkbook workbook;
	HSSFSheet workSheet;

	public ExcelReadUtil(String filePath, String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			workbook = new HSSFWorkbook(fis);
			workSheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int getNoOfTotalRows() {
		int totalRows = workSheet.getLastRowNum();
		return totalRows;

	}

	public String getCellValue(int row, int col) {
		HSSFRow rowValue = workSheet.getRow(row);
		HSSFCell cellValue = rowValue.getCell(col);
		return (cellValue.toString());

	}
	


}
