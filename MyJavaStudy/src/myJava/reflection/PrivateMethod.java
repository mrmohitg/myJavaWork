package myJava.reflection;

import java.lang.reflect.Method;

public class PrivateMethod {
	public static void main(String... args) throws Exception {
		GetMethod obj = new GetMethod();
		Class<? extends GetMethod> c = obj.getClass();
		// Method method = c.getMethod("divide",new class[]{int.class,int.class});
		Method method = c.getDeclaredMethod("divide", int.class, int.class);
		method.setAccessible(true);
		System.out.println("Method Name : " + method.getName());
		double result = (double) method.invoke(obj, 10, 5);
		System.out.println(result);
	}
}

class GetMethod {
	private double divide(int num1, int num2) {
		return num1 / num2;
	}
}