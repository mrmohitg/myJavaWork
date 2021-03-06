package myJava.nestedClasses;

import java.io.*;

class BankAcc {
	private double bal;

	BankAcc(double b) {
		bal = b;
	}

	void contact(double r) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the password:");
		String password = br.readLine();
		if (password.equals("xyz123")) {
			Inner in = new Inner(r);
			in.calculateInterest();
		} else
			System.out.print("\nSorry, You are not a authorised Person");
	}

	private class Inner {
		double rate;

		Inner(double r) {
			rate = r;
		}

		void calculateInterest() {
			double interest = bal * rate / 100;
			bal += interest;
			System.out.print("\nUpdated Balance:" + bal);
		}
	}
}

class InnerClass {
	public static void main(String[] arr) throws IOException {
		BankAcc ba = new BankAcc(10000);
		ba.contact(9.5);
	}
}

/*
 * Output Enter the password:xyz123
 * 
 * Updated Balance:10950.0
 */