package day18;

// Note: This coding has some drawbacks so to overcome this drawbacks we use constructor.
public class User2 {
	String userName;
	String password;

	public void assignInfo(String u, String p) {
		userName = u;
		password = p;
	}

	public void displayInfo() {
		System.out.println("Enter username:" + userName);
		System.out.println("Enter Password:" + password);
	}

	public static void main(String[] args) {
		User2 khagendra = new User2();
		khagendra.assignInfo("khagendra", "abc123");
		khagendra.displayInfo();
		User2 nabin = new User2();
		nabin.assignInfo("nabin", "cde123");
		nabin.displayInfo();
		System.out.println("========");
		khagendra.assignInfo("Rabina","gdoe123");/*
							 * same username has different name this is shouldn't happen in the real world
							 * .Example in fb is always same though password can be changed
							 */
		khagendra.displayInfo();
	}
}
