package day41filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// bit by bit read and write 
public class FileDemo6 {

	public static void main(String[] args) {
		String fileReadPath = "C:/Users/bhatt/Desktop/demo1.txt /";
		String fileWritePath = "C:/Users/bhatt/Desktop/demo3.txt";
		try (FileReader fr = new FileReader(fileReadPath);
				FileWriter fw = new FileWriter(fileWritePath);) {
			int len;
			while ((len = fr.read()) != -1) {// bit ko end of file -1 hunxa 
				System.out.println(len);
				fw.write(len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

