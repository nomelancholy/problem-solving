package stack;

import java.util.*;

public class StockPrice {

	public static int[] solution(int[] prices) {

		// 초단위로 기록된 주식 가격
		// 가격이 떨어지지 않은 기간을 각 초별로 구하라
		int[] answer = new int[prices.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		

		int t = prices.length - 1;

		answer[t] = 0;
		t--;
		answer[t] = 1;
		t--;
		// 끝 두자리는 0과 1로 고정된다

		while (t >= 0) {
			// 그 다음부터 0번째까지
			int v = 0;
			boolean stopFlag = false;

			for (int i = t + 1; i < prices.length; i++) {
				// 검사
				
				if (!stopFlag) {
					// stopFlag가 false면
					v++;
				}

				if (prices[t] > prices[i]) {
					// 크면 flag를 true로 바꿔 카운트를 멈춘다
					stopFlag = true;
				}

			}
			// 반복 종료하면

			answer[t] = v;
			// 값 넣고
			t--;
			// t 1 감소
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] prices = { 1, 2, 3, 2, 3 };
		// 4,3,1,1,0

		int[] answer = solution(prices);

		for (int i : answer) {
			System.out.println(i);
		}

	}

}
