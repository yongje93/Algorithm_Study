package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number_2751 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int total = Integer.parseInt(br.readLine());
			List<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < total; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}

			Collections.sort(list);

			for (int i = 0; i < total; i++) {
				System.out.println(list.get(i));
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
