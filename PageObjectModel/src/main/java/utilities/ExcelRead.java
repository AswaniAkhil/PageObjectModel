package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	public void readData()
	{
		try
		{
			
		String path="\"C:\\Users\\Aswani\\Documents\\ExcelRead.xlsx\"";
				File src = new File(path);
		FileInputStream fi = new FileInputStream(src);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet("ExcelRead");
		switch (cell.getCellType()) {
		case STRING: {
			String x;
			x = cell.getStringCellValue();
			System.out.println(x);
			break;
		}
		case NUMERIC: {
			long d = (long) cell.getNumericCellValue();
			System.out.println(d);
			break;
		}

		default:
		System.out.println("null");;

		}}
		catch (Exception e){
			System.out.println("file not found");
			e.printStackTrace();
		}
	}

}
