package Day03;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
public class Day03_05_�ݺ���05_Up_Down_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num = ran.nextInt(100)+1;
		int i = 1;
		int score = 100;
		while(i==1) {
			System.out.println("���� �Է� : ");
			int my_num = scan.nextInt();
			if(my_num > num) {System.out.println("Down");
							  score -= 5;}
			else if(my_num < num) {System.out.println("Up");
							  score -= 5;}
			else {System.out.println("�����Դϴ�.");
								i=0;}
		}
		System.out.println(score);
	}

}
