package day41filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
// create folder
	public static void main(String[] args) {
		String filepath = "C:/Users/bhatt/Desktop/ demo";
		File file = new File(filepath);
		if (file.mkdir()) {
			System.out.println("folder  created ");
		} else {
			System.out.println("folder already exist");
		}
	}
}
