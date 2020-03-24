package problem;

public class Harshad {
	public boolean solution(int x) {
		String[] array = String.valueOf(x).split("");
		int sum = 0;
		for (String s : array) {
			sum += Integer.parseInt(s);
		}
		if(x % sum == 0) return true;
		else return false;
	}

	public static void main(String[] args) {
		Harshad has = new Harshad();
		System.out.println(has.solution(10));
	}

}
