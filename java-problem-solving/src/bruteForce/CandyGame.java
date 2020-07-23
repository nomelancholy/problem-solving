package bruteForce;

import java.io.*;

public class CandyGame {

	static int check(char[][] a) {
		int n = a.length;
		int ans = 1;
		for (int i = 0; i < n; i++) {
			// 한줄씩
			int cnt = 1;
			for (int j = 1; j < n; j++) {
				// 좌우 비교
				if (a[i][j] == a[i][j - 1]) {
					// 같으면
					cnt += 1;
					// cnt 증가
				} else {
					// 다르면
					cnt = 1;
					// cnt 1로 초기화
				}
				if (ans < cnt) {
					// cnt가 ans보다 크면
					ans = cnt;
					// answer 초기화 ( 한번에 하나씩 갱신 )
				}
			}
			cnt = 1;
			// cnt 초기화
			for (int j = 1; j < n; j++) {
				// 상하비교
				if (a[j][i] == a[j - 1][i]) {
					// 같으면
					cnt += 1;
					// cnt 증가
				} else {
					// 다르면
					cnt = 1;
					// 1로 초기화
				}
				if (ans < cnt) {
					// cnt가 ans보다 크면
					ans = cnt;
					// answer 초기화 ( 한번에 하나씩 갱신 )
				}

			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 크기 저장

		char[][] a = new char[n][n];
		// 배열 생성

		// 인접한 두칸을 고르고 사탕을 교환하는 방법의 수 = 2N^2 = N^2
		// 같은 색으로 이루어져 있는 가장 긴 연속 부분 행 또는 열을 고르는 문제 = O(N^2 )

		// 경우의 수 = O(n^4) / N <= 50

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = temp.charAt(j);
			}
		}
		// 입력 저장

		int ans = 0;
		// 정답 받을 변수
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j + 1 < n) {
					// 오른쪽 맨 끝이 아니면
					char t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
					// 좌우 swap
					int temp = check(a);
					// 체크하고
					if (ans < temp) {
						ans = temp;
					}
					// temp가 ans보다 클 경우 ans 갱신
					t = a[i][j];
					a[i][j] = a[i][j + 1];
					a[i][j + 1] = t;
					// 원위치
				}
				if (i + 1 < n) {
					// 가장 아래가 아니면
					char t = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = t;
					// 상하 swap
					int temp = check(a);
					// 체크하고
					if (ans < temp) {
						ans = temp;
					}
					// temp가 ans보다 클 경우 ans 갱신
					t = a[i][j];
					a[i][j] = a[i + 1][j];
					a[i + 1][j] = t;
					// 원위치
				}
			}
		}

		bw.write(String.valueOf(ans));
		// 정답 출력
		bw.flush();

	}

}
