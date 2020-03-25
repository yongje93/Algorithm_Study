package string;

public class Strange {
	public String solution(String s) {
		String answer = "";
		int temp = 0;
		String[] data = s.split("");

		for (int i = 0; i < data.length; i++) {
			if (" ".equals(data[i])) {
				temp = 0;
			} else {
				if (temp % 2 == 0) {
					data[i] = data[i].toUpperCase();
					temp++;
				} else if (temp % 2 != 0) {
					data[i] = data[i].toLowerCase();
					temp++;
				}
			}
			answer += data[i];
		}

		return answer;

		// 다른사람 풀이
//		String answer = "";
//		int cnt = 0;
//		String[] array = s.split("");
//
//		for (String ss : array) {
//			cnt = ss.contains(" ") ? 0 : cnt + 1;
//			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//		}
//		return answer;
	}

	public static void main(String[] args) {
		Strange strange = new Strange();
		System.out.println(strange.solution("try hello world"));
	}

}
