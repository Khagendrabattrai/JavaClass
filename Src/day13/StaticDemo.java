package day13;

public class StaticDemo {
	static String name = "khagendra";

	public static void greet() {
		System.out.println("i love learning Java");
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo.name);
		StaticDemo.greet();

	}

}
