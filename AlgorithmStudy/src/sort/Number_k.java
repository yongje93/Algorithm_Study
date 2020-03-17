package sort;

import java.util.Arrays;

public class Number_k {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] temp = {};

		for (int i = 0; i < commands.length; i++) {
			// copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
			temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] result = solution(array, commands);

		for (int i : result) {
			System.out.println(i);
		}
	}
}
