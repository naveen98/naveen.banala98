package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class numericdata {

	public static void main(String[] args) throws Throwable {
		
     FileInputStream fis= new FileInputStream("C:\\Users\\navee\\OneDrive\\Documents\\numeric.xlsx\\");
     Workbook w=WorkbookFactory.create(fis);
     double data= w.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
     System.out.println(data);
     
     
	}

}
