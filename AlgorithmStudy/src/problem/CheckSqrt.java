package problem;

// 정수 제곱근 판별
public class CheckSqrt {
	public long solution(long n) {
		double doubleSqrt = Math.sqrt(n);
		int intSqrt = (int) doubleSqrt;
		return intSqrt == doubleSqrt ? (long) Math.pow(intSqrt + 1, 2) : -1;
	}

	public static void main(String[] args) {
		CheckSqrt sqrt = new CheckSqrt();
		System.out.println(sqrt.solution(121));
	}

}
