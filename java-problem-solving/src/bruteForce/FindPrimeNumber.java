package bruteForce;

import java.util.*;

public class FindPrimeNumber {

	// n까지 크기의 판별 배열 생성
	static boolean[] isNotPrime = new boolean[10000000];
	static int[] numbersArray;

	static boolean[] visited = new boolean[10];

	static void combination(char[] arr, int start, int n, int r) {
		
		if (r == 0) {
			print(arr, n);
			return;
		} else {
			for (int i = start; i < n; i++) {
				visited[i] = true;
				combination(arr, i + 1, n, r - 1);
				visited[i] = false;
			}
		}
	}

	static void print(char[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (visited[i] == true)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int solution(String numbers) {

		setSieveOfEratosthenes();
		// 1 <= numbers.length <= 7
		// 1부터 numbers로 만들 수 있는 최대 크기의 수인 9999999 까지의 소수를 모두 찾아 배열에 저장

		int answer = 0;

		char[] c = numbers.toCharArray();
		// 하나씩 잘라서 배열에 담는다

		for(int i=1; i<=c.length; i++) {
			combination(c, 0, c.length, i);
		}
		

		// 이 char들로 만들 수 있는 모든 조합을 만들어서 숫자로 바꾸고

		// 그 조합들의 숫자를 에라토스 테네스의 체에 걸러서 소수로 판별날 때 마다 카운트를 올리고

		// 리턴한다

		// 9999999

		return answer;
	}


	public static void main(String[] args) {

		//String numbers = "17";
		// 3

		 String numbers = "011";
		// 2

		solution(numbers);
	}
	
	private static void setSieveOfEratosthenes() {
		// TODO Auto-generated method stub

		isNotPrime[0] = true;
		isNotPrime[1] = true;
		// 0과 1은 소수에서 제외
		int n = 10000000;
		// numbers로 만들 수 있는 가장 큰 수의 크기

		for (int i = 2; i < n; i++) {
			// 2부터 n보다 작거나 같은 동안 반복
			if (isNotPrime[i] == false) {
				// 숫자 i가 소수로 체크되어 있지 않다면
				// 소수 발견! 소수 하나 체크하고
				for (int j = i + i; j < n; j += i) {
					// 그 배수를 시작으로 j가 n 보다 커지기 전까지 i만큼 더해가며
					isNotPrime[j] = true;
					// 그 배수들은 소수가 아니라고 체크한다
				}
			}
		}

	}

}
