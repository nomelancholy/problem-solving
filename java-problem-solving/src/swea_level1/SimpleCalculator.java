package swea_level1;

import java.io.*;

public class SimpleCalculator {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		
		int i = Integer.parseInt(temp[0]);
		int j = Integer.parseInt(temp[1]);
		
		bw.write(String.valueOf(i + j));
		bw.write('\n');
		
		bw.write(String.valueOf(i - j));
		bw.write('\n');
		
		bw.write(String.valueOf(i * j));
		bw.write('\n');
		
		bw.write(String.valueOf(i / j));
		bw.write('\n');
		
		bw.flush();

	}

}
