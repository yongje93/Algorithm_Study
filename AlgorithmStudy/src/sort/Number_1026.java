package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Number_1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		int[] arrayA = new int[num];
		int[] arrayB = new int[num];

		for (int i = 0; i < num; i++) {
			arrayA[i] = scan.nextInt();
		}
		for (int i = 0; i < num; i++) {
			arrayB[i] = scan.nextInt();
		}

		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		int total = 0;
		for (int i = 0; i < num; i++) {
			total += arrayA[i] * arrayB[num - 1 - i];
		}

		System.out.println(total);
	}

}
