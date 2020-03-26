package kakao;

// 다트게임
public class DartGame {
	public int solution(String dartResult) {
		int[] score = new int[3];
		char[] dart = dartResult.toCharArray();
		int round = -1;

		for (int i = 0; i < dart.length; i++) {
			if (dart[i] >= '0' && dart[i] <= '9') {
				round++;
				if (dart[i] == '1' && dart[i + 1] == '0') {
					score[round] = 10;
					i++;
				} else {
					// 숫자 CHAR(0-9)는 아스키코드 48부터 시작하므로, 48을 빼주면 숫자를 얻는다.
					score[round] = dart[i] - '0';
				}
			} else {
				if (dart[i] == 'D') { // D 제곱
					score[round] *= score[round];
				} else if (dart[i] == 'T') { // T 세제곱
					score[round] *= score[round] * score[round];
				} else if (dart[i] == '*') { // * 2배
					if (round > 0) {
						score[round - 1] *= 2;
					}
					score[round] *= 2;
				} else if (dart[i] == '#') { // # -1배
					score[round] *= -1;
				}
			}
		}
		
		return score[0] + score[1] + score[2];
	}

	public static void main(String[] args) {
		DartGame dart = new DartGame();
		System.out.println(dart.solution("1D2S3T*"));
	}

}
