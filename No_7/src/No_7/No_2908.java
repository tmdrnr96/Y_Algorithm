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
		
		String[] arr = new String[str.countTokens()];
		
		for(int i = 0; i < 2; i++) {
			
			rev = str.nextToken();
			arr[i] = "";
			
			for(int j = rev.length()-1; j >= 0 ; j--) {
				
				arr[i]+=String.valueOf(rev.charAt(j));
			}
		}

		if(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) {
			bw.write(arr[0]);
		}else {
			bw.write(arr[1]);
		}
		
		br.close();
		bw.close();
		
	}//main
}
