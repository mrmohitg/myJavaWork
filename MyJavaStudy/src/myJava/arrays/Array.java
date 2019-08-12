package myJava.arrays;

//To read and display a 1D array.
public class Array {
	public static void main(String args[]) {
		int arr[] = { 50, 60, 55, 67, 70 };
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("This is the class name of the array which have been created at the backend "
				+ arr.getClass().getName());
	}
}
/*
 * Output 50 60 55 67 70 This is the class name of the array which have been
 * created at the backend [I
 */