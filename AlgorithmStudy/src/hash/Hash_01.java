package hash;

import java.util.Arrays;
import java.util.HashMap;

public class Hash_01 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (String player : participant) {
			// getOrDefault를 안해주면 중복 체크가 되지 않는다.
			hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hashMap.put(player, hashMap.get(player) - 1);
		}

		for (String key : hashMap.keySet()) {
			if (hashMap.get(key) != 0) {
				answer = key;
			}
		}

		return answer;
	}

	// 내가 풀은 방법.
	public String solution2(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[i];
	}

	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "leo", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		String result = solution(participant, completion);
		System.out.println("완주하지 못한 사람:" + result);
	}
}
