package dp;

public class SchoolRoad {

	static boolean[][] route;
	static int[][] memo;
	static int[] count = new int[10000];

	public static int go(int cnt, int x, int y) {

		
		System.out.println("x : "+x + " y: "+y);


		if (route[x][y]) {
			return 0;
		}

		if (memo[x][y] > 0) {
			return memo[x][y];
		}

		System.out.println("x : "+x + " y: "+y);
		
		memo[x][y] = cnt;

		if (x == route.length - 1 && y == route[route.length - 1].length - 1) {

			count[cnt] = (count[cnt] + 1) % 100007;

		}

		
		if(x < route.length ) {
			
			if(route[x+1][y]) {
				go(cnt++,x+1,y);
			}
			
		}
		
		if(y < route[route.length - 1].length) {
			
			if(route[x][y+1]) {
				go(cnt++,x,y+1);
			}
			
		}
		

		return memo[x][y];

	}

	public static int solution(int m, int n, int[][] puddles) {
		int answer = 0;

		route = new boolean[m + 1][n + 1];
		memo = new int[m + 1][n + 1];

		for (int i = 0; i < puddles.length; i++) {
			int x = 0;
			int y = 0;
			for (int j = 0; j < puddles[i].length; j++) {
				if (j % 2 == 0) {
					x = puddles[i][j];
				}

				if (j % 2 == 1) {
					y = puddles[i][j];
				}
			}
			route[x][y] = true;
		}

		// 물 웅덩이 생성

		go(0, 1, 1);

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println("i : "+i);
				answer = count[i];
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int m = 4;
		int n = 3;
		int[][] puddles = { { 2, 2 } };
		// return 4

		int answer = solution(m, n, puddles);
		System.out.println(answer);

	}

}
