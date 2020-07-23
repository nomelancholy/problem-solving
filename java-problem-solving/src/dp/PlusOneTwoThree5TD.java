package dp;

import java.io.*;

public class PlusOneTwoThree5TD {

	public static long[][] memo;
	public static long MOD = 1000000009L;
	public static int LIMIT = 100000;

	public static long plus(int n) {
		if (n == 0) {
			return 0;
		}

		if (memo[n][1] + memo[n][2] + memo[n][3] > 0) {
			return (memo[n][1] + memo[n][2] + memo[n][3]) % MOD;
		}
		// 메모이제이션
		
		System.out.println();
		
		if (n - 1 >= 0) {
			memo[n][1] = (memo[(int) plus(n - 1)][2] + memo[(int) plus(n - 1)][3]) % MOD;

			if (n == 1) {
				memo[n][1] = 1;
			}

		}
		if (n - 2 >= 0) {
			memo[n][2] = (memo[(int) plus(n - 2)][1] + memo[(int) plus(n - 2)][3]) % MOD;
			if (n == 2) {
				memo[n][2] = 1;
			}

		}
		if (n - 3 >= 0) {
			memo[n][3] = (memo[(int) plus(n - 3)][2] + memo[(int) plus(n - 3)][3]) % MOD;
			if (n == 3) {
				memo[n][3] = 1;
			}
		}

		return (memo[n][1] + memo[n][2] + memo[n][3]) % MOD;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int times = Integer.parseInt(br.readLine());
		// 테스트 케이스 갯수 받고

		memo = new long[LIMIT + 1][4];

		for (int i = 0; i < times; i++) {

			int n = Integer.parseInt(br.readLine());
			// 숫자 입력 받아서

			long answer = plus(n);
			// 함수에 넣고 리턴 받아서

			bw.write(String.valueOf(answer));
			// 출력
			bw.write('\n');
			bw.flush();

		}

	}

}
