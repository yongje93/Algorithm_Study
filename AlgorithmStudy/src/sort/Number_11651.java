package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number_11651 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int[][] array = new int[total][2];
		String[] str = new String[2];

		for (int i = 0; i < total; i++) {
			str = br.readLine().split(" ");
			array[i][0] = Integer.parseInt(str[0]);
			array[i][1] = Integer.parseInt(str[1]);
		}

		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] x, int[] y) {
				if (x[1] == y[1]) {
					return Integer.compare(x[0], y[0]);
				}
				return Integer.compare(x[1], y[1]);
			}
		});

		for (int i = 0; i < total; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}

	}

}
