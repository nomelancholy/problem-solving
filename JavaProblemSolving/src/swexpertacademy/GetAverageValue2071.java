package swexpertacademy;

import java.util.Scanner;

public class GetAverageValue2071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){
            int sum = 0;

            for(int j=0; j<10; j++){
                int input = scanner.nextInt();
                sum += input;
            }

            int answer = (int)Math.round((double)sum/10);

            System.out.println("#"+i+" "+answer);
        }
    }
}
