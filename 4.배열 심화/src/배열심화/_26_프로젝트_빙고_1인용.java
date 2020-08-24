package �迭��ȭ;

import java.util.Random;
import java.util.Scanner;

/*1) 1�ο� �÷���
5x5 2���� �迭
int[ ][ ] bingo = new int[5][5];
1���� 50������ ���� ���� 25���� �ߺ����� bingo �迭�� ����
���� ���� ��, y��ǥ�� x��ǥ�� �Է¹޾� ó�� 
�ߺ� ���� ����
���� ó�� : ����5 + ����5 + �밢��2(12����)
*/
public class _26_������Ʈ_����_1�ο� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[5][5];
		int[][] mark = new int[5][5];
		
		int[] temp = new int[5*5];
		
		int size = 50;
		
		int win = 0;
		
		//�ߺ��˻�
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size)+1;
			for(int j=0; j<i; j++) {
				if(temp[j] == temp[i]) {
					i = i-1;
				}
			}
		}
		//�ߺ��˻縦 �ϱ����� temp[]�� �����? �� �� �ٽ� ���������� �ߺ����� �ʴ� ������ ����?
		int k = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				bingo[i][j] = temp[k];
				k += 1;
			}
		}
		
		while(true) {
			//���� �� ����
			System.out.print(" ");
			for(int i=0; i<5; i++) {
				System.out.print(" ");
				System.out.print(i + "\t");
			}
			System.out.println();
			
			for(int i=0; i<5; i++) {
				System.out.print(i + " ");
				for(int j=0; j<5; j++) {
					//���� mark�� 5x5�� 0���� �Ǿ������Ƿ� �ش� 0�� ������ ä���
					if(mark[i][j] == 0) {
					System.out.print(bingo[i][j] + "\t");
					}
					//ó���� ���ڵ��� o ���� ��ü
					else System.out.print("o" + "\t");
				}
				System.out.println();
			}
			
			if(win == 1) System.out.println("���� ����");
			System.out.println();
			
			System.out.println("y ��ǥ �Է� : ");
			int pY = scan.nextInt();
			System.out.println("x ��ǥ �Է� : ");
			int pX = scan.nextInt();
			
			if(mark[pY][pX] == 0) {
				mark[pY][pX] = 1;	// 1�̸� o ���, 0�̸� ���� ���� ���! 
			}
			
			//���ΰ˻�
			int cnt = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(mark[i][j] == 1) {
						cnt += 1;
					}
					if(cnt == 5) {
						win = 1;
						
					}
				}
			}
			
			//���ΰ˻�
			cnt = 0;
			for(int j=0; j<5; j++) {
				for(int i=0; i<5; i++) {
					if(mark[i][j] == 1) {
						cnt += 1;
					}
					if(cnt == 5) {
						win = 1;
						
					}
				}
			}
			
			//�밢���˻�
			
			// 1. \
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(mark[i][i] == 1) {
					cnt += 1;
				}
			}
			if(cnt == 5) {
				win = 1;
				
			}
			
			// 2. /
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(mark[i][4-i] == 1) {
					cnt += 1;
				}	
			}
			if(cnt == 5) {
				win = 1;
				
			}
		}
	}
}
