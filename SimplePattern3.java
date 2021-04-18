package Patterns;

import java.util.Scanner;

public class SimplePattern3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Of Rows To Be displayed");
		int length = scan.nextInt();
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				if (j == (length / 2) + 1 && i != 1 && i != length) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
