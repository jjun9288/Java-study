package basic;

import java.util.Scanner;

/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */
public class Day02_07_���̱ⱸ_�̿����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű :");
		int height = scan.nextInt();
		if(height >= 120) {System.out.println("ž�� ����");}
		if(height < 120) 
		{
			System.out.println("�θ�԰� �Բ� ���̳���? (yes : 1, no : 0)");
			System.out.println("�� :");
			int answer = scan.nextInt();
				if(answer == 1) {System.out.println("ž�� ����");}
				else {System.out.println("ž�� �Ұ�");}
		}

	}

}
