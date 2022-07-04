package day41filedemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// line by line  read and write 
public class FileDemo7 {
	public static void main(String[] args) {
		String fileReadPath = "C:/Users/bhatt/Desktop/demo1.txt /";
		String fileWritePath = "C:/Users/bhatt/Desktop/demo4.txt";
		try (FileReader fr = new FileReader(fileReadPath);
				BufferedReader br= new BufferedReader(fr);// this helps to raed line by line 
				FileWriter fw = new FileWriter(fileWritePath);
				BufferedWriter bw= new BufferedWriter(fw)// this helps to write line by line 
				) {
			String  line;
			while ((line = br.readLine()) != null) { //  stringma lineko end of file null hunxa 
				System.out.println(line);
				bw.write(line);// yo method lae auta line ma matra write garxa so we use nextLine 
				bw.newLine();// new line lina ko lagi yo method use hunxa natra vayae autai line ma auxa 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
}



