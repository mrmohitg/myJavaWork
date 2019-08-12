package myJava.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)

@interface MyAnno3 {
	String str() default "Testing";

	int val() default 9000;
}

public class Meta3 {

	// Annotate a method using the default values.
	@MyAnno(str = "", val = 0)
	public static void myMeth() {
		Meta3 ob = new Meta3();

		// Obtain the annotation for this method
		// and display the values of the members.
		try {
			Class<? extends Meta3> c = ob.getClass();

			Method m = c.getMethod("myMeth");

			MyAnno anno = m.getAnnotation(MyAnno.class);

			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth();
	}
}
