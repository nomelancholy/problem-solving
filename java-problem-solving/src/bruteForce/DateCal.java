package bruteForce;

import java.io.*;

public class DateCal {

	public static void main(String[] args) throws IOException {

		// 가능한 경우의 수는 15 * 28 * 19

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");

		int eVal = Integer.parseInt(temp[0]);
		int sVal = Integer.parseInt(temp[1]);
		int mVal = Integer.parseInt(temp[2]);
		// 값 세팅

		int e = 1;
		int s = 1;
		int m = 1;
		// 1부터 출발

		int answer = 1;
		// 초기값 1로 세팅

		while (true) {
			// 무한 루프 돌리는데
			if (e == eVal && s == sVal && m == mVal) {
				// 위 조건이 성립하면
				break;
				// 반복 탈출
			} else {
				// 아니면
				answer++;

				e++;
				s++;
				m++;
				// 모두 1씩 추가
				if (e == 16) {
					e = 1;
				}
				if (s == 29) {
					s = 1;
				}
				if (m == 20) {
					m = 1;
				}
				// 범위를 벗어날 경우 1로 초기화
			}
		}

		bw.write(String.valueOf(answer));

		bw.flush();

	}

}
