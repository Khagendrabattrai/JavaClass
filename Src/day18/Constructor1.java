package day18;

public class Constructor1 {
	String userName;
	String password;

	public Constructor1(String u, String p) {
		System.out.println("Constructor1 called");
		userName = u;
		password = p;
	}

	public void displayInfo() {
		System.out.println("Enter username:" + userName);
		System.out.println("Enter Password:" + password);
	}

	public static void main(String[] args) {
		Constructor1 khagendra = new Constructor1("khagendra", "abc123");
		khagendra.displayInfo();
		Constructor1 nabin = new Constructor1("nabin", "cde123");
		nabin.displayInfo();

	}
}
