package string;

import java.io.*;

public class FourNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] numbers = br.readLine().split(" ");
		// 스플릿

		long preTarget = Long.parseLong((numbers[0] + numbers[1]));
		long postTarget = Long.parseLong((numbers[2] + numbers[3]));
		
		bw.write(String.valueOf(preTarget+postTarget));
		bw.flush();
		
	}
	
}
