package dp;

import java.io.*;

public class PinaryNumberBU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		long[][] pinaryNumber = new long[n + 1][2];

		pinaryNumber[1][0] = 0;
		pinaryNumber[1][1] = 1;
		// 기저사례 세팅

		if (n >= 2) {
			pinaryNumber[2][0] = 1;
			pinaryNumber[2][1] = 0;

			for (int i = 3; i <= n; i++) {

				pinaryNumber[i][0] = pinaryNumber[i - 1][1] + pinaryNumber[i - 1][0];
				// 처음이 아니면 1과 0 모두 올 수 있다

				pinaryNumber[i][1] = pinaryNumber[i - 1][0];
				// 마지막에 1이 오면 앞에는 0만 올 수 있다
			}
		}

		long answer = pinaryNumber[n][0] + pinaryNumber[n][1];

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
