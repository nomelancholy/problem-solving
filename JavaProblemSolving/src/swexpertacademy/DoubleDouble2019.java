package swexpertacademy;

import java.util.Scanner;

public class DoubleDouble2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 0; i<=n; i++){
            System.out.print((int)Math.pow(2, i) + " ");
        }
    }
}
