package sort;

import java.util.Arrays;
import java.util.Collections;

// 정수 내림차순으로 배치하기
public class DesendingNum {
	public long solution(long n) {
		long answer = 0;
		String temp = "";
		String[] arr = String.valueOf(n).split("");
		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
		}

		answer = Long.parseLong(temp);

		return answer;
	}

	public static void main(String[] args) {
		DesendingNum des = new DesendingNum();
		System.out.println(des.solution(565665568));
	}

}
