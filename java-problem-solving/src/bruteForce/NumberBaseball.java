package bruteForce;

public class NumberBaseball {
	
	

	public static int solution(int[][] baseball) {

		boolean[] check = new boolean[1000];

		for (int i = 0; i < baseball.length; i++) {

			int number = 0;
			int strike = 0;
			int ball = 0;

			int[] numbers = new int[3];

			for (int j = 0; j < baseball[i].length; j++) {
				if (j == 0) {
					number = baseball[i][j];

					int index = 2;

					while (number != 0) {

						numbers[index] = number % 10;

						number /= 10;

						index--;
					}

				} else if (j == 1) {
					strike = baseball[i][j];
				} else if (j == 2) {
					ball = baseball[i][j];
				}

			}

			System.out.println("번호들");

			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
			System.out.println("strike : " + strike);
			System.out.println("ball : " + ball);

			if (strike == 3) {
				
				// 숫자 하나만 가능
				
				
				
			} else if (strike == 2) {


			} else if (strike == 1) {

				if (ball == 2) {

				} else if (ball == 1) {

				} else if (ball == 0) {

				}

			} else if (strike == 0) {

				if (ball == 3) {

				} else if (ball == 2) {

				} else if (ball == 1) {

				} else if (ball == 0) {

				}

			}

		}

		System.out.println();


		int answer = 0;
		
		
		
		return answer;
	}

	private static int check(boolean[] first, boolean[] second, boolean[] third) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<10; i++) {
			
		}
		
		return 0;
	}

	public static void main(String[] args) {

		int[][] baseball = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };

		int answer = solution(baseball);

		System.out.println(answer);

	}

}
