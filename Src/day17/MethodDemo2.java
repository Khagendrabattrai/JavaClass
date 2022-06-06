package day17;

public class MethodDemo2 {
// <access modifier> void <method name>(any type and any number of parameter);{
//..........
//...........
	// }

	public void displayBioData(String name, int age) {
		System.out.println(" name :" + name);
		System.out.println("age :" + age);
	}

	public static void main(String[] args) {

		String name = "Khagendra";
		int age = 26;

		MethodDemo2 obj = new MethodDemo2();
		obj.displayBioData(name, age);
		
	

	}

} 
