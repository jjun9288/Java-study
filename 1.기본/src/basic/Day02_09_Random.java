package basic;

import java.util.Random;

public class Day02_09_Random {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int num1 = ran.nextInt(3);    //0~2 출력
		System.out.println(num1);
		
		num1 = ran.nextInt(3)+1;      //1~3 출력
		System.out.println(num1);
		
	}
}
