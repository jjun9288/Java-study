package basic;

import java.util.Scanner;

//java.util ��Ű�� �ȿ� Scanner ��� ������ import ��  (Scan+[ctrl+spacebar])
public class Day01_08_�Է¹ޱ� 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	//����01) ���� 2���� �Է� �޾� ���� ����϶�
		System.out.println("ù��° ���ڸ� �Է��ϼ��� :");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� :");
		int num2 = scan.nextInt();
		int sum = num1+num2;
		System.out.println("�� ������ ����  " + sum + "�Դϴ�");
		
	//����02) ���� 1���� �Է� �޾�, Ȧ���̸� true ���
		System.out.println("���� �Է� : ");
		int num3 = scan.nextInt();
		System.out.println(num3%2==1);
		
	//����03) ������ �Է¹޾�, 60�� �̻� 100�� �����̸� true ���
		System.out.println("���� �Է� :");
		int grade = scan.nextInt();
		System.out.println(grade>=60 && grade<=100);	
	}
}










/*System.out.println("���ڸ� �Է��ϼ��� :");
int num = scan.nextInt();
System.out.println("�Է��� ���� : " + num);*/