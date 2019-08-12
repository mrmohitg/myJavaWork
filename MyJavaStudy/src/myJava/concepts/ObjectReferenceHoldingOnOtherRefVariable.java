package myJava.concepts;

//ReferenceId of the object can be hold to the number of Reference Variable 
public class ObjectReferenceHoldingOnOtherRefVariable {
	int x;

	public ObjectReferenceHoldingOnOtherRefVariable(int a) {
		x = a;
	}

	public static void main(String args[]) {
		ObjectReferenceHoldingOnOtherRefVariable s = new ObjectReferenceHoldingOnOtherRefVariable(10);
		ObjectReferenceHoldingOnOtherRefVariable obj = s;
		System.out.println(s);
		System.out.println(s.x);
		System.out.println(obj);
		System.out.println(obj.x);
		obj.x = 20;
		System.out.println("If we do this statement (obj.x=20;) and try to print (s.x) then result will be.");
		System.out.println(s.x);
	}
}
/*
 * Output ObjectReferenceHoldingOnOtherRefVariable@2a139a55 10
 * ObjectReferenceHoldingOnOtherRefVariable@2a139a55 10 If we do this statement
 * (obj.x=20;) and try to print (s.x) then result will be. 20
 */
