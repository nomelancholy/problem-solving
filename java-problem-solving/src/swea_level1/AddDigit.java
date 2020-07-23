package swea_level1;

import java.io.*;

public class AddDigit {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split("");
		
		int answer = 0;

		for (int i = 0; i < temp.length; i++) {
			answer += Integer.parseInt(temp[i]);
		}
		
		bw.write(String.valueOf(answer));
		bw.flush();

	}
	
}
