package Day03;

import java.util.Scanner;

/* # �ݺ��� ����
* 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
* 2. �Է��� ���ڰ� 0�̸�, ���α׷��� ����ȴ�.
*/ 
public class Day03_04_�ݺ���04_�ݺ������� {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i==1) {
			System.out.println("���� �Է�(EXIT=0) : ");
			int a = scan.nextInt();
			if(a==0) {System.out.println("����");
					  i = 0;}
		}
	}
}

