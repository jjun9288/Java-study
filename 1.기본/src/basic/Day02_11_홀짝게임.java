package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */
public class Day02_11_홀짝게임 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int random_number = ran.nextInt(100)+1;
		
		System.out.println("홀수일까요 짝수일까요?");
		System.out.println("1.홀수");
		System.out.println("2.짝수");
		
		System.out.println("숫자를 입력하세요 : ");
		int my_number = scan.nextInt();
	
		if(my_number==1) {
			if(random_number%2==1) {System.out.println("정답입니다!");}
			else System.out.println("틀렸습니다.");
		}
		if(my_number==2) {
			if(random_number%2==0) {System.out.println("정답입니다!");}
			else System.out.println("틀렸습니다.");
		}
		else System.out.println("다시 입력하세요.");
		
		System.out.println(random_number);
	}

}


