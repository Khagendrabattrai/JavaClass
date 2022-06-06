package day19;

// construction overloading
public class Student {
	String studentName;
	int rollNumber;
public Student() {
	System.out.println(" 1.Defult constructor");
}
	public Student(int r) {
		rollNumber = r;
		System.out.println("2.Parameterized constructor r");
	}

	public Student(String name) {
		studentName = name;
		System.out.println("3.Parameterized constructor name  ");
	}

	public Student(String name, int r) {
		studentName = name;
		rollNumber = r;
		System.out.println("4.Parameterized constructor  name , r");}
		public  void  displayInfo() {
			System.out.println("Student name "+studentName);
			System.out.println("Roll number is "+rollNumber);
		
		}
	

	public static void main(String[] args) {
		Student student1= new Student("Khagendra"); 
		student1.displayInfo();
		Student roll= new Student(25);
		roll.displayInfo();
		Student student3= new Student("Nabin" ,23);
		student3 .displayInfo();
	}

}
