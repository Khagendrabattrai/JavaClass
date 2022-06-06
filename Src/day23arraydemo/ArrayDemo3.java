package day23arraydemo;

public class ArrayDemo3 {
// third way
	public static void main(String[] args) {
    int[] arr= {10, 20,30}; // fix data or element of an array vako case ma yo array use garna milxa
	                         // It is called literal array.
    int sum=0;
    for(int i=0; i<3;i++) {
    	sum = sum + arr[i];  //confusion
    }
    System.out.println("The sum of array elements is :"+sum);
	}

}
