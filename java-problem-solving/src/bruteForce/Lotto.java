package bruteForce;

import java.io.*; 

public class Lotto {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		while(true) {
			String[] temp = br.readLine().split(" ");
			
			int n = Integer.parseInt(temp[0]);
			
			if(n==0) {
				break;
			}
			
			int[] a = new int[n];
			
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(temp[i+1]);
			}
		}

//		int answer = solution();
//		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
