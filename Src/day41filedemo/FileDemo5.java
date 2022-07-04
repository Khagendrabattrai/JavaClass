package day41filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo5 {
// read and write file on java
	public static void main(String[] args) {
		String fileReadPath = "C:/Users/bhatt/Desktop/demo1.txt /";
		String fileWritePath = "C:/Users/bhatt/Desktop/demo2.txt";
		// FileInputStream readko lagi use hunxa
		try (FileInputStream fis = new FileInputStream(fileReadPath);
				FileOutputStream fos = new FileOutputStream(fileWritePath);) {
			int len;
			while ((len = fis.read()) != -1) {// read method lae yo folder(JavaQuestion.docx) jabasamma somethig data
												// hunxa...
				// taba samma aslae int value return garaera dinxa and java end of file hunxa
				// teslae -1 dinxa.
				// som mathi ko while loop ma jaba samma -1 audaina taba samma while loop
				// chalirahanxa.
				System.out.println(len);
				fos.write(len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
