package swexpertacademy;

import java.util.Scanner;

public class SumDigits2058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int answer = 0;

        while(n != 0){
            answer += n % 10;
            n = n / 10;
        }

        System.out.println(answer);
    }
}
