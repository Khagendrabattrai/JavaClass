package day31expectiondemo;

import java.util.Scanner;

public class ExpectionDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a= input.nextInt();
		System.out.println("Enter number2:"); // if we provide 0 the second number it gives expection
		int b = input.nextInt();
		//int result= division(a,b);
		//System.out.println("The result is:"+ result); 
		// to handled the expection in the above code we do as follows 
			 try {
				 System.out.println("====Inside try start=====");
				 int result= division(a,b);// expection xa vane tyo line bata bira goidinxa 
					System.out.println("The result is:"+ result); 
					System.out.println("====Try end =====");
			 } catch ( ArithmeticException abc) {// abc yaha j name dida ne hunxa 
				System.out.println("Inside catch"); 
				 input.close();
				 
			 }finally { // finally always runs in both normal and abnormal condition
				 System.out.println("=====Inside finally======");
			 }
			 System.out.println("=========The End======");
			}
	// Resource clean garnu xa resource close garnu xa ,kunai kura shutdown garnuxa 
	// Note : javama jati pani library class xa( like scanner ) teslae closeable or autoCloseable..
	//interface lai extend or implements garya xa vanae tyo class lai resource class vanxa ...
	// resource classko object banauda jaylae close garnu parxa 



		public static int division(int num1,int num2) {
			int div= num1/num2;
			return div;}
	}


