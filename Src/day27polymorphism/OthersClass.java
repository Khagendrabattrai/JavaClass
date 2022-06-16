package day27polymorphism;

public class OthersClass {
	public static void main(String[] args) {

	AccessModifier obj1= new AccessModifier(7,8,9);// arko class ma access hudaina
	AccessModifier obj2= new AccessModifier(9,5);
	AccessModifier obj3=new AccessModifier();
	AccessModifier obj4= new AccessModifier(7);
	obj1.publicMethod();
	obj1.privateMethod(); // arko class ma access hudaina
	obj1.protectedMethod();
	obj1.defaultMethod();
	}
}
