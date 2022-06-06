package day24arraydemo;

public class ArrayDemo9 {

	public static void main(String[] args) {// This programming didnt give output as expected//confusion
		String[][] arr = new String[3][];
		arr[0] = new String[2];
		arr[0][0] = "khagendra";
		arr[0][1] = "rabina";

		arr[1] = new String[3];
		arr[1][0] = "Sujata";
		arr[1][1] = "Sunita";
		arr[1][2] = "Rabin";

		arr[2] = new String[3];
		arr[2][0] = "Chandra";
		arr[2][1] = "Durga";
		arr[2][2] = "Nabin";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}
}
