package myJava.thisKeyword;

//'this' keyword in action
class ThisKeyword {
	ThisKeyword() {
		System.out.println(this + " by this keyword.");
	}

	public static void main(String s[]) {
		ThisKeyword obj = new ThisKeyword();
		System.out.println(obj + " by object.");
		System.out.println(obj.toString() + " by toString() method.");
		System.out.println(obj.hashCode() + " by hashCode() method.");
	}
}
/*
 * Output ThisKeyword@2a139a55 by this keyword. ThisKeyword@2a139a55 by object.
 * ThisKeyword@2a139a55 by toString() method. 705927765 by hashCode() method.
 */