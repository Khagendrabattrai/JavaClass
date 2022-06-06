package day24arraydemo;

public class EnhancedForLoop1 {

	public static void main(String[] args) {
int[] arr= {3,4,5,6};
for(int i =0 ; i< arr.length;i++) {
	System.out.println(arr[i]);
}
System.out.println("====Enhanced for loop======");
for(int a: arr) {
System.out.println(a);}
		
	}
}
