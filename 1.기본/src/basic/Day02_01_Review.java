package basic;

public class Day02_01_Review 
{

	public static void main(String[] args) 
	{
	//������ : byte < short < int < long
		int year_2 = 2020;
		System.out.println(year_2);
		
		int max1 = 2147483647;
	    long max2 = 2147483648L;  //long ���� ������ ���� L ����.
		System.out.println(max1);
		System.out.println(max2);
		
	//�Ǽ��� : float < double
		double a = 108.2000000;
		float b = 182.4f;  //float ���� ������ ���� f �ٿ��� �Ѵ�.
		System.out.println(b);
	
	//������ : char
		char x = 'a'; 
		char x2 = 65;   //ASCII code
		System.out.println(x);
		System.out.println(x2);
	
	//���ڿ� : string
		String str1 = "a b c d";
		System.out.println(str1);
		
	//boolean ��/����
		boolean b1 = true;
		System.out.println(b1);
		
	//ex
		int sec = 71064;
		System.out.println(sec/60/60 + "��");
		System.out.println(sec/60%60 + "��" );
		System.out.println(sec%60 + "��");
		
		
	/*���ڸ��� ���ϱ� 384*749
	 *     384
	 *   X 749
	 *---------
	 *    3456
	 *   1536
	 *  2688
	 *---------
	 *  287616     
	*/
		int x5 = 384;
		int x6 = 749;
		
		int unit = x6%10;     //9
		int ten = x6%100/10;  //4
		int hund = x6/100;    //7
		
		int first = x5 * unit;
		int second = x5 * ten;
		int third = x5 * hund;
		
		int total = first + second*10 + third*100;
		System.out.println(total);
		
		
	}

}
