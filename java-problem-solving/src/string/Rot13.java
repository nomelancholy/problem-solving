package string;

import java.io.*;

public class Rot13 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				// 소문자일 경우
				if ('z' < input.charAt(i) + 13) {
					// 13 옮겼을 때 알파벳 소문자의 범위를 벗어나면
					bw.write(('a' - 1) + ((input.charAt(i) + 13) - 'z'));
					// 차이만큼 a-1부터 다시 더해서 출력
				} else {
					// 아니면
					bw.write(input.charAt(i) + 13);
					// 그냥 출력
				}

			} else if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				// 대문자일 경우
				if ('Z' < input.charAt(i) + 13) {
					// 13 옮겼을 때 알파벳 대문자의 범위를 벗어나면
					bw.write(('A' - 1) + ((input.charAt(i) + 13) - 'Z'));
					// 상동
				} else {
					// 아니면
					bw.write(input.charAt(i) + 13);
				}

			} else {
				// 소문자나 대문자 아니면 그냥 출력
				bw.write(input.charAt(i));
			}

		}

		bw.flush();

	}

}
