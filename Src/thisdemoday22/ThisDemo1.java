package thisdemoday22;
//Shadowing is the process of hiding instance variable by local variable of same name and same type.
 //inside the non static method or constructor of a class
 //"this" :is a keyword is an implicit  reference variable of current object of current class.
//"this" is available only inside non static method and constructor of a class.
// "this" is a final variable.
public class ThisDemo1 {
	//instance variable
	int a= 5;
	public void  printData() {
		System.out.println("this is this :"+this);
		System.out.println(a);
		//local variable
		int a = 10;
		System.out.println(a);
		//ThisDemo1 obj= new ThisDemo1();//This is not necessary to do in non static method to hide
		//int sum =obj. a + a;  // we can use This instead of objname(obj) to hide.
		int sum =this.a + a;
		System.out.println("The sum is:"+sum);
	}
	public static void main(String[] args) {

ThisDemo1 obj=new ThisDemo1();
System.out.println("obj is:"+obj);
obj.printData();
System.out.println("=====================");
ThisDemo1 obj1=new ThisDemo1();
System.out.println("obj is:"+obj1);
obj1.printData();
	}

}
