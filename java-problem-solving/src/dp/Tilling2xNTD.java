package dp;

import java.io.*;

public class Tilling2xNTD {

	private static int[] memo;

	public static int tilling(int n) {

		if (n >= 0 && n <= 2) {
			memo[n] = n;
			// 기저 사례들 - 0,1,2 세팅
			return memo[n];
		}

		if (memo[n] > 0) {
			return memo[n];
		}

		memo[n] = tilling(n - 1) + tilling(n - 2);
		// 크기가 2 X N인 직사각형을 1 X 2, 2 X 1 타일로 채우는 방법의 수는
		// 마지막에 1 x 2 타일 하나가 올 때의 방법과 마지막에 2 X 1 타일 두개가 올 때의 방법의 합이다 
		memo[n] %= 10007;

		return memo[n];

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 1 <= n <= 1,000

		memo = new int[n + 1];
		// n 까지 저장해야하니 메모 배열 n+1 까지 생성

		int answer = tilling(n);
		// 크기가 2 X N인 직사각형을 1 X 2, 2 X 1 타일로 채우는 방법의 수

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
