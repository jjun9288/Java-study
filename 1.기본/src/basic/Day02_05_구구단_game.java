package basic;

import java.util.Scanner;

public class Day02_05_������_game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� :");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int num2 = scan.nextInt();
		System.out.println("�� �Է� :");
		int num3 = scan.nextInt();
	
		int mul = num1 * num2;
		if(num3==mul) {System.out.println("�����Դϴ�");}
		else System.out.println("Ʋ�Ƚ��ϴ�");		
	}

}
