package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_11720 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;

		String str = br.readLine();
	
		for(int i = 0; i < n; i++) {
			sum+=str.charAt(i)-'0';
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.close();
		
	}//main
}

