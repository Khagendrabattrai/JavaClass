package day26abstractandinterface;

public class ShapeTest {
	public static void main(String[] args) {
		// we cannot create an object of abstract class
		 Shape shape; // but we can create  variable 
		 shape  = new Rectangle(); //yaha overrid garyaxa
		 shape .drawn();
		 System.out.println("==========");
		 shape= new Triangle();
		 shape.drawn();
	}
}
/*   If a class inherits a method from its superclass, then there is a chance to override the method provided that it is not marked final.

The benefit of overriding is: ability to define a behavior that's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.

In object-oriented terms, overriding means to override the functionality of an existing method. */