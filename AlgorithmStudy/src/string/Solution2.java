package string;

public class Solution2 {

	public String solution(int n) {
		String answer = "";
		String result = "";
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else if (i % 2 == 1) {
				answer += "박";
			}
			// 삼항연산자로 풀기
			result += i%2 == 0 ? "수" : "박";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(4));
	}

}
