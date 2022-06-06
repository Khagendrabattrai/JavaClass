package day10;

public class NestedIfElseDemo {
//When there is an if else statement inside another if else  statement then it is called the nested if else  statement.
//The structure of nested if looks like this:

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 7;
		if (a > b) {
			if (a > c) {
				System.out.println("a is greatest");
			} else {
				System.out.println("c is largest");
			}

		} else {
			System.out.println(" a is smallest");
		}
	}
}
