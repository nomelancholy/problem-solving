package dp;

import java.io.*;

public class BuyCard2TD {

	public static int[] d;
	public static int[] prices;

	public static int buyCard(int n) {

		if (d[n] > 0) {
			return d[n];
			// 메모한 값이 있다면 사용
		}

		if (n == 1) {
			// 하나 살 때
			d[n] = prices[n];
			// 최소 가격은 prices[1] 이다
			return d[n];
		}
		// 이걸 기저 사례로 세팅

		for (int i = 1; i <= n; i++) {
			// n개 살 때 1개 들어있는 카드팩을 구매 + 나머지했을 때 부터
			// n개 들어있는 카드팩 하나만 구매했을 때까지
			if (d[n] == 0 || d[n] > buyCard(n - i) + prices[i]) {
				d[n] = buyCard(n - i) + prices[i];
			}

			// 반복하며 재귀를 내려 보내고
			// 가장 작은 걸 d[n]의 값으로 저장
		}

		return d[n];
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 구매해야하는 카드 갯수

		String[] temp = br.readLine().split(" ");
		prices = new int[n + 1];
		// 가격 저장할 배열

		for (int i = 0; i < n; i++) {
			prices[i + 1] = Integer.parseInt(temp[i]);
			// String to int
		}

		d = new int[n + 1];
		// d[n] = n개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최초값
		// 이는 i개가 들어있는 카드팩을 샀을 때 사용한 금액 + n-i개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최대값과 같다

		// d[n] = d[n-i] + prices[i]

		int answer = buyCard(n);

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
