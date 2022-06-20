package day32expectiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;
// Multiple catch 
public class ExpectionDemo6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter number1:");
			int a = input.nextInt();
			System.out.println("Enter number2:");
			int b = input.nextInt();
			int result= division(a,b);
			System.out.println("Division is :"+ result);
			
		} catch (ArithmeticException |InputMismatchException abc/*Expection*/) {//same level ko Expection xa vane.... 
			System.out.println(abc);// ExpectionDemo5B ma garae jasari garnu pardainxa  but Expection...
			                       // lina mildaina because Expection parent ho ... 
			                       // here ArithmeticException |InputMismatchException  are same ...
			                       // level of Expection
		
		}           
		System.out.println("=========The End======");
	}

	public static int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}
	}


