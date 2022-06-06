package day23arraydemo;

public class ArrayDemo5 {

	public static void main(String[] args) {
		final int rows = 3;
		final int coloumn = 3;
		int[][] arr = new int[rows][coloumn];
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.print(arr[0][2]);

		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);

		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);

		System.out.println("=========================");
		arr[0][0] = 12;
		arr[0][1] = 13;
		arr[0][2] = 14;

		arr[1][0] = 15;
		arr[1][1] = 16;
		arr[1][2] = 17;

		arr[2][0] = 18;
		arr[2][1] = 19;
		arr[2][2] = 20;
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");
		System.out.println(arr[0][2]);

		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println(arr[1][2]+"");

		System.out.print(arr[2][0]+" ");
		System.out.print(arr[2][1]+" ");
		System.out.println(arr[2][2]);
	}

}
