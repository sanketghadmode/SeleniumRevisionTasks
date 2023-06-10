package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
	public static void main(String[] args) throws IOException {
		
	
	  String path = "G:\\Eclips_2023\\JustPPractic\\data\\MyExcelFile.xlsx";
		
	  File file = new File(path);
	  FileInputStream f  = new FileInputStream(file);
	  
	  XSSFWorkbook wb = new XSSFWorkbook(f);
	  
	  XSSFSheet sheet = wb.getSheet("Sheet0");
	  
	   DataFormatter df = new DataFormatter();
	   
	   for(int i = 0;i<7;i++)
	   {
	   
		   for(int  j=0 ; j<=1;j++)
		   {
		   String value = df.formatCellValue(sheet.getRow(i).getCell(j));
	  
		   System.out.print(value+" ");
		   }
		   
		   System.out.println(" ");
	   }
	  
	}
	
}
