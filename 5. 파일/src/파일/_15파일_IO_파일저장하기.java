package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class _15파일_IO_파일저장하기 {
//txt 파일을 생성
	public static void main(String[] args) {
		String fileName = "Ex01.txt";
		//예외처리 없이는 사용하지 못하게 강제성을 부여해뒀다.
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("파일 저장하기 연습 중...");
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
