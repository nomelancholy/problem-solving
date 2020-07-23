package dp;

import java.io.*;

public class Tilling2XN2BU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 1 <= n <= 1,000
		
		int[] memo = new int[1001];

		memo[1] = 1;
		// 기저 사례 1. 크기가 2 x 1 인 직사각형을 타일로 채우는 방법은 1가지 뿐이다		
		memo[2] = 3;
		// 기저 사례 2. 크기가 2 x 1 인 직사각형을 타일로 채우는 방법이 3가지다. 
		// 1 x 2 두개 놓거나 2 x 1 두개 놓거나 2 x 2 하나 놓거나
		// 즉 마지막에 좌우로 2칸짜리 블록을 놓을 수 있는 방법이 두가지다

		for (int i = 3; i <= n; i++) {
			memo[i] = memo[i-1] + (2 * memo[i-2]);
			// 위의 기저 사례를 바탕으로 하나씩 쌓아나가고 
			memo[i] %= 10007;
			// 나머지 연산 + 저장
		}
		
		
		bw.write(String.valueOf(memo[n]));
		bw.flush();

	}

}
