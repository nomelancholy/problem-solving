package arrayList;

import java.io.*;
import java.util.ArrayList;

public class Editor1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// reader 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// writer 생성
		ArrayList<Character> list = new ArrayList<Character>();
		// list 생성
		String input = br.readLine();
		// String 입력받음
		int cursor = input.length();
		// 커서 위치
		int max = input.length();
		// 오른쪽 끝 위치
		for (int i = 0; i < max; i++) {
			list.add(input.charAt(i));
		}
		// 리스트에 글자 담음

		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);
		// 첫 라인을 읽고

		// 첫 라인에서 입력받은 라인만큼 반복
		for (int i = 0; i < n; i++) {

			String command = br.readLine();
			// 명령어 입력 받음

			if (command.startsWith("L")) {
				// 커서가 맨 왼쪽이 아니면
				if (cursor > 0) {
					// 왼쪽으로 이동
					cursor--;
				}

			} else if (command.startsWith("D")) {
				// 커서가 맨 오른쪽이 아니면
				if (cursor < max) {
					// 오른쪽으로 이동
					cursor++;
				}

			} else if (command.startsWith("B")) {

				// 커서가 맨 왼쪽이 아니면
				if (cursor > 0) {
					// 왼쪽 글자 삭제
					list.remove(--cursor);
					// 글자수도 하나 감소
					max--;
				}

			} else if (command.startsWith("P")) {

				String[] pCommand = command.split(" ");
				// 커서 위치에 $ 입력
				list.add(cursor, pCommand[1].toCharArray()[0]);

				// 커서, 최대값 증가
				cursor++;
				max++;

			}

		}

		// sb에 더해서
		StringBuilder sb = new StringBuilder("");

		for (char c : list) {
			sb.append(c);
		}

		// 출력
		bw.write(sb.toString());

		br.close();
		bw.flush();
		bw.close();
		// reader와 writer를 닫는다
	}

}
