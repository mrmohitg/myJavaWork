package myJava.collections;

import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		Date date = new Date();
		String dateinString = date.toString();
		System.out.println(dateinString);
	}

}
