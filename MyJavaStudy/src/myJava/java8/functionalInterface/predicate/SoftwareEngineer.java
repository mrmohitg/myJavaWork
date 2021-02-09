package myJava.java8.functionalInterface.predicate;

public class SoftwareEngineer {
	String name;
	int age;
	boolean isHavingGirlFriend;

	public SoftwareEngineer(String name, int age, boolean isHavingGirlFriend) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGirlFriend = isHavingGirlFriend;
	}

	@Override
	public String toString() {
		return "Engineer " + name + " age " + age + " is having Girl Friend so allowed in pub.";
	}

}
