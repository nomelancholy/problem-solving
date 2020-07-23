package dp;

import java.io.*;

public class LISBU {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		// 숫자들 저장할 배열
		int[] d = new int[n];
		// 증가하는 수열 길이 저장할 배열
		// d[i] = a[1], ~~ a[i] 까지 수열이 있을 때 a[i]를 마지막으로 하는 가장 긴 증가하는 부분 수열의 길이
		
		String[] words = br.readLine().split(" ");

		for (int i = 0; i < words.length; i++) {
			a[i] = Integer.parseInt(words[i]);
		}
		// split 해서 숫자를 넣는다

		for (int i = 0; i < n; i++) {
			// 0부터 n까지
			d[i] = 1;
			// 증가하는 수열 길이를 1로 놓고
			for (int j = 0; j < i; j++) {
				// 처음부터 i까지 비교하며
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					// a[i]가 a[j] 보다 크고 d[j] + 1 값이 d[i]보다 길면
					d[i] = d[j] + 1;
					// 증가하는 수열 길이를 증가시켜준다
				}
			}
		}
		
		int answer = 0;
		
		for(int i: d) {
			// d 배열에서
			if(answer < i) {
				// 최대값 찾아서
				answer = i;
			}
		}

		bw.write(String.valueOf(answer));
		// 출력
		bw.flush();

	}

}
