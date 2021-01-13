package programmers;

import java.util.Scanner;

public class CountOfPandY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();

        int p = 0;
        int y = 0;

        boolean answer = false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == 'P'){
                p++;
            }else if (c == 'Y'){
                y++;
            }
        }

        if(p == y){
            answer = true;
        }

        System.out.println(answer);

    }
}
