package bruteForce;

import java.io.*;
import java.util.*;

public class MaximumDifference {

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

		if (i == 0) {
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

		String[] temp = br.readLine().split(" ");

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}

		Arrays.sort(a);
		// 모든 경우를 다해봐야 하니 정렬

		int answer = 0;

		do {
		// 첫 순열부터 계산해야 하니 do - while 사용
			int tempInt = calculate(a);
			// 계산해서
			answer = Math.max(answer, tempInt);
			// 최대값 비교
		} while (nextPermutation(a));
		// 모든 순열 전부 돌아가면서 한다
		
		bw.write(String.valueOf(answer));
		bw.flush();

	}

	private static int calculate(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i < a.length; i++) {
			sum += Math.abs(a[i] - a[i - 1]);
			// 문제에서 차이의 절대값을 구하라고 했으니 절대 값 반환
		}

		return sum;
	}

}
