package �迭��ȭ;

import java.util.Scanner;

/*
 * # �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�.
 * 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 */
public class _02_��ȭ_�����̵�_2�ܰ� {

	public static void main(String[] args) {
		int[] game = {0,0,1,0,2,0,0,1,0};
		int player = 0;
		for(int i=0; i<9; i++) {
			if(game[i]==2) {player = i;}
		}
		boolean run = true;
		while(run) {
				for(int i=0; i<9; i++) {
					if(game[i]==2) {System.out.print("��");}
					else System.out.print(" ");
					}
				System.out.println();
				System.out.println("���ڸ� �Է��Ͻÿ� : (1 : �������� �̵�, 2 : ���������� �̵�");
				Scanner scan = new Scanner(System.in);
				int move = scan.nextInt();
	
				if(move == 1) {
					if(player-1 >= 0) {
						if(game[player-1]==1) {
							System.out.print("����!(3)");
							int destroy = scan.nextInt();
							if(destroy != 3) continue;
						}
						game[player-1]=2;
						game[player]=0;
						player=player-1;
					}
				}
				if(move == 2) {
					if(player+1 < 9) {
						if(game[player+1]==1) {
							System.out.print("����(3)");
							int destroy = scan.nextInt();
							if(destroy != 3) continue;
						}
						game[player+1]=2;
						game[player]=0;
						player=player+1;
					}	
				}
		}
	}

}
