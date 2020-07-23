package template;

import java.io.*;
import java.util.*;

public class BOJ {

//	public static solution() {
//	int answer = 0;
//	
//	return answer;
//	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		String[] temp = br.readLine().split(" ");

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}

//		int answer = solution();
//		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
