package day27polymorphism;

public class AdditionDemo {
	// Below is called method overloading .
	//It can be with  same method name with different parameters cont...
	// number of parameters ,orientation  of parameters
 //public  void Add() {
	// TODO Auto-generated constructor stub
//}
// public void  Add(int a) {
	// TODO Auto-generated constructor stub
//}
// yaha tala method ma return type  same huna sakxa athava diff ne huna sakxa like:
// method overloading same method name ra parameters lae decide garxa return cont...
//type lae decide gardaina so return type diff huna sakxa
// overloading starts from here 
//	public  int /*yaha double pani huna sakxa*/ /*void*/ Add( int a , int b ) {   
		// void lae kehai return gardaina 
		/*	int sum= a+b;
			 System.out.println(" 1.sum is:"+ sum);
			 return sum;
		 }
		 public double  Add(double a , double b ) {
			 double sum = a+ b;
			 System.out.println("2. Sum is: "+sum);
			 return sum;
			
		}
		 public int   Add(int a, int  b , int c) {
			 int sum = a+ b +c;
			 System.out.println("3.Sum is:"+sum);
			 return  sum;  
		}*/
	public   void Add( int a , int b ) {   
			int sum= a+b;
			 System.out.println(" 1.sum is:"+ sum);
			 
		 }
		 public  void Add(double a , double b ) {
			 double sum = a+ b;
			 System.out.println("2. Sum is: "+sum);
			
		}
		 public   void Add(int a, int  b , int c) {
			 int sum = a+ b +c;
			 System.out.println("3.Sum is:"+sum);  
		}
			public static void main(String[] args) {
				// This called compile time polymorphism (Static binding)
				//this is achived by method overloading like above 
				// yaha kunai pani add call garnu paryo vane /*AdditionDemo*/ kai object banaunu parxa
				// tera run time polymorphism ma jsako object dinxau tyo call hunxa cont...
				// like /*name =new Dog()* yaha user lae jasko object dinxa tesko sound nikalxa$/
         AdditionDemo obj = new AdditionDemo();
         obj.Add(5, 7);
         obj.Add(4.5,7.5);
         obj.Add(5, 7, 8);
			}

}
