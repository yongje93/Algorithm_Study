package problem;

public class Average {
	public double solution(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		return (double)total / arr.length;
	}

	public static void main(String[] args) {

	}

}
