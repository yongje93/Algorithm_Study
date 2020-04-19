package level2;

import java.util.Arrays;

// 전화번호 목록
public class PhoneList {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		PhoneList phone = new PhoneList();
		String[] phone_book = { "119", "97674223", "1195524421" };
		System.out.println(phone.solution(phone_book));
	}

}
