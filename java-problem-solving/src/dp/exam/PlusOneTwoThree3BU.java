package dp.exam;

import java.io.*;

public class PlusOneTwoThree3BU {

	static int LIMIT = 1000000;
	static long MOD = 1000000009L;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] d = new long[LIMIT + 1];

		d[0] = 1;
		// n 으로 0이 들어올 경우는 아무것도 하지 않는 한가지 방법이 있어야 하나]
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		// 1,2,3이 입력으로 들어올 때 기저사례 세팅

		for (int i = 4; i <= LIMIT; i++) {
			// 기저사례 활용해 4부터 최대 입력까지
			d[i] = ((d[i - 1] % MOD) + (d[i - 2] % MOD) + (d[i - 3] % MOD)) % MOD;
			 // 나머지 연산해서 배열에 저장
		}

		int times = Integer.parseInt(br.readLine());
		// 횟수 저장

		for (int i = 0; i < times; i++) {
			// 횟수 만큼
			int n = Integer.parseInt(br.readLine());

			// 테스트 케이스 받고
			bw.write(String.valueOf(d[n]));
			// 출력
			bw.write('\n');
			bw.flush();

		}

	}

}
