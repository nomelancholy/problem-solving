package math;

import java.io.*;

public class Factorial {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성

		int n = Integer.parseInt(br.readLine());

		int answer = 1;

		if (n > 1) {
			// 1보다 크면 ( 0 팩토리얼은 1이다 )
			for (int i = 2; i <= n; i++) {
				answer *= i;
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
