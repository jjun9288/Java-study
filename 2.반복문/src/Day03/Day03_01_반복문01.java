package Day03;
public class Day03_01_�ݺ���01 {
	public static void main(String[] args) {
		//ex01) 1���� 5���� ���
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		//ex02) 1~10 ���� �ݺ��� 5~9 ���
		int num1 = 1;
		while(num1<=10) {
			if(5<=num1 && num1<=9) {System.out.println(num1);}
			num1++;
		}
		//ex03) 10~1 �ݺ��� 6~3 �Ųٷ� ���
		int num2 = 10;
		while(num2>=1) {
			if(3<=num2 && num2<=6) {System.out.println(num2);}
			num2-=1;
		}
		//ex04) 1~10 ���� �ݺ��� ¦���� ���
		int num3 = 1;
		while(num3<=10) {
			if(num3%2==0) {System.out.println(num3);}
			num3+=1;
		}
	}

}
