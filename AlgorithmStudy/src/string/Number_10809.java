package string;

import java.util.Scanner;

public class Number_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(s.indexOf(c) + " ");
		}
	}

}
