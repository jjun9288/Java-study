package basic;
/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������
 * 	1) 2���̸�, ¦¦�� ���
 *  2) 1���̸�, ¦�� ���
 *  3) 0���̸�, �ش� ���ڸ� ���
 * ��)
 * 		33	 : ¦¦
 * 		16	 : ¦
 * 		 7	 : 7
 */
import java.util.Random;
import java.util.Scanner;

public class Day02_13����_369���� 
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
		
		if(cnt == 2) {System.out.println("¦¦");}
		else if(cnt == 1) {System.out.println("¦");}
		else System.out.println(num);
		
	}

}


/*int num1 = ran.nextInt(50)+1;
System.out.println(num1);
if(num1 < 10) {
	if(num1 % 3 ==0) {System.out.println("¦");}
	else System.out.println(num1);
}
else if(num1 >= 10) {
	if(num1 % 30 == 0 && (num1%10) % 3 == 0) {System.out.println("¦¦");}
	else if(num1 % 30 != 0 && num1%10%3 == 0) {System.out.println("¦");}
	else if(num1 % 30 == 0 && num1%10%3 != 0) {System.out.println("¦");}
	else System.out.println(num1);
	}*/