package 배열심화;

import java.util.Random;
import java.util.Scanner;

/*1) 1인용 플레이
5x5 2차원 배열
int[ ][ ] bingo = new int[5][5];
1부터 50사이의 랜덤 숫자 25개를 중복없이 bingo 배열에 저장
숫자 선택 시, y좌표와 x좌표를 입력받아 처리 
중복 선택 방지
승패 처리 : 가로5 + 세로5 + 대각선2(12가지)
*/
public class _26_프로젝트_빙고_1인용 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[5][5];
		int[][] mark = new int[5][5];
		
		int[] temp = new int[5*5];
		
		int size = 50;
		
		int win = 0;
		
		//중복검사
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size)+1;
			for(int j=0; j<i; j++) {
				if(temp[j] == temp[i]) {
					i = i-1;
				}
			}
		}
		//중복검사를 하기위해 temp[]를 만든듯? 그 후 다시 빙고판으로 중복되지 않는 빙고판 대입?
		int k = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				bingo[i][j] = temp[k];
				k += 1;
			}
		}
		
		while(true) {
			//빙고 판 생성
			System.out.print(" ");
			for(int i=0; i<5; i++) {
				System.out.print(" ");
				System.out.print(i + "\t");
			}
			System.out.println();
			
			for(int i=0; i<5; i++) {
				System.out.print(i + " ");
				for(int j=0; j<5; j++) {
					//현재 mark의 5x5는 0으로 되어있으므로 해당 0에 빙고판 채우기
					if(mark[i][j] == 0) {
					System.out.print(bingo[i][j] + "\t");
					}
					//처리된 숫자들은 o 으로 대체
					else System.out.print("o" + "\t");
				}
				System.out.println();
			}
			
			if(win == 1) System.out.println("게임 종료");
			System.out.println();
			
			System.out.println("y 좌표 입력 : ");
			int pY = scan.nextInt();
			System.out.println("x 좌표 입력 : ");
			int pX = scan.nextInt();
			
			if(mark[pY][pX] == 0) {
				mark[pY][pX] = 1;	// 1이면 o 출력, 0이면 원래 숫자 출력! 
			}
			
			//가로검사
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
			
			//세로검사
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
			
			//대각선검사
			
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
