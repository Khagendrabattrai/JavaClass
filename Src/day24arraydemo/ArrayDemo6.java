package day24arraydemo;

import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		final int rows = 3;
		final int coloumn = 3;
		int[][] arr = new int[rows][coloumn];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println("Enter number");
				arr[i][j] = input.nextInt();// confusion on here question
				// why dont we take int in front of arr[i][i]

			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();// confusion
			System.out.println("======");
		}

	}
}
