package data_drivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data_from_excel_by_column_number {

	public static void main(String[] args) throws Exception {

		// when you use excel file in maual testing you go like this

		// file --> workbook --> sheet --> row --> column

		// by using this way we can fetch data from excel file in automation

		// create object of FileInputStream class --> for select excel file

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\vaibh\\OneDrive\\Desktop\\Automation_excelfile_for data_drivenTesting.xlsx");

		// go to the workbook --> create object of XSSFWorkbook class

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// go to the sheet

		XSSFSheet sheet = workbook.getSheet("Login_01");

		// go to the row which index is 1
		XSSFRow row = sheet.getRow(1);

		// go the the cell which index is 1
		XSSFCell cell_001 = row.getCell(1);

		// go to the cell which index is 2
		XSSFCell cell_002 = row.getCell(2);

		// to get data from cell
		// String cellvalue_001 = cell.getStringCellValue();

		// System.out.println(cellvalue_01);

		// or we can use to string method to get data from cell --> it is used to store
		// numeric plus alphabetical value
		String cellvalue_001 = cell_001.toString();
		String cell_value_002 = cell_002.toString();

		// to print data in console
		System.out.println(cellvalue_001);
		System.out.println(cell_value_002);

		// for row count from sheet
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row count is: " + rowcount);

		// for column count from sheet
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count is: " + columncount);

		// fetch data to web application

		// launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// navigate url
		driver.get("https://www.facebook.com/");

		// locate element email and send data in it
		driver.findElement(By.id("email")).sendKeys(cellvalue_001);

		// locate element email and send data in it
		driver.findElement(By.id("pass")).sendKeys(cell_value_002);

		// to close workbook --> workbook reference variable is responsible
		workbook.close();

		// to close excel file --> fis reference variable is responsible
		fis.close();

	}

}
