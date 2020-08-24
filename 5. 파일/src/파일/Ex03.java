package ����;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		
		// ���� �б�
		// 1. ������ �������� Ȯ�� : File
		// 2. ���� �޸��� ���� : FileReader
		// 3. �޸��忡�� ���ڿ� �������� : BufferedReader
		
		File file = new File("0318.txt");
		if(file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String data = br.readLine();			// ���� �о
				System.out.println(data);
				
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
