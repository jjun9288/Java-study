package basic;
/*
 * # 369°ÔÀÓ[1´Ü°è]
 * 1. 1~50 »çÀÌÀÇ ·£´ı ¼ıÀÚ¸¦ ÀúÀåÇÑ´Ù.
 * 2. À§ ¼ö¿¡ 369ÀÇ °³¼ö°¡
 * 	1) 2°³ÀÌ¸é, Â¦Â¦À» Ãâ·Â
 *  2) 1°³ÀÌ¸é, Â¦À» Ãâ·Â
 *  3) 0°³ÀÌ¸é, ÇØ´ç ¼ıÀÚ¸¦ Ãâ·Â
 * ¿¹)
 * 		33	 : Â¦Â¦
 * 		16	 : Â¦
 * 		 7	 : 7
 */
import java.util.Random;
import java.util.Scanner;

public class Day02_13¿¹½À_369°ÔÀÓ 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(50)+1;
		System.out.println(num);
		int ten = num / 10;
		int one = num % 10;
		int cnt = 0;
		if(ten == 3 || ten == 6 || ten == 9) {cnt+=1;}
		if(one == 3 || one == 6 || one == 9) {cnt+=1;}
		
		if(cnt == 2) {System.out.println("Â¦Â¦");}
		else if(cnt == 1) {System.out.println("Â¦");}
		else System.out.println(num);
		
	}

}


/*int num1 = ran.nextInt(50)+1;
System.out.println(num1);
if(num1 < 10) {
	if(num1 % 3 ==0) {System.out.println("Â¦");}
	else System.out.println(num1);
}
else if(num1 >= 10) {
	if(num1 % 30 == 0 && (num1%10) % 3 == 0) {System.out.println("Â¦Â¦");}
	else if(num1 % 30 != 0 && num1%10%3 == 0) {System.out.println("Â¦");}
	else if(num1 % 30 == 0 && num1%10%3 != 0) {System.out.println("Â¦");}
	else System.out.println(num1);
	}*/