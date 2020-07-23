package dp;

import java.io.*;

public class Tilling2XNBU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 1 <= n <= 1,000
		
		int[] memo = new int[1001];

		memo[1] = 1;
		// 기저 사례 1. 크기가 2 x 1 인 직사각형을 타일로 채우는 방법은 1가지 뿐이다		
		memo[2] = 2;
		// 기저 사례 2. 크기가 2 x 1 인 직사각형을 타일로 채우는 방법은 2가지 뿐이다

		for (int i = 3; i <= n; i++) {
			// 3부터 n까지는
			memo[i] = memo[i-1] + memo[i-2];
			// 기저 사례를 바탕으로 하나씩 쌓아나가고 
			memo[i] %= 10007;
			// 문제의 요구대로 10007로 나눈 나머지를 저장한다
		}
		
		bw.write(String.valueOf(memo[n]));
		// memo[n]을 출력한다
		bw.flush();

	}

}
