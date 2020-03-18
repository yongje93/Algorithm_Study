package problem;

public class String_middle {

	public String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}

		return answer;
	}

	public static void main(String[] args) {
		String_middle mid = new String_middle();
		String s1 = mid.solution("abcd");
		String s2 = mid.solution("abcde");
		System.out.println("s1: " + s1 + " s2: " + s2);
	}

}
