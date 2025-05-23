package myJava.initBlock;

//Init Block with Constructor Chaining, init block will not execute with every constructor executing but it will execute with a new object.
class InitBlockInConsChaining {
	InitBlockInConsChaining() {
		this(1);
		System.out.println("Constructor1");
	}

	InitBlockInConsChaining(int x) {
		this(1, 2);
		System.out.println("Constructor2");
	}

	InitBlockInConsChaining(int x, int y) {
		System.out.println("Constructor3");
	}

	{
		System.out.println("Init1");
	}
	{
		System.out.println("Init2");
	}

	public static void main(String[] args) {
		InitBlockInConsChaining obj = new InitBlockInConsChaining();
		System.out.println("Main Function");
		new InitBlockInConsChaining(10);
	}

	{
		System.out.println("Init3");
	}
}
/*
 * Output Init1 Init2 Init3 Constructor3 Constructor2 Constructor1 Main Functio
 * Init1 Init2 Init3 Constructor3 Constructor2
 */