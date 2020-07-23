package swea_level1;

import java.io.*;

public class YearMonthDateCalendar {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[] dates = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < n; i++) {

			String temp = br.readLine();

			String year = temp.substring(0, 4);
			int month = Integer.parseInt(temp.substring(4, 6));
			int date = Integer.parseInt(temp.substring(6, 8));

			bw.write("#" + String.valueOf(i + 1) + " ");

			if (dates[month] < date) {
				bw.write("-1");
			} else {
				StringBuilder sb = new StringBuilder();

				sb.append(year);
				sb.append("/");
				
				if (month < 10) {
					sb.append("0");
				}
				sb.append(String.valueOf(month));
				sb.append("/");
				
				if(date < 10) {
					sb.append("0");
				}
				sb.append(String.valueOf(date));

				bw.write(sb.toString());
			}

			bw.write('\n');
			bw.flush();
		}

	}

}
