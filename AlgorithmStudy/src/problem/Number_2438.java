package problem;

import java.util.Scanner;

public class Number_2438 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
