package dp;

import java.io.*;

public class FibonacciNumber2Topdown {
	
	static long[] memo; 
	// 메모이제이션 배열 생성
	static long fibonacci(int n) {
		if(n<=1) {
			// 0과 1은 답을 구할 수 없는 가장 작은 수
			return n;
		}else {
			if(memo[n]>0) {
				// 메모 되어 있다면
				return memo[n];
				// 메모 값을 리턴
			}

			memo[n] = fibonacci(n-1) + fibonacci(n-2);
			// 재귀 호출 보내서 받은 값을 메모에 담고
			return memo[n];
			// 메모를 리턴
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성
		memo = new long[91];
		
		int n = Integer.parseInt(br.readLine());
		
		long answer = fibonacci(n);
		
		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
