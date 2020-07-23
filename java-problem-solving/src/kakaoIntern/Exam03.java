package kakaoIntern;

import java.util.*;

public class Exam03 {

	public static int solution(String[] user_id, String[] banned_id) {

		// user_id == user id
		// banned_id == 불량 사용자 아이디

		// 아이디는 길이 1이상 8이하의 알파벳 소문자와 숫자로만 이루어져 있다

		// 불량 사용자 아이디 목록이 전달된 경우

		// 제재 아이디 목록의 경우의 수를 구하라

		String[][] mappingUser = new String[banned_id.length][user_id.length];
		// 매핑 될 수 있는 유저 벤 아이디 별로 모아놓은 배열

		for (int i = 0; i < banned_id.length; i++) {
			// 불량 사용자 id 길이만큼 반복하는데

			String banUser = banned_id[i];
			// 불량 사용자 하나
			boolean mappingFlag = false;
			// 체크할 flag

			for (int j = 0; j < user_id.length; j++) {
				// 불량 사용자 id하나 마다 모든 유저 아이디를 확인한다

				String user = user_id[j];
				// 일반 유저
				mappingFlag = true;
				// 일단 맞을 수 있다고 생각하고 출발

				if (user.length() == banUser.length()) {
					// 길이가 맞는 경우에만
					for (int k = 0; k < banUser.length(); k++) {
						// 글자수를 하나하나 검사하는데
						if (banUser.charAt(k) != '*') {
							// banUserid의 글자가 *가 아닌 경우

							if (banUser.charAt(k) != user.charAt(k)) {
								// banUser의 글자와 user의 글자가 같지 않다면
								mappingFlag = false;
								// 매핑될 수 없다
								break;
								// 반복 종료
							}
						}
					}
				} else {
					// 글자수가 다르면 어차피 무조건 다르다
					mappingFlag = false;
				}

				if (mappingFlag) {
					// true인채로 빠져나오면
					mappingUser[i][j] = user;
					// 매핑된 명단에 저장
					// i번째 banID에 j ID가 매핑됨
				}

			}

		}

		int answer = 0;
		
		// 갯수를 구하면되는데
		for (int i = 0; i < mappingUser.length; i++) {
			// i번째 banID에 매핑된
			for (int j = 0; j < mappingUser[i].length; j++) {
				// j번째 userID가 있을 경우
				if (mappingUser[i][j] != null && i == 0) {

					// int cnt = check(mappingUser[i][j]);
					// answer += cnt;
					// null이 아닐 경우 == 있다

				}

				System.out.print(mappingUser[i][j] + " ");

			}
			System.out.println();
		}

		return answer;
	}

	public static void main(String[] args) {

//		String[] user_id = { "frodo", "fradi", "crodo", "abc123", "frodoc" };
//		String[] banned_id = { "fr*d*", "abc1**" };
		// 2 ( frodo, abc123 ) / (fradi, abc12)

//		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
//		String[] banned_id = {"*rodo", "*rodo", "******"};
		// 2 (frodo,crodo, abc123) / (frodo, crodo, forodoc )

		String[] user_id = { "frodo", "fradi", "crodo", "abc123", "frodoc" };
		String[] banned_id = { "fr*d*", "*rodo", "******", "******" };
		// 3 ( frodo, crodo, abc123, frodoc) / ( fradi, crodo, abc123, frodoc ) / (
		// fradi,frodo,abc123,frodoc )

		// 중복 상관없다

		int answer = solution(user_id, banned_id);

		System.out.println(answer);
	}

}
