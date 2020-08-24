package �迭��ȭ;

import java.util.Random;
import java.util.Scanner;

/*
 * # ���� �߱� ����
 * 1. me�� 1~9 ������ ���� 3���� ����
 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
 * ��)
 * ���� : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */
public class _03_��ȭ_���ھ߱����� {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
		while(true) {
			
			int strike = 0;
			int ball = 0;

			for(int i=0; i<3; i++) {
				System.out.print("[" + (i+1) + "]1~9 �Է� : ");
				int num = scan.nextInt();
				//me �迭�� ���� ���ڰ� �ߺ��Ǵ°� ���� ���� �� ��. check�� -1�� �Ǹ� �ش� ĭ ���� �ٽ� �Է�
				int check = 1;
				for(int j=0; j<i; j++) {
					if(num == me[j]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					i= i-1; //���� �ߺ� �����Ƿ� �ٽ� ���ÿ�!
				}else {
					me[i] = num; //�ߺ� �� �����Ƿ� ���� ���� �Է�
				}
			}
			
			System.out.print("me = ");
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " ");
			}
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike += 1;
						}else if(i != j) {
							ball += 1;
						}
					}
				}
			}
			System.out.print("com =");
			for (int i=0; i<3; i++) {System.out.print(com[i]);}
			System.out.println("strike(" + strike + ") ball(" + ball + ")");
			
			if(strike == 3) {
				break;
			}
		}
	}

}
