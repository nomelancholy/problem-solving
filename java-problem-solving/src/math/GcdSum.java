package math;

import java.io.*;

public class GcdSum {

	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	// 유클리드 호제법

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 첫 줄 읽고
		for (int i = 0; i < n; i++) {
			// 첫 줄에 명시된 횟수만큼 반복
			String[] numbersStr = br.readLine().split(" ");
			// String으로 읽고 split
			int[] numbers = new int[numbersStr.length - 1];
			// 처음 갯수 하나를 제외하고 저장할거니까 하나 작게 만들어서
			for (int j = 1; j < numbersStr.length; j++) {
				numbers[j - 1] = Integer.parseInt(numbersStr[j]);
			}
			// String[] -> int[]

			long answer = 0;

			for (int j = 0; j < numbers.length - 1; j++) {
				for (int k = j + 1; k < numbers.length; k++) {
					answer += gcd(numbers[j], numbers[k]);
					// 순서대로 비교해가며 최대공약수 구해서 정답에 저장
				}
			}

			bw.write(String.valueOf(answer));
			bw.write('\n');
			
		}
		bw.flush();

	}

}
