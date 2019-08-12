package myJava.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
	int id;
	String name;

	Employee(int i, String n) {
		id = i;
		name = n;
	}

	void getDetails() {
		System.out.println(id + "\t" + name);
	}
}

class ArrayObject {
	public static void main(String args[]) throws IOException {
		Employee arr[] = new Employee[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int a = 0; a < 5; a++) {
			System.out.println("Enter ID");
			int i = Integer.parseInt(br.readLine());
			System.out.println("Enter Name");
			String n = br.readLine();
			arr[a] = new Employee(i, n);
		}
		System.out.println("Inserted Data ");
		for (int a = 0; a < 5; a++) {
			arr[a].getDetails();
		}
	}
}
/*
 * Output Enter ID 01 Enter Name Mohit Enter ID 02 Enter Name Anurag Enter ID 03
 * Enter Name Vipul Enter ID 04 Enter Name Yajas Enter ID 05 Enter Name Nikhil
 * Inserted Data 1 Mohit 2 Anurag 3 Vipul 4 Yajas 5 Nikhil
 */
