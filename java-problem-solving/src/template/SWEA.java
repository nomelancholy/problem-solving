package template;

import java.io.*;

public class SWEA {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] temp = br.readLine().split(" ");
			

			bw.write("#" + String.valueOf(i + 1) + " ");
			bw.write('\n');
			bw.flush();
		}

 	}

}
