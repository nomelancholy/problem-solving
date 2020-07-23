package stack;

import java.io.*;
import java.util.*;

public class PostfixExpression {

	public static int comparison(char ch) {
		if (ch == '(')
			return 0;
		if (ch == '+' || ch == '-')
			return 1;
		else
			return 2;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		Stack<Character> stack = new Stack<Character>();

		// 문자는 그냥 찍고
		// 기호는 우선순위에 따라 스택에 넣거나 출력

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				// 문자일 경우
				bw.write(input.charAt(i));
				// 그냥 출력
			} else if (input.charAt(i) == '(') {
				// 여는 괄호일 경우
				stack.push(input.charAt(i));
				// 스택에 추가
			} else if (input.charAt(i) == ')') {
				// 닫는 괄호일 경우
				while (!stack.isEmpty()) {
					// 스택이 빌 때 까지
					if (stack.peek() == '(') {
						// 여는 괄호를 만나면
						stack.pop();
						// 여는 괄홀 없애고
						break;
						// 반복 종료
					}
					bw.write(stack.pop());
					// 스택 상단 값을 출력하는데
				}
			} else {
				// * / + - 일 경우
				while (!stack.isEmpty() && comparison(stack.peek()) >= comparison(input.charAt(i))) {
					// 스택이 비어 있지 않고 스택 상단 값의 우선순위가 입력 문자보다 크면
					// 괄호안이 아니고 stack 최상단 값이 * 나 /면
					bw.write(stack.pop());
					// 스택 상단 값 출력
				}
				stack.add(input.charAt(i));
				// 다시 담는다
			}

		}

		while (!stack.isEmpty()) {
			// 반복 끝났는데 스택이 다 비어있지 않으면
			bw.write(stack.pop());
			// 스택 상단 값 출력
		}

		bw.flush();
	}

}
