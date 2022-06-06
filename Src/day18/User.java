package day18;

public class User {
	// String userName="Khagendra"; // note 1: non static instance variable cannot
	// be initialize here.
	// String password = "abc123";
	// ( As a whole this method is not so good because data cannot be shown
	// directly).
	String userName;
	String password;

	public void displayInfo() {
		System.out.println("Enter username:" + userName);
		System.out.println("Enter Password:" + password);
	}

	public static void main(String[] args) {
		User khagendra = new User();
		khagendra.userName = "Khagendra";
		khagendra.password = "abc123";
		khagendra.displayInfo();
		User nabin = new User();
		nabin.userName = "Nabin";
		nabin.password = "cde123";
		nabin.displayInfo();

	}

		
	}
