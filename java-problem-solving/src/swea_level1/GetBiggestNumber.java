package swea_level1;

import java.io.*;

public class GetBiggestNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			int[] numbers = new int[temp.length];
			
			int max = 0;
			
			for (int j=0; j<temp.length; j++) {
				
				int checkNumber = Integer.parseInt(temp[j]);
				numbers[j] = checkNumber;
				
				max = (checkNumber > max)? checkNumber : max;
				
			}
			
			bw.write("#" + String.valueOf(i + 1) + " "+String.valueOf(max));
			bw.write('\n');
			bw.flush();
		}
	}
	
}