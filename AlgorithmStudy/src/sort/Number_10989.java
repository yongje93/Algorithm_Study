package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int[] array = new int[10001];

		for (int i = 0; i < count; i++) {
			array[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				for (int arri = 0; arri < array[i]; arri++) {
					bw.write(Integer.toString(i) + "\n");
				}
			}
		}

		br.close();
		bw.close();
	}
}
