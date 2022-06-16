package day26abstractandinterface;
// auta pakage ko class arko pakage ko class ma extend garna first we must write import......
import day27polymorphism/*pakage name*/.AccessModifier/*class name day 26*/;

public class AccessModifierChild extends AccessModifier {
	public static void main(String[] args) {
	AccessModifier obj1= new AccessModifier(7,8,9);
	AccessModifier obj2= new AccessModifier(9,5);
	AccessModifier obj3=new AccessModifier();
	AccessModifier obj4= new AccessModifier(7);
	obj1.publicMethod();
	obj1.privateMethod();
	obj1.protectedMethod();
	obj1.defaultMethod();
	// How to access access modifier protected in othes package sub class
	// first construct object of child class
	
	AccessModifierChild obj= new AccessModifierChild();
	obj.protectedMethod();
	}
}
