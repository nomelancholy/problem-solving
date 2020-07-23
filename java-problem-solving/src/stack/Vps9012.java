package stack;

import java.io.*;
import java.util.Stack;

public class Vps9012 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// reader 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// writer 생성
		Stack<Character> stack = new Stack<Character>();
		// Stack 생성
		String input = "";
		// String 입력받을 변수 선언

		String nStr = br.readLine();
		int n = Integer.parseInt(nStr);

		// 첫 라인에서 입력받은 라인만큼 반복
		for (int i = 0; i < n; i++) {

			// 문장을 입력받아
			input = br.readLine();
			// noFlag
			boolean noFlag = false;
			// 글자수만큼 반복
			for (int j = 0; j < input.length(); j++) {

				// ( 일때는
				if (input.charAt(j) == '(') {
					// stack에 넣는다
					stack.push(input.charAt(j));
				} else {

					// ) 일때는 조건확인

					if (stack.empty()) {
						// stack이 비어있는데 ( ( 가 담긴게 없는데 )
						// ) 가 나왔다는건 VPS가 아니란 말
						noFlag = true;
						break;
					} else {
						// 담긴게 있을 때는 가장 위에 하나를 비워준다
						stack.pop();
					}
				}
			}

			// 반복문 종료 후 noFlag도 바뀌지 않고 stack이 비어있으면
			if (noFlag == false && stack.empty()) {
				bw.write("YES" + '\n');
			} else if (noFlag == true || !stack.empty()) {
				// 스택이 다 비지 않았거나 noFlag가 돌아갔으면
				bw.write("NO" + '\n');
				stack.clear();
			}

		}

		br.close();
		bw.flush();
		bw.close();
		// reader와 writer를 닫는다

	}

}
