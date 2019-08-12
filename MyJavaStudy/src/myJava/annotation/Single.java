package myJava.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value(); // This variable name must be value.
}

public class Single {
	// Annotate a method using a marker.
	@MySingle(100)
	public static void myMeth() {
		Single ob = new Single();
		try {
			Method m = ob.getClass().getMethod("myMeth");
			MySingle anno = m.getAnnotation(MySingle.class);
			int x = anno.value(); // Displays 100
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Method not found.");
		}
	}

	public static void main(String... args) {
		myMeth();
	}
}