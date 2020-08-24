package basic;

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */
public class Day02_08_최댓값_구하기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("숫자를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {System.out.println(num1);}
		else if(num2>num1 && num2>num3) {System.out.println(num2);}
		else System.out.println(num3);
	}

}
