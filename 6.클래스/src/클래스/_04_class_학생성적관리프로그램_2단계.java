package Ŭ����;

import java.util.Random;
import java.util.Scanner;

class Ex04{
	int[] student_number = {1001,1002,1003,1004,1005};
	int[] scores = new int[5];
}

public class _04_class_�л������������α׷�_2�ܰ� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		Ex04 e = new Ex04();
		
		//1. score �迭�� 1~100�� ������ ���� 5�� ����
		for(int i=0; i<e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
			System.out.print(e.scores[i]+" ");
		}
		System.out.println();
		
		//2. �������� ������ ��� ���
		int total = 0;
		int avg = 0;
		for(int i=0; i<e.scores.length; i++) {
			total = total + e.scores[i];
		}
		avg = total /e.scores.length;
		System.out.println("total = " + total);
		System.out.println("average = " + avg);
		
		//3. ������ 60�� �̻��̸� �հ�, �հ��� �� ���
		int count=0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {count += 1;}
		}
		System.out.println("�հ��� �� = " + count);
		
		//4. �ε��� �Է¹޾� ���� ���
		System.out.println("�ε��� �Է� : ");
		int a = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(i == a) System.out.println(e.scores[i]);
		}
		
		//5. ���� �Է¹޾� �ε��� ���
		System.out.println("���� �Է� : ");
		int b = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(b == e.scores[i]) System.out.println(i);
		}
		
		//6. �й� �Է¹޾� ���� ���
		System.out.println("�й� �Է� : ");
		int c = scan.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			for(int j=0; j<e.student_number.length; j++) {
				if(c == e.student_number[j]) {
					if(j == i) System.out.println(e.scores[i]);
				}
			}
		}
		
		//7. 1�� �л� �й�, ���� ���
		int max_id = 0;
		int max_score = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(max_score < e.scores[i]) {
				max_id = e.student_number[i];
				max_score = e.scores[i];
			}
		}
		System.out.println("1�� �л��� �й� : " + max_id);
		System.out.println("1�� �л��� ���� : " + max_score);
	}

}
