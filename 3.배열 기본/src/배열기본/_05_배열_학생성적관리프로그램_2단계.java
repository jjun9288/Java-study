package �迭�⺻;

import java.util.Scanner;

/*
*int[] arr = {87, 11, 45, 98, 23}
*����1) �ε����� �Է¹޾� ���� ���
*����1) �ε��� �Է� : 1	���� : 11��
*����2) ������ �Է¹޾� �ε��� ���
*����2) ���� �Է� : 11		�ε��� : 1
*int[] hakbuns = {1001, 1002, 1003, 1004, 1005}
*int[] scores  = {  87,   11,   45,   98,   23};	
*����3) �й��� �Է¹޾� ���� ���
*����3) �й� �Է� : 1003	���� : 45��
*/
public class _05_�迭_�л������������α׷�_2�ܰ� {  //**

	public static void main(String[] args) {
		int[] arr = {87,11,45,98,23};
		Scanner scan = new Scanner(System.in);
		//����1)
		System.out.println("�ε��� �Է� : ");
		int index = scan.nextInt();
		System.out.println(arr[index] + "��");
		//����2)
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(score == arr[i]) {System.out.println(i + "��");}
		}
		//����3)
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		System.out.println("�й� �Է� : ");
		int �й� = scan.nextInt();
		for(int j=0;j<5;j++) {
				if(�й� == hakbuns[j]) {System.out.println(arr[j] + "��");}
			}
			
	}

}
