package bruteForce;

import java.io.*;

public class KaingCalendar {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] temp = br.readLine().split(" ");

			int m = Integer.parseInt(temp[0]);
			int n = Integer.parseInt(temp[1]);
			int x = Integer.parseInt(temp[2])-1;
			int y = Integer.parseInt(temp[3])-1;
			// 나머지 연산을 활용해 건너 뛰며 확인 하기 위해 x 와 y를 1씩 빼준다 
			
			int answer = -2;
			// +1 더해서 출력하니 해당 수가 없을 때는 -1이 나오도록 -2로 초기화
			
			for (int j = x; j < m * n; j+=m) {
				// x부터 시작해서 m * n보다 작을때까지 m만큼 증가시킨다 
				
				// < x , y > == < j % m , j % n >
				
				// x는 계속 m만큼 올라가니 놔두고
				
				if(j % n == y) {
					// 나머지 연산을 활용해 y를 찾는다
					answer = j;
					// 찾을 경우 answer 갱신하고
					break;
					// 반복 종료
				}
				
			}
			
			bw.write(String.valueOf(answer+1));
			bw.write('\n');

		}

		bw.flush();

	}

}
