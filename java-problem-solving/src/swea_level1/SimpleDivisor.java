package swea_level1;

import java.io.*;

public class SimpleDivisor {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				bw.write(String.valueOf(i + " "));
			}
		}
		bw.flush();
	}

}
