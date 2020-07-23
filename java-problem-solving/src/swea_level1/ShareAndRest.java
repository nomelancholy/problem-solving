package swea_level1;

import java.io.*;

public class ShareAndRest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] temp = br.readLine().split(" ");

			int numerator = Integer.parseInt(temp[0]);
			int denominator = Integer.parseInt(temp[1]);

			int share = numerator / denominator;
			int rest = numerator % denominator;

			bw.write("#" + String.valueOf(i + 1) + " " + String.valueOf(share) + " " + String.valueOf(rest));
			bw.write('\n');

		}

		bw.flush();

	}

}
