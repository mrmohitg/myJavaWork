package myJava.java8.functionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierOTP {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				int x = (int) (Math.random() * 10);
				otp = otp + x;
			}
			return otp;
		};

		System.out.println("New generated OTP is " + s.get());
	}

}
