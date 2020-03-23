package sort;

import java.util.ArrayList;
import java.util.Collections;

// 제일 작은 수 제거하기
public class MinimalDel {
	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(arr.length <= 1) {
			return answer = new int[]{-1};
		}
		
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int min = 0;
		min = Collections.min(list);
		list.remove(list.indexOf(min));
		
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		MinimalDel del = new MinimalDel();
		int[] test = {4,10,3,7};
		//int[] test = {4};
		int[] arr = del.solution(test);
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	}

}
