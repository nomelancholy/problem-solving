package swexpertacademy;

import java.util.Scanner;

public class GetBiggestNumber2068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){
            int answer = 0;

            for(int j=0; j<10; j++){
                int input = scanner.nextInt();
                if(answer < input){
                    answer = input;
                }
            }

            System.out.println("#"+i+" "+answer);
        }
    }
}
