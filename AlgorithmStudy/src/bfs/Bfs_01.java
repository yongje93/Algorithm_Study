package bfs;

import java.util.ArrayList;

public class Bfs_01 {
	public static int[] solution(int[] answers) {
		int[] answer = {};

		int[] human1 = { 1, 2, 3, 4, 5 };
		int[] human2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] human3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		// 채점결과
		int result[] = new int[3];

		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == human1[i%human1.length]) result[0]++;
			if(answers[i] == human2[i%human2.length]) result[1]++;
			if(answers[i] == human3[i%human3.length]) result[2]++;	
		}

		int max = Math.max(result[0], Math.max(result[1], result[2]));
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(max == result[0]) list.add(0);
		if(max == result[1]) list.add(1);
		if(max == result[2]) list.add(2);

		answer = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i)+1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] result = solution(answers);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
