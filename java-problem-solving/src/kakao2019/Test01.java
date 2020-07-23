package kakao2019;

import java.util.ArrayList;

public class Test01 {
	
    public int[] solution(int[][] v) {
        
        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<Integer>();
        
        for(int i=0; i<v.length;i++){
            for(int j=0; j<v[i].length; j++){
                // j가 0이면 x좌표
                // j가 1이면 y좌표
                if(j==0){
                    
                    if(xList.contains(v[i][j])){
                        xList.remove(xList.indexOf(v[i][j]));
                    }else{
                        xList.add(v[i][j]);
                    }
                    
                }else if(j==1){
                    if(yList.contains(v[i][j])){
                        yList.remove(yList.indexOf(v[i][j]));
                    }else{
                        yList.add(v[i][j]);
                    }
                }
                
            }
        }
        
        int[] answer = {xList.get(0),yList.get(0)};
        
        return answer;
    }

	public static void main(String[] args) {
		
		Test01 test = new Test01();
		int[][] input = {{1,4},{3,4},{3,10}}; 
		test.solution(input);
		
	}
	
}
