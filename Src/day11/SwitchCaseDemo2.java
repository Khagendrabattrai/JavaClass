package day11;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator:");
		char operator = input.next().charAt(0);
		int a = 0, b = 0;
		if (operator == '+' || operator == '-' || operator == '*' || operator == '|') {
			System.out.println("Enter number a:");
			a = input.nextInt();
			System.out.println("Enter number b:");
			b = input.nextInt();

		}

		switch (operator) {
		case '+':

			int addition = a + b;
			System.out.println("sum of a and b is:" + addition);

			break;
		case '-':
			int subtraction = a - b;
			System.out.println("Difference of a and b is :" + subtraction);

			break;
		case '*':
			int multiplication = a * b;
			System.out.println("The product of a and b is:" + multiplication);
			break;
		case '/':
			int division = a / b;
			System.out.println("The quotient when we divide a by b is :" + division);
			;
			break;

		default:
			System.out.println("wrong selection");
		}
	}

}
