package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_5622 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int time = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			
			if(a <= 'C') {
				time+=3;
			}else if(a <= 'F'){
				time+=4;
			}else if(a <= 'I') {
				time+=5;
			}else if(a <= 'L') {
				time+=6;
			}else if(a <= 'O') {
				time+=7;
			}else if(a <= 'S') {
				time+=8;
			}else if(a <= 'V') {
				time+=9;
			}else if(a <= 'Z'){
				time+=10;
			}
			
		}
		bw.write(String.valueOf(time));
		
		bw.close();
		br.close();
		
	}//main
}
