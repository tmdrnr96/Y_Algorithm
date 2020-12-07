package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_10809 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int result = 0;
		char[] c = new char[26];
		
		char ch = 'a';
		String str = "";
		
		for(int i = 0; i < c.length; i++) {
			
			c[i] = ch++;
			str+=c[i];
		}
	
		for(int i = 0; i < str.length(); i++) {

			if(s.contains(String.valueOf(c[i]))) {
				
				result = s.indexOf(c[i]);
				
			}else {
				result = -1;
			}
			
			bw.write(result + " ");
			
		}
	
		br.close();
		bw.close();
		
	}//main
}
