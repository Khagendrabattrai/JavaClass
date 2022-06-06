package day17;

public class MethodDemo3 {
	// < access modifier > <return type > <method name> (){
	// ----------------
	// ............}
	public int addition() {
		int a = 12;
		int b = 15;
		int  sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		MethodDemo3 obj = new MethodDemo3();
		int sum = obj.addition();
		System.out.println("sum is :" + sum);

	}
}
