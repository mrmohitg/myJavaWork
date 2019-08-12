package myJava.collections;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClass {

	public static void loadProperties()
	{
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		try
		{
			fileInputStream = new FileInputStream("application.properties");
			properties.load(fileInputStream);
			
			Enumeration<?> names = properties.propertyNames();
			while (names.hasMoreElements()) {
				String key = (String) names.nextElement();
				String value = 	properties.getProperty(key);
				System.out.println(key + " = " + value);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		loadProperties();
	}

}
