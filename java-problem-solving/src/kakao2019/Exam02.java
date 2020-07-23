package kakao2019;

import java.util.Stack;

public class Exam02 {

	public String solution(String p) {

		String answer = "";
		StringBuilder answerSb = new StringBuilder();

		// 입력이 빈 문자열일 경우 빈 문자열을 반환합니다
		if (p == null || p.length() == 0) {
			answer = "";
		} else {

			// 빈 문자열이 아닐 경우
			// 문자열 W를 두 균형잡힌 괄호 문자열 U, V로 분리합니다 .

			// 단 U는 더이상 분리할 수 없어야 합니다
			// == ( 로 시작하면 올바른 괄호 문자열이, ) 로 시작하면 그냥 균형잡힌 괄호 문자열이 나온다

			// ( 로 시작하는 경우 // 균형잡힌 괄호 문자열 U가 올바른 괄호 문자열인 경우
			if (p.startsWith("(")) {

				/* 균형 잡힌 괄호 문자열 만들기 */

				// 스택 생성
				// Stack<Character> stack = new Stack<Character>();

				int checkCnt = 0;
				// U와 V를 가르거나 문자열이 완성되었을 경우를 확인할 cnt 변수
				int cnt = 0;

				// W의 글자수 만큼 반복하는데
				for (int i = 0; i < p.length(); i++) {

					// ( 일 때는
					if (p.charAt(i) == '(') {

						// p의 i번째 캐릭터를 stack에 넣고
						// stack.push(p.charAt(i));
						checkCnt++;
						// 카운트를 올리고
						cnt++;
						// 반환하기 위해 추가
						answerSb.append(p.charAt(i));

					} else {
						// ) 일 때는

						// stack에서 빼고
						// stack.pop();
						checkCnt--;
						// cnt 증가
						cnt++;
						// 추가한다
						answerSb.append(p.charAt(i));

					}

					// 한번 반복하면 스택 비었는지 확인하고
					// 비었으면 반복문을 나온다
					if (checkCnt == 0) {
						break;
					}
				}

				// 반복 문을 나왔을 때 스택이 비었고 cnt와 p의 길이가 같다면
				if (checkCnt == 0 && cnt == p.length()) {
					// 더 확인할 게 없으니 answer return
					answer = answerSb.toString();
				} else {
					// 그렇지 않다면 solution 함수에 v를 넣고 재귀 - 반환 받은 문자열을 더한다

					String u = p.substring(0, cnt);
					String v = p.substring(cnt, p.length());

					answerSb.append(solution(v));
					answer = answerSb.toString();
				}

			} else {
				// ) 인 경우 // 균형잡힌 괄호 문자열 U가 올바른 괄호 문자열이 될 수 없는 경우

				//Stack<Character> stack = new Stack<Character>();
				int checkCnt = 0;
				int cnt = 0;

				// 일단 v를 찾기 위해 균형잡힌 괄호 문자열을 만든다
				for (int i = 0; i < p.length(); i++) {
					// 글자수 만큼 반복하는데
					if (p.charAt(i) == ')') {
						// ) 인 모든 경우를
						//stack.push(p.charAt(i));
						checkCnt ++;
						// stack 에 넣고
						cnt++;
						// count를 올린다
					} else {
						// ( 면 스택이 빌때까지 뺀다

						//stack.pop();
						checkCnt--;
						// cnt 증가
						cnt++;
					}
					// stack 비었는지 확인
					if (checkCnt==0) {
						break;
					}

				}

				// U가 올바른 괄호 문자열이 아닐 경우 U, V
				String u = p.substring(0, cnt);
				String v = p.substring(cnt, p.length());

				// 빈 문자열에 (를 붙이고
				answerSb.append("(");
				// v를 재귀시킨 결과를 붙이고
				answerSb.append(solution(v));
				// )를 다시 붙이고
				answerSb.append(")");

				// u의 첫번째와 마지막 문자를 제거하고
				StringBuilder uSb = new StringBuilder(u);

				// 마지막 문자 제거
				uSb.deleteCharAt(u.length() - 1);
				// 첫번째 문자 제거
				uSb.deleteCharAt(0);

				if (uSb.length() != 0) {
					uSb.reverse();
					String temp = uSb.toString();
					answerSb.append(uSb);
				}

				answer = answerSb.toString();

			}

		}

		return answer;
	}

	public static void main(String[] args) {

		 //String p = "(()())()";
		// String p = ")(";
		//String p = "()))((()";
		String p = ")))(((";

		Exam02 exam = new Exam02();

		String s = exam.solution(p);
		System.out.println(s);

	}

}
