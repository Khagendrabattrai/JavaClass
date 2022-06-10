package day26abstractandinterface;
// we cannot use final on abstract java class.
public/* final*/ abstract class Shape {

	public abstract void drawn();         //(Abstract method) // we cannot use private keyword 
	/*abstract*/  int a=5;                             //in front of abstract method 
	                               // we cannot use static keyword  in abstract method
  public void Paint() { //(concrete method // we cannot use final keyword abstract method
System.out.println("shape is painted");}// abstract class ma 2 tai type ko method banauna milxa
                                       // (abstract and concrete )
/* abstract* this is wrong*/public Shape(){// yo mathi class shape ko constructor ho abstract class ma 
System.out.println("Shapes constructor"); // abstract is used only in front of class and method.
                                          // we cant use in front of constructor and variable 
   }
}                