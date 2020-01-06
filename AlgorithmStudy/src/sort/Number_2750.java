package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Number_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();
		int[] array = new int[total];

		for (int i = 0; i < total; i++) {
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int n : array) {
			System.out.println(n);
		}
	}

}
