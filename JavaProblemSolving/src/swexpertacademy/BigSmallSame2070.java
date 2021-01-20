package swexpertacademy;

import java.util.Scanner;

public class BigSmallSame2070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            String answer = "";

            if(a<b){
                answer = "<";
            }else if(a>b){
                answer = ">";
            }else{
                answer = "=";
            }

            System.out.println("#"+i+" "+answer);
        }
    }
}
