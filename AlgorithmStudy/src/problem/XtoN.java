package problem;

public class XtoN {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for (int i = 1; i <= n; i++) {
			answer[i-1] = x*i;
		}
		return answer;
	}

	public static void main(String[] args) {
		XtoN x = new XtoN();
		long[] answer = x.solution(10000000, 1000);
		for (long l : answer) {
			System.out.println(l);
		}
	}

}
