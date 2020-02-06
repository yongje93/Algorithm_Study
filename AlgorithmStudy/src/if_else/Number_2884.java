package if_else;

import java.util.Scanner;

public class Number_2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		int h2 = h;
		int m2 = m - 45;

		if (m2 < 0) {
			h2--;
			m2 += 60;
			if (h2 < 0) {
				h2 += 24;
			}
		}
		System.out.println(h2 + " " + m2);
	}
}
