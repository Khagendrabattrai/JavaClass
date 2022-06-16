package day27polymorphism;

public class AccessModifierChild extends AccessModifier {
	public static void main(String[] args) {
		
	    /*Yo  sub class ma access hudaina kina ki yo private constructor ko cont..
        object ho.*/
		AccessModifier obj1= new AccessModifier(7,8,9);
		                     
		AccessModifier obj2= new AccessModifier(9,5);
		obj1.publicMethod();
		// obj.privateMethod(); yo access sub class ma excess hudaina kina ke yo private method ho. 
		obj1.protectedMethod();
		obj1.defaultMethod();
		}
	}
	

