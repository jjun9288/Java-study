package Day03;

public class Day03_02_�ݺ���02 {

	public static void main(String[] args) {
		/*//practice01) 1~5���� �� ���
		int a = 1;
		int sum = 0;
		while(a <= 5) {
			sum=sum+a;
			a+=1;
		} 
		System.out.println(sum);*/
		
		//practice02) 1~10���� ����� 3�̸� 7�̻� ���
		int b = 1;
		while(b <= 10) {
			if(b<3 || b>=7) {System.out.println(b);}	// && , || �򰥸��� ����!
			b+=1;
		}
		
		//practice03) 2�� ���� ����� �� ��� **
		int c = 1;
		int add = 0;
		while(c <= 10) {
			if(c<3 || c>=7) { add = add+c; }
			c+=1;
		}
		System.out.println(add);
		//practice04) 2�� ���� ����� ���� ���
		int d = 1;
		int cnt = 0;
		while(d <= 10) {
			if(d<3 || d>= 7) { cnt++;}
			d+=1;
		}
		System.out.println(cnt);

	}

}
