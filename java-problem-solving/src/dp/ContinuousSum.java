package dp;

import java.io.*;

public class ContinuousSum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int d[] = new int[n];
		// 숫자 저장
		int a[] = new int[n];
		// 연속합 저장

		String[] words = br.readLine().split(" ");

		for (int i = 0; i < words.length; i++) {
			d[i] = Integer.parseInt(words[i]);
		}
		// 수 저장

		a[0] = d[0];
		// 첫 연속합은 처음 값 저장

		for (int i = 1; i < d.length; i++) {
			if (d[i] + a[i - 1] > d[i]) {
				// i번째 숫자랑 그간의 연속합을 더해서 합한게 i번째 수보다 크면
				a[i] = d[i] + a[i - 1];
				// 더한 값을 연속합에 저장
			} else {
				// 아니면
				a[i] = d[i];
				// 단독 값을 연속합에 저장
			}
		}
		int max = -1001;

		for (int i : a) {
			if (i > max) {
				max = i;
			}
		}

		bw.write(String.valueOf(max));
		// 마지막에 저장되어 있는 연속값을 출력

		bw.flush();

	}

}
