package dp;

import java.io.*;

public class PlusOneTwoThreeTD {

	public static int[] memo;

	public static int plus(int n) {
		
		if(n >= 11) {
			return 0;
			// 0으로 
		}

		if (memo[n] > 0) {
			// 메모에 값이 있으면
			return memo[n];
			// 메모값 리턴
		}

		if (n == 0) {
			memo[n] = 1;
			return memo[n];
		}

		if (n == 1) {
			memo[n] = 1;
			return memo[n];
		}

		if (n == 2) {
			memo[n] = 2;
			return memo[n];
		}

		if (n == 3) {
			memo[n] = 4;
			return memo[n];
		}

		// 기저 사례 세팅

		memo[n] = plus(n-1) + plus(n-2) + plus(n-3);
		// 끝에 1이 오는 경우 , 끝에 2가 오는 경우 , 끝에 3이 오는 경우일 때의 방법들을 모두 합하면
		// n일 때 값을 구할 수 있다 

		return memo[n];
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int times = Integer.parseInt(br.readLine());

		memo = new int[11];

		for (int i = 0; i < times; i++) {

			int n = Integer.parseInt(br.readLine());
			// 테스트 케이스 받고

			int answer = plus(n);

			bw.write(String.valueOf(answer));
			// 출력
			bw.write('\n');
			bw.flush();

		}

	}

}
