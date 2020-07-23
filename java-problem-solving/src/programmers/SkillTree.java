package programmers;

import java.io.*;
import java.util.*;

public class SkillTree {

	public static void test() {

		System.out.println("테스트");
	}

	public static int solution(String skill, String[] skill_trees) {

		// 1 <= skill <= 26
		// 1 <= skill_trees.length <= 20
		// 2 <= skill_trees[i] <= 26

		int answer = 0;

		for (int j = 0; j < skill_trees.length; j++) {
			// skill_trees 배열 index 에서 단어 하나씩 꺼낸다

			int count = 0;

			char first = skill.charAt(count);
			// 처음 글자
			char last = skill.charAt(count + 1);
			// 다음 글자
			boolean flag = false;
			// 판별 flag

			String temp = skill_trees[j];
			// j번째 스킬트리
			
			for (int k = 0; k < temp.length(); k++) {
				// 문자열 반큼 도는데

				if (count == skill.length() - 1 && flag == true) {
					answer++;
				} else if (count == skill.length() - 1 && flag == false) {
					break;
				}
				
				if(flag == false) {
					// 먼저 배워야 할 껄 아직 배우지 않았을 때
					if(skill.charAt(k) == first) {
						// 첫번째 스킬을 먼저 배우면
						flag = true;
						// flag true로
					}else if(skill.charAt(k) == last) {
						// 두번째 스킬을 먼저 배우면
						break;
						// 반복 종료
					}
				}else {
					// 먼저 배워야 할 껄 배웠을 때
				}


				count++;
				// count 올려서 다음 두 글자로 반복한다

			}

		}

		return answer;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String skill = "CBD";
		String[] skillTrees = { "BACDE", "CBADF", "AECB", "BDA" };

		int answer = solution(skill, skillTrees);

		bw.write(String.valueOf(answer));
		bw.flush();

	}

}