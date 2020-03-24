package problem;

public class PhoneNumber {
	public String solution(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}
		answer = answer + phone_number.substring(phone_number.length() - 4);
		return answer;

		// 다른사람 풀이
//		char[] ch = phone_number.toCharArray();
//		for (int i = 0; i < ch.length - 4; i++) {
//			ch[i] = '*';
//		}
//		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		PhoneNumber pn = new PhoneNumber();
		System.out.println(pn.solution("01033334444"));
	}

}
