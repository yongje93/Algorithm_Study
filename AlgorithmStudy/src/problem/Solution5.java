package problem;

public class Solution5 {

	boolean solution(String s) {
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;
		
		s = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p') pCount++;
			if(s.charAt(i) == 'y') yCount++;
		}
		
		if(pCount == 0 && yCount == 0) answer = true;
		else if(pCount != yCount) answer = false;
		
		return answer;
		
		// 다른사람 풀이
		//return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		boolean bol = sol.solution("pPoooyyY");
		System.out.println(bol);
	}

}
