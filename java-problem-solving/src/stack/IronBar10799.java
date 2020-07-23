package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class IronBar10799 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<Integer>();

		String str = br.readLine();
		// 입력 읽어서 저장
		
		int bar = 0;
		// 막대 조각 갯수 저장할 변수

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(') {
				stack.push(i);
				// index 저장
			} else {
				// 닫힘 태그일 경우

				if (i - stack.peek() == 1) {
					// 레이저일 경우

					stack.pop();
					// 가장 위의 index를 하나 지우고

					if (stack.size() != 0) {
						// null 체크한 후에

						bar = bar + stack.size();
						// 레이저는 막대를 이등분하니까
						// 레이저 왼쪽에 있는 막대만 ( stack size ) 일단 막대 갯수에 더한다

					}

				} else {
					// 막대의 끝일 경우

					stack.pop();
					// 가장 위의 index 하나 지우고
					
					bar = bar + 1;
					// 막대의 끝 조각 부분 하나를 더한다

				}

			}

		}

		bw.write(String.valueOf(bar));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
