package �迭�⺻;

import java.util.Scanner;

public class _15_�迭_����_�迭��Ʈ�ѷ�_1�ܰ�_�߰� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		boolean run = true;
		while(run) {

			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();			
			
			System.out.println("[1]�߰�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.print("�߰��� �� �Է� : ");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt += 1;
				if(cnt == 5) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					break;
				}	
			}
		}		
	}
}
