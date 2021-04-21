package Patterns;

public class SimplePattern5 {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 26; i++) { int alphabet = 65; for (int j = 1; j <= i;
		 * j++) { System.out.print((char)alphabet); alphabet++; } System.out.println();
		 * }
		 */

		int rows = 5;
		int alphabet = 65;
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + "");
			}
			System.out.println();
		}

	}
}