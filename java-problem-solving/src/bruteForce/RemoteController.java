package bruteForce;

import java.io.*;

public class RemoteController {

	static boolean[] broken = new boolean[10];
	// 버튼 고장 여부 저장할 배열

	private static int possible(int c) {
		// 채널이 들어오면
		if (c == 0) {
			// 0일경우 
			if (broken[0]) {
				// 0이 고장났으면
				return 0;
				// 바로 이동하지 못하니 0을 리턴
			} else {
				// 아니면
				return 1;
				// 한번에 갈 수 있으니 1을 리턴
			}
		}

		int len = 0;
		// 길이 0으로 초기화

		while (c > 0) {
			// 채널이 0보다 크고
			if (broken[c % 10]) {
				// 뒤에서부터 해당 숫자 버튼이 고장났는지 확인
				return 0;
				// 고장났으면 리턴 0
			}
			len += 1;
			// 한번 반복할 때마다 len을 1씩 추가하고 
			c /= 10;
			// c를 뒤 한자리를 날린 값으로 갱신한다 
		}

		return len;
		// 반복이 끝날 때까지 고장난 버튼이 없었다면 len을 리턴한다
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 이동하려는 채널

		String[] temp = br.readLine().split(" ");

		for (String s : temp) {
			int i = Integer.parseInt(s);
			broken[i] = true;
			// 고장난 버튼들은 true로 표시
		}

		int answer = n - 100;
		// 정답은 이동하려는 채널에서 지금 채널인 100을 뺀 값으로 초기화
		// ( 버튼이 모두 고장났다면 + 혹은 -를 n-100 번 눌러야하니 ) 

		if (answer < 0) {
			// 뺀 값이 음수면
			answer = -answer;
			// 양수로 만들어준다
		}

		for (int i = 0; i <= 1000000; i++) {
			// 이동하려는 채널이 50만까지고 채널은 무한대이니 100만까지를 범위로 잡고 0부터 100만까지 
			int c = i;
			
			int len = possible(c);
			// 0부터 10만까지 그 채널로 바로 이동이 가능한지 확인한다
			if (len > 0) {
				// 이동이 가능할 경우
				int press = c - n;
				// c에서 n을 빼서 + - 로 이동해야하는 횟수를 구하고
				
				if (press < 0) {
					press = -press;
				}
				// ( 음수일 경우 양수로 만든다 )
				if (answer > len + press) {
					// len + press가 answer 보다 작을 경우
					answer = len + press;
					// 정답 갱신
				}
			}

		}

		bw.write(String.valueOf(answer));
		bw.flush();
		// 출력

	}

}
