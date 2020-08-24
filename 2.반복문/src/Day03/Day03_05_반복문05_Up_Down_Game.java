package Day03;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */
public class Day03_05_반복문05_Up_Down_Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int num = ran.nextInt(100)+1;
		int i = 1;
		int score = 100;
		while(i==1) {
			System.out.println("숫자 입력 : ");
			int my_num = scan.nextInt();
			if(my_num > num) {System.out.println("Down");
							  score -= 5;}
			else if(my_num < num) {System.out.println("Up");
							  score -= 5;}
			else {System.out.println("정답입니다.");
								i=0;}
		}
		System.out.println(score);
	}

}
