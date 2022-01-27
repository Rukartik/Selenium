
package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author kartik
 *
 */

public class ExcelLib {

	static String excelPath = "./textResources/ExcelFile/testDataOfExcelLib.xlsx";

	/**
	 * This method is used to read string data from an excel file
	 * 
	 * @param sheetName provide the sheet name where you have stored the test data
	 *                  (here in ex: sheetName = demo1)
	 * @param rowNum    provide the row number where you have test data of string
	 *                  value
	 * @param cellNum   provide the cell number where you have test data of string
	 *                  value
	 * @return sheetName, rowName and cellName
	 */
	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;

		File absPath = new File(excelPath);
		try {
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();

	}

	/***
	 * This method is used to read boolean data from the excel file
	 * 
	 * @param sheetName provide the sheet name where you have stored the test data
	 * @param rowNum    provide the row number where you have test data of boolean
	 *                  value
	 * @param cellNum   provide the cell number where you have test data of boolean
	 *                  value
	 * @return sheetName, rowName and cellName
	 */
	public static boolean readBoleanData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		File absPath = new File(excelPath);

		try {
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}

	/***
	 * This method is used to read numeric data from the excel file
	 * 
	 * @param sheetName provide the sheet name where you have stored the test data
	 * @param rowNum    provide the row number where you have test data of numeric
	 *                  value
	 * @param cellNum   provide the cell number where you have test data of numeric
	 *                  value
	 * @return sheetName, rowName and cellName
	 */
	public static double readNumericData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		File absPath = new File(excelPath);

		try {
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}

	/***
	 * This method is used to read LocalDateTime data from the excel file
	 * 
	 * @param sheetName provide the sheet name where you have stored the test data
	 * @param rowNum    provide the row number where you have test data of
	 *                  LocalDateTime value
	 * @param cellNum   provide the cell number where you have test data of
	 *                  LocalDateTime value
	 * @return sheetName, rowName and cellName
	 */
	public static LocalDateTime readLocalDateTimeData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null;
		File absPath = new File(excelPath);

		try {
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();

	}

	/*
	 * public static String readAllData(String sheetName, int rowNum, int cellNum) {
	 * Workbook workbook = null; File absPath = new File(excelPath);
	 * 
	 * 
	 * 
	 * }
	 */

}
