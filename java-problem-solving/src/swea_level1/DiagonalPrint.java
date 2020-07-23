package swea_level1;

import java.io.*;

public class DiagonalPrint {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==j) {
					bw.write("#");
				}else {
					bw.write("+");
				}
			}
			bw.write('\n');
		}
		bw.flush();
	}


}
