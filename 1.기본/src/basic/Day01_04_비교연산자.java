package basic;

public class Day01_04_비교연산자 
{
	/*
	 * [2] 비교 연산자
	 * 1. 크다           : >
	 * 2. 작다           : <
	 * 3. 같다           : ==
	 * 4. 다르다        : !=
	 * 5. 크거나 같다 : >=
	 * 6. 작거나 같다 : <=
	 */
	public static void main(String[] args) 
	{
		//true false 로 출력
		//모두 true 가 되도록 변경
		System.out.println(10 > 3);
		System.out.println(10 < 30);
		System.out.println(10 == 10);
		System.out.println(10 != 3);
		System.out.println(10 >= 3);
		System.out.println(10 <= 30);
		
		//문제01) 점수가 60점 이상이면 true 출력
		int score=70;
		System.out.println(score >= 60);
		
		//문제02) 3의 배수이면 true 출력
		int a = 453;
		System.out.println(a%3 == 0);
		
		//문제03) 금액을 입력하고 1000원 이상인 화폐를 제외한 나머지 금액에서 1000원짜리가 3장 이상이면 true 출력
		int money = 18000;
		int thousand = ((18000 % 10000) % 5000) /1000;
		System.out.println(thousand >= 3);
		
		//문제04) 3과목의 평균이 60점 이상이면 true, 한 과목이라도 50점 아래면 false
		int math = 90;
		int kor = 14;
		int eng = 82;
		int total = math + kor + eng;
		int avg = total / 3;
		System.out.println(avg>=60 && math>=50 && eng>=50 && kor>=50);
		
		//문제05) 키 180 이상이거나 몸무게 100 이하이면 true
		int height = 172;
		int weight = 110;
		System.out.println(height >= 180 || weight <= 100);
	}

}