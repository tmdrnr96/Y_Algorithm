package no_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_3052 {
	public static void main(String[] args) throws IOException {

		//10���� ������ �޾Ƽ� ���� 42�� ���� �������� ���� �ٸ� ����? ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];
		int count = 0;
		int result = 0;

		//10���� ������ 42�� ���� �������� �迭�� ����ֱ�
		for(int i = 0; i < arr.length; i++) {	
			arr[i] = Integer.parseInt(br.readLine())%42;
		}

		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = i+1; j < arr.length; j++) {

				if(arr[i] == arr[j]) {				
					count++;
				}

			}//inner
			
			
			if(count == 0) {
				result++;
			}

		}//out
		bw.write(String.valueOf(result));

		bw.close();
		br.close();

	}//main
}
