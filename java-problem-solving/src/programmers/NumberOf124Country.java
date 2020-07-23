package programmers;

import java.util.*;

public class NumberOf124Country {

	public static String solution(int n) {

		String[] numbers = { "4", "1", "2" };
		// 나머지 활용을 위한 세팅
		Stack<String> stack = new Stack<String>();
		// stack 생성
		
		
		do {
			if(!stack.isEmpty()) {
				// n이 3보다 클 때만
				n = n / 3;
				
				if (stack.peek().equals("4")) {
					// 자릿수가 바뀌어야 할 때면
					n = n - 1;
				}
				
			}
			
			stack.push(numbers[n % 3]);
		} while (n > 3);
		// do ~ While 처리

		StringBuilder sb = new StringBuilder("");
		// StringBuilder 생성
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
			// 스택 꺼내 sb에 담고
		}

		String answer = sb.toString();
		// to String

		return answer;
		//출력
	}

	public static void main(String[] args) {

		// int n = 1; ~3
		// ok;

//		1 1
//		2 2
//		3 4
//		4 11
//		5 12
//		6 14
//		7 21
//		8 22
//		9 24
//		10 41
//		11 42
//		12 44
//		13 111
//		14 112
//		15 114
//		16 121
//		17 122
// 		18 124		
		int n = 13;
		// 12

		String answer = solution(n);

		System.out.println(answer);

	}

}
