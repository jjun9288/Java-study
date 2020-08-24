package basic;

public class Day02_02_조건문 
{
	
	public static void main(String[] args)
	{
		
	int num = 1021;
	if(num%2==0) {
		System.out.println("짝수");
	}
	else System.out.println("홀수");
	
	//문제01) 양수,0,음수 출력
	int num1 = -13;
	if(num1>0) {
		System.out.println("양수");
	}
	if(num1==0) {
		System.out.println("0");
	}
	else System.out.println("음수");
	
	//합격,불합격 출력
	int score = 93;
	if(score>=60) {
		System.out.println("합격");
	} 
	else System.out.println("불합격");
	
	
	}

}
