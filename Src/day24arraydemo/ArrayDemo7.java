package day24arraydemo;

public class ArrayDemo7 {

	public static void main(String[] args) {
		String[][] name =new String[] []{ { "Khagendra", "Sunita", "sujata" }, { "nabin", "rabin", "nawaraj" } };
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				System.out.print(name[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
