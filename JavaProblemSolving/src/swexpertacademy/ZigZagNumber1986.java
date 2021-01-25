package swexpertacademy;

import java.util.Scanner;

public class ZigZagNumber1986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=1; i<=t; i++){
            int n = scanner.nextInt();
            int sum = 0;
            for(int j=1; j<=n; j++){
                if(j % 2 == 1){
                    sum += j;
                }else {
                    sum -= j;
                }
            }
            System.out.println("#"+i+" "+sum);
        }
    }
}
