package ����;

import java.util.Scanner;

/*
 * # nextLine()�� next()�� ����
 * 1. nextLine() : ���� �Ѷ��� ��ü�� �Է¹޴´�. 
 * 2. next() : ������ �������� �Ѵܾ �Է¹޴´�.
 */

// nextInt(), next(), nextLine() �� ���°ž� ����!
public class _11_next�޼���_vs_nextline�޼���_�� {

	public static void main(String[] args) {
		/*
		 * hello java �Է½�,
		 * nextLine() �޼���� Hello Java ��� ��µ�����,
		 * next() �޼���� Hello�� ��µȴ�.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine();	
		System.out.println(name);
		
		System.out.print("�̸� �Է� : ");
		name = scan.next();	
		System.out.println(name);


	}
}
