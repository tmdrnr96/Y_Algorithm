package No_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_1157 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[26];
		String str = br.readLine();

		for(int i = 0; i < str.length(); i++) {

			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i)- 'A']++; //�ش��ϴ� �ε����� �� ������Ű��
			}else {
				arr[str.charAt(i) - 'a']++;
			}

		}

		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65); //�빮�ڷ� ���
			}else if(arr[i] == max){
				ch = '?';
			}
		}

		bw.write(ch);
		
		bw.close();
		br.close();
		
	}//main
}
