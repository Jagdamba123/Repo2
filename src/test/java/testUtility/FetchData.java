package testUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {
	public static String fetchDataFromExcel(int row,int column) throws EncryptedDocumentException, IOException
	 {
	 String data="";
	 String path="src\\test\\resources\\ExcelFile\\admin.xlsx";
	 FileInputStream file= new FileInputStream(path);
	
	 Sheet s=WorkbookFactory.create(file).getSheet("Sheet1");
	 Cell c=s.getRow(row).getCell(column);
	
	 CellType type= c.getCellType();
	 if (type==CellType.STRING)
	 {
	 data=c.getStringCellValue();
	 }
	 else if (type==CellType.NUMERIC)
	 {
	 double data1=c.getNumericCellValue();
	 data=Double.toString(data1);
	 }
	 else if (type==CellType.BLANK)
	 {
	 data="";
	 }
	
	 return data;
}}
