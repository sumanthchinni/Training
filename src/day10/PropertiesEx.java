package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesEx {

	public static Properties addProperties() {
		Properties prop=new Properties();
		prop.setProperty("Name", "abcd");
		prop.setProperty("Passw", "abcd@1234");;
		return prop;		
	}
	public static void saveProperties(Properties properties,String filename) {
		OutputStream propfile=null;
		try {
			propfile=new FileOutputStream(filename);
			properties.store(propfile, filename);
		}
		catch(IOException e){
			e.fillInStackTrace();
		}
		finally {
			try {
				if(propfile!=null) {
					propfile.close();
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String PROPERTIES_FILE="PropFile1.properties";
		Properties propties;
		propties=addProperties();
		saveProperties(propties,PROPERTIES_FILE);

	}

}
