package problem;

// 약수의 합
public class Sum {
	public int solution(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println(sum.solution(12));
	}

}
