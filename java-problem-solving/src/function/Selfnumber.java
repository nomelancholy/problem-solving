package function;

import java.io.*;

public class Selfnumber {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = 10001;

		boolean[] a = new boolean[n];

		a[0] = true;

		for (int i = 10; i < n; i++) {

			int position = i;
			int temp = i;
			
			while (temp > 0) {
				//System.out.println(temp);
				position += (temp % 10);

				temp = temp / 10;
			}

			System.out.println(position);

		}

//		int answer = solution();
//		bw.write(String.valueOf(answer));
		bw.flush();

	}

}
