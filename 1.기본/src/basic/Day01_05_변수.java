package basic;

/*
 * [3]����(variable)
 * 1. ����
 * 2. �̸�
 * 3. ��
 * ���� 10 - int
 * �Ǽ� 3.14 - double
 */
public class Day01_05_���� 
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
		//a �� b �� ��ü
		/* a=b;
		 * b=a;  -> a=20, b=20 �� ����
		*/
		int c = a;  //c=10
		a = b;      //a=20
		b = c;      //b=10
		
		System.out.println(a);
		System.out.println(b);

	}

}
