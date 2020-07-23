package graph;

import java.io.*;
import java.util.*;

public class ElementsConnectedCount {
	
	private static void dfs(ArrayList<Integer>[] a, boolean[] check, int i) {
		if (check[i]) {
			return;
		}
		// 들렸으면 return
		check[i] = true;
		// 아니면 들렸다고 check하고
		for (int y : a[i]) {
			// 그 노드에서 들릴 수 있는 것들 중 
			if (check[y] == false) {
				// 들리지 않은 것들
				dfs(a, check, y);
				// dfs 로 다시 탐색
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");

		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);

		ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		// 정점의 갯수만큼 ArrayList 생성

		for (int i = 0; i < m; i++) {
			// 간선 갯수만큼 반복
			String[] t = br.readLine().split(" ");

			int u = Integer.parseInt(t[0]);
			int v = Integer.parseInt(t[1]);

			a[u].add(v);
			a[v].add(u);
			// u,v 저장
		}

		boolean[] check = new boolean[n + 1];
		// 1부터 n까지 확인할 체크 배열 생성

		int answer = 0;

		for (int i = 1; i <= n; i++) {
			// 1부터 n까지 도는데
			if (check[i] == false) {
				// i일때 check가 false라는 건 새로 시작해야 한다는 얘기이니
				dfs(a, check, i);
				answer += 1;
				// answer 1 증가
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();

	}



}
