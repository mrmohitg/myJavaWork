package myJava.reflection;

class PackageList {
	public static void main(String... args) {
		Package pkgs[];
		pkgs = Package.getPackages();
		for (int i = 0; i < pkgs.length; i++) {
			System.out.println(pkgs[i].getName());
		}
	}
}