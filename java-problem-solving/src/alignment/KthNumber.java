package alignment;

import java.util.*;

public class KthNumber {

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			// commands 길이만큼 반복하는데

			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			// ArrayList 선언
			
			int start = commands[i][0]-1;
			int end = commands[i][1]-1;
			int index = commands[i][2]-1;
			// commands 내용 index로 활용하기 위해 1뺀수로 선언

			for (int j = start; j <= end; j++) {
				arrayList.add(array[j]);
			}
			// start부터 end까지 담아주고
			
			Collections.sort(arrayList);
			// 정렬
			
			answer[i] = arrayList.get(index);
			// index번째 값을 답으로 넣는다

		}
		
		return answer;
	}

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };

		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		solution(array, commands);

	}

}
