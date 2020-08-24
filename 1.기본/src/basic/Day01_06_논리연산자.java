package basic;

/*
 * [4] 논리연산자
 * 1. and && : 양 쪽 모두 true 여야 참
 * 2. or || ([shift+\] *2) : 어느 한 쪽이라도 true 이면 참
 */
public class Day01_06_논리연산자 
{

	public static void main(String[] args) 
	{
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);
	}

}
