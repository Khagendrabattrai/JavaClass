package day24arraydemo;

public class MethodDemo1 {
	public int[] getArray() {
		int[] ar = { 4, 5, 7 };
		return ar;

	}

	public void printArray(int[] ar) {  // passing array
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);}

	}
	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		int[] ar = obj.getArray();
		obj.printArray(ar);
	}
	

}
