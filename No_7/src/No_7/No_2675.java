package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No_2675 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			StringTokenizer strt = new StringTokenizer(br.readLine()," ");
			int n1 = Integer.parseInt(strt.nextToken());	//3 
			String n2 = strt.nextToken(); //ABC
			
			for(int j = 0; j < n2.length(); j++) {
				
				for(int k = 0; k < n1; k++) {
					bw.write(n2.charAt(j));
				}
			}
			
			bw.write("\n");
			
		}
		
		br.close();
		bw.close();
		
		
	}//main
}
