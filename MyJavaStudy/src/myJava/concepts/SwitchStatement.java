package myJava.concepts;

//To display a color name depending on color value
import java.io.*;

public class SwitchStatement {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the colour name which you want to apply to your walls.");
		String color = br.readLine();
		switch (color) {
		case "red":
			System.out.println("Red");
			break;
		case "green":
			System.out.println("Green");
			break;
		case "blue":
			System.out.println("Blue");
			break;
		default:
			System.out.println("Wrong Entry.");
		}
	}
}
/*
 * Output Enter the colour name which you want to apply to your walls. red Red
 */