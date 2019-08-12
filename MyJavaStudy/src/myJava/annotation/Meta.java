package myJava.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();

	int val();
}

public class Meta {
	// Annotate a method
	@MyAnno(str = "Annotation Example", val = 100)
	public static void myMeth() {
		Meta ob = new Meta();
		try {
			Class<? extends Meta> c = ob.getClass();
			// Now get a method object that represents this method
			Method m = c.getMethod("myMeth");
			// Next get the annotation for this class.
			MyAnno anno = m.getAnnotation(MyAnno.class);
			// Finally display the value
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException e) {
			System.out.println("Method not found.");
		}
	}

	public static void main(String... args) {
		myMeth();
	}
}