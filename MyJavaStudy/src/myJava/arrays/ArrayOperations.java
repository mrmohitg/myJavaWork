package myJava.arrays;

//Array Addition and Maximum element at the array
public class ArrayOperations {
	public static void main(String... args) {
		double[] myList = { 1.9, 2.9, 3.4, 3.5, 9.5, 3.3 };
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);
	}
}
/*
 * Output 1.9 2.9 3.4 3.5 9.5 3.3 Total is 24.5 Max is 9.5
 */