package swea_level1;

import java.io.*;

public class GetAverrage {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String[] temp = br.readLine().split(" ");

			int total = 0;

			for (int j = 0; j < temp.length; j++) {

				int number = Integer.parseInt(temp[j]);
				total += number;

			}
			
			double averageDouble = total / (double)temp.length;
			int average = (int) (Math.round(averageDouble));
			
			bw.write("#" + String.valueOf(i+1) +" "+ String.valueOf(average));
			bw.write('\n');
			bw.flush();

		}

	}

}
