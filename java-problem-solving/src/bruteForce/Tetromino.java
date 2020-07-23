package bruteForce;

import java.io.*;

public class Tetromino {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 회전과 대칭 모두 되니 19 * 500 * 500 가지 경우의 수가 있음

		String[] sizeTemp = br.readLine().split(" ");

		int n = Integer.parseInt(sizeTemp[0]);
		int m = Integer.parseInt(sizeTemp[1]);
		// 사이즈 저장

		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(temp[j]);
			}
		}
		// 숫자들 저장

		int ans = 0;
		// 정답 변수
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j + 3 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i][j + 3];
					if (ans < temp)
						ans = temp;
				}
				if (i + 3 < n) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 2][j] + a[i + 3][j];
					if (ans < temp)
						ans = temp;
				}
				if (i + 1 < n && j + 2 < m) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j + 2];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j + 1 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i + 2][j];
					if (ans < temp)
						ans = temp;
				}
				if (i + 1 < n && j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 2];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j - 1 >= 0) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 2][j] + a[i + 2][j - 1];
					if (ans < temp)
						ans = temp;
				}
				if (i - 1 >= 0 && j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i - 1][j + 2];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j + 1 < m) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 2][j] + a[i + 2][j + 1];
					if (ans < temp)
						ans = temp;
				}
				if (i + 1 < n && j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j + 1 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i + 1][j + 1] + a[i + 2][j + 1];
					if (ans < temp)
						ans = temp;
				}
				if (i + 1 < n && j + 1 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i + 1][j + 1];
					if (ans < temp)
						ans = temp;
				}
				if (i - 1 >= 0 && j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i - 1][j + 1] + a[i - 1][j + 2];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j + 1 < m) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 2][j + 1];
					if (ans < temp)
						ans = temp;
				}
				if (i + 1 < n && j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i + 1][j + 1] + a[i + 1][j + 2];
					if (ans < temp)
						ans = temp;
				}
				if (i + 2 < n && j - 1 >= 0) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 1][j - 1] + a[i + 2][j - 1];
					if (ans < temp)
						ans = temp;
				}
				if (j + 2 < m) {
					int temp = a[i][j] + a[i][j + 1] + a[i][j + 2];
					if (i - 1 >= 0) {
						int temp2 = temp + a[i - 1][j + 1];
						if (ans < temp2)
							ans = temp2;
					}
					if (i + 1 < n) {
						int temp2 = temp + a[i + 1][j + 1];
						if (ans < temp2)
							ans = temp2;
					}
				}
				if (i + 2 < n) {
					int temp = a[i][j] + a[i + 1][j] + a[i + 2][j];
					if (j + 1 < m) {
						int temp2 = temp + a[i + 1][j + 1];
						if (ans < temp2)
							ans = temp2;
					}
					if (j - 1 >= 0) {
						int temp2 = temp + a[i + 1][j - 1];
						if (ans < temp2)
							ans = temp2;
					}
				}
			}
		}

		// 전부 비교

		bw.write(String.valueOf(ans));
		bw.flush();

	}

}
