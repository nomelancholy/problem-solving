package kakaoIntern;

public class Exam04 {

	static boolean[] checked;
	static long[] answer;
	
	public static long[] solution(long k, long[] room_number) {
		answer = new long[room_number.length];
		// 전체 방의 갯수 k

		// 원하는 방번호 room_number / 1< < 20000

		// 원하는 방번호가 비어있으면 준다
		// 원하는 방번호가 비어있지 않으면
		// 원하는 방번호보다 큰 수 중 가장 작은 비어있는 방의 번호가 주어진다

		checked = new boolean[(int) (k + 1)];
		// 나간 방 체크할 배열

		for (int i = 0; i < room_number.length; i++) {
			// 처음부터 방배정을 하는데

			if (checked[(int) room_number[i]]) {
				// 원하는 방이 나갔으면
				check(i,(int) room_number[i]);
				// 찾아서 주고

			} else {
				// 아니면
				answer[i] = room_number[i];
				checked[(int) room_number[i]] = true;
				// 그냥 준다
			}

		}

		// 정답 복사

		return answer;
	}

	private static void check(int index, int want) {
		for (int k = want + 1; k < checked.length; k++) {
			// 원한 방 다음방부터 시작해서
			if (!checked[k]) {
				// 비어있는 방 발견하면
				answer[index] = k;
				checked[k] = true;
				return;
			}
		}
	}

	public static void main(String[] args) {

		long k = 10;
		long[] room_number = { 1, 3, 4, 1, 3, 1 };

		long[] answer = solution(k, room_number);

		for (long l : answer) {
			System.out.println(l);
		}

		// System.out.println(answer);
	}

}
