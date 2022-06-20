package day32expectiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionDemo5B {
 // Multiple Catch 
	public static void main(String[] args) {
		int []arr= new int[3];// 3 is size of an index (0 , 1 ,2 index)
		Scanner input = new Scanner(System.in);
		try {// To handle the expection try ma j expection auna sakxa tesko correspondance...
			 // hunu parxa like try ma ArithmeticExpection guess garya xa so catch ma ne..
			// ArithmeticExpection hunu parxa 
			System.out.println("Enter number1:");
			int a = input.nextInt();
			System.out.println("Enter number2:");
			int b = input.nextInt();
			arr [3] = division(a, b);// here we are assigning result on 3 index which we dont 
			                         // have on int[]arr= new int[3] so it gives Expection 
			System.out.println(arr[2]);
		} catch (ArithmeticException abc) {
			System.out.println(abc);
		}  catch(InputMismatchException cde){// kayle kahai code ma expection related logic ....
			System.out.println(cde);// haru lekhnu parne huna sakxa so ....
			                        // to case ma  catch(InputMismatchException cde)..
			                       // natra vaye  asari catch (Exception efg) lekda e hunxa 
			
		}catch (Exception efg) {// Hamilai kun index auxa vannae tha xaina vanae just Expection lekhae ..
			System.out.println(efg);// hunxa 
			                        // if multiple  catch banaunuxa vanae yo catch (Exception efg)...
			                        //last ma lekhnu parxa suru ma lekhaera hudaina :parent last ma ...
			                        // hunu parxa 
		
		}           
		System.out.println("=========The End======");
	}

	public static int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}



	}


