package swea_level2;

import java.io.*;

public class WaterRateCompetition {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] temp = br.readLine().split(" ");
			
			int p = Integer.parseInt(temp[0]);
			int q = Integer.parseInt(temp[1]);
			int r = Integer.parseInt(temp[2]);
			int s = Integer.parseInt(temp[3]);
			int w = Integer.parseInt(temp[4]);
			
			int a = w * p;
			int b = 0;
			
			if(w > r) {
				b = q + (w-r) * s;
			}else {
				b = q;
			}
			
			int answer = Math.min(a, b);
			
			bw.write("#" + String.valueOf(i + 1) + " "+String.valueOf(answer));
			bw.write('\n');
			bw.flush();
		}

	}
	
}
