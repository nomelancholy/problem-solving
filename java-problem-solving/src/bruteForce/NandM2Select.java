package bruteForce;

import java.io.*;

public class NandM2Select {

	static int[] a = new int[10];

	// 결과 저장할 배열
	static void go(int index, int selected, int n, int m, BufferedWriter bw) throws IOException {
		// index 자연수
		// selected 지금까지 선택한 수의 갯수

		// index라는 수를 결과에 포함할건지 확인

		if (selected == m) {
			// 선택한 수의 갯수가 m개에 도달한 경우
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

		if (index > n) {
			return;
		}
		// index가 n 보다 커지는 경우 예외 처리

		a[selected] = index;
		// selected 번째 숫자를 index로 저장한다
		go(index + 1, selected + 1, n, m, bw);
		// index 1, 선택된 숫자 1 증가시켜서 재귀 보냈다가

		// index를 결과에 포함할 때

		a[selected] = 0;
		// index 번째 숫자를 i로 저장한다
		go(index + 1, selected, n, m, bw);
		// index 1, 선택된 숫자 그대로 재귀 보냈다가

		// index를 결과에 포함하지 않을 때
		
		// 둘 다 재귀를 보낸다

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");

		int n = Integer.parseInt(temp[0]);
		// 1부터 n까지
		int m = Integer.parseInt(temp[1]);
		// 길이

		go(1, 0, n, m, bw);
		// index, selected, n , m , writer

		bw.flush();

	}

}
