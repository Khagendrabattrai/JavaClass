package day21encapulation;

public class User {
	String name; // String username= "Khagendra "; Note :members data shouldn't be initialize here .  
       String password; // String password= "abc123";

	public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1.name);
		System.out.println(user1.password);
		System.out.println("========");
		User user2 = new User();
		System.out.println(user2.name);
		System.out.println(user2.password);

	}

}
