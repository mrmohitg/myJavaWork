package myJava.garbageCollection;

//Once the garbage collection has been done we can reget the reference id of the object by storing it in the static variable variable.
class GarbageCollection {
	int x = 10;
	int y = 20;
	static GarbageCollection obj;

	protected void finalize() throws Exception {
		obj = this;
		System.out.println(obj);
		System.out.println(obj.y);
		System.out.println(obj.x);
	}

	public static void main(String... s) {
		for (int i = 0; i < 200; i++) {
			new GarbageCollection();
			System.gc();
		}
	}
}
/*
 * Output GarbageCollection@1d787636 20 10 GarbageCollection@13bf8be9 20 10
 * GarbageCollection@17801d46 20 10 GarbageCollection@528281d2 20 10
 * GarbageCollection@c959472 20 10 GarbageCollection@631ab6ca 20 10
 * GarbageCollection@74e7fdc2 20 10 GarbageCollection@32ad7e9d 20 10
 * GarbageCollection@123b4abe 20 10 GarbageCollection@242112d5 20 10
 * GarbageCollection@6fe3f27e 20 10 GarbageCollection@36e32089 20 10
 * GarbageCollection@7ec5e251 20 10 GarbageCollection@525ef0e6 20 10
 * GarbageCollection@22de98d1 20 10 GarbageCollection@d96136b 20
 */