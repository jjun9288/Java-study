package ����;

import java.util.Scanner;

/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */
public class _06_�����ձ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String start = "������";
		
		while(true) {
		int size = start.length();
		System.out.println("���þ� : " + start);
		System.out.print("�Է� : ");
		String me = scan.next();
		
		if(start.charAt(size-1) == me.charAt(0)) {
			start = me;
			}
		else break;
		}
	}
}
