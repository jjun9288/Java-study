package ����;

import java.util.Scanner;

/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */
public class _12_�ܾ�˻�_1�ܰ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		String[] part = text.split(" ");
		int check = -1;
		for(int i=0; i<part.length; i++) {
			if(word.equals(part[i])) {
				check = 1;
			}
			else continue;
		}
		
		if(check == 1) {
			System.out.println("true");
		}
		else System.out.println("false");
	}
}
