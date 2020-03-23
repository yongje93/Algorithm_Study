package problem;

// 자릿수 더하기
public class Add {
	public int solution(int n) {
		int answer = 0;
		
		String number = n+"";
		String[] array = number.split("");
//		String[] array2 = String.valueOf(n).split("");
		for(int i = 0; i< array.length; i++) {
			answer += Integer.parseInt(array[i]);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Add add = new Add();
		System.out.println(add.solution(987));
	}

}
