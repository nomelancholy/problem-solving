package swea_level1;

import java.io.*;

public class DoubleDouble {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int answer = 1;
		bw.write(String.valueOf(answer) + " ");
		
		for (int i = 0; i < n; i++) {

			answer *= 2;
			bw.write(String.valueOf(answer) + " ");
		
		}
		
		bw.flush();

	}
	
}
