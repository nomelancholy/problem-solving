package kakao2019;

import java.io.*;

public class Test02 {
	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();
        String[] nArr = nStr.split(" ");
        
        int x = Integer.parseInt(nArr[0]);
        int y = Integer.parseInt(nArr[1]);
        
        
        
        for(int i=0; i<y; i++) {
        	for(int j = 0; j<x; j++) {
        		bw.write("*");
        	}
        	bw.write("\n");
        }
        
		br.close();
		bw.flush();
		bw.close();
	}

}
