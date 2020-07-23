package graph;

import java.util.*;

public class DFSnBFS {

	static ArrayList<Integer>[] a;
	// 인접리스트
	static boolean[] c;
	// 체크배열

	public static void dfs(int x) {
		
		if (c[x]) {
			return;
		}
		// 체크되어 있다면 return
		c[x] = true;
		// 그렇지 않다면 체크하고 
		System.out.print(x + " ");
		// 출력하고 
		for (int y : a[x]) {
			// a[x]와 연결되어 있는 정점들 중
			if (c[y] == false) {
				// 방문하지 않은 배열들을
				dfs(y);
				// dfs로 다시 방문
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		// 큐 생성
		q.add(start);
		// 큐에 시작 수 넣고
		c[start] = true;
		// 체크해주고
		while (!q.isEmpty()) {
			// 큐가 빌 때 까지
			int x = q.remove();
			System.out.print(x + " ");
			// 가장 먼저 들어간 것 출력한 후
			for (int y : a[x]) {
				// x에서 갈 수 있는 곳들 중 
				if (c[y] == false) {
					// 방문하지 않은 곳들은
					c[y] = true;
					// 방문했다고 체크하고
					q.add(y);
					// 전부 큐에 집어넣는다
				}
			}
		}
	}

	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 정점의 갯수
		int m = sc.nextInt();
		// 간선의 갯수
		int start = sc.nextInt();
		// 탐색을 시작할 정점의 번호
		
		// n과 m, start 입력
		
		a = (ArrayList<Integer>[]) new ArrayList[n + 1];
		// ( 1부터 시작하니 n+1로 ) 동적 배열 배열 생성
		
		for (int i = 1; i <= n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		// 1부터 n까지 n개의 인접 리스트 생성
		
		for (int i = 0; i < m; i++) {
			// 간선의 갯수 만큼
			int u = sc.nextInt();
			int v = sc.nextInt();
			a[u].add(v);
			a[v].add(u);
			// 정점간 간선 상호 저장
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
			// 정렬
		}
		
		c = new boolean[n + 1];
		// 체크배열 초기화
		dfs(start);
		// dfs 탐색
		System.out.println();
		
		c = new boolean[n + 1];
		// 체크배열 초기화
		bfs(start);
		// bfs 탐색
		System.out.println();
	}

}
