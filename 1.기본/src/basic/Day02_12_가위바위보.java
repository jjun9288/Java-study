package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * ����(0) ����(1) ��(2)
 */
public class Day02_12_���������� {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ���� ��!");
		int com = ran.nextInt(3);
		System.out.println("�� : ");
		int me = scan.nextInt();
		System.out.println(com);
		if(me == com) {System.out.println("�����ϴ�");}
		else if ((me==0 && com==2) || (me==1 && com==0) || (me==2 && com==1)) {System.out.println("�̰���ϴ�!");}
		else System.out.println("�����ϴ�.");

	}

}
