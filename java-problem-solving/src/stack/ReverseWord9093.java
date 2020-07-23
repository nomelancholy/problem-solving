package stack;

import java.io.*;
import java.util.Stack;

public class ReverseWord9093 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// reader 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// writer 생성
		Stack<Character> stack = new Stack<Character>();
		// Stack 생성
		String input = "";
		// String 입력받을 변수 선언

		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);
		// 첫 라인을 읽고

		// 첫 라인에서 입력받은 라인만큼 반복
		for (int i = 0; i < n; i++) {
			input = br.readLine();
			// 한 줄을 읽고
			input += "\n";
			// 마지막을 의미할 개행문자 하나를 추가
			StringBuilder sb = new StringBuilder("");
			// char들을 더할 StringBuilder 생성

			// 문자열 길이만큼 반복하는데
			for (int j = 0; j < input.length(); j++) {

				if (input.charAt(j) == ' ' || input.charAt(j) == '\n') {
					// 띄어쓰기를 만난 경우
					while (!stack.isEmpty()) {
						// stack이 빌 때 까지
						sb.append(stack.peek());
						// stack의 가장 윗 값을 sb에 더하고
						stack.pop();
						// stack을 비운다
					}
					// stack이 모두 비고 마지막이 아니면 띄어쓰기도 더한다.
					if (input.charAt(j) == ' ') {
						sb.append(input.charAt(j));
					}

				} else {
					// 문자인 경우스택에 집어넣는다
					stack.push(input.charAt(j));
				}
			}

			bw.write(sb.toString() + "\n");
			// 그렇게 모인 sb를 출력하고

		}

		br.close();
		bw.flush();
		bw.close();
		// reader와 writer를 닫는다
	}

}
