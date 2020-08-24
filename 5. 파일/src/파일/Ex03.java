package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex03 {
	public static void main(String[] args) {
		
		// 파일 읽기
		// 1. 파일의 존재유무 확인 : File
		// 2. 실제 메모장 열기 : FileReader
		// 3. 메모장에서 문자열 꺼내오기 : BufferedReader
		
		File file = new File("0318.txt");
		if(file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String data = br.readLine();			// 한줄 읽어괴
				System.out.println(data);
				
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
