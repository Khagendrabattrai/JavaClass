package day26abstractandinterface;
// we can use final only  in front of class , variable and method
// we cannot inherit final class
public /*final*/ class FinalDemo {
	/* we use final keyword on variable to make it constant*/
	/* final variable must be initialized at the time of deceleration*/
 final int a =7;
// we cannot override final method
public/* final*/ void greet() {
	System.out.println("Hello world good morning");
	/*a=9;*/ /* yaha variable a ko value change garna sakindaina coz 
	 * we have use used final in front of  int a =7 , which makes a always 7*/
	
}
// we cannot use final on constructor
//final int b;/* yedhi final variablelai initilized garnu xaina vane 
              // constructor ko through initilized hunu parxa*/
//public/*final*/ FinalDemo(int b) {
	// this.b=9;
}

//}