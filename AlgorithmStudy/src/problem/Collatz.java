package problem;

// 콜라츠 추측
public class Collatz {
	public int solution(int num) {
		// 1-1. 입력된 수가 짝수라면 2로 나눕니다.
		// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
		// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
		long n = (long) num;

		int count = 0;
		while (n != 1) {
			if (count > 500) {
				count = -1;
				break;
			}
			count++;
			if (n % 2 == 0) {
				n = n / 2;
			} else if (n % 2 != 0) {
				n = n * 3 + 1;
			}
		}
		return count;

//		// 다른사람 풀이
//		long n = (long) num;
//		for (int i = 0; i < 500; i++) {
//			if (n == 1)
//				return i;
//			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
//		}
//		return -1;
	}

	public static void main(String[] args) {
		Collatz col = new Collatz();
		System.out.println(col.solution(626331));
	}

}
