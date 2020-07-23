package kakaoIntern;

import java.util.*;

public class Exam01 {

	public static int solution(int[][] board, int[] moves) {

		// board의 가장 뒤쪽 배열부터 순서대로
		// board.length개의 스택을 만들어서 쌓는다

		Stack<Integer> stack = new Stack<Integer>();
		// 바구니 역할 스택 생성

		for (int i : moves) {
			System.out.print(i + " ");
		}

		System.out.println();

		int answer = 0;
		// 터지는 횟수

		int cnt = 0;

		while (cnt <= moves.length - 1) {
			// moves의 모든 배열을 다 볼때까지 반복

			// System.out.println(cnt);

			int now = moves[cnt];
			// 이번에 확인하는 라인

			int catchNumber = 0;

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					// System.out.print(board[i][j] + " ");
					if (j == now - 1) {
						// now번째 라인만 확인

						if (board[i][j] == 0) {
							// 숫자가 0이면
							continue;
						} else {
							// 0이 아닌 수를 만나면
							catchNumber = board[i][j];
							// catchNumber 잡고

							board[i][j] = 0;
							// 그 숫자는 0으로 변경하고
							break;
						}

						// System.out.println(board[i][j]);
					}

				}
				if (catchNumber != 0) {
					break;
				}
				// System.out.println("===================");
			}

			if (catchNumber != 0) {
				// 잡은 숫자가 0이 아닌 경우에만

				if (stack.isEmpty()) {
					// stack이 비어있다면
					stack.push(catchNumber);
					// stack에 인형을 집어넣고
				} else {
					// 아니면

					System.out.println("가장 위 숫자 : "+stack.peek());
					System.out.println("넣을 숫자 : "+catchNumber);
					
					if (stack.peek() == catchNumber) {
						// 스택 가장 위를 봐서 catchNumber와 같으면
						answer= answer+2;
						// 정답 2개 올리면서(인형 2개 사라지니까
						stack.pop();
						// 인형 터트리고
					} else {
						stack.push(catchNumber);
						// 아니면 인형 넣는다
					}

				}

			}

			cnt++;
		}

		// 같은 모양의 인형 두개가 담기면 두 인형은 터져 사라진다

		// 바구니에 담는 과정에서 터트려져 사라진 인형의 갯수를 리턴한다

		return answer;
	}

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };

		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		int answer = solution(board, moves);

		 System.out.println(answer);
	}

}
