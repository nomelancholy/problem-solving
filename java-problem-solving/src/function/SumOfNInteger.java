package function;

import java.io.*;

public class SumOfNInteger {

	public static long sum(int[] a) {

		long answer = 0;
		
		for(int i=0; i<a.length; i++) {
			answer += a[i];
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		

		int[] a = {1,2,3,4,5};
		
		long answer = sum(a);
		
		System.out.println(answer);
		
	}

}
