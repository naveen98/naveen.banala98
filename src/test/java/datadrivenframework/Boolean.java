package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\navee\\OneDrive\\Documents\\numeric.xlsx\\");
		Workbook wb = WorkbookFactory.create(fis);
		boolean data = wb.getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(data);

	}

}
