package data_drivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data_in_excel_file {

	public static void main(String[] args) throws Exception {

		// create object of FileInputStram class

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\vaibh\\OneDrive\\Desktop\\Automation_excelfile_for data_drivenTesting.xlsx");

		// go inside workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// go inside the sheet
		XSSFSheet sheet = workbook.getSheet("Login_01");

		// go inside the row which index is 1
		// XSSFRow row = sheet.getRow(1);

		// go inside the row which index is 2
		XSSFRow row = sheet.getRow(2);

		// go inside the cell which index is 3
		// XSSFCell cell = row.getCell(3);

		// go inside the cell which index is 1
		XSSFCell cell = row.getCell(0);

		// to write the data in cell
		// cell.setCellValue("Mumbai"); // setCellvalue() is used to set data in string format
		
		//write data in cell 
		cell.setCellValueImpl(2); // this method accept value in double data type foramt
		 

		// to write data in excel file create object of FileOutputStream class

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\vaibh\\OneDrive\\Desktop\\Automation_excelfile_for data_drivenTesting.xlsx");

		// to write data workbook reference variable is responsible
		workbook.write(fos);

		// to close workbook --> workbook reference variable is responsible
		workbook.close();

		// to close excel file --> fis reference variable is responsible
		fis.close();

	}

}
