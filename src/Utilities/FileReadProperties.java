package Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class FileReadProperties {

	Properties prop = new Properties(); // Property Class to write ,read,store file
	InputStream input= null;//this is output stream
	public String getValue(String name)
	{

		try {
			input= new FileInputStream("config.properties");

			//prop.setProperty("name", "deep");
			//prop.setProperty("password", "kolkata");

			prop.load(input);
			//prop.getProperty(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(name);
	}

	public String getValue(String name,File filename)
	{

		try {
			input= new FileInputStream(filename);

			//prop.setProperty("name", "deep");
			//prop.setProperty("password", "kolkata");

			prop.load(input);
			//prop.getProperty(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(name);
	}



}

