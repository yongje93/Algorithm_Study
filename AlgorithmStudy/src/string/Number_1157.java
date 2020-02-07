package string;

import java.util.Scanner;

public class Number_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next().toUpperCase();

		int[] cnt = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// A를 뺴주면 0~25로 바뀜
			cnt[c - 'A']++;
		}

		int max = 0;
		int count = 0;
		int index = 0;

		for (int i : cnt) {
			if (i > max) {
				max = i;
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			if (max == cnt[i]) {
				count++;
				index = i;
			}
		}

		if (count > 1) {
			System.out.println("?");
		} else {
			System.out.println((char) (index + 'A'));
		}
	}

}
