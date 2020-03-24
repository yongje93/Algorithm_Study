package problem;

// 최대공약수 최소공배수
public class GcdAndLcm {
	public int[] solution(int n, int m) {
		int[] answer = {};
		int gcd = gcd(n, m);
		int lcm = lcm(n,m);
		answer = new int[] {gcd, lcm};
		return answer;
	}

	// 최대공약수는 유클리드 호제법
	public int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	// 최소공배수
	public int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String[] args) {
		GcdAndLcm gcd = new GcdAndLcm();
		int[] array = gcd.solution(2, 5);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
