package myJava.internationalization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocale {

	public static void main(String[] args) {
		Locale l = new Locale("hi", "IN");
		//Locale l = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("ResourceBundle",l);
		System.out.println(Locale.getDefault().toString());
		Enumeration<?> e = rb.getKeys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = rb.getString(key);
			System.out.println(key +" = "+ value);
		}
	}

}
