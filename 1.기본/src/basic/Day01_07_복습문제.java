package basic;

public class Day01_07_�������� 
{

	public static void main(String[] args) 
	{
		
		//��) ����1000���� ���� �ִ�. 200��¥�� ���ڸ� �������� �� �ܵ��� ����غ���.
		int cash = 1000;
		int snack = 200;
		int change = 1000 - 200;
		System.out.println(change);

		//����1) ���ΰ� 2�̰�, ���ΰ� 4�� �簢���� ���� ���
		int ���� = 2;
		int ���� = 4;
		int ���� = ����*����;
		System.out.println(����);

		//����2) �� ������ �ﰢ���� ���� ���
		System.out.println(����/2);

		//����3) ������ 1000���̴�. �������. ��, ���� 10% �� ������ ���� ���
		int month = 1000;
		int notax = 1000*12;
		double tax = month*0.1;
		double withtax = notax - tax*12;
		System.out.println(withtax); 
		
		//����4) 100�ʸ� 1�� 40�ʷ� ���
		int time = 100;
		int min = time/60;
		int sec = time%60;
		System.out.println(min + "��" + sec + "��");
		
		//����5) 800������ 500���� ������ 100���� ���� ���
		int money = 800;
		int fivehund = 800%500;
		int onehund = fivehund / 100;
		System.out.println(onehund);
	}

}

				