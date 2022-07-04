package day41filedemo;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileDemo4 {
	public static void main(String[] args) {
		String filepath = "C:/Users/bhatt/Desktop/demo1.txt";
		File file = new File(filepath);
		try {
			if (file.createNewFile()) {
				System.out.println("file created ");
			} else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long lastModified = file.lastModified();
		/*Date d = new Date(lastModified);
		System.out.println(d);
		System.out.println("======================");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf.format(d));*/
		
		System.out.println("====== another  short method for date======= ");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a").format(new Date(lastModified)));
		
	}
}
