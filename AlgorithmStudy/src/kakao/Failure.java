package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

// 실패율
public class Failure {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Double> fail = new HashMap<Integer, Double>();
		
		for(int i = 0; i < stages.length; i++) {
			if(!map.containsKey(stages[i])) {
				map.put(stages[i], 1);
			} else {
				map.put(stages[i], map.get(stages[i]) + 1);
			}
		}
		
		int hNumber = stages.length;
		
		for(int i = 1; i <= N; i++) {
			if(map.containsKey(i)) {
				fail.put(i, (double) map.get(i) / hNumber);
				hNumber -= map.get(i);
			} else {
				fail.put(i, 0.0);
			}
		}
		
		List<Integer> keySetList = new ArrayList<Integer>(fail.keySet());
		// 내림차순
		Collections.sort(keySetList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return fail.get(o2).compareTo(fail.get(o1));
			}
		});
		
		for (int i = 0; i < keySetList.size(); i++) {
			answer[i] = keySetList.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Failure fail = new Failure();
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] result = fail.solution(5, stages);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
