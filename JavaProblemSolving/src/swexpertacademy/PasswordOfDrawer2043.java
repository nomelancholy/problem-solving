package swexpertacademy;

import java.util.Scanner;

public class PasswordOfDrawer2043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int answer = 0;

        for(int i=k; i<=p; i++){
            answer ++;
        }

        System.out.println(answer);
    }
}
