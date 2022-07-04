package day41filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
//create file
	public static void main(String[] args) {
		String filepath="C:/Users/bhatt/Desktop/demo2.txt";
		File file = new File(filepath);
		try {
			if (file.createNewFile()) {
			System.out.println("file created ");			
			}else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
