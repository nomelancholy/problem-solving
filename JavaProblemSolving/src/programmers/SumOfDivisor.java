package programmers;

import java.util.Scanner;

public class SumOfDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = 0;

        for (int i = 1; i<= n; i++){
            if(n % i ==0){
                answer += i;
            }
        }

        System.out.println(answer);
    }
}
