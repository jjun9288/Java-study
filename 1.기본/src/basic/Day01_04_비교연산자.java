package basic;

public class Day01_04_�񱳿����� 
{
	/*
	 * [2] �� ������
	 * 1. ũ��           : >
	 * 2. �۴�           : <
	 * 3. ����           : ==
	 * 4. �ٸ���        : !=
	 * 5. ũ�ų� ���� : >=
	 * 6. �۰ų� ���� : <=
	 */
	public static void main(String[] args) 
	{
		//true false �� ���
		//��� true �� �ǵ��� ����
		System.out.println(10 > 3);
		System.out.println(10 < 30);
		System.out.println(10 == 10);
		System.out.println(10 != 3);
		System.out.println(10 >= 3);
		System.out.println(10 <= 30);
		
		//����01) ������ 60�� �̻��̸� true ���
		int score=70;
		System.out.println(score >= 60);
		
		//����02) 3�� ����̸� true ���
		int a = 453;
		System.out.println(a%3 == 0);
		
		//����03) �ݾ��� �Է��ϰ� 1000�� �̻��� ȭ�� ������ ������ �ݾ׿��� 1000��¥���� 3�� �̻��̸� true ���
		int money = 18000;
		int thousand = ((18000 % 10000) % 5000) /1000;
		System.out.println(thousand >= 3);
		
		//����04) 3������ ����� 60�� �̻��̸� true, �� �����̶� 50�� �Ʒ��� false
		int math = 90;
		int kor = 14;
		int eng = 82;
		int total = math + kor + eng;
		int avg = total / 3;
		System.out.println(avg>=60 && math>=50 && eng>=50 && kor>=50);
		
		//����05) Ű 180 �̻��̰ų� ������ 100 �����̸� true
		int height = 172;
		int weight = 110;
		System.out.println(height >= 180 || weight <= 100);
	}

}