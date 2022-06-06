package day23arraydemo;

public class ArrayDemo4 {
// fourth way
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 30 };

		int max = arr[0];
		for (int i = 0; i < arr.length/*3 is the length of an  element of an array/*/; i++) {
			if (arr[i] > max) {
				max = arr[i];  // confusion on here......

			
			}
		
		}
		
		System.out.println("The largest element of an array is:"+max);
	}
}
