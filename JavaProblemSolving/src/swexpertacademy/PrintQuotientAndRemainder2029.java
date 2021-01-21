package swexpertacademy;

import java.util.Scanner;

public class PrintQuotientAndRemainder2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("#"+i+" "+a/b+" "+a%b);
        }
    }
}
