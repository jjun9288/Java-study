package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */
public class Day02_11_Ȧ¦���� {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int random_number = ran.nextInt(100)+1;
		
		System.out.println("Ȧ���ϱ�� ¦���ϱ��?");
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int my_number = scan.nextInt();
	
		if(my_number==1) {
			if(random_number%2==1) {System.out.println("�����Դϴ�!");}
			else System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		if(my_number==2) {
			if(random_number%2==0) {System.out.println("�����Դϴ�!");}
			else System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		else System.out.println("�ٽ� �Է��ϼ���.");
		
		System.out.println(random_number);
	}

}


