package Day03;

import java.util.Scanner;

/*
 * # �������
 * 1. break
 * . �ݺ��� 1���� ��� ����
 * 2. continue
 * . �ݺ����� ���ǽ����� �ٷ� �̵�
 * . �Ʒ����� �����Ű�� ���� ���� �� ���
 */
public class Day03_08_������� {

	public static void main(String[] args) {
		//break��
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i>3) break;
		}
		
		//continue��
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("�ܹ���");
			System.out.println("�ݶ�");
			System.out.println("����Ƣ��");
			
			System.out.println("���� �Է� : ");
			int sel = scan.nextInt();
			if(sel ==1) System.out.println("5000��");
			else if(sel ==2) System.out.println("2000��");
			else if(sel ==3) System.out.println("2000��");
			else continue;
		}
	}

}
