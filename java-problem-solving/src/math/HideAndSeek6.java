package math;

import java.io.*;

public class HideAndSeek6 {

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성

		String[] info = br.readLine().split(" ");
		// info[0]에 N / info[1]에 S
		String[] temp = br.readLine().split(" ");

		int[] distance = new int[temp.length];

		for (int i = 0; i < temp.length; i++) {
			if (Integer.parseInt(temp[i]) > Integer.parseInt(info[1])) {
				distance[i] = Integer.parseInt(temp[i]) - Integer.parseInt(info[1]);
			} else {
				distance[i] = Integer.parseInt(info[1]) - Integer.parseInt(temp[i]);
			}
		}

		int brothersCnt = Integer.parseInt(info[0]);

		int answer = distance[0];

		if (brothersCnt != 1) {
			// 동생이 한명이 아니면 최대 공약수를 구한다
			for (int i = 1; i < distance.length; i++) {
				answer = gcd(answer, distance[i]);
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
