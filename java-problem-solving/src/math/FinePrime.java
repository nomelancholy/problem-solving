package math;

import java.io.*;

public class FinePrime {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		// split
		
		int m = Integer.parseInt(temp[0]);
		int n = Integer.parseInt(temp[1]);
		// m부터 n까지의 소수를 찾아 출력하라
		
		// n까지 크기의 판별 배열 생성
		boolean[] isNotPrime = new boolean[n + 1];

		isNotPrime[0] = true;
		isNotPrime[1] = true;
		
		for (int i = 2; i <= n; i++) {
			// 2부터 n보다 작거나 같은 동안 반복
			if (isNotPrime[i] == false) {
				// 숫자 i가 소수로 체크되어 있지 않다면
				for (int j = i + i; j <= n; j += i) {
					// 그 배수를 시작으로 j가 n 보다 커지기 전까지 i만큼 더해가며
					isNotPrime[j] = true;
					// 그 배수들은 소수가 아니라고 체크한다
				}
			}
		}
		
		
		for(int i=m; i<isNotPrime.length; i++) {
			// m부터 isNotPirme 배열 길이만큼 돌면서
			if(isNotPrime[i] == false) {
				// isNotPrime이 false면
				bw.write(String.valueOf(i));
				bw.write('\n');
				// 출력
			}
			
		}
		
		bw.flush();

	}

}
