package hash;

import java.util.*;

public class UnfulfilledPlayer {

	public static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		String answer = "";

		for (int i = 0; i < completion.length; i++) {
			
			if (!completion[i].equals(participant[i])) {
				answer = participant[i];
				break;
			}

			if (i == completion.length-1) {
				answer = participant[i+1];
			}
		}

		return answer;
	}

	public static void main(String[] args) {

//		String[] participant = { "leo", "kiki", "eden" };
//		String[] completion = { "eden", "kiki" };
		// return leo
		
//		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa"};
//		String[] completion = { "marina", "josipa", "nikola", "filipa" };
		
		String[] participant = { "mislav", "stanko", "mislav", "ana"};
		String[] completion = { "mislav", "stanko", "ana" };

		String answer = solution(participant, completion);
		
		System.out.println(answer);
		
	}

}
