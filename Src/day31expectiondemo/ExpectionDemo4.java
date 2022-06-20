package day31expectiondemo;

public class ExpectionDemo4 {

	public static void main(String[] args) {
		// nested Expection
		try {
			try {
				try {

				} catch (Exception e) {
					try {

					} catch (Exception e2) {
					}
				}

			} catch (Exception e) {

			}

		} catch (Exception e) {

		} finally {
			try {
			} catch (Exception e2) {
			}
		}
	}

}
