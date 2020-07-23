package graph;

import java.io.*;
import java.util.*;

public class BipartiteGraph {

	private static void dfs(ArrayList<Integer>[] a, int[] color, int x, int c) {
		color[x] = c;
		for (int y : a[x]) {
			if (color[y] == 0) {
				dfs(a, color, y, 3 - c);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			String[] temp = br.readLine().split(" ");

			int n = Integer.parseInt(temp[0]);
			// 정점의 갯수
			int m = Integer.parseInt(temp[1]);
			// 간선의 갯수

			ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
			// ArrayList 배열 n+1만큼 생성

			for (int j = 1; j <= n; j++) {
				a[j] = new ArrayList<Integer>();
				// 동적배열 1부터 n까지 할당
			}

			for (int j = 0; j < m; j++) {
				String[] s = br.readLine().split(" ");

				int u = Integer.parseInt(s[0]);
				int v = Integer.parseInt(s[1]);

				a[u].add(v);
				a[v].add(u);
				// 그래프 저장
			}
			// 연결
			int[] color = new int[n + 1];

			boolean ok = true;

			for (int j = 1; j <= n; j++) {
				if (color[j] == 0) {
					dfs(a, color, j, 1);
				}
			}

			for (int j = 1; j <= n; j++) {
				for (int k : a[i]) {
					if (color[j] == color[k]) {
						ok = false;
					}
				}
			}

			if (ok) {
				bw.write("YES");
			} else {
				bw.write("NO");
			}

		}

		bw.flush();

	}



}
