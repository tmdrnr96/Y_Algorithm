package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_2908 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine()," ");
		
		String rev="";
		
		String s1 = "";
		String s2 = "";
		
		for(int i = 0; i < str.countTokens(); i++) {
			rev = str.nextToken();//734
			
			for(int j = rev.length(); j > 0 ; j--) {
				if(i == 0) {
					s1+=rev.charAt(j);					
				}else {
					s2+=rev.charAt(j);
				}
			}
		}
		
		System.out.println(s1+"/"+s2);
		if(Integer.parseInt(s1) > Integer.parseInt(s2)) {
			bw.write(s1);
		}else {
			bw.write(s2);
		}
		
		
		
		br.close();
		bw.close();
		
	}//main
}
