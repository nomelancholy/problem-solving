package array;

import java.io.*;
import java.util.*;

public class AlphabetPosition {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		int[] alphabetArray = new int[26];
		Arrays.fill(alphabetArray, -1);

		for (int i = 0; i < input.length(); i++) {
			int position = input.charAt(i) - 97;
			if (alphabetArray[position] == -1) {
				alphabetArray[position] = i;
			}
		}

		for (int i : alphabetArray) {
			bw.write(i + " ");
		}

		bw.flush();

	}

}
