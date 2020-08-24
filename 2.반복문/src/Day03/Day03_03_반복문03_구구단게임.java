package Day03;

import java.util.Random;
import java.util.Scanner;

public class Day03_03_반복문03_구구단게임 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("-------구구단 게임---------");
		int i=1;
		int result = 0;
		while(i<=5) {
			int a=ran.nextInt(9)+1;
			int b=ran.nextInt(9)+1;
			int sub = a*b;
			System.out.println(a + "x" + b + "=" + "?");
			int num=scan.nextInt();
			System.out.println("답을 입력하세요 : ");
			System.out.println(num);
			if(num == sub) {System.out.println("정답!");
							result +=20;}
			else System.out.println("땡!");
			i++;	
		}
		System.out.println("결과 : " + result);
	}
}
