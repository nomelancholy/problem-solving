package graph;

import java.util.*;

class Edge {
	int from, to;

	Edge(int from, int to) {
		this.from = from;
		this.to = to;
	}
}

public class ABCDE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 사람의 수
		int m = sc.nextInt();
		// 친구 관계의 수

		// n과 m 입력

		boolean[][] a = new boolean[n][n];
		// 인접 행렬로 구현할 이차원 boolean 배열 a 선언

		ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
		// 인접 리스트

		ArrayList<Edge> edges = new ArrayList<Edge>();
		// 간선 리스트

		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<Integer>();
			// n만큼 arrayList 생성
		}

		for (int i = 0; i < m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			edges.add(new Edge(from, to));
			edges.add(new Edge(to, from));

			a[from][to] = a[to][from] = true;

			g[from].add(to);
			g[to].add(from);
			// 방향 없는 관계는 양쪽으로 방향 있는 관계로 저장
		}

		m *= 2;
		// 친구 관계의 수가 양방향이기 때문에 2배

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {

				int A = edges.get(i).from;
				int B = edges.get(i).to;
				// A -> B

				int C = edges.get(j).from;
				int D = edges.get(j).to;
				// C -> D

				System.out.println("A : " + A);
				System.out.println("B : " + B);
				System.out.println("C : " + C);
				System.out.println("D : " + D);

				if (A == B || A == C || A == D || B == C || B == D || C == D) {
					continue;
				}
				
				System.out.println("a[B][C] : "+a[B][C]+" B : " + B+" C : "+C );
				
				// 같은 사람이 있는지 검사
				if (!a[B][C]) {
					continue;
				}
				// B - > C

				for (int E : g[D]) {
					
					System.out.println("D : "+D);
					System.out.println("E : "+E);
					
					// D -> E
					if (A == E || B == E || C == E || D == E) {
						continue;
					}
					System.out.println(1);
					System.exit(0);
				}
			}
		}
		System.out.println(0);
	}

}
