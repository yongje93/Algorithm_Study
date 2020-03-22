package string;

public class Solution {

	public boolean solution(String s) {
		boolean answer = true;

		if (s.length() != 4 && s.length() != 6) {
			answer = false;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < '0' || c > '9') {
				answer = false;
			}
		}

		return answer;
	}

	public boolean solution2(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				int x = Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		} else
			return false;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean result = sol.solution("a234");
		System.out.println(result);
	}

}
