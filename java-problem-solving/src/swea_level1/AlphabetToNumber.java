package swea_level1;

import java.io.*;

public class AlphabetToNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String temp = br.readLine();

		for (int i = 0; i < temp.length(); i++) {
			int number = temp.charAt(i) - 64;
			bw.write(String.valueOf(number) + " ");
		}
		
		bw.flush();
	}

}
