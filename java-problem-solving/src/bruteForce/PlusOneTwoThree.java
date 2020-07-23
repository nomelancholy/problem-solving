package bruteForce;

import java.io.*;

public class PlusOneTwoThree {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		// 횟수 세팅
		
		for (int i = 0; i < t; i++) {
			// 반복하며
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(go(0, n)));
			// 0부터 출발 재귀해서 출력
			bw.write('\n');
		}

//		int answer = solution();
//		bw.write(String.valueOf(answer));
		bw.flush();

	}

	private static int go(int sum, int goal) {

		// sum : 현재까지 더해진 총 합
		// goal : 만들고자 하는 수
		
		if (sum > goal) {
			return 0;
		}
		// 절대 불가능한 경우
		
		if (sum == goal) {
			return 1;
		}
		// 정답을 찾은 경우
		
		int now = 0;
		
		for (int i = 1; i <= 3; i++) {
			// 1,2,3 만 사용할 수 있기 때문에!
			now += go(sum + i, goal);
			// 리턴값을 누적한다
		}
		// 다음 경우를 호출하는 경우

		return now;

	}

}
