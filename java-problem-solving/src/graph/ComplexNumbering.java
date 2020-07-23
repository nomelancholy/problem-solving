package graph;

import java.io.*;
import java.util.*;

public class ComplexNumbering {

	static ArrayList<Integer>[] array;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) temp.charAt(j) - 48;
			}
		}
		// 배열에 저장

		array = (ArrayList<Integer>[]) new ArrayList[n + 1];
		// 어레이 리스트들을 저장할 어레이리스트 배열 생성
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				bw.write(String.valueOf(a[i][j]));
			}
			bw.write('\n');
		}
//		int answer = solution();
//		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
