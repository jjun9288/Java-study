package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */
public class Day02_10_Coin_game {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		System.out.println("��(0)�ϱ�� ��(1)�ϱ��?");
		int me = scan.nextInt();
		
		if(me==coin) {System.out.println("�����Դϴ�!");}
		else System.out.println("Ʋ�Ƚ��ϴ�.");
		System.out.println("���� : " + coin);
	}

}
