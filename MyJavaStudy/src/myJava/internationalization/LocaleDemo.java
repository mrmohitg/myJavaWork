package myJava.internationalization;

import java.text.DateFormat;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale []list = DateFormat.getAvailableLocales();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
		}
	}

}
