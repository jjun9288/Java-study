package ����;

import java.util.Scanner;

/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */
public class _09_���ڿ�_�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			String name = "�ڳ���";
			System.out.println(name);
			
			System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
			String myName = scan.next();
			int check = -1;
			if(name.length() == myName.length()) {
				check = 1;
				for(int i=0; i<name.length(); i++) {
					if(name.charAt(i) != myName.charAt(i)) {
						check = -1;
					}
				}
			}
			
			if(check == 1) System.out.println("true");
			else if(check == -1) System.out.println("false");
	}
}
