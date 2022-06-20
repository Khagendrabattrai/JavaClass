package day32expectiondemo;

// Hamilae afnai costum Expection banauna pani sakxau
// How to make costum Expection 
// 1. checked Expection banaunuxa vane Expectionlai extend garnae 
// 2. unchecked Expection banaunuxa vanae RunTimeExpection lai extend garne 
	public class InvalidAgeExpection  extends RuntimeException{
		public InvalidAgeExpection (String msg) {// constructor 
			super(msg);
		}
		
	}
	


