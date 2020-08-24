package Day03;

import java.util.Scanner;

/*
 * # 보조제어문
 * 1. break
 * . 반복문 1개를 즉시 종료
 * 2. continue
 * . 반복문의 조건식으로 바로 이동
 * . 아래식을 실행시키고 싶지 않을 때 사용
 */
public class Day03_08_보조제어문 {

	public static void main(String[] args) {
		//break문
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i>3) break;
		}
		
		//continue문
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("햄버거");
			System.out.println("콜라");
			System.out.println("감자튀김");
			
			System.out.println("숫자 입력 : ");
			int sel = scan.nextInt();
			if(sel ==1) System.out.println("5000원");
			else if(sel ==2) System.out.println("2000원");
			else if(sel ==3) System.out.println("2000원");
			else continue;
		}
	}

}
