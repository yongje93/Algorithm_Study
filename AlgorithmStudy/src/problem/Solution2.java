package problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution2 {

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		Collections.sort(list);
		if (list.size() == 0) {
			list.add(-1);
		}
		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
		// 다른사람이 푼거.. lamda 사용..
		//return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr1 = {5,9,7,10};
		int[] result = sol.solution(arr1, 5);
		
		for (int i : result) {
			System.out.print(i+ ",");
		}
	}

}
