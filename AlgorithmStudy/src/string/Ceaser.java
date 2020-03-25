package string;

public class Ceaser {
	public String solution(String s, int n) {
		String answer = "";
		char[] array = s.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				continue;
			else if (array[i] >= 'a' && array[i] <= 'z') {
				if (array[i] + n > 'z') {
					array[i] = (char) (array[i] + n - 26);
				} else {
					array[i] += n;
				}
			} else if (array[i] >= 'A' && array[i] <= 'Z') {
				if (array[i] + n > 'Z') {
					array[i] = (char) (array[i] + n - 26);
				} else {
					array[i] += n;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			answer += array[i];
		}

		return answer;

		// 다른사람 풀이
//		String result = "";
//		n = n % 26;
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (Character.isLowerCase(ch)) {
//				ch = (char) ((ch - 'a' + n) % 26 + 'a');
//			} else if (Character.isUpperCase(ch)) {
//				ch = (char) ((ch - 'A' + n) % 26 + 'A');
//			}
//			result += ch;
//		}
//		return result;
	}

	public static void main(String[] args) {
		Ceaser cea = new Ceaser();
		System.out.println(cea.solution("AB", 1));
		System.out.println(cea.solution("z", 1));
		System.out.println(cea.solution("a B z", 4));
	}

}
