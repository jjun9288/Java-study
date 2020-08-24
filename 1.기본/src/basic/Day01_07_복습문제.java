package basic;

public class Day01_07_복습문제 
{

	public static void main(String[] args) 
	{
		
		//예) 현금1000원을 갖고 있다. 200원짜리 과자를 구매했을 때 잔돈을 출력해보자.
		int cash = 1000;
		int snack = 200;
		int change = 1000 - 200;
		System.out.println(change);

		//문제1) 가로가 2이고, 세로가 4인 사각형의 넓이 출력
		int 가로 = 2;
		int 세로 = 4;
		int 넓이 = 가로*세로;
		System.out.println(넓이);

		//문제2) 위 길이의 삼각형의 넓이 출력
		System.out.println(넓이/2);

		//문제3) 월급이 1000원이다. 연봉출력. 단, 세금 10% 를 제외한 연봉 출력
		int month = 1000;
		int notax = 1000*12;
		double tax = month*0.1;
		double withtax = notax - tax*12;
		System.out.println(withtax); 
		
		//문제4) 100초를 1분 40초로 출력
		int time = 100;
		int min = time/60;
		int sec = time%60;
		System.out.println(min + "분" + sec + "초");
		
		//문제5) 800원에서 500원을 제외한 100원의 갯수 출력
		int money = 800;
		int fivehund = 800%500;
		int onehund = fivehund / 100;
		System.out.println(onehund);
	}

}

				