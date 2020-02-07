package string;

import java.util.Scanner;

public class Number_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int count = scan.nextInt();
			String s = scan.next();

			String result = "";

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < count; k++) {
					result += s.charAt(j);
				}
			}
			System.out.println(result);
		}

	}

}
