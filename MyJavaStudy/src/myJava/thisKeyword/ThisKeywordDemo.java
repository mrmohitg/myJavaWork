package myJava.thisKeyword;

//Data Shadowing concept in action
class ThisKeywordDemo {
	int x = 100;

	void show(int x) {
		System.out.println("This is local variable x : " + x);
		System.out.println("This is class level variable x : " + this.x);
		System.out.println("This is this keyword output : " + this);
	}

	public static void main(String... s) {
		ThisKeywordDemo obj = new ThisKeywordDemo();
		obj.show(10);
		System.out.println("This is reference variable of in main function : " + obj);
	}
}
/*
 * Output This is local variable x : 10 This is class level variable x : 100
 * This is this keyword output : ThisKeywordDemo@2a139a55 This is reference
 * variable of in main function : ThisKeywordDemo@2a139a55
 */