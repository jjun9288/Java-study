package Day03;

import java.util.Random;
import java.util.Scanner;

public class Day03_03_�ݺ���03_�����ܰ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("-------������ ����---------");
		int i=1;
		int result = 0;
		while(i<=5) {
			int a=ran.nextInt(9)+1;
			int b=ran.nextInt(9)+1;
			int sub = a*b;
			System.out.println(a + "x" + b + "=" + "?");
			int num=scan.nextInt();
			System.out.println("���� �Է��ϼ��� : ");
			System.out.println(num);
			if(num == sub) {System.out.println("����!");
							result +=20;}
			else System.out.println("��!");
			i++;	
		}
		System.out.println("��� : " + result);
	}
}
