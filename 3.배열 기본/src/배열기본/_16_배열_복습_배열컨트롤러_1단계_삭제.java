package �迭�⺻;

import java.util.Scanner;

public class _16_�迭_����_�迭��Ʈ�ѷ�_1�ܰ�_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 5;
		boolean run = true;
		while(run) {
			System.out.println("[2]����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 2) {
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				int index = 0;
				for(int i=0; i<cnt; i++) {
					if(data == arr[i]) {
						index = i;
					}
				}
				if(index == 0) System.out.println("�迭�� ���� ���Դϴ�.");
				else {
					for(int i=index; i<cnt-1; i++) {
						arr[i] = arr[i+1];
					}
					cnt -= 1;
				}
				for(int i=0; i<cnt; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}	
		}
	}
}