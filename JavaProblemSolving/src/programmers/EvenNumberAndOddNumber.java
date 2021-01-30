package programmers;

import java.util.Scanner;

public class EvenNumberAndOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String answer = "";

        if(num % 2 == 0){
            answer = "Even";

        }else {
            answer = "Odd";
        }

        System.out.println(answer);
    }
}
