package myJava.inputOutput;

import java.io.File;
import java.io.IOException;

class FileDemo {
	public static void main(String args[]) throws IOException {
		File f = new File(args[0]);
		boolean b = f.exists();
		if (b == true) {
			System.out.println("Exist");
			String path = f.getPath();
			String name = f.getName();
			long size = f.length();
			System.out.println("Path = " + path + "\nName = " + name + "\nSize = " + size);
			boolean bb = f.isFile();
			if (bb == true) {
				System.out.println("It is a file.");
				// f.delete();
			}
			boolean bb1 = f.isDirectory();
			if (bb1 == true) {
				System.out.println("This is a folder.");
				String[] list = f.list();
				for (int i = 0; i < list.length; i++)
					System.out.println(list[i]);
			}
		} else {
			System.out.println("Folder does not exist");
			f.mkdir();
		}
	}
}
