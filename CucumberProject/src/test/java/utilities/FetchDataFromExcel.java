package utilities;

import java.io.FileInputStream;
import ConstantsData.ConstantsData;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromExcel 
{
	public static String getDataFromExcel(int x,int y) throws IOException
	{
		
	FileInputStream fis=new FileInputStream(ConstantsData.excelPath);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	XSSFCell cell=sheet.getRow(x).getCell(y);
	String value=cell.toString();
	System.out.println(value);
	return value;
	

	
	
	}
}
