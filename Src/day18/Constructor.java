package day18;

public class Constructor {
	String userName;
	String password;

	public Constructor(String u, String p) {
		System.out.println("Constructor called");
		userName = u;
		password = p;
	}

	public void displayInfo() {
		System.out.println("Enter username:" + userName);
		System.out.println("Enter Password:" + password);
	}

	public static void main(String[] args) {
		Constructor khagendra = new Constructor("khagendra", "abc123");
		khagendra.displayInfo();
		Constructor nabin = new Constructor("nabin", "cde123");
		nabin.displayInfo();

	}
}
