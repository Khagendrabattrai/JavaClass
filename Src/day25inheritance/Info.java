package day25inheritance;

class Info1 {
	String name = "Khagendra";
	int rollNum = 7;

	public void information1() {
		System.out.println("NAME: " + name);
		System.out.println("ROLL NUMBER: " + rollNum);
	}
}

class Info2 extends Info1 {

	String address = "Ilam ,Nepal ";
	String message = "I love Ilam,Nepal";

	public void information2() {
		System.out.println("ADDRESS: " + address);
		System.out.println("MESSAGE: " + message);}
class Info3 extends Info2{
			
		}
	}


public class Info {
	public static void main(String[] args) {

		Info2 ob = new Info2();
		ob.information1();
		ob.information2();
		Info3 ob1= new Info3(); // confusion.....
		
	}
}
