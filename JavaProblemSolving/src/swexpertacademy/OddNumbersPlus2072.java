package swexpertacademy;

import java.util.Scanner;

public class OddNumbersPlus2072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){
            int sum = 0;

            for(int j=0; j<10; j++){
                int input = scanner.nextInt();
                if(input % 2 == 1){
                    sum += input;
                }
            }

            System.out.println("#"+i+" "+sum);
        }
    }
}
