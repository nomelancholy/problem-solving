package bruteForce;

import java.util.ArrayList;

public class MockTest {

	public static int[] solution(int[] answers) {

		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int firstCnt = 0;
		int secondCnt = 0;
		int thirdCnt = 0;

		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == first[i % first.length]) {
				firstCnt++;
			}

			if (answers[i] == second[i % second.length]) {
				secondCnt++;
			}

			if (answers[i] == third[i % third.length]) {
				thirdCnt++;
			}

		}

		ArrayList<Integer> array = new ArrayList<Integer>();

		if (firstCnt == secondCnt) {

			if (firstCnt == thirdCnt) {
				array.add(1);
				array.add(2);
				array.add(3);
			} else if (firstCnt > thirdCnt) {
				array.add(1);
				array.add(2);
			} else if (firstCnt < thirdCnt) {
				array.add(3);
			}

		} else if (firstCnt == thirdCnt) {

			if (firstCnt > secondCnt) {
				array.add(1);
				array.add(3);
			} else if (firstCnt < secondCnt) {
				array.add(2);
			}

		} else if (secondCnt == thirdCnt) {
			if (secondCnt > firstCnt) {
				array.add(2);
				array.add(3);
			} else if (secondCnt < firstCnt) {
				array.add(1);
			}
		} else {

			if (firstCnt > secondCnt && firstCnt > thirdCnt) {
				array.add(1);
			} else if (secondCnt > firstCnt && secondCnt > thirdCnt) {
				array.add(2);
			} else if (thirdCnt > firstCnt && thirdCnt > secondCnt) {
				array.add(3);
			}

		}

		int[] answer = new int[array.size()];

		for (int i = 0; i < array.size(); i++) {
			answer[i] = array.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {

		//int[] answers = { 1, 2, 3, 4, 5 };
		// 1

		 int[] answers = {1,3,2,4,2};
		// 1,2,3

		int[] answer = solution(answers);

		for (int i : answer) {
			System.out.println(i);
		}

	}

}
