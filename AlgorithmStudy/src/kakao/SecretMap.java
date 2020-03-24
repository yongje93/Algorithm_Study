package kakao;

// 비밀지도
public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] binaryArr = new String[n];
		
		// 비트연산자...
		for (int i = 0; i < n; i++) {
			binaryArr[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
			binaryArr[i] = String.format("%" + n + "s", binaryArr[i]);
			binaryArr[i] = binaryArr[i].replace("0", " ");
			binaryArr[i] = binaryArr[i].replace("1", "#");
		}
		
		return binaryArr;
	}

	public static void main(String[] args) {
		SecretMap map = new SecretMap();
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] arr = map.solution(5, arr1, arr2);
		for (String	s : arr) {
			System.out.println(s);
		}
	}

}
