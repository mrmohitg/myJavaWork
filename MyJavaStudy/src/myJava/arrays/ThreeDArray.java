package myJava.arrays;

//Three Dimensional Array
public class ThreeDArray {
	public static void main(String args[]) {
		int dept, student, marks, tot = 0;
		int arr[][][] = { { { 51, 61, 71 }, { 61, 62, 63 } }, { { 73, 63, 53 }, { 81, 84, 86 } },
				{ { 65, 66, 67 }, { 76, 77, 78 } } };
		for (dept = 0; dept < 3; dept++) {
			System.out.println("Department " + (dept + 1) + " : ");
			for (student = 0; student < 2; student++) {
				System.out.print("Student " + (student + 1) + " marks : ");
				for (marks = 0; marks < 3; marks++) {
					System.out.print(arr[dept][student][marks] + " ");
					tot += arr[dept][student][marks];
				}
				System.out.println("Total : " + tot);
				tot = 0;
			}
			System.out.println();
		}
	}
}
/*
 * Output Department 1 : Student 1 marks : 51 61 71 Total : 183 Student 2 marks
 * : 61 62 63 Total : 186
 * 
 * Department 2 : Student 1 marks : 73 63 53 Total : 189 Student 2 marks : 81 84
 * 86 Total : 251
 * 
 * Department 3 : Student 1 marks : 65 66 67 Total : 198 Student 2 marks : 76 77
 * 78 Total : 231
 */