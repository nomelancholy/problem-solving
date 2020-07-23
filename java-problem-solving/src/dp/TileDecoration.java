package dp;

public class TileDecoration {

	public static long[] memo;

	public static long solution(int N) {

		memo = new long[N + 2];
		// 메모 배열 생성

		// 1 <= N <= 80
		long answer = fibonaci(N) * 2 + fibonaci(N + 1) * 2;

		// 그 이전 수 두개를 더해 다음수를 만든다

		// 둘레를 구하라 둘레는 지금수 * 2 + 다음수 *2다

		return answer;
	}

	private static long fibonaci(int n) {

		if (n == 1 || n == 2) {
			memo[n] = 1;
			return memo[n];
		}

		if (memo[n] > 0) {
			return memo[n];
		}

		memo[n] = fibonaci(n - 1) + fibonaci(n - 2);

		return memo[n];
	}

	public static void main(String[] args) {

		//int N = 5;
		// return 26;

		 int N=6;
		// return 42;

		long answer = solution(N);

		System.out.println(answer);

	}

}
