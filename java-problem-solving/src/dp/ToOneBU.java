package dp;

import java.io.*;

public class ToOneBU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] d = new int[10000001];
		// 입력 범위만큼 메모 배열 생성
		
		int n = Integer.parseInt(br.readLine());

		d[1] = 0;
		// 1을 1을 빼거나 2로 나누거나 3으로 나눠서 1로 만드는 방법은 없으니 0

		for (int i = 2; i <= n; i++) {
			// 2부터 n까지 , 말그대로 bottom-up 방식으로 쌓아 올라간다
			d[i] = d[i - 1] + 1;
			
			if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
				d[i] = d[i / 2] + 1;
			}

			if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
				d[i] = d[i / 3] + 1;
			}
		}
		
		bw.write(String.valueOf(d[n]));
		bw.flush();

	}

}
