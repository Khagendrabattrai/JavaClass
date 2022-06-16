package day27polymorphism;
/*   Access Modifiers:  are keywords and specify the accessibility of a class
 *  or interface and its members.
Keywords:
Data type
Modifiers
Other(static, abstract, synchronized, transient)
Access Modifiers
 Implicit(default)- by default for interface, class and its members
Explicit
-public (by default for the method of interface)
-private
-protected
  1. Public Zazaq1 q
 Class
Variables
Method
Constructor

  2. Private 
Variables
Method
Constructor
  1. Default 
 Class
Variables
Method
Constructor
Initializers(non-static & static block)

  2. Protected 
Variables
Method
Constructor

Security level
private               default               protected                public
                    Visibility++ 
Access Modifiers	Same Package	Other Package
 	Same Class	Sub Class	Non-Sub Class	Sub Class	Non-Sub Class
Public	y	y	Y	Y	Y
Protected	y	y	Y	Y(conditions apply)	N
Default	y	y	Y	N	N
Private	y	N	N	N	N
                                      Security++









Conditions: Protected members of a class can only be accessed by using the ref. variable of its subclass in another package.
What is the access modifier of the constructor?
The access modifier of constructor is defined based on following conditions;
If constructor is provided by compiler, in this case the access modifiers of constructor is same as the access modifier of the class.
If constructor is provided by programmer, in this case, the access modifiers of the constructor is also provided by programmer.        */
 /* public , private default can be used in front of class  */
 public class AccessModifier {
 
/*default , public , private, protected all is used in front of variable*/
 String defaultvar= " This is default variable";
 public String publicvar="This is public variable";
 private String privatevar="This is private variable";
 protected String protectvar="This is protected variable";
   
 
 /*default , public , private, protected all is used in front of method*/
 void defaultMethod() {
	 System.out.println("This is  default method");
 }
 public void publicMethod() {
	 System.out.println("This is public method ");
 }
 private void privateMethod() {
	 System.out.println("This is private method ");
 }
 protected void protectedMethod() {
	 System.out.println("This is protected method ");
	 
 }
 /*default , public , private, protected all is used in front of constructor*/
        AccessModifier(int a){
    	System.out.println("This is default constructor");}
    	public AccessModifier() {
    		System.out.println("This is public constructor");
    		
    	}
    	private AccessModifier(int a , int b , int c ) {
    		System.out.println("This is private constructor");
    		
    	}
    	protected  AccessModifier(int a , int b) {
    		System.out.println("This is protected constructor");
    		
    	}
	public static void main(String[] args) {
		// yo tala koo sap same class ko method ma access vai ra xa 
		AccessModifier obj1= new AccessModifier(7,8,9);
		AccessModifier obj2= new AccessModifier(9,5);
		AccessModifier obj3=new AccessModifier();
		AccessModifier obj4= new AccessModifier(7);
		obj1.publicMethod();
		obj1.privateMethod();
		obj1.protectedMethod();
		obj1.defaultMethod();
		
	}

}
