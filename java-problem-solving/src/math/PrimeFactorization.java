package math;

import java.io.*;

public class PrimeFactorization {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 입력 받는다

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				bw.write(String.valueOf(i));
				bw.write('\n');
				bw.flush();
				n /= i;
			}
		}
		// 숫자 n을 소인수 분해할때는
		// 2부터 루트 N까지 반복하면서
		// i로 나누어 떨어지면 n을 i로 나눈 값으로 n을 갱신하고 i를 출력
		// 을 더이상 나누어 떨어지는 수가 없을 때까지 반복하고

		if (n > 1) {
			bw.write(String.valueOf(n));
			bw.flush();
		}
		// n이 1보다 크면 마지막으로 n을 출력해준다

	}

}
