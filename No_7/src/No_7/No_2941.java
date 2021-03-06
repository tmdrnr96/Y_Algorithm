package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2941 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		int count = 0;
		int len = str.length();
		
		
		for(int i = 0; i < len; i++) {

			char c = str.charAt(i);

			if(c == 'c' && i < len -1) {
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-' ) {
					i++;
				}
			}

			else if(c == 'd' && i < len-1) {
				if(str.charAt(i+1) == '-') {
					i++;
					
				}else if(i < len-2 && (str.charAt(i+1) == 'z'&& str.charAt(i+2) == '=')) {
					i+=2;

				}
			}			
			else if((c == 'l'|| c== 'n') && i < len-1) {
				if(str.charAt(i+1) == 'j') {
					i++;

				}
			}
			
			else if((c == 's' || c == 'z')&& i < len-1) {
				if(str.charAt(i+1) == '=') {
					i++;

				}
			}
			
			
			count++;

		}
		
		bw.write(String.valueOf(count));

		br.close();
		bw.close();
		
	}//main
}
