package string;

import java.util.Scanner;

public class Number_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int total = 0;
		String input = scan.next();
		
		for(int i = 0; i < input.length(); i++) {
			total += Integer.parseInt(input.substring(i, i+1));
		}
		System.out.println(total);
	}

}
