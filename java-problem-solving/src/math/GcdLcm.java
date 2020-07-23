package math;

import java.io.*;

public class GcdLcm {

	static int gcd(int a, int b) {
		// 두 수 a b가 주어질 때
		if(b == 0) {
			// b가 0이 되면
			return a;
			// a가 두 수의 최대공약수고
		}else {
			// b가 0이 아니면
			return gcd(b,a % b);
			// b를 a의 자리로 , 
			// 그리고 a와 b를 나머지 연산 한 값을 b의 자리로 넣어 반복한다
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		// split
		int[] inputNumbers = new int[temp.length];
		// 같은 크기의 int형 배열을 생성하고

		for (int i = 0; i < temp.length; i++) {
			inputNumbers[i] = Integer.parseInt(temp[i]);
			// int로 변환
		}

		int gcd = gcd(inputNumbers[0], inputNumbers[1]);
		// 최대 공약수는 유클리드 호제법 활용
		int lcm = (inputNumbers[0] * inputNumbers[1]) / gcd;
		// 최소 공배수는 최소공배수 = A * B / 최대공약수 공식 활용
		 
		bw.write(String.valueOf(gcd));
		bw.write('\n');
		bw.write(String.valueOf(lcm));
		
		bw.flush();

	}

}
