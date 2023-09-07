package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       FileInputStream fis=new FileInputStream("C:\\Users\\navee\\eclipse-workspaceselenium1\\naveen\\src\\test\\resources\\ate.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("Sheet2").getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
