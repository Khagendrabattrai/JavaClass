package day31expectiondemo;

import java.io.FileInputStream;
import java.util.Scanner;

public class ExpectionDemo1 {

	public static void main(String[] args) {
		/* EXAMPLE OF rumTimeException(unchecked exception*/
		
		// Below code gives ArrayIndexOutOfBoundsException.
		// Why is ArrayIndexOutOfBoundsException is RuntimeExpection
		//1.ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException.
		//2. IndexOutOfBoundsException extends RuntimeExpection.
		//3. RuntimeExpection extends Exception
	
		 int[] arr = new int[] { 3, 5, 6, 7 };
		// arr[4] = 8;
		 for (int i = 0; i <= arr.length; i++) {// yaha loop chalauda garda 4th ko element
		                             // pani khojxa but we ....
		 //System.out.println(arr[4]);// dont have ....
		                           // Index 4 out of bounds for length 4 so it gives exception

System.out.println("===========");
		// Below code gives RuntimeExpection(ArithmeticExpection)
		// why is ArithmeticExpection is RuntimeExpection
		// 1. ArithmeticException extends RuntimeException // div 5 by 0;
		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = input.nextInt();
		System.out.println("Enter b");
		int b = input.nextInt();
		int div = a / b;
		System.out.println("The div is" + div);
		System.out.println("========");
		
		
		
		// The below code give input mismatchExpection if we input wrong input like
		// string on here.
		System.out.println("Enter a:");
		int c = input.nextInt();
		System.out.println("Enter b");
		int d = input.nextInt();
		int division = c / d;
		System.out.println("The div is" + division);
		
		System.out.println("====================");
		// This code gives StringIndexOutOfBoundsException.
		String s1=""; // here we don't have second index  so it gives StringIndexOutOfBoundsException
		char s= s1.charAt(2);// to take second index 
		System.out.println(s1);
		
		System.out.println("======================");
		// Below Code gives NullPointerException
		String s2= null;
		System.out.println(s2.toUpperCase());
		
		System.out.println( "====================");
		/* Example of compileTimeExpection(Checked exception/)*/
		// This error has to be always handeled by the programmer
		// If programmer doesnt want to handeled the programmer has to write throws
		
		//FileInputStream fis=new FileInputStream("");*/
		
		System.out.println("=================");
		// This code gives NumberFormatException 
		// why??   because 
		String a1="25q"; // try by taking just number only one time it gives output.
		int nn=Integer.parseInt(a1);// Integer.parseInt() is a library class which take int and give .... 
		System.out.println(nn);    //output int  but asma number(int) ra string pass ....
                                   // garyo vanae expection dinxa 
		
		System.out.println("================");
		// Keyword to handle expection
		// try =>block=>{}
		//catch => block=>{}
		//finally=>block=>{}
		// throw =>clause (jodnnae)
		// throws=>statement
	   }
	}
}
	
	
