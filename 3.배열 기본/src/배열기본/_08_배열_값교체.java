package �迭�⺻;

import java.util.Scanner;

public class _08_�迭_����ü {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		//ex01) �ε��� 2�� �Է¹޾� ��ü�ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("�ε��� �Է� : ");
		int num1 = scan.nextInt();
		System.out.println("�ε��� �Է� : ");
		int num2 = scan.nextInt();
		int a = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = a;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		//ex02) �� 2�� �Է¹޾� ��ü�ϱ�
		System.out.println("�� �Է� : ");
		int num3 = scan.nextInt();
		System.out.println("�� �Է� : ");
		int num4 = scan.nextInt();
		int index1 = 0;
		int index2 = 0;
		for(int j=0; j<5; j++) {
			if(num3==arr[j]) index1 = j;
			if(num4==arr[j]) index2 = j;
		}
		int b = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = b;
		
		for(int j=0; j<5; j++) {System.out.println(arr[j]);}
	}
}
