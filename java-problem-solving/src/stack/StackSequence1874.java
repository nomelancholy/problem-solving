package stack;

import java.io.*;
import java.util.Stack;

public class StackSequence1874 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// reader 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// writer 생성
		Stack<Integer> stack = new Stack<Integer>();
		// Stack 생성
		String input = "";
		// String 입력받을 변수 선언

		StringBuilder answer = new StringBuilder("");
		// 정답 더할 StringBuilder 생성

		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);
		// 반복 갯수 입력받아서 형변환

		// 이전 값 저장할 변수
		int preVal = 0;

		// 첫 라인에서 입력받은 반복 갯수만큼 반복
		for (int i = 0; i < n; i++) {

			input = br.readLine();
			int inputNum = Integer.parseInt(input);
			// 문장을 입력받아 숫자로 만든다

			// 입력받은 숫자가 이전 숫자보다 크다면
			if (inputNum > preVal) {

				// 그 차만큼
				int repeatCount = inputNum - preVal;

				// 반복한다.
				for (int j = 0; j < repeatCount; j++) {
					// 이전값 증가시키고
					preVal++;
					// 증가시킨 값 스택에 넣고
					stack.push(preVal);
					// 정답 sb에 + 추가
					answer.append("+\n");

					// 마지막 반복 횟수가 되면
					if (j == repeatCount - 1) {
						// 하나를 pop하고
						stack.pop();
						// 정답 sb에 - 추가
						answer.append("-\n");
					}

				}

			} else {
				// 입력받은 숫자가 이전 숫자 보다 작을 경우

				// 스택이 비어있지 않을 경우
				if (!stack.isEmpty()) {

					// 입력한 숫자와 스택 가장 위 숫자가 같은지 확인하고
					// ( 그렇지 않을 이 수열을 완전히 만들 방법이 사라지므로 )
					if (inputNum == stack.peek()) {
						// 하나 빼고
						stack.pop();
						// 정답 sb에 - 추가
						answer.append("-\n");
					} else {
						// 아니면 NO만 StringBuilder에 더해 break;로 빠져나간다.
						answer = new StringBuilder("");
						answer.append("NO");
						break;
					}

				}

			}

		}
		// 모인 값 추가
		bw.write(answer.toString());

		br.close();
		bw.flush();
		bw.close();
		// reader와 writer를 닫는다

	}

}
