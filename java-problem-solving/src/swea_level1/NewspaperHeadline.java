package swea_level1;

import java.io.*;

public class NewspaperHeadline {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		s = s.toUpperCase();
		
		bw.write(s);
		bw.flush();

	}
	
}
