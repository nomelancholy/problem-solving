package programmers;

import java.io.*;
import java.util.*;

public class Budget {

	public static int solution(int[] d, int budget) {

		// 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 한다.
		// 지원은 신청한 만큼 전부 해줘야 한다

		// 1 <= d <= 100
		// 1 <= d[n] <= 100,000
		// 1 <= budget <= 10,000,000

		int answer = 0;
		// 정답 변수 선언 및 0으로 초기화
		Arrays.sort(d);
		// 작은 수가 앞에 오게 배열 정렬

		for (int i = 0; i < d.length; i++) {
			// 배열 끝까지 도는데
			if (d[i] <= budget) {
				// 부서가 신청한 예산이 총예산 잔액보다 작으면
				budget -= d[i];
				// 총예산에서 그만큼 빼고
				answer++;
				// 정답 카운트 올린다
			} else {
				// 부서가 신청한 예산이 총예산잔액보다 큰 순간이 오면
				break;
				// 더이상의 반복은 무의미하니까 break;
			}
		}

		return answer;
		// 지원해 줄 수 있는 부서의 최대 값

	}

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] d = { 2, 2, 3, 3 };
		int budget = 10;

		int answer = solution(d, budget);

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
