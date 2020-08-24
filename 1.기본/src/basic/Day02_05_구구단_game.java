package basic;

import java.util.Scanner;

public class Day02_05_구구단_game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 :");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		System.out.println("값 입력 :");
		int num3 = scan.nextInt();
	
		int mul = num1 * num2;
		if(num3==mul) {System.out.println("정답입니다");}
		else System.out.println("틀렸습니다");		
	}

}
