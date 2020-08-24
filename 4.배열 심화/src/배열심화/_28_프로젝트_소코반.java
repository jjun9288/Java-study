package �迭��ȭ;

import java.util.Random;
import java.util.Scanner;

/*1. 7 x 7 ��ũ��
* 2. �� ��ġ ���θ� �����Ѵ� : 3��
* 3. ���� ��밡 �����ϰ� ��ġ�ȴ�.
* 4. ĳ������ ��ǥ��(y, x)�� �Է¹޾�, ��ġ��Ų��.
* 5. ĳ���ʹ� �����¿�� �̵������ϴ�.
* 6. ĳ���Ͱ� �� ���� ������ ������ ����ȴ�.
*/
public class _28_������Ʈ_���ڹ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pX = 0;
		int pY = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		//����ġ
		System.out.println("��ġ�� ���� ������ �Է��ϼ��� : ");
		wallCount = scan.nextInt();
		
		int temp = wallCount;
		while(temp != 0) {
			int rY = ran.nextInt(SIZE-2) + 1;
			int rX = ran.nextInt(SIZE-2) + 1;
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = WALL;
				temp -= 1;
			}
		}
		
		//����ġ
		while(true) {
			int rY = ran.nextInt(SIZE-2) + 1;
			int rX = ran.nextInt(SIZE-2) + 1;
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = BALL;
				ballY = rY;
				ballX = rX;
				break;
			}
		}
		
		//��뼳ġ
		while(true) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if(map[rY][rX] == 0) {
				map[rY][rX] = GOAL;
				goalY = rY;
				goalX = rX;
				break;
			}
		}
		//ȭ�� ���
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		//�÷��̾��ġ
		while(true) {
			System.out.println("�÷��̾ ��ġ�� ��Ҹ� �Է��ϼ��� : ");
			System.out.print("Y ��ǥ : ");
			pY = scan.nextInt();
			System.out.print("X ��ǥ : ");
			pX = scan.nextInt();
			
			if(map[pY][pX] == 0) {
				map[pY][pX] = PLAYER;
				break;
			}
		}
		//���ӽ���
		while(true) {
			//ȭ�� ���
			System.out.println("------------------------");
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(map[i][j] == PLAYER) {
						System.out.print("�� ");
					}
					else if(map[i][j] == WALL) {
						System.out.print("�� ");
					}
					else if(map[i][j] == GOAL) {
						System.out.print("�� ");
					}
					else if(map[i][j] == BALL) {
						System.out.print("�� ");
					}
					else System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("------------------------");
			//��뿡 ���� ������ ��������
			if(ballY == goalY && ballX == goalX) {
				System.out.println("���� ����");
				break;
			}
			
			System.out.print("��(1) ��(2) ��(3) ��(4) �Է� : ");
			int move = scan.nextInt();
			
			//���� ��ġ �����ϱ�
			int yy = pY;
			int xx = pX;
			
			if(move == 1) {yy = yy - 1;}
			else if(move == 2) {yy = yy + 1;}
			else if(move == 3) {xx = xx - 1;}
			else if(move == 4) {xx = xx + 1;}
			//����ó��
			if(yy >= SIZE || yy < 0) continue;
			if(xx >= SIZE || xx < 0) continue;
			if(map[yy][xx] != 0 && map[yy][xx] != BALL) continue;
			
			//�� ���� ��
			if(map[yy][xx] == BALL) {
				int yyy = ballY;
				int xxx = ballX;
				if(move == 1) {yyy = yyy - 1;}
				else if(move == 2) {yyy = yyy + 1;}
				else if(move == 3) {xxx = xxx - 1;}
				else if(move == 4) {xxx = xxx + 1;}
				//����ó��
				if(yyy >= SIZE || yyy < 0) continue;
				if(xxx >= SIZE || xxx < 0) continue;
				if(map[yyy][xxx] != 0 && map[yyy][xxx] != GOAL) continue;
				//�� �̵�
				map[ballY][ballX] = 0;
				ballY = yyy;
				ballX = xxx;
				map[ballY][ballX] = BALL;
			}
			//ĳ���� �̵���Ű��
			map[pY][pX] = 0;
			pY = yy;
			pX = xx;
			map[pY][pX] = PLAYER;
			
		}
		
		
		

	}

}
