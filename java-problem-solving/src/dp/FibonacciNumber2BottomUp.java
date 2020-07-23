package dp;

import java.io.*;

public class FibonacciNumber2BottomUp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성

		int n = Integer.parseInt(br.readLine());

		long[] fibonacci = new long[91];

		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		bw.write(String.valueOf(fibonacci[n]));
		bw.flush();

	}

}
