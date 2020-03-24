package summer_winter;

import java.util.Arrays;

// 예산
public class Budget {
	public int solution(int[] d, int budget) {
		int dept = 0;
		Arrays.sort(d); // 예산 오름차순.
		for (int i = 0; i < d.length; i++) {
			if (budget >= d[i]) {
				budget -= d[i];
				dept++;
			}
		}
		return dept;
	}

	public static void main(String[] args) {
		Budget budget = new Budget();
		int[] d = { 2, 2, 3, 3 }; // { 1, 3, 2, 5, 4 };
		System.out.println(budget.solution(d, 10));
	}

}
