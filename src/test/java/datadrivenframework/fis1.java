package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fis1 {

	public static void main(String[] args) throws IOException {
 FileInputStream fis=new FileInputStream("E:\\firefox.properties");
 Properties p= new Properties();
 p.load(fis);
 String user=p.getProperty("un");
 System.out.println(user);
 
 
	}

}
