package array;

// 행렬의 덧셈
public class SumOfArray {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		SumOfArray sum = new SumOfArray();
		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 4 } };
		int[][] arr2 = { { 3, 4, 5}, { 5, 6, 7 } };
		int[][] array = sum.solution(arr1, arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(array[0][i]);
		}
	}

}
