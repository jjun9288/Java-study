package basic;

import java.util.Scanner;

/*
 * # Up & Down ����[1�ܰ�]
 * 1. com�� 8�̴�.
 * 2. me�� com�� ���ڸ� ���ߴ� �����̴�.
 * 3. ������ ���� �޼����� ����Ѵ�.
 * 1) me < com	: Up!
 * 2) me == com : Bingo!
 * 3) me > com  : Down!
 */
public class Day02_03_Up_down_game {

	public static void main(String[] args) {
		int com = 8;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� : ");
		int me = scan.nextInt();
		
		if(me<com) {System.out.println("Up!");}
		else if(me==com) {System.out.println("Bingo!");}
		else System.out.println("Down!");	
	}
}
