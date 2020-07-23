package stack;

import java.util.*;

public class FunctionalDevelopment {

	public static int[] solution(int[] progresses, int[] speeds) {

		// progresses = 진척도 length <= 100
		// speeds = 하루에 개발할 수 있는 양 length <= 100

		// 배포는 progresses 순서대로 되어야 한다
		// 두번째 기능이 먼저 개발되어도
		// 첫번째 기능이 배포되지 않았다면 배포할 수 없다

		// 배포는 진도가 100% 일때마 가능하다

		// 각 배포마다 몇 개의 기능이 배포되는지 출력

		Stack<Integer> stack = new Stack<Integer>();
		// 스택 생성

		ArrayList<Integer> array = new ArrayList<Integer>();
		// 정답 저장용 동적 배열 생성

		int t = progresses.length;

		while (t-- > 0) {
			stack.push(progresses[t]);
		}
		// progresses 수들 뒤에서부터 스택에 담고

		int position = 0;
		// 위치 확인용 변수

		while (!stack.isEmpty()) {
			// stack이 다 빌때 까지 반복하는데

			for (int i = 0; i < progresses.length; i++) {
				progresses[i] = progresses[i] + speeds[i];
				// 일단 각 progreeses 를 각 speeds만큼 더한다
				System.out.println("progresses[" + i + "] : " + progresses[i]);
			}

			if (progresses[position] >= 100) {
				// 먼저 개발해야 하는 기능 진도가 100이상이 되면

				do {
					position++;
					// 포지션을 1 증가시키는데

					if (position == progresses.length) {
						// 배열끝에 도달했으면
						break;
						// 반복 중지
					}

				} while (progresses[position] >= 100);
				// 아직 다 완성되지 않은 배열을 찾을때 까지 반복한다.

				int cnt = 0;
				// 이번 배포때 배포할 기능의 수

				if (array.isEmpty()) {
					// 동적 배열이 비어있으면
					cnt = position;
				} else {

//					System.out.println("position : " + position);
//					System.out.println("index : " + (array.size() - 1));
//					System.out.println("array : " + array.get((array.size() - 1)));
					
					int temp = 0;
					for(int i=0; i<array.size(); i++) {
						temp += array.get(i);
					}
					// 비어 있지 않으면
					cnt = position - temp;
					// 이미 완성한 갯수들에서 이번 position을 뺀 게 cnt
				}

				System.out.println("cnt : " + cnt);

				array.add(cnt);
				// 동적배열에 정답 더한 다음

				while (cnt-- > 0) {
					System.out.println("stack cnt : " + cnt);
					// cnt 가 0이 될 때 까지
					stack.pop();
					// stack을 비운다
				}

			}

		}

		int[] answer = new int[array.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = array.get(i);
		}
		// 동적 배열 정답 배열로 복사해서

		return answer;
		// 리턴
	}

	public static void main(String[] args) {

//		int[] progresses = { 93, 30, 55 };
//		int[] speeds = { 1, 30, 5 };

		int[] progresses = { 40, 93, 30, 55, 60, 65 };
		int[] speeds = { 60, 1, 30, 5, 10, 7 };

		// return = {1,2,3}

//		int[] progresses = {93, 30, 55, 60, 40, 65};
//		int[] speeds = {1, 30, 5 , 10, 60, 7};

		// return = {2,4}

		int[] answer = solution(progresses, speeds);

		for (int i : answer) {
			System.out.println(i);
		}

	}

}
