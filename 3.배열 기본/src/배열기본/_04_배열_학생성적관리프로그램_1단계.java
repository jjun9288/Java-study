package �迭�⺻;
/*�л������������α׷�
 * 1. �迭�� 1~100 ������ ���� 5�� ����
 * 2. 5�� �л��� ���� �� ��� ���
 * 3. ������ 60�� �̻��̸� �հ��̴�. �հ��� �� ���
 */
import java.util.Random;

class _04_�迭_�л������������α׷�_1�ܰ� {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		int total = 0;
		int avg = 0;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;
			System.out.println(arr[i]);
			total += arr[i];
			avg = total/5;
			if(arr[i]>=60) {cnt++;}
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("�հ��� �� : " + cnt);
	}
		
}
