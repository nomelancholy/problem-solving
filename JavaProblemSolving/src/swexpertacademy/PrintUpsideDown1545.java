package swexpertacademy;

import java.util.Scanner;

public class PrintUpsideDown1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = n; i>=0; i--){
            System.out.print(i + " ");
        }
    }
}
