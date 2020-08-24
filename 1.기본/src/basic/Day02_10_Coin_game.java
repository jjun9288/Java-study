package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
public class Day02_10_Coin_game {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		System.out.println("앞(0)일까요 뒤(1)일까요?");
		int me = scan.nextInt();
		
		if(me==coin) {System.out.println("정답입니다!");}
		else System.out.println("틀렸습니다.");
		System.out.println("정답 : " + coin);
	}

}
