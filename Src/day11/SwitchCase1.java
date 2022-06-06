package day11;

import java.util.Scanner;

public class SwitchCase1 {
	/*
	 * switch(expression) {
	 *  case x: 
	   // code block 
	    break;
	   case y: 
	   // code block
	  break;
	   default: 
	   // code block }*/

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice:");
		int choice = input.nextInt();

		switch (choice) {//start
		case 1:
			System.out.println(" Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
          default :
        	  System.out.println( " Wrong Choice");
		}// end 
		System.out.println("exit");
	}
	
	}


