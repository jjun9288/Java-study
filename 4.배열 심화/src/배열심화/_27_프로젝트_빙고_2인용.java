package 배열심화;

import java.util.Random;
import java.util.Scanner;

/*
 2) 2인용 플레이
 turn 개념 적용
 내가 선택한 숫자가 상대방에게도 있을 경우, 함께 마킹
*/
public class _27_프로젝트_빙고_2인용 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int size = 50;
		
		int[][] me = new int[5][5];
		int[][] you = new int[5][5];
		
		int[][] meMark = new int[5][5];
		int[][] youMark = new int[5][5];
		
		int[] temp = new int[5*5];
		
		int win = 0;
		int turn = 0;
		int p1X = 0;	int p1Y = 0;
		int p2X = 0;	int p2Y = 0;

		//me 빙고판 만들기(중복x)
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size)+1;
			for(int j=0; j<i; j++) {
				if(temp[j] == temp[i]) {
					i -= 1;
				}
			}
		}
		int m=0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				me[i][j] = temp[m];
				m += 1;
			}
		}
		//you 빙고판 만들기(중복x)
		for(int i=0; i<temp.length; i++) {
			temp[i] = ran.nextInt(size)+1;
			for(int j=0; j<i; j++) {
				if(temp[j] == temp[i]) {
					i -= 1;
				}
			}
		}
		int n=0;
		for(int i=0; i<maxNum; i++) {
			for(int j=0; j<maxNum; j++) {
				you[i][j] = temp[n];
				n += 1;
			}
		}
		
		while(true) {
			//me 빙고판 공개
			System.out.print(" ");
			for(int i=0; i<5; i++) {
				System.out.print(" " + i + "\t");
				}
			System.out.println();
			for(int i=0; i<5; i++) {
				System.out.print(i + " ");
				for(int j=0; j<5; j++) {
					if(meMark[i][j] == 0) {
						System.out.print(me[i][j] + "\t");
					}
					else if(meMark[i][j] == 1) {
						System.out.print("O \t");
					}
				}
				System.out.println();
			}
			//you 빙고판 공개
			System.out.print(" ");
			for(int i=0; i<5; i++) {
				System.out.print(" "+ i + "\t");
			}
			System.out.println();
			for(int i=0; i<5; i++) {
				System.out.print(i + " ");
				for(int j=0; j<5; j++) {
					if(youMark[i][j] == 0) {
						System.out.print(you[i][j] + "\t");
					}
					else if(youMark[i][j] == 1) {
						System.out.print("X \t");
					}
				}
				System.out.println();
			}
			
			if(win == 1) {System.out.println("me 승리!");}
			else if(win == 2) {System.out.println("you 승리!");}
			 //me turn
			if(turn % 2 == 0) {
				System.out.println("me 차례");
				System.out.println("Y 좌표 입력 : ");
				p1Y = scan.nextInt();
				System.out.println("X 좌표 입력 : ");
				p1X = scan.nextInt();
				
				if(meMark[p1Y][p1X] == 0) {
					meMark[p1Y][p1X] = 1;
					turn += 1;
					// me 입력한 숫자가 you 에 있다면 you 의 해당 칸도 비우기
					for(int i=0; i<5; i++) {
						for(int j=0; j<5; j++) {
							if(me[p1Y][p1X] == you[i][j]) {
								if(youMark[i][j] == 0) {
									youMark[i][j] = 1;
								}
							}
						}
					}
				}
				else {
					System.out.println("다시 입력하세요.");
				}
			}
			//you turn
			else if(turn % 2 == 1) {
				System.out.println("you 차례");
				System.out.println("Y 좌표 입력 : ");
				p2Y = scan.nextInt();
				System.out.println("X 좌표 입력 : ");
				p2X = scan.nextInt();
				
				if(youMark[p2Y][p2X] == 0) {
					youMark[p2Y][p2X] = 1;
					turn += 1;
					//you 에 입력한 숫자가 me 에도 있다면 me 의 해당 칸도 비우기
					for(int i=0; i<5; i++) {
						for(int j=0; j<5; j++) {
							if(you[p2Y][p2X] == me[i][j]) {
								if(meMark[i][j] == 0) {
									meMark[i][j] = 1;
								}
							}
						}
					}
				}
				else {
					System.out.println("다시 입력하세요.");
				}
			}
			
			//승패 결정
			
			//가로 검사
			//me 검사
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(meMark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			//you 검사
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(youMark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
			
			//세로 검사
			//me 검사
			for(int j=0; j<5; j++) {
				int cnt = 0;
				for(int i=0; i<5; i++) {
					if(meMark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;

				}
			}
			//you 검사
			for(int j=0; j<5; j++) {
				int cnt = 0;
				for(int i=0; i<5; i++) {
					if(youMark[i][j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
			//대각선(/) 검사
			//me 검사
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(meMark[i][4-j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			//you 검사
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(youMark[i][4-j] == 1) {
						cnt += 1;
					}
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
			//대각선(\) 검사
			//me 검사
			int cnt = 0;
			for(int i=0; i<5; i++) {
				if(meMark[i][i] == 1) {
					cnt += 1;
				}
				if(cnt == 5) {
					win = 1;
					break;
				}
			}
			//you 검사
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(youMark[i][i] == 1) {
					cnt += 1;
				}
				if(cnt == 5) {
					win = 2;
					break;
				}
			}
		}
	}
}
