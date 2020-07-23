package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
	
	
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        
    	// bridge_length = 다리 길이 1<= length <= 10000
    	// weight = 다리가 버틸 수 있는 무게 1<= weight <= 10000
    	// truck_weights = 각 트럭들 무게 1<= length <= 10000 / 1<= truck <= weight
    	
    	int answer = 0;
    	// 정답 ( 초 )
    	int index = 0;
    	// 인덱스
    	int nowTotal = 0;
    	// 현재 다리위에 올라가 있는 트럭의 총 무게
    	int[] remainTimes = new int[truck_weights.length];
    	
    	boolean[] check = new boolean[truck_weights.length];
    	// 체크
    	
    	Queue<Integer> bridge = new LinkedList<Integer>();
    	// 다리
    	
    	while(!(index == truck_weights.length-1 && bridge.isEmpty())) {
    		// 트럭을 끝까지 보내고 bridge가 비기 전까지는 
    		
    		answer++;
    		// 1초 증가
    		
    		if(bridge.isEmpty()) {
    			nowTotal += truck_weights[index];
    			bridge.add(truck_weights[index]);
    			
    		}else {
    			
    			
    			// 잔여시간 1씩 줄이고
    			
    			if(weight > nowTotal + truck_weights[index]) {
    				
    			}
    			
    		}
    		
    		index++;
    	}
    	
    	
        return answer;
    }
	
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
//		int bridge_length = 100;
//		int weight = 100;
//		int[] truck_weights = {10};
		
		// 101
		
//		int bridge_length = 100;
//		int weight = 110;
//		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
		
		int answer = solution(bridge_length, weight, truck_weights);

		System.out.println(answer);
		
	}

}
