package basic;

import java.util.Scanner;

/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������ 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������ �߸� �Է��߽��ϴ�.
 */
public class Day02_06_����_��ȿ��_�˻� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		
		if(60<=score && score<=100) {System.out.println("�հ�");}
		else if(0<=score && score<=60) {System.out.println("���հ�");}
		else {System.out.println("������ �߸� �Է��߽��ϴ�.");}
	}

}
