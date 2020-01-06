package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Number_1427 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] splited = input.split("");

		Arrays.sort(splited, Comparator.reverseOrder());

		for (String s : splited) {
			System.out.print(s);
		}
	}

}
