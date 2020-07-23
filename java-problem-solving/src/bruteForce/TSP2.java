package bruteForce;

import java.io.*;
import java.util.Scanner;

public class TSP2 {

	static boolean nextPermutation(int[] a) {

		// 가장 첫 순열은 오름차순으로 정렬되어 있다

		// 가장 마지막 순열은 내림차순으로 정렬되어 있다

		int i = a.length - 1;
		// a배열의 가장 뒤에서 부터

		while (i > 0 && a[i - 1] >= a[i]) {
			// i가 처음에 도착하기 전까지
			// a[i]가 a[i-1]보다 큰 순간을 찾는다
			i--;
			// i 감소
		}

		if (i <= 0) {
			// 못찾고 i가 0에 도달하면
			return false;
			// return false
		}

		// i 찾았으면

		int j = a.length - 1;
		// 다시 a배열 가장 뒤에서부터

		while (a[j] <= a[i - 1]) {
			// a[j]가 a[i-1]보다 큰 순간을 찾을 때 까지
			j--;
			// j 감소
		}

		// i, j 찾았으면

		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		// swap

		j = a.length - 1;
		// j를 다시 a의 가장 뒤로 세팅해서

		while (i < j) {
			// j가 i보다 큰 동안에는
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			// 계속 swap
			i++;
			j--;
			// i는 증가 j는 감소하는 식으로
		}

		return true;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
		// 이차원 배열에 값 세팅

		int[] d = new int[n];
		// 인덱스로 쓸 배열 생성

		for (int i = 0; i < n; i++) {
			d[i] = i;
		}
		// d에 0부터 n-1까지 세팅

		int answer = Integer.MAX_VALUE;
		// int중 최대값으로 세팅

		do {
			if(d[0] != 0) {
				break;
			}
			// 시작점을 1로 고정 
			// 1 2 3 4 == 2 3 4 1 == 3 4 1 2 == 4 1 2 3 모두 같기 때문
			
			boolean ok = true;
			// flag
			int sum = 0;
			// 합 담을 변수
			for (int i = 0; i < n - 1; i++) {
				// 0부터 n-2까지
				if (a[d[i]][d[i + 1]] == 0) {
					// 0을 만나면
					ok = false;
					// flag false로
				} else {
					sum += a[d[i]][d[i + 1]];
					// 아니면 sum 을 더한다
				}
			}
			// 반복 완료하고
			if (ok && a[d[n - 1]][d[0]] != 0) {
				// ok flag가 true고 마지막에서 처음으로 올 수있는 상황이면
				sum += a[d[n - 1]][d[0]];
				// 마지막에서 처음으로 돌아오는 부분을 더하고
				if (answer > sum) {
					//대소 비교
					answer = sum;
					// 갱신
				}
			}
		} while (nextPermutation(d));

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
