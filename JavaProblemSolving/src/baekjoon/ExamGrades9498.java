package baekjoon;

import java.util.Scanner;

public class ExamGrades9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n <= 100 && n >= 90){
            System.out.println("A");
        }else if(n >= 80){
            System.out.println("B");
        }else if(n >= 70){
            System.out.println("C");
        }else if(n >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
