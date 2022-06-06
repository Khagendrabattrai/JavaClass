package thisdemoday22;
// building  concept of constructor for "this" .....................
public class Student {
	String name;
	int  roll;
public Student( String n ,int r) {
	 name= n;
	 roll= r;}
	public void displayInfo() {
		System.out.println("student name:"+name);
		System.out.println("student roll number:"+roll);
	}

	public static void main(String[] args) {
Student s1=new Student("khagendra", 5);
s1.displayInfo();
	}
	
		
	}


