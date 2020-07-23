package swea_level1;

import java.io.*;
import java.util.*;

public class GetMiddleNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		if (n % 2 == 1) {
			n = n + 1;
		}

		int middle = n / 2 - 1;

		String[] temp = br.readLine().split(" ");
		int[] numbers = new int[temp.length];

		for (int i = 0; i < temp.length; i++) {
			numbers[i] = Integer.parseInt(temp[i]);
		}

		Arrays.sort(numbers);

		bw.write(String.valueOf(numbers[middle]));
		bw.flush();

	}

}
