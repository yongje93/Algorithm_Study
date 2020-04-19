package level2;

import java.util.Stack;

// 레벨2 탑 (스택)
public class Top {

	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		Stack<Integer> topStack = new Stack<>();

		for (int i = 0; i < heights.length; i++) {
			topStack.push(heights[i]);
		}

		while (!topStack.isEmpty()) {
			int temp = topStack.pop();

			for (int i = topStack.size(); i >= 0; i--) {
				if (temp < heights[i]) {
					answer[topStack.size()] = i + 1;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Top top = new Top();
		int[] heights = { 6, 9, 5, 7, 4 };
		int[] answer = top.solution(heights);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+ " ");
		}
	}

}
