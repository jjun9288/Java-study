package ����;

import java.util.Scanner;

/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) adklajsiod
 * 	     ���ڸ� �ִ�.
 * ��) 123123
 *    ���ڸ� �ִ�.
 * ��) dasd12312asd
 *    ���ڿ� ���ڰ� �����ִ�.
 */
public class _10_���ڿ�_��_���ڰ˻� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		char[] chNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int cnt = 0;
		for(int i=0; i<chNum.length; i++) {
			for(int j=0; j<text.length(); j++) {
				if(chNum[i] == text.charAt(j)) {
					cnt += 1;
				}
			}
		}
		
		if(cnt == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		}
		else if(cnt == 0) {
			System.out.println("���ڸ� �ִ�.");
		}
		else System.out.println("���ڿ� ���ڰ� �����ִ�.");
	}
}
