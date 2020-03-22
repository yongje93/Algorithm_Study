package sort;

import java.util.Arrays;
import java.util.Collections;

public class Desending {

	public String solution(String s) {
		String answer = "";

		String[] array = s.split("");
		Arrays.sort(array, Collections.reverseOrder());
		answer = String.join("", array);

		return answer;
	}
	
	public String solution2(String str) {
		char[] sol = str.toCharArray();
	    Arrays.sort(sol);
	    
	    return new StringBuilder(new String(sol)).reverse().toString();
	}

	public static void main(String[] args) {
		Desending des = new Desending();
		String answer = des.solution("Zbcdefg");
		System.out.println(answer);
	}

}
