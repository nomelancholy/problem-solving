package swea_level1;

import java.io.*;

public class BigSameSmall {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] temp = br.readLine().split(" ");
			int[] numbers = new int[temp.length];

			for (int j = 0; j < temp.length; j++) {
				numbers[j] = Integer.parseInt(temp[j]);
			}

			String answer = "";

			if (numbers[0] == numbers[1]) {
				answer = "=";
			} else {
				answer = (numbers[0] > numbers[1]) ? ">" : "<";
			}

			bw.write("#" + String.valueOf(i + 1) + " "+answer);
			bw.write('\n');
			bw.flush();
		}

	}

}
