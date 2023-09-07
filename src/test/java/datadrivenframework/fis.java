package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("E:\\unadmin.properties");
		Properties p=new Properties();
		p.load(fis);
		String user=p.getProperty("browser");
		System.out.println(user);
		
	}

}
