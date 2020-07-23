package kakao2019;

public class Exam04 {

	public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {

			int answerCnt = 0;

			String s = queries[i];
			// 물음표 숫자
			int cnt = 0;

			if (s.startsWith("?")) {
				// ?????
				if (s.charAt(s.length() - 1) == '?') {
					// 시작부터 끝까지 ? 면
					for (String w : words) {
						if (s.length() == w.length()) {
							// 글자수 같을때마다 answerCnt ++
							answerCnt++;
						}
					}
				} else {
					// ???abc

					for (int j = 0; j < s.length(); j++) {
						// ? 가 더는 안나오는 곳 까지 확인
						if (s.charAt(j) != '?') {
							break;
						}
						cnt++;
					}

					// 물음표 숫자 확인
					int qCnt = cnt;

					for (String w : words) {
						if (s.length() == w.length()) {

							if (w.endsWith(s.substring(qCnt))) {
								answerCnt++;
							}

						}
					}

				}

			} else {
				// abc ???

				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == '?') {
						// ?가 나오는 지점까지 cnt ++
						break;
					}
					cnt++;
				}
				// 글자수 확인
				int wordCnt = cnt;
				// 검사
				for (String w : words) {
					if (s.length() == w.length()) {
						// 총 글자수 같고
						if (w.startsWith(s.substring(0, wordCnt))) {
							// 구한 글자수 까지 subString한 것과 w의 시작이 같으면
							answerCnt++;
						}
					}
				}

			}

			answer[i] = answerCnt;

		}

		return answer;
	}

	public static void main(String[] args) {

		Exam04 exam = new Exam04();

		String[] words = { "frodo", "front", "frost", "frozen", "frame", "kakao" };
		String[] queries = { "fro??", "????o", "fr???", "fro???", "pro?" };

		int[] answer = exam.solution(words, queries);

		for (int i : answer) {
			System.out.println(i);
		}

	}

}
