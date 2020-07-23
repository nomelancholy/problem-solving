package hash;

public class PhoneList {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++) {

			String criteria = phone_book[i];

			for (int j = 0; j < phone_book.length; j++) {
				if (j == i) {
					continue;
				}

				if (phone_book[j].startsWith(criteria)) {
					answer = false;
					break;
				}

				if (answer == false) {
					break;
				}
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = { "119", "97674223", "1195524421" };
		// false

		boolean answer = solution(phone_book);
		System.out.println(answer);
	}

}
