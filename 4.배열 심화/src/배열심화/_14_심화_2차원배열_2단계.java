package �迭��ȭ;

import java.util.Scanner;

public class _14_��ȭ_2�����迭_2�ܰ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
			// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
			//		   �� ��� : 60 
			System.out.print("�ε���1 �Է� : ");
			int a = scan.nextInt();
			System.out.print("�ε���2 �Է� : ");
			int b = scan.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(a == i) {
						if(b == j) {
							System.out.println(arr[i][j]);
						}
					}
				}
			}
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
			// ��    2) �� �Է� : 60
			//		   �ε���1 ��� : 1	�ε���2 ��� : 2
			System.out.print("�� �Է� : ");
			int value = scan.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(value == arr[i][j]) {
						System.out.print("�ε���1 ��� : " + i + "  ");
						System.out.println("�ε���2 ��� : " + j);
					}
				}
			}
		// ���� 3) ���� ū ���� �ε��� 2�� ���
			// ���� 3) 2 2
			int max1 = 0;
			int max2 = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(max1 < i) {
						max1 = i;
						}
					if(max2 < j) {
						max2 = j;
					}
				}
			}
			System.out.println(max1 + " " + max2);
			
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
			System.out.println("�� 1 �Է� : ");
			int x = scan.nextInt();
			System.out.println("�� 2 �Է� : ");
			int y = scan.nextInt();
			int idx1_1 = 0, idx1_2 = 0;
			int idx2_1 = 0, idx2_2 = 0;
			int temp = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(arr[i][j] == x) {
						idx1_1 = i;
						idx1_2 = j;
					}
					if(arr[i][j] == y) {
						idx2_1 = i;
						idx2_2 = j;
					}
				}
			}
			
			temp = arr[idx1_1][idx1_2];
			arr[idx1_1][idx1_2] = arr[idx2_1][idx2_2];
			arr[idx2_1][idx2_2] = temp;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
	}
}
