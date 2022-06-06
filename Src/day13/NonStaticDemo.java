package day13;

public class NonStaticDemo {
	String name ="Khagendra";
	public void sayHello() {
		System.out.println("hello.....");
	}

	public static void main(String[] args) {
		System.out.println("main");
		NonStaticDemo obj=new NonStaticDemo();
		 System.out.println(obj.name);
		 obj.sayHello();	

	}

}
