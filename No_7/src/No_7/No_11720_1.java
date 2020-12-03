package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_11720_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		br.readLine();
		
		int sum = 0;
		
		for(byte b : br.readLine().getBytes()) {
			sum+=(b -'0');
		}
		
		bw.write(String.valueOf(sum));
		
		br.close();
		bw.close();
	}//main
}
