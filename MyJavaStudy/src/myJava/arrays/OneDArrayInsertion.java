package myJava.arrays;

//Total marks and pecentage
import java.io.*;

public class OneDArrayInsertion {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many subjects?");
		int n = Integer.parseInt(br.readLine());
		int marks[] = new int[n];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks: ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		int tot = 0;
		for (int i = 0; i < n; i++)
			tot += marks[i];
		System.out.println("Total Marks = " + tot);
		float percentage = (float) tot / n;
		System.out.println("Percentage = " + percentage);
	}
}
/*
 * Output How many subjects? 2 Enter the marks: 23 Enter the marks: 34 Total
 * Marks = 57 Percentage = 28.5
 */