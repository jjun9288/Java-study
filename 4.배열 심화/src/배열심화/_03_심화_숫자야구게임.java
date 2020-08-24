package 배열심화;

import java.util.Random;
import java.util.Scanner;

/*
 * # 숫자 야구 게임
 * 1. me에 1~9 사이의 숫자 3개를 저장
 *    (단, 중복되는 숫자는 저장 불가)
 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
 * 3. 숫자와 자리가 같으면 		strike += 1
 *    숫자만 같고 자리가 틀리면 	ball += 1
 * 예)
 * 정답 : 1 7 3
 * 3 1 5		: 2b
 * 1 5 6		: 1s
 * ...
 */
public class _03_심화_숫자야구게임 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		
		while(true) {
			
			int strike = 0;
			int ball = 0;

			for(int i=0; i<3; i++) {
				System.out.print("[" + (i+1) + "]1~9 입력 : ");
				int num = scan.nextInt();
				//me 배열에 들어가는 숫자가 중복되는걸 막기 위해 쓴 것. check가 -1이 되면 해당 칸 숫자 다시 입력
				int check = 1;
				for(int j=0; j<i; j++) {
					if(num == me[j]) {
						check = -1;
					}
				}
				
				if(check == -1) {
					i= i-1; //숫자 중복 됐으므로 다시 쓰시오!
				}else {
					me[i] = num; //중복 안 됐으므로 다음 숫자 입력
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
