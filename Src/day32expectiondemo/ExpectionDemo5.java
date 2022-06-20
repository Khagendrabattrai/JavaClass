package day32expectiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionDemo5 {

	public static void main(String[] args) {
		try {// To handle the expection try ma j expection auna sakxa tesko correspondance...
			 // hunu parxa like try ma ArithmeticExpection guess garya xa so catch ma ne..
			// ArithmeticExpection hunu parxa 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number1:");
			int a = input.nextInt();
			System.out.println("Enter number2:");
			int b = input.nextInt();
			int result = division(a, b);
			System.out.println("The result is:" + result);
		} catch (ArithmeticException abc) {
			System.out.println(abc);
		} catch(InputMismatchException cde) {
			System.out.println(cde);
	
		}
		System.out.println("=========The End======");
	}
	

	public static int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

}
