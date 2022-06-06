package day24arraydemo;

public class VarArgDemo {
	public void printArray(int...ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
          	}
	public static void main(String[] args) {
		int [] arr= {2,3,4};

VarArgDemo obj= new VarArgDemo();
obj.printArray(arr);
obj.printArray(5,6,7,8,9);

	}

}
