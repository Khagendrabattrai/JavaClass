package thisdemoday22;
// using "this"
public class Student2 {
	String name;
	int roll;

	public Student2(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public void displayInfo() {
		System.out.println("student name:" + name);
		System.out.println("student roll number:" + roll);
	}

	public static void main(String[] args) {
		Student2 student = new Student2("khagendra ", 5);
		student.displayInfo();

	}
}
