package Patterns;

public class SimplePattern4 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 26; i++) {
			int alphabet = 65; //'A'
			for (int j = 1; j <= i; j++) {
				System.out.print((char)alphabet);
				alphabet++;
			}
			System.out.println();
		}
	}
}