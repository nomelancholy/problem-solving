package bruteForce;

import java.io.*;

public class PrevPermutation {

	static boolean prevPermutation(int[] a) {

		int i = a.length - 1;
		// a배열의 가장 뒤에서 부터

		while (i > 0 && a[i - 1] <= a[i]) {
			// i가 처음에 도착하기 전까지
			// a[i-1]이 a[i]보다 큰 순간을 찾는다
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

		while (a[j] >= a[i - 1]) {
			// a[j]가 a[i-1]보다 작은 순간을 찾을 때 까지 
			j--;
			// j 감소
		}

		// i, j 찾았으면
		
		int temp = a[i - 1];
		a[i - 1] = a[j];
		a[j] = temp;
		// swap

		j = a.length -1;
		// j를 다시 a의 가장 뒤로 세팅해서
		
		while (i < j) {
			// j가 i보다 큰 동안에는
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			// 계속 swap
			i++;
			j--;
			//i는 증가 j는 감소하는 식으로 
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

		if (prevPermutation(a)) {
			for (int i = 0; i < n; i++) {
				bw.write(String.valueOf(a[i] + " "));
			}
		} else {
			bw.write("-1");
		}
		// 출력

		bw.flush();

	}

}
