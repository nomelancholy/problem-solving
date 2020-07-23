package kakao2019;


public class Exam01 {

	public int solution(String s) {
		int answer = s.length();

		
		// 글자의 절반부터 i가 1이 될 때 까지
		for (int i = 1; i <= s.length() / 2; i++) {
			// 글자 간격
			int cnt = s.length();
			
			// 이전 저장 변수 
			String prev = "";
			// 지금 수 저장 변수
			String now = "";
			boolean flag = false;
		
			// 0부터 간격만큼 더해져서 길이보다 같거나 작을 때 까지
			for(int j=0; j + i <= s.length() ; j=j+i) {
				// 자르고 
				now = s.substring(j,j+i);

				// 비교하고
				if(prev.equals(now)) {
					System.out.println(i);
					System.out.println(now);
					System.out.println(prev);
					if(flag) {
						cnt = cnt - i;
					}else {
						cnt = cnt - i + 1;
					}
					flag = true;
					System.out.println(cnt);
					
				}else {
					flag = false;
				}
				// 이전으로 넣고
				prev =now;
				
			}
			
			if(cnt<answer) {
				answer = cnt;
			}
			
		}

		System.out.println("정답: " + answer);
		return answer;
	}


	public static void main(String[] args) {

		
		 String t = "aabbaccc";
		// String t = "ababcdcdababcdcd";
		// String t = "abcabcdede";
		//String t = "abcabcabcabcdededededede";
		// String t = "xababcdcdababcdcd";

		Exam01 exam = new Exam01();
		exam.solution(t);

	}

}
