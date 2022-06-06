package thisdemoday22;

public class Student1 {

	
		String name;
		int  roll;
	public Student1( String name ,int roll) {
		 name= name;
		 roll= roll;}
		public void displayInfo() {
			System.out.println("student name:"+name);
			System.out.println("student roll number:"+roll);}
     public static void main(String[] args) {
    	 Student1 student= new Student1("khagendra ",5);
    	 student .displayInfo();
		}

	

}
