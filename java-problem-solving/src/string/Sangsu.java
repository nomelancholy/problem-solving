package string;

import java.io.*;

public class Sangsu {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		// 입력
		int[] reverseNumbers = new int[temp.length];
		// 숫자 저장 배열
		
		for (int i = 0; i < temp.length; i++) {
			String s = temp[i];
			s = new StringBuffer(s).reverse().toString();
			reverseNumbers[i] = Integer.parseInt(s);
			// 뒤집어서 저장
		}
		
		int answer = Math.max(reverseNumbers[0], reverseNumbers[1]);
		// 대소 비교
		bw.write(String.valueOf(answer));
		bw.flush();
		// 출력

		bw.close();
		br.close();
	}

}
