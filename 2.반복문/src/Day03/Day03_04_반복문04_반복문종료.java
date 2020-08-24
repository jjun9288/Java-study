package Day03;

import java.util.Scanner;

/* # 반복문 종료
* 1. 무한 반복을 하면서 숫자를 입력받는다.
* 2. 입력한 숫자가 0이면, 프로그램은 종료된다.
*/ 
public class Day03_04_반복문04_반복문종료 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while(i==1) {
			System.out.println("숫자 입력(EXIT=0) : ");
			int a = scan.nextInt();
			if(a==0) {System.out.println("종료");
					  i = 0;}
		}
	}
}

