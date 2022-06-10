package day26abstractandinterface;
public /* abstract */ interface InterfaceDemo1 { // interface is same as class.
//void m1() { // interface ma bodyvayeko method banauna mildaina...
//Interface methods do not have a body - the body is provided by the "implement" class
// Given below are the ways to create interface method 
void m1();	 // mostly used one 

public void m2();   // interface ma method ko aghadi public matra hunxa .. protected , private hudaina.

abstract void m3();

public abstract void m4();// by default 
//int a1; yaha variable initilized vayaeko xaina 
// interface ma banaune variable initilize vayaekai hunuparxa coz by default tyo final hunxa
int a1=7;// mostly we use this  
final int a2=7;
public int a3=7;
static int a4=7;
final static int a5=7;
public static int a6=7;
public final int a7=7;
public static final int a8=7;  // by default 

// we cannot create constructor of interface 
//public InterfaceDemo1() {
	
}



//}
/*Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to group related methods with empty bodies:
To access the interface methods, the interface must be "implemented" 
(kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
*/