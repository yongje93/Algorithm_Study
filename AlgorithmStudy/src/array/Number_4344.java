package array;

import java.util.Scanner;

public class Number_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int n, total, count;
		double avg = 0;
		int[] scores = new int[1000];

		for (int i = 0; i < c; i++) {
			n = scan.nextInt();
			total = 0;
			count = 0;
			for (int j = 0; j < n; j++) {
				scores[j] = scan.nextInt();
				total += scores[j];
			}
			avg = (double) total / n;

			for (int j = 0; j < n; j++) {
				if (scores[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / n);
			System.out.println("%");
		}
	}

}
