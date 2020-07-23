package programmers;

public class NextBigNumber {

	public static int solution(int n) {
		int answer = 0;

		String binary = Integer.toBinaryString(n);

		int cnt = 0;

		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				cnt++;
			}
		}

		int index = 1;

		while (true) {

			String temp = Integer.toBinaryString(n + index);
			int tempCnt = 0;

			for (int i = 0; i < temp.length(); i++) {
				if (temp.charAt(i) == '1') {
					tempCnt++;
				}
			}

			
			if (cnt == tempCnt) {
				answer = n + index;
				break;
			}
			
			

			index++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 78;
		// int n = 15;

		int result = solution(n);
		System.out.println(result);
	}

}
