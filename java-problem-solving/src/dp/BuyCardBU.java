package dp;

import java.io.*;

public class BuyCardBU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 구매해야하는 카드 갯수

		String[] temp = br.readLine().split(" ");
		int[] prices = new int[n + 1];
		// 가격 저장할 배열

		for (int i = 0; i < n; i++) {
			prices[i + 1] = Integer.parseInt(temp[i]);
			// String to int
		}

		int[] d = new int[n + 1];
		// d[n] = n개의 카드를 구매하기 위해 지불해야 하는 금액의 최대값
		// 이는 i개가 들어있는 카드팩을 샀을 때 사용한 금액 + n-i개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최대값과 같다 
		
		// d[n] =  d[n-i] + prices[i] 
		
		for (int i = 1; i <= n; i++) {
			// 1개를 구매해야할 때부터 n개를 구매해야 할 때 까지
			for (int j = 1; j <= i; j++) {
				// n개 짜리 n-1] 
				if(d[i] < d[i-j] + prices[j]) {
					 
					d[i] = d[i-j] + prices[j];
				}
			}
		}

		bw.write(String.valueOf(d[n]));
		bw.flush();

	}

}
