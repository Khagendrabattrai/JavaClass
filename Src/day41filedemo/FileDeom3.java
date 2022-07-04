package day41filedemo;

import java.io.File;

public class FileDeom3 {
	public static void main(String[] args) {
		String filepath = "C:/Users/bhatt/Desktop/demo1.txt";
		File file = new File(filepath);
       System.out.println(file.getName());
       System.out.println(file.getPath());
       System.out.println(file.exists());
      
       
       System.out.println("=======================");
       System.out.println(file.canRead());
      // file.setWritable(false);// this method  don't allow to write 
       System.out.println(file.canWrite());
       System.out.println(file.canExecute());
       
       System.out.println("====================");
       System.out.println(file.isDirectory());
       System.out.println(file.isFile());
       System.out.println(file.isHidden());
       
       System.out.println("===================");
       System.out.println(file.getFreeSpace());
       System.out.println(file.getUsableSpace());
       System.out.println(file.getTotalSpace());
       
       System.out.println("=======================");
        filepath= "C:/Users/bhatt/Desktop/demo/demo3.txt";
        File file2=new File(filepath);
        file.renameTo(file2);
        System.out.println("file renamed and moved to folder demo ");
       
       System.out.println("=====================");
       //file2.delete();
	}

}
