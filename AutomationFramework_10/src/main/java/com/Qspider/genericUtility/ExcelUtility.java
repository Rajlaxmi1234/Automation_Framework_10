package com.Qspider.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author ama
 */
public class ExcelUtility {
	/**
	 * this method will read String data
	 * @param sheentName
	 * @param rowIndex
	 * @param colIndex
	 * @return String value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public String getStringDataFromExcel(String sheentName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/textScriptData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheentName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	
	
}
/**
 * this method will read boolean data
 * @param sheentName
 * @param rowIndex
 * @param colIndex
 * @return boolean value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public boolean getBooleanDataFromExcel(String sheentName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/textScriptData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheentName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
}
/**
 * this method will read number data
 * @param sheentName
 * @param rowIndex
 * @param colIndex
 * @return number value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public double getNumricDataFromExcel(String sheentName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/textScriptData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheentName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
public LocalDateTime getDataDataFromExcel(String sheentName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/textScriptData.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	return workbook.getSheet(sheentName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
}
}
