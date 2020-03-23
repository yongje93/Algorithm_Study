package array;

// 자연수 뒤집어 배열로
public class NumToArray {
	public int[] solution(long n) {
		int[] answer = {};
		String[] temp = String.valueOf(n).split("");
		answer = new int[temp.length];

		for (int i = 0; i < temp.length; i++) {
			answer[i] = Integer.parseInt(temp[temp.length - i - 1]);
		}
		return answer;
	}

	public static void main(String[] args) {
		NumToArray nta = new NumToArray();
		int[] array = nta.solution(12345);
		for (Integer n : array) {
			System.out.print(n + " ");
		}
	}

}
