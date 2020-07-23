package kakaoIntern;

import java.util.*;

public class Exam02 {

	public static int[] solution(String s) {

		Stack<Character> stack = new Stack<Character>();

		String[][] temp = new String[501][501];

		// {{ 가 두개일 때 쉼표만

		// {가 하나일 때

		StringBuilder sb = new StringBuilder();

		int index = 0;
		
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '{') {
				
				if(stack.size()==1) {
					start = i+1;
				}
				stack.push(s.charAt(i));
				// { 만나면 스택에 넣는다
			} else if (s.charAt(i) == '}') {
				// System.out.print(s.charAt(i) + " ");
				 
				if (stack.size() == 2) {
					
					end = i;
					
					String tempStr = s.substring(start,end);
					
					String[] splitStr = tempStr.split(",");
					
					System.out.println(splitStr.length);
					
					for(int j=0; j< splitStr.length; j++) {
						//temp[splitStr.length] = splitStr[j];
					}
					
					
					System.out.println("테스트 : "+tempStr);
					// 튜플간 닫는 괄호를 만났을 때
					//System.out.println("index : "+index);
					//System.out.println(sb.toString());
					//temp[index] = Integer.parseInt(sb.toString());
					// index 번째에 sb 를 Int화 해서 넣는다.

					sb = new StringBuilder("");
					// sb 초기화
				}
				stack.pop();
				// 스택에서 { 하나 뺀다

			} else if (s.charAt(i) == ',') {

				if (stack.size() == 1) {
					// 하나일때 == 튜플간 쉼표
					index = 0;
				}

				if (stack.size() == 2) {
					// 원소간 쉼표를 만나면
					index++;
					// index 올리고
					sb = new StringBuilder("");
					// sb 초기화
				}
			} else {
				// 숫자일 경우
				sb.append(s.charAt(i));
				// StringBuilder에 붙인다

			}

		}
		int size = 0;
//		for (int number : temp) {
//			if (number > 0) {
//				size++;
//			} else {
//				break;
//			}
//		}
		int[] answer = new int[size];
//		
//		for(int i=0; i<answer.length; i++) {
//			answer[i] = temp[i];
//		}

		return answer;
	}

	public static void main(String[] args) {

		 //String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		 //String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		 //String s = "{{20,111},{111}}";
		// String s = "{{123}}";
		String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

		int[] answer = solution(s);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		// 2,1,3,4
		//

		// int answer = solution();

		// System.out.println(answer);
	}

}
