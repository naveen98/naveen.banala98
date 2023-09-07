package datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class excelsheet {


	public static void main(String[] args) throws IOException {
  FileInputStream fis= new FileInputStream("C:\\Users\\navee\\OneDrive\\Documents\\ate.xlsx\\");
  // open the work workbook
Workbook wb= WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
String data=sh.getRow(0).getCell(0).getStringCellValue();

System.out.println(data);
		
		
		
		
	}

}
