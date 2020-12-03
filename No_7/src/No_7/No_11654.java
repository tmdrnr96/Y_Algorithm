package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_11654 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		char c = str.charAt(0);
		
		int n = c;
		bw.write(String.valueOf(n));
		//bw.write(String.valueOf(br.read()));
		
		br.close();
		bw.close();
	}//main
}
