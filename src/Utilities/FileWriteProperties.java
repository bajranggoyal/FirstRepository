package Utilities;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class FileWriteProperties {
	Properties prop = new Properties(); // Property Class to write ,read,store file
	OutputStream output= null;//this is output stream



	public void filewrite(String fname, String lname,String Username,String Password)
	{

		try {
			output= new FileOutputStream("config.properties");
			prop.setProperty("firstname", fname);
			prop.setProperty("lastname", lname);
			prop.setProperty("UserName", Username);
			prop.setProperty("password", Password);
			prop.store(output, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}