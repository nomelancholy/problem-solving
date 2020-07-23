package dp;

import java.io.*;

public class Tilling2xN2TD {

	private static int[] memo;

	public static int tilling(int n) {

		if (n == 1) {
			memo[n] = 1;
			return memo[n];
		}
		
		if (n == 2) {
			memo[n] = 3;
			return memo[n];
		}

		// 기저 사례 세팅
		
		if (memo[n] > 0) {
			return memo[n];
		}
		
		// 메모된 값이 있으면 메모된 값 출력

		memo[n] = tilling(n - 1) + (2 * tilling(n - 2));
		// tilling(int n) = tilling(n - 1) + (2 * tilling(n - 2)) 란 점화식을 활용해 값 저장후
		memo[n] %= 10007;
		// 문제 요구에 따라 나머지 연산 후 저장

		return memo[n];
		// 리턴

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 1 <= n <= 1,000

		memo = new int[n + 1];

		int answer = tilling(n);
		// 크기가 2 X N인 직사각형을 1 X 2, 2 X 1 타일로 채우는 방법의 수

		bw.write(String.valueOf(answer));
		// 출력
		bw.flush();

	}

}
