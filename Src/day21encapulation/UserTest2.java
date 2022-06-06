package day21encapulation;

public class UserTest2 {

	public static void main(String[] args) {
		
		UserTest user1 = new UserTest();
		//set
		user1.setUsername("khagendra");
		user1.setPassword("abc123");
	
		//get
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
		//set
		user1.setUsername("Nabin");
		user1.setPassword("cde123");
		//get
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());
	}

}
