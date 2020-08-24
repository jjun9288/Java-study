package 배열기본;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */
public class _11_배열_틱택토게임 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = new int[9];
		
		int win = 0;
		int turn = 0;
		
		while(true) {
			//3X3 배열 만들기
			System.out.println("===============");
			for(int i=0; i<9; i++) {
			//1-O 2-X
				if(game[i]==0) {System.out.print("[ ]");}
				else if(game[i]==1) {System.out.print(" O ");}
				else if(game[i]==2) {System.out.print(" X ");}
				if(i%3 == 2) {System.out.println();}
			}
			//승리자 표기
			if(win==1) {
				System.out.println("p1 승리");
				break;
			}
			else if(win==2) {
				System.out.println("p2 승리");
				break;
			}
			//p1 게임 진행
			if(turn%2==0) {
				System.out.println("p1 인덱스 입력 : ");
				int idx = scan.nextInt();
				if (game[idx]==0) {
					game[idx]=1;
					turn+=1;
				}
			}
			//p2 게임 진행
			else if(turn%2==1) {
				System.out.println("p2 인덱스 입력 : ");
				int idx = scan.nextInt();
				if(game[idx]==0) {
					game[idx]=2;
					turn+=1;
				}
			}
			//가로검사
			for(int i=0; i<9; i=i+3) {
				if(game[i]==1 && game[i+1]==1 && game[i+2]==1) {win=1;}
				else if(game[i]==2 && game[i+1]==2 && game[i+2]==2) {win=2;}
			}
			//세로검사
			for(int i=0; i<3; i++) {
				if(game[i]==1 && game[i+3]==1 && game[i+6]==1) {win=1;}
				else if(game[i]==2 && game[i+3]==2 && game[i+6]==2) {win=2;}
			}
			//대각선검사
			if(game[0]==1 && game[4]==1 && game[8]==1) {win=1;}
			if(game[0]==2 && game[4]==2 && game[8]==2) {win=2;}
			if(game[2]==1 && game[4]==1 && game[6]==1) {win=1;}
			if(game[2]==2 && game[4]==2 && game[6]==2) {win=2;}
		}
	}

}
