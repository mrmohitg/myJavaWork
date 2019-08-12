package myJava.inputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ExtractZip {
	public static void main(String... args) {
		try {
			ZipFile zipFile = new ZipFile("Test.zip");
			Enumeration<?> enu = zipFile.entries();
			while (enu.hasMoreElements()) {
				ZipEntry zipEntry = (ZipEntry) enu.nextElement();
				String name = zipEntry.getName();
				System.out.println("Name = " + name);
				File file = new File(name);
				InputStream is = zipFile.getInputStream(zipEntry);
				FileOutputStream fos = new FileOutputStream(file);
				byte bytes[] = new byte[1024];
				int length;
				while ((length = is.read(bytes)) >= 0) {
					fos.write(bytes, 0, length);
				}
				is.close();
				fos.close();
			}
			zipFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}