package Patterns;

import java.util.Scanner;

public class SimplePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Enter Number Of Rows To Be displayed");*/
		
		for(int i = 1 ; i <= 5 ; i++ ) {
			for(int j = 1; j <= 5 ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
