package bruteForce;

import java.io.*;

public class NandM4Select {

	static int[] a = new int[10];

	// 결과 저장할 배열
	static void go(int index, int start, int n, int m, BufferedWriter bw) throws IOException {
		// index 채우려고 하는 위치

		if (index == m) {
			// index가 m과 같아지는 경우 ( 마지막일 경우 )
			for (int i = 0; i < m; i++) {
				// 0부터 m-1 까지 반복하며
				bw.write(String.valueOf(a[i]));
				// index마다 저장했던 숫자를 출력하고
				if (i != m - 1) {
					// i가 m-1과 같지 않으면 ( 끝이 아니면 )
					bw.write(" ");
					// 띄어쓰기를 추가한다.
				}
			}
			// 한 줄 출력이 끝나면
			bw.write('\n');
			// 줄 바꿔주고
			return;
			// 리턴
		}

		for (int i = start; i <= n; i++) {
			// i부터 n까지 반복
			
			a[index] = i;
			// index 번째 숫자를 i로 저장한다
			go(index + 1, i, n, m, bw);
			// index 1, 시작수 1 증가시켜서 재귀 보냈다가
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");

		int n = Integer.parseInt(temp[0]);
		// 1부터 n까지
		int m = Integer.parseInt(temp[1]);
		// 길이

		go(0, 1, n, m, bw);
		// index, n , m , writer

		bw.flush();

	}

}
