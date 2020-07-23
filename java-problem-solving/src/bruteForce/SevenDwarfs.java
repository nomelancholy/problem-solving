package bruteForce;

import java.io.*;
import java.util.Arrays;

public class SevenDwarfs {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] heights = new int[9];

		// 9명중에서 7명을 찾는 것. == 9명 중에서 2명을 찾는 것
		// 9 * 6 / 2 * 1 = 36가지 경우의 수

		int total = 0;

		for (int i = 0; i < 9; i++) {
			heights[i] = Integer.parseInt(br.readLine());
			total += heights[i];
			// 키의 총 합을 더하고
		}

		Arrays.sort(heights);
		// 정렬한 후

		for (int i = 0; i < 9; i++) {
			// 0부터 9까지와
			for (int j = i + 1; j < 9; j++) {
				// i+1 부터 9까지를 찾아서
				if (total - heights[i] - heights[j] == 100) {
					// 총합에서 i와 j를 뺀 값이 100인 경우
					for (int k = 0; k < 9; k++) {
						if (k == i || k == j) {
							continue;
							// 그 인덱스만 건너뛰고
						}
						bw.write(String.valueOf(heights[k]) + '\n');
						// 출력
					}
					bw.flush();
					System.exit(0);
					// 시스템 종료
				}
			}
		}

	}

}
