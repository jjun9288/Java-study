package �迭��ȭ;

import java.util.Scanner;

/*
 * # ���ڿ� [��]
 * . ���ڿ� �񱳴� equals() �޼��带 ���� Ȯ���� �� �ִ�.
 */
public class _18_��ȭ_���ڿ�_�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "���ؿ�";
		
		System.out.println("�̸� �Է� : ");
		String my_name = scan.next();
		
		if(name == my_name) System.out.println("��ġ");
		else System.out.println("����ġ");
		
		if(name.equals(my_name)) System.out.println("��ġ");
		else System.out.println("����ġ");
	}

}
