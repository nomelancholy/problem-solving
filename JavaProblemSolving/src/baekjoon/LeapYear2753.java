package baekjoon;

import java.util.Scanner;

public class LeapYear2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int answer = 0;

        if(year % 4 ==0){
            if(year % 100 != 0 || year % 400 == 0){
                answer = 1;
            }
        }

        System.out.println(answer);
    }
}
