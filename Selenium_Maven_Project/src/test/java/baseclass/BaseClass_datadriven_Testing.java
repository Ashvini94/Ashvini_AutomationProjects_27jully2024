package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass_datadriven_Testing {

	
	// dynamic code to fetch the data from excel file
	public static String get_data_from_excel_by_column_number(String filepath,String sheetname,int rownumber,int cellnumber) throws Exception
	{
		
		
		FileInputStream fis =new FileInputStream (filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		 XSSFRow row = sheet.getRow(rownumber);
		 XSSFCell cell = row.getCell(cellnumber);
		 String cellvalue_001 = cell.toString();
		 return cellvalue_001;
	}
	
	//dynamic code to write data in excel file
	public static void write_data_in_excel_file(String filepath,String sheetname,int rownumber,int cellnumber,String passdata) throws Exception
	{
		
		
		FileInputStream fis =new FileInputStream (filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		 XSSFRow row = sheet.getRow(rownumber);
		 XSSFCell cell = row.getCell(cellnumber);
		 cell.setCellValue(passdata);
		 FileOutputStream fos = new FileOutputStream(filepath);
		 workbook.write(fos);
		 workbook.close();
		 fis.close();
	}
	
	
}
