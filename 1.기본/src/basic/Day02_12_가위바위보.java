package basic;

import java.util.Random;
import java.util.Scanner;

/*
 * 가위(0) 바위(1) 보(2)
 */
public class Day02_12_가위바위보 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위 바위 보!");
		int com = ran.nextInt(3);
		System.out.println("나 : ");
		int me = scan.nextInt();
		System.out.println(com);
		if(me == com) {System.out.println("비겼습니다");}
		else if ((me==0 && com==2) || (me==1 && com==0) || (me==2 && com==1)) {System.out.println("이겼습니다!");}
		else System.out.println("졌습니다.");

	}

}
