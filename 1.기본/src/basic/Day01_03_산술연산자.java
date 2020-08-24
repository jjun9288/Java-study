package basic;

public class Day01_03_산술연산자 
{
	/*
	 * [1] 산술연산자
	 * 1. 더하기 		 : +
	 * 2. 빼기 	  	 : -
	 * 3. 곱하기 		 : *
	 * 4. 나누기		 : /
	 * 5. 나누기(나머지) : %
	 */
	public static void main(String[] args) 
	{
		//문자 + 문자
		/*	System.out.println("ja"+"va");
			//사칙연산
			System.out.println(10+3);
			System.out.println(10-3);
			System.out.println(10*3);
			System.out.println(10/3);
			System.out.println(10%3);
			//숫자+문자
			System.out.println(10+"30");     //1030  */
		
		//예) 현금1000원을 갖고 있다. 200원짜리 과자를 구매했을 때 잔돈을 출력해보자.
				System.out.println(1000-200);
				
				//문제1) 가로가 2이고, 세로가 4인 사각형의 넓이 출력
				System.out.println(2*4);
				
				//문제2) 위 길이의 삼각형의 넓이 출력
				System.out.println(2*4/2);
				
				//문제3) 월급이 1000원이다. 연봉출력. 단, 세금 10% 를 제외한 연봉 출력
				System.out.println(1000*0.9*12);
				
				//문제4) 100초를 1분 40초로 출력
				System.out.println(100/60 + "분" + 100%60 + "초");
				
				//문제5) 800원에서 500원을 제외한 100원의 갯수
				System.out.println((800%500)/100);	//3	        
	}

}
