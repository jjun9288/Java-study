package ����;

import java.io.FileWriter;
import java.io.IOException;

public class _15����_IO_���������ϱ� {
//txt ������ ����
	public static void main(String[] args) {
		String fileName = "Ex01.txt";
		//����ó�� ���̴� ������� ���ϰ� �������� �ο��ص״�.
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write("���� �����ϱ� ���� ��...");
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
