package swea_level1;

import java.io.*;

public class PlusOddNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 1; i <= t; i++) {
			String[] temp = br.readLine().split(" ");
			int[] a = new int[temp.length];
			int answer = 0;

			for (int j = 0; j < temp.length; j++) {
				a[j] = Integer.parseInt(temp[j]);

				if (a[j] % 2 == 1) {
					answer += a[j];
				}
			}

			bw.write("#" + String.valueOf(i) + " " + String.valueOf(answer));
			bw.write('\n');
			bw.flush();
		}
	}
}
