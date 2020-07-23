package queue;

import java.util.*;

public class Printer {

	public static int solution(int[] priorities, int location) {

		// priorities = 중요도 배열 1 <= priorities.length <= 100
		// location = 내가 인쇄를 요청한 문서의 위치

		// 가장 중요한 게 먼저 나온다
		// 내가 요청한 문서는 언제 출력 되는가

		Queue<Integer> pioritiesQueue = new LinkedList<Integer>();
		Queue<Integer> indexQueue = new LinkedList<Integer>();
		// 숫자, 인덱스 큐 각각 생성

		for (int i = 0; i < priorities.length; i++) {
			indexQueue.add(i);
			pioritiesQueue.add(priorities[i]);
			// 배열의 숫자와 인덱스를 각각의 큐에 집어넣는다
		}

		int answer = 0;
		// 정답 변수
		
		while (true) {
			// 무한 반복하는데
			int max = pioritiesQueue.peek(); 
			// 큐 가장 앞에 있는 숫자로 max와 maxIndex 초기화한 후에
			
			int loopCnt = 0;
			// 찾은 횟수
			int savepoint = 0;
			// 마지막으로 최대값 갱신한 부분 저장 
			
			for (int i = 0; i < indexQueue.size(); i++) {
				// 큐 사이즈만큼 반복하면서
	
				int temp = pioritiesQueue.poll();
				int tempIndex = indexQueue.poll();
				
				loopCnt++;
				
				if(max < temp) {
					max = temp;
					
					savepoint = loopCnt;
				}
				// 지금 큐에서 가장 큰 숫자와 인덱스를 찾고
				
				pioritiesQueue.add(temp);
				indexQueue.add(tempIndex);
				// 다시 뒤로 돌린다
				
			}
			
			// 찾았으면
			
			
			// 반복 횟수 구해서
			
			for(int i=0; i<savepoint-1; i++) {
				
				int temp = pioritiesQueue.poll();
				int tempIndex = indexQueue.poll();
				
				pioritiesQueue.add(temp);
				indexQueue.add(tempIndex);
				// 가장 큰 수가 앞에 올 때 까지 돌리고
			}
			
			pioritiesQueue.poll();
			// 현재 큐에서 가장 큰 숫자 빼고
			int index = indexQueue.poll();
			// 가장 큰 인덱스 빼면서
			answer++;
			// 출력 횟수 증가
			
			if(index==location) {
				// 만약 인덱스와 location이 같다면
				break;
				// 반복을 종료한다
			}

		}

		return answer;
	}

	public static void main(String[] args) {

//		int[] priorities = { 2, 1, 3, 2 };
//		int location = 2;

		// return = 1

//		int[] priorities = {1,1,9,1,1,1};
//		int location = 0;

		// return = 5;
		
//		int[] priorities = {2,2,2,1,3,4};
//		int location = 3;

		// return = 6;
		
//		int[] priorities = {3,3,4,2};
//		int location = 3;

		// return = 4;
		
		int[] priorities = {9,9,9,9,9};
		int location = 0;

		// return = 1;

		int answer = solution(priorities, location);

		 System.out.println(answer);

	}

}
