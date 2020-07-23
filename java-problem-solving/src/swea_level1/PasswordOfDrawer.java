package swea_level1;

import java.io.*;

public class PasswordOfDrawer {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		
		
		int password = Integer.parseInt(temp[0]);
		int start = Integer.parseInt(temp[1]);
		
		int answer = password - start + 1;
		
		bw.write(String.valueOf(answer));
		bw.flush();
		
	}
	
}
