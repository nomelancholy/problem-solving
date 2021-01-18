package baekjoon;

import java.util.Scanner;

public class AlarmClock2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m = m - 45;

        if(m < 0){
            h = h-1;
            m = m + 60;

            if(h < 0){
                h = 23;
            }
        }

        System.out.println(h + " " + m);
    }
}
