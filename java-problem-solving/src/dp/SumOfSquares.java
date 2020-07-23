package dp;

import java.io.*;

public class SumOfSquares {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		// 142를 넣으면 3이 나와야 한다
		int[] d = new int[n + 1];
		// 최소 갯수 저장할 배열 변수
		// d[n] = n을 제곱수들의 합으로 표현할 때 그 항의 최소 갯수
		// d[n] = d[n-i^2] + 1 (마지막에 어떤수의 제곱이 올 때 = (i^2)항이 하나니까 1) 

		for (int i = 1; i <= n; i++) {
			// i부터 n까지
			d[i] = i;
			// i가지 있다고 초기화 하고 시작 ( 모든 수는 1^2의 합만으로 나타낼 수 있으니! )  
			for (int j = 1; j * j <= i; j++) {
				// 제곱의 수가 N보다 클수는 없으니 i (N) 까지 반복하며
				if (d[i] > d[i - j * j] + 1) {
					// d[i]와 d[i - j * j] + 1 비교해서 작으면
					d[i] = d[i - j * j] + 1;
					// 최소 갯수 변경
				}
			}
		}

		bw.write(String.valueOf(d[n]));

		bw.flush();

	}

}
