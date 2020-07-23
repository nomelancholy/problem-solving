package swea_level2;

import java.io.*;
import java.util.*;

public class PalindromeExamination {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String s = br.readLine();

            int center = s.length() / 2 + 1;
            int answer = 0;

            boolean flag = true;

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < center - 1; j++) {
                stack.push(s.charAt(j));                
            }

            for(int j = center; j<s.length();j ++){
                if(stack.pop()!=s.charAt(j)){
                    flag = false;
                }
            }

            if (flag) {
                answer = 1;
            }

            bw.write("#" + String.valueOf(i + 1) + " " + String.valueOf(answer));
            bw.write('\n');
            bw.flush();
        }

    }

}