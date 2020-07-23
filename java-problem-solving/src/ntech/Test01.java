package ntech;

public class Test01 {

	public static void main(String[] args) {

		Test01 test01 = new Test01();

		test01.encoding("AAAAABBBBCCCCCDDDEEEFF");

	}

	public String encoding(String input) {

		int wordCnt = 1;
		String[] words = input.split("");
		StringBuilder sb = new StringBuilder("");

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i - 1) == input.charAt(i)) {

				if (i == input.length() - 1) {
					sb.append(wordCnt + input.charAt(i));
				} else {
					wordCnt++;
				}

			} else {
				sb.append(wordCnt + input.charAt(i - 1));
				wordCnt = 1;
			}

		}
		
		System.out.println(sb.toString());

		return null;
	}

	public String decoding(String input) {

		return null;
	}

}
