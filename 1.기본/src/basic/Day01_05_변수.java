package basic;

/*
 * [3]변수(variable)
 * 1. 종류
 * 2. 이름
 * 3. 값
 * 정수 10 - int
 * 실수 3.14 - double
 */
public class Day01_05_변수 
{

	public static void main(String[] args) 
	{
		int num = 10;
		num = 5;
		System.out.println(num);
		
		int x = 3;
		System.out.println(x+1);
		System.out.println(x);
		
		x+=1;
		System.out.println(x);
		
		int a = 10;
		int b = 20;
		//a 와 b 값 교체
		/* a=b;
		 * b=a;  -> a=20, b=20 이 되지
		*/
		int c = a;  //c=10
		a = b;      //a=20
		b = c;      //b=10
		
		System.out.println(a);
		System.out.println(b);

	}

}
