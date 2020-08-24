package basic;

import java.util.Scanner;

//java.util 패키지 안에 Scanner 라는 파일을 import 함  (Scan+[ctrl+spacebar])
public class Day01_08_입력받기 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	//문제01) 숫자 2개를 입력 받아 합을 출력하라
		System.out.println("첫번째 숫자를 입력하세요 :");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요 :");
		int num2 = scan.nextInt();
		int sum = num1+num2;
		System.out.println("두 숫자의 합은  " + sum + "입니다");
		
	//문제02) 숫자 1개를 입력 받아, 홀수이면 true 출력
		System.out.println("숫자 입력 : ");
		int num3 = scan.nextInt();
		System.out.println(num3%2==1);
		
	//문제03) 성적을 입력받아, 60점 이상 100점 이하이면 true 출력
		System.out.println("성적 입력 :");
		int grade = scan.nextInt();
		System.out.println(grade>=60 && grade<=100);	
	}
}










/*System.out.println("숫자를 입력하세요 :");
int num = scan.nextInt();
System.out.println("입력한 숫자 : " + num);*/