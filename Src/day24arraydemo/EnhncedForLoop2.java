package day24arraydemo;

public class EnhncedForLoop2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 7, 8, 9, 10 } };// confusion
		// arr vanya array ko name.
        // Naming can be any (a,b,c,whatever......)
	    // int[][] arr =   new int [][]{ { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 7, 8, 9, 10 } };
		// yo mathi doitai case ma output de ra xa getting confuse.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("====Enhanced for loop===");
		for (int[] a : arr) { // double dimension bata nikalera single ma rakhne.
			for (int b : a) {// one dimensional lai pheri single variable ma lanu parxa

				System.out.print(b + "   ");
			}
			System.out.println();
		}
	}
}
