package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution4 {

	public String[] solution(String[] strings, int n) {
		// 내가 푼거
//		// Comparator는 특정한 정렬을 할 때 사용.
//		Comparator<String> stringComparator = new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				char c1 = s1.charAt(n);
//				char c2 = s2.charAt(n);
//				// n번째 문자열이 같을 경우에는 사전순으로 비교
//				if (c1 == c2) {
//					return s1.compareTo(s2);
//				} else {
//					return c1 - c2; // 음수 또는 0 이면 자리유지. 양수이면 자리 바뀜.
//				}
//			}
//		};
//
//		Arrays.sort(strings, stringComparator);
//
//		return strings;
		
		// 다른사람 풀이
		String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
	}

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String[] strings = { "abce", "abcd", "cds" };
		String[] result = sol.solution(strings, 2);
		for (String string : result) {
			System.out.print(string + ",");
		}
	}

}
