package math;

import java.io.*;

public class GoldbachsPartition {

	public static final int MAX = 1000000;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성

		boolean[] isNotPrime = new boolean[MAX + 1];
		// 소수 판별 배열 선언

		isNotPrime[0] = true;
		isNotPrime[1] = true;
		// 0과 1 제외

		for (int i = 2; i < MAX; i++) {
			if (isNotPrime[i] == false) {
				// 소수 찾으면
				for (int j = i + i; j <= MAX; j += i) {
					isNotPrime[j] = true;
					// 그 배수들 소수가 아니라 표시
				}
			}
		}
		// MAX까지 소수 판별

		int n = Integer.parseInt(br.readLine());
		// 입력 받을 갯수

		for (int i = 0; i < n; i++) {
			// 입력 받은 만큼 돈다
			
			int count = 0;

			int m = Integer.parseInt(br.readLine());
			// 확인할 수 입력 받아서

			for (int j = 3; j < m; j++) {
				// 표시된 소수 배열 3부터 돌면서
				if (isNotPrime[j] == false && j >= m-j) {
					// 소수 찾고 j 가 m-j보다 클 경우만이라는 조건을 달아 중복을 방지한 다음
					if (isNotPrime[m - j] == false) {
						count++;
						// 카운트 올린다
					}
				}
			}

			bw.write(count + "");
			bw.write('\n');
			bw.flush();

		}

	}

}
