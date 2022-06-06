package day23arraydemo;

import java.util.Scanner;

public class ArrayDemo2 {
// second way
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] arr=new int [3];
		// loop to take input
		for (int i=0; i<arr.length;i++) {
			System.out.println("Enter element");
			
			arr[i]= input.nextInt();// confusion on here
			// System.out.println(arr[i]); // yehai nera pani print garna sakinxa kehai problem xaina.
		}
		
		//System.out.println(arr[0]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		// yo mathi ko garnu ko satho hamile loop pani use garna sakxau.....
		// loop to print output(element of an array)
		for (int i =0; i<3;i++) {
			System.out.println(arr[i]);}
			input.close();
		
	}

}
