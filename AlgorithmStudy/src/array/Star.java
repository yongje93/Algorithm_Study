package array;

import java.util.Scanner;

// 직사각형 별찍기
public class Star {
	public void star(int x, int y) {
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Star star = new Star();
		star.star(x, y);
	}

}
