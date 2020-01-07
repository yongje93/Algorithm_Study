package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Number_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		
		String[][] array = new String[total][2];
		String[] str = new String[2];

		for (int i = 0; i < total; i++) {
			str = br.readLine().split(" ");
			array[i][0] = str[0];
			array[i][1] = str[1];
		}
		
		Arrays.sort(array, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for(int i = 0; i < total; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
	}

}
