package day11;

public class ElseIf {
	/*
	 * if (test - expression 1) { statement1; } else if (test - expression 2) {
	 * Statement2; } else if (test - expression 3) { Statement3; } else if (test -
	 * expression n) { Statement n; } else { default; } Statement x;
	 */

	public static void main(String[] args) {
		int marks = 80;
		if (marks >= 80 && marks <= 100) {
			System.out.println("Distinction");

		} else if (marks >= 60 && marks <= 80) {
			System.out.println("First Division");

		} else if (marks >= 45 && marks <= 60) {
			System.out.println("Third Division");
		} else {
			System.out.println("Fail");

		}

	}

}
