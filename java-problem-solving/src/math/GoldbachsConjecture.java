package math;

import java.io.*;

public class GoldbachsConjecture {

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
		
		int n;

		int a;
		int b;

		while ((n = Integer.parseInt(br.readLine())) != 0) {

			for (int i = 3; i < n; i++) {
				// 표시된 소수 배열 3부터 돌면서
				if (isNotPrime[i] == false) {
					// 소수 찾으면
					a = i;
					// a를 소수에 넣고
					if (isNotPrime[n - a] == false) {
						// n-a번째 배열도 소수면
						b = n - a;
						// b도 찾았으니
						bw.write(n + " = " + a + " + " + b);
						bw.write('\n');
						bw.flush();
						// 출력하고
						break;
						// 반복문 탈출
					}
				}
			}

		}

	}

}
