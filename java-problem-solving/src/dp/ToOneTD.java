package dp;

import java.io.*;

public class ToOneTD {

	static int[] d;
	// 메모해둘 배열

	static int go(int n) {

		if (n == 1) {
			return 0;
		}
		// 답을 구할 수 없는 가장 작은 문제

		if (d[n] > 0) {
			return d[n];
		}
		// 메모되어 있다면 메모된 값을 리턴한다

		// go(n) = n을 1로 만들 수 있는 최소 연산 횟수
		// 그리고 n은 1을 빼거나 2로 나누어 떨어지면 2로, 3으로 나누어 떨어지면 3으로 나눌 수 있다.
		
		// 그러니까 이 문제는 n을 n-1로 만드는 1가지 방법에 n-1을 1로 만드는 횟수를 구해 더하는 방법 
		// n이 2로 나누어 떨어지면 n을 2로 나누는 1가지 방법에 n/2 를 1로 만드는 횟수를 구해 더하는 방법
		// n이 3으로 나누어 떨어지면 n을 3으로 나누는 1가지 방법에 n/3 을 1로 만드는 횟수를 구해 더하는 방법 으로 나누어 풀 수 있다.
		
		
		d[n] = go(n - 1) + 1;
		// 1. go(n-1) =  n-1을 1로 만들 수 있는 최소 연산 횟수

		if (n % 2 == 0) {

			int temp = go(n / 2) + 1;
			// 2. go(n / 2) = n/2를 1로 만드는 최소 연산 횟수
			
			if (d[n] > temp) {
				// 최소 연산을 구하니 비교해주고
				d[n] = temp;
				// temp가 작으면 temp를 d[n]에 메모한다
			}

		}

		if (n % 3 == 0) {
			int temp = go(n / 3) + 1;
			/// 3. go(n / 3) = n/3을 1로 만드는 최소 연산 횟수
			
			if (d[n] > temp) {
				// 최소 연산을 구하니 비교해주고 
				d[n] = temp;
				// temp가 작으면 temp를 d[n]에 메모한다
			}
		}
		
		// n-1 -> n/2 -> n/3 순으로 진행하는 이유는 최소값을 편하게 구하기 위함이다
		// 최소 값을 구할 때는 비교 대상이 필요한데 
		// 2나 3으로 나누는 것은 나누어 떨어질 때만 사용할 수 있는데 1을 빼는 것은 아무때나 사용가능하기 때문에
		// 먼저 1을 빼는 방식으로 구한 값들을 메모해두고 
		// 2로 나누는 방법으로 구한 값, 3으로 나누는 방법으로 구한 값들과 비교하면 최소값을 구할 수 있다. 

		return d[n];
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		d = new int[n + 1];
		// n까지 저장해야 하니 n + 1로 배열 생성
		
		int val = go(n);

		bw.write(val + "\n");
		bw.flush();

	}

}
