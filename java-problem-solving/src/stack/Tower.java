package stack;

import java.util.*;

public class Tower {

	public static int[] solution(int[] heights) {

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> answerStack = new Stack<Integer>();

		int now = heights.length;
		// 몇번째 수를 검사중인지

		int start = 0;
		// 시작 수 세팅

		while (now > 0) {
			// now가 0보다 크거나 같을 때는 계속 반복

			//System.out.println(now);
			
			for (int i = start; i < now; i++) {
				// start부터 now 전까지
				stack.push(heights[i]);
			}
			// 스택에 집어넣고

			int top = stack.pop();
			// 가장 위에 수를 꺼내서

			//System.out.println("top : " + top);
			
			if(stack.isEmpty()) {
				answerStack.push(0);
			}else {
				
				while (true) {
					
					//System.out.println("peek : "+stack.peek());

					if (top >= stack.peek()) {
						// 그 다음수와 비교한다. top이 더 크다면
						
						stack.pop();
						// stack의 수 하나 날리고

						if (stack.isEmpty()) {

							// 스택이 비었으면
							answerStack.push(0);
							// 정답 스택에 0 넣고
							break;
							// 탈출
						}

					} else {
						// top이 더 작다면
						answerStack.push(stack.size());
						// stack의 크기 == top보다 큰 수가 있는 수의 위치
						// stack의 사이즈를 answer 스택에 넣는다
						break;
						// 탈출
					}
				}
				
			}

			now--;

			start = stack.size();
			// 비어있는 수

		}

		//System.out.println(answerStack.size());

		int[] answer = new int[heights.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerStack.pop();
		}

		return answer;
	}

	public static void main(String[] args) {

		//int[] heights = { 6, 9, 5, 7, 4 };
		// {0,0,2,2,4}

		// int[] heights = {3,9,9,3,5,7,2};
		// {0,0,0,3,3,3,6}

		 int[] heights = {1,5,3,6,7,6,5};
		// {0,0,2,0,0,5,6}

		int[] answer = solution(heights);

		for (int i : answer) {
			System.out.println(i);
		}

	}

}
