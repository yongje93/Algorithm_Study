package string;

import java.util.Scanner;

public class Number_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] word = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String input = scan.nextLine().trim();

		for (int i = 0; i < word.length; i++) {
			if(input.contains(word[i])) {
				input = input.replace(word[i], "*");
			}
		}
		System.out.println(input.length());
	}

}
