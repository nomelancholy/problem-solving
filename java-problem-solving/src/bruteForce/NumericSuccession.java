package bruteForce;

import java.io.*;

public class NumericSuccession {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		// n을 입력 받는다
		
		// 1부터 9까지는 한자리
		// 10부터 99까지는 두자리
		// 100부터 999까지는 세자리...
		
		// 89 * 2
		
		
		// 899 * 3 
		
		// 4 
		
		// 1 <= n <= 100000000 

		long answer = 0;
		// 정답 입력 받을 변수
		
		for(int start = 1, len=1 ; start<=n; start*=10, len++) {
			// start 변수 ( 10씩 증가 ) 와 len 변수 ( 1씩 증가 )
			// 둘 다 start가 n보다 작을 동안은 반복시킨다 
			
			int end = start * 10 - 1;
			// 끝지점 세팅
			
			if(end > n) {
				// 만약 끝지점이 n보다 크면
				end = n;
				// n이 끝지점
			}
			
			answer += (long)(end-start+1) * len;
			// 자릿수마다 정답 더한다
			
		}
		
		
		bw.write(String.valueOf(answer));
		// 출력
		
		bw.flush();

	}
	
}
