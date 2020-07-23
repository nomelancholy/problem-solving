package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ReverseWord2_17413 {
	
	private static void printStack(BufferedWriter bw, Stack<Character> stack) throws IOException {
		while (!stack.isEmpty()) {
			bw.write(stack.pop());
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문자열이 주어진다.
		// 이는 < 로 시작해서 단어 혹윽 공백이 적혀있고 >로 끝나는 태그와 단어로 구성되어있다.
		// 태그는 뒤집지 말고 단어만 뒤집어라.

		String s = br.readLine();
		// Line 입력 받고 s 에 저장

		boolean tag = false;
		// tag 안인지 밖인지 확인할 flag 생성

		Stack<Character> stack = new Stack<Character>();
		// 단어들 뒤집을 Stack 생성

		for (int i = 0; i < s.length(); i++) {
		// 단어를 처음부터 끝까지 검사

			if (s.charAt(i) == '<') {
				// 태그 시작일 때
				
				tag = true;
				// tag 안인지 확인하는 flag를 true로 바꾸고
				
				printStack(bw,stack);
				// 그동안 stack에 쌓인 단어들을 스택이 빌 때 까지 비워준다

				bw.write(s.charAt(i));
				// 태그 출력
				
			} else if (s.charAt(i) == '>') {
				// 태그 종료일 때
				
				tag = false;
				// tag 안인지 확인하는 flag를 false로 바꾸고

				bw.write(s.charAt(i));
				// 그 단어 그대로 출력

			} else if (tag) {
				// 태그 안일 경우
				bw.write(s.charAt(i));
				// 그 단어 그대로 출력
			} else {
				// 태그 바깥일 경우
				if(s.charAt(i)==' ') {
					//공백이면
					printStack(bw,stack);
					// 그동안 stack에 쌓인 단어들을 스택이 빌 때 까지 비워준다
					bw.write(s.charAt(i));
					// 공백 출력
				}else {
					//공백이 아니면
					stack.push(s.charAt(i));
					// stack에 넣어준다 
				}

			}

		}
		
		// 반복이 끝나고 마지막일 경우
		printStack(bw,stack);
		// 그동안 stack에 쌓인 단어들을 스택이 빌 때 까지 비워준다
		
		// BufferedWriter 비움
		bw.flush();
		// reader, writer 종료
		bw.close();
		br.close();

	}

}
