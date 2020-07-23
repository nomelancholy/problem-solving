package array;

import java.io.*;

public class AlphabetCount {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		int[] alphabetArray = new int[26];

		for (int i = 0; i < input.length(); i++) {
			int position = input.charAt(i) - 97;

			alphabetArray[position] += 1;

		}

		for (int i : alphabetArray) {
			bw.write(i + " ");
		}

		bw.flush();

	}

}
