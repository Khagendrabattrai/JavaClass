package day17;

public class MethodDemo1 {
	// <access modifier> void <method name>(){
	// ............
	// ...........}
	//method definition
	public void khagendra() {
		System.out.println("i am khagendra.");
	}

	public static void main(String[] args) {
		System.out.println("i live in Iowa");

		MethodDemo1 obj = new MethodDemo1();
		//method calling 
		obj.khagendra();
	}

}
