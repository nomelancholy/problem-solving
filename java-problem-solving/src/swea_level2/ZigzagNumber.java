package swea_level2;

import java.io.*;

public class ZigzagNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int number = Integer.parseInt(br.readLine());

			int answer = 0;

			for (int j = 1; j <= number; j++) {
				if (j % 2 == 1) {
					answer += j;
				} else {
					answer -= j;
				}
			}

			bw.write("#" + String.valueOf(i + 1) + " " + String.valueOf(answer));
			bw.write('\n');
			bw.flush();
		}

	}

}
