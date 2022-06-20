package day32expectiondemo;

public class ExpectionDemo8 {

	public static void main(String[] args) {
       vote (2); // calling method 
       System.out.println("=============");}
	public static void  vote(int age) {
		if (age >= 18) {
			System.out.println("you are eligiable for vote ");
		}else {
			//System.out.println("You are not eligiable for vote ");//yaha code haru lekda REST api ..
			//throw new ArithmeticException("you can vote");// SOAP api haru banayinxa.REST api ra SOAP..
			throw new InvalidAgeExpection /*ArithmeticExpection*/("you can vote");// api  banauda certain conditon meet garya..
		}                                              // xa vanae tyo kam garxau ra meet garya xaina ..
	}                                                 // vanae expection throw garxau like mathi ko ..
}                                                     // code ma argument 2 pass garda if(age>=18)...
                                                      // condition meet vako xaina so we throw Exception