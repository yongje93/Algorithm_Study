package array;

import java.util.Scanner;

public class Number_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		String[] str = new String[total];
		
		for(int i = 0; i < total; i++) {
			str[i] = scan.next();
		}
		
		for(String ox: str) {
			int score = 0;
			int sum = 0;
			
			for(int i = 0; i < ox.length(); i++) {
				if(ox.charAt(i) == 'O') {
					sum += ++score;
				} else {
					score = 0;
				}
			}
			System.out.println(sum);
		}
		
	}

}
