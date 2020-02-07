package string;

import java.util.Scanner;

public class Number_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().trim().split(" ");
		int inputA = Integer.parseInt(str[0]);
		int inputB = Integer.parseInt(str[1]);
		
		int newA  = 0, newB = 0;
		newA = (inputA % 10)*100 + ((inputA %100)/10)*10 + (inputA/100);
		newB = (inputB % 10)*100 + ((inputB %100)/10)*10 + (inputB/100);

		System.out.println((newA > newB ? newA : newB));
	}

}
