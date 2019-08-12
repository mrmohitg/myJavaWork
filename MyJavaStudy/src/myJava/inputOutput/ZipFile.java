package myJava.inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
	public static void main(String... args) {
		try {
			FileOutputStream fos = new FileOutputStream("Test.zip");
			ZipOutputStream zos = new ZipOutputStream(fos);
			String file1Name = "abc.txt";
			String file2Name = "def.txt";
			String file3Name = "ijk.txt";
			String file4Name = "lmn.txt";
			addToZipFile(file1Name, zos);
			addToZipFile(file2Name, zos);
			addToZipFile(file3Name, zos);
			addToZipFile(file4Name, zos);
			zos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addToZipFile(String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {
		System.out.println("Writing " + fileName + " toZipfile");
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}
		zos.closeEntry();
		fis.close();
	}
}