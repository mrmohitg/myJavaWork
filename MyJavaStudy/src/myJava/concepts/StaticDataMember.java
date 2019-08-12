package myJava.concepts;

//Static data member is used for the re usability and it represent the properties of the class.
class StaticDataMember {
	String name;
	int salary;
	static String company = "TCS";

	void set(String s1, int i) {
		name = s1;
		salary = i;
	}

	void get() {
		System.out.println(name + " " + salary + " " + company);
	}

	public static void main(String args[]) {
		StaticDataMember obj = new StaticDataMember();
		obj.set("Mohit", 30000);
		obj.get();
		StaticDataMember obj2 = new StaticDataMember();
		obj2.set("Anurag", 40000);
		obj2.get();
	}
}
/*
 * output Mohit 30000 TCS Anurag 40000 TCS
 */