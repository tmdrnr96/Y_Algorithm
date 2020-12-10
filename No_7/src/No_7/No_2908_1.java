package No_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2908_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
				
		System.out.println(a > b ? a : b);
		
		br.close();

		
	}//main
}

