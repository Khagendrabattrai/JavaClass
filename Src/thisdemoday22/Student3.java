package thisdemoday22;

public class Student3 {
	String name;
	int roll;
//valid
	/* public Student3(String n, int r){
	 this.name = n; 
	 this.roll = r;}*/
	
	// invalid
	 /*public Student3(String name, int roll) { 
		name = name; 
		roll = roll;*/
	//invalid
	/*public Student3(String name, int roll) { 
	name = this.name; 
	roll = this.roll;*/
	//valid
	public Student3(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	public void displayInfo() {
		System.out.println("student name:" + name);
		System.out.println("Roll number of students:" + roll);
	}
	
      public static void main(String[] args) {

		Student3 student = new Student3("Khagendra", 5);
		student.displayInfo();

	}

}
