package swea_level2;

import java.io.*;

public class NewCureForInsomnia {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			int[] array = new int[10];

			int init = Integer.parseInt(br.readLine());
			int times = 0;

			while(hasZero(array)){
				
				int number = init * times;

				while(number > 0){
					int position = number % 10;
					array[position] = 1;
					number /= 10;
				}

				times++;
			}
			
			bw.write("#" + String.valueOf(i + 1) + " "+String.valueOf(times));
			bw.write('\n');
			bw.flush();
		}

	}

	public static boolean hasZero(int[] array){
		
		boolean flag = false;

		for(int i=0; i<array.length; i++) {
			if(array[i]==0){
				flag = true;
				break;
			}
		}
		
		return flag;
	}

}