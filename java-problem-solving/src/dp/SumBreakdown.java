package dp;

import java.io.*;

public class SumBreakdown {
	public static long mod = 1000000000L;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		
		int n = Integer.parseInt(temp[0]);
		// n
		int k = Integer.parseInt(temp[1]);
		// 더할 갯수 k
		
		long[][] d = new long[k+1][n+1];
		
		// d[k][n] = 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수
		
        d[0][0] = 1;
        // 기저사례 세팅
        
        for (int i=1; i<=k; i++) {
        	// 1개일때부터 K개일때까지
            for (int j=0; j<=n; j++) {
            	// o부터 n까지
                for (int l=0; l<=j; l++) {
                	// n을 만들기 위한 재료가 명시되어 있지 않으니 변수 l을 사용한다.
                	
                    d[i][j] += d[i-1][j-l];
                    // d[k][n] = d[k-1][n-l];
                    d[i][j] %= mod;
                }
            }
        }
		
		bw.write(String.valueOf(d[k][n]));
		bw.flush();

	}
}
