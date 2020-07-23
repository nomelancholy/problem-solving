package swea_level2;

import java.io.*;

public class SimplePrimeFactorization {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int number = Integer.parseInt(br.readLine());
			
			int[] base = new int[5];
			
			while(number != 1) {
				if(number % 2 == 0) {
					base[0]++;
					number /= 2;
				}else if(number % 3 == 0) {
					base[1]++;
					number /= 3;
				}else if (number % 5 == 0) {
					base[2]++;
					number /= 5;
				}else if (number % 7 == 0) {
					base[3]++;
					number /= 7;
				}else if (number % 11 == 0) {
					base[4]++;
					number /= 11;
				}
			}
			
			bw.write("#" + String.valueOf(i + 1) + " "+String.valueOf(base[0])+ " "+String.valueOf(base[1])+ " "+String.valueOf(base[2])+ " "+String.valueOf(base[3])+ " "+String.valueOf(base[4]));
			bw.write('\n');
			bw.flush();
		}

	}
}
