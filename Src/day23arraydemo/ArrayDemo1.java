package day23arraydemo;
// Array:Array is collection of elements arranged in a 
// sequential manner.
// Types of a array.
// a. single dimensional array
 // b. Multi dimensional array
public class ArrayDemo1 {
// first way
	public static void main(String[] args) {
		//<data type > [] <array name>= new <data type > [size of an arrays element]
		int[] arr=new int [3];
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]); 
		System.out.println("=============");
		arr[0]=10;
		arr[1]= 20;
		arr[2]=30;
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
