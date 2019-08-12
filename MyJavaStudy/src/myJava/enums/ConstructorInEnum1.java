package myJava.enums;

enum userStatus {
	Pending("P"), Active("A"), Inactive("I"), Deleted("D");
	private String status;

	private userStatus(String s) {
		status = s;
	}

	public String getStatus() {
		return status;
	}
}

public class ConstructorInEnum1 {
	public static void main(String... ares) {
		System.out.println(userStatus.Active.getStatus());
	}
}