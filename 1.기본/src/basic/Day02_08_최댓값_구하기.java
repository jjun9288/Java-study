package basic;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */
public class Day02_08_�ִ�_���ϱ� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num2 = scan.nextInt();
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {System.out.println(num1);}
		else if(num2>num1 && num2>num3) {System.out.println(num2);}
		else System.out.println(num3);
	}

}
