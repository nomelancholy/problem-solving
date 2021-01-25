package swexpertacademy;

import java.util.Scanner;

public class RockPaperScissors1936 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String answer = "";

        if(a == 1){
            // 가위
            if(b == 2){
                // 바위
                answer = "B";
            }else if(b == 3){
                // 보
                answer = "A";
            }
        }else if(a == 2){
            // 바위
            if(b == 1){
                // 가위
                answer = "A";
            }else if(b == 3){
                // 보
                answer = "B";
            }
        }else if(a == 3){ 
            // 보
            if(b == 1){
                // 가위
                answer = "B";
            }else if(b == 2){
                // 바위
                answer = "A";
            }
        }

        System.out.println(answer);
    }
}
