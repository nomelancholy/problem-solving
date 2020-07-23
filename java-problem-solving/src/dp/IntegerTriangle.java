package dp;

public class IntegerTriangle {

	static int[][] memo;

	static int go(int[][] triangle, int depth, int width) {

		if (memo[depth][width] > 0) {
			return memo[depth][width];
		}

		if (depth == triangle.length - 1) {
			memo[depth][width] = triangle[depth][width];
			return memo[depth][width];
		}

		memo[depth][width] = triangle[depth][width] + go(triangle, depth + 1, width);

		int temp1 = triangle[depth][width] + go(triangle, depth + 1, width);
		int temp2 = triangle[depth][width] + go(triangle, depth + 1, width + 1);

		memo[depth][width] = Math.max(temp1, temp2);

		return memo[depth][width];
	}

	public static int solution(int[][] triangle) {
		int answer = 0;

		memo = new int[triangle.length][triangle[triangle.length - 1].length];

		answer = go(triangle, 0, 0);

//        for(int i=0; i<triangle.length; i++) {
//        	for(int j=0; j<=i; j++) {
//        		
//        		System.out.print(triangle[i][j]+" ");
//        		// triangle[i][j] 와 덧셈할 수 있는 건 두가지다 
//        		
//        		// triangle[i+1][j] 와 triangle[i+1][j+1]
//        		
//        	}
//        	System.out.println();
//        }

		return answer;
	}

	public static void main(String[] args) {

		 int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		// result = 30;

		//int[][] triangle = { { 7 }, { 3, 8 } };
		// result = 15;
		int answer = solution(triangle);

		System.out.println(answer);

	}

}
