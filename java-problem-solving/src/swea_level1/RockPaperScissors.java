package swea_level1;

import java.io.*;

public class RockPaperScissors {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] temp = br.readLine().split(" ");
		
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		
		String answer = "";
		
		if(a==1) {
			if(b==2) {
				answer = "B";
			}else if(b==3) {
				answer = "A";
			}
		}
		
		if(a==2) {
			if(b==1) {
				answer = "A";
			}else if(b==3) {
				answer = "B";
			}
		}
		
		if(a==3) {
			if(b==1) {
				answer = "B";
			}else if(b==2) {
				answer = "A";
			}
		}
		
		bw.write(answer);
		bw.flush();
		
	}

}
