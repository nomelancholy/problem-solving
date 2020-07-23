package math;

import java.io.*;

public class FactorialZero {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// reader writer 생성

		int n = Integer.parseInt(br.readLine());
		// n 팩토리얼에서 n
		int answer = 0;
		// 0의 갯수를 담을 변수
		
		for( int i = 5; i<= n; i*=5) {	
			answer += n/i;
		}
		

		// 팩토리얼에서 0의 갯수를 찾으려면 5가 몇번 나오는지만 확인하면 된다
		// n 팩토리얼 = 1부터 n까지 곱한 수이니
		// 곱하는 수 중에서 5의 배수인 수의 갯수는 n을 5로 나누면 알 수 있다.
		
		// 그런데 이 때 25 50 75 100 처럼 5가 2개씩 들어가는 경우가 있으니
		// i가 n보다 작거나 같을 동안에는 i를 5의 배수만큼 증가시켜가면서 
		// n을 i로 나눈 값을 정답 변수에 담아주면 된다
		
		bw.write(answer+"\n");
		bw.flush();
		// 출력
	}

}
