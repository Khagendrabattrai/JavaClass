package day17;

public class MethodDemo4 {
	// <access modifier> < return type > <method name>(any type and number of
	// parameter){
	// ...............
	// ....................
	// }
	public int number(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		MethodDemo4 obj = new MethodDemo4();
		int number = obj.number(a, b);
		System.out.println("The sum is: " + number);
	
			
		}
			
		
		
			
	

	}


