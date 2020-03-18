package problem;

public class Solution3 {

	public long solution(int a, int b) {
		long answer = 0;

		for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) {
			answer += i;
		}

		return answer;

		// 등차수열..
		// return sumAtoB(Math.min(a, b), Math.max(b, a));
	}

//	private long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;
//    }

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		long result = sol.solution(1000, 2000);
		System.out.println(result);
	}

}
