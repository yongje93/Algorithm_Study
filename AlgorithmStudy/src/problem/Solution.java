package problem;

import java.util.ArrayList;

public class Solution {

	public int[] solution(int[] arr) {
		// 내가푼거
//		int[] answer = {};
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int current = 10;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(current != arr[i]) {
//				list.add(arr[i]);
//				current = arr[i];
//			}
//		}
//		
//		answer = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i);
//		}
//		
//		return answer;
		
		//다른사람이 푼거
		ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = { 4, 4, 4, 3 };
		int[] result1 = sol.solution(arr1);
		int[] result2 = sol.solution(arr2);
		System.out.println("result1");
		for (int i : result1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("result2");
		for (int i : result2) {
			System.out.print(i+ " ");
		}

	}

}
