package dp;
import java.io.*;

public class PinaryNumberTD {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		long[] pinaryNumber = new long[n + 1];

		pinaryNumber[1] = 1;

		// 기저사례 세팅

		if (n >= 2) {
			pinaryNumber[2] = 1;

			for (int i = 3; i <= n; i++) {

				pinaryNumber[i] = pinaryNumber[i - 1] + pinaryNumber[i - 2];
				// pinaryNumber[i] = i 자리 이친수의 갯수
				// pinaryNumber[i-1] = 마지막에 온 숫자가 0일 경우 그 전에 온 숫자는 알 수 없다
				// pinaryNumber[i-2] = 마지막에 온 숫자가 1일 경우 그 전에는 0만 올 수 있다. 그 전에 온 숫자는 알 수 없다
			}
		}

		long answer = pinaryNumber[n];

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}