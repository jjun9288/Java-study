package �迭�⺻;

import java.util.Scanner;

public class _17_�迭_����_�迭��Ʈ�ѷ�_1�ܰ�_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 0, 0, 0};
		int cnt = 2;
		
		boolean run = true;
		while(run) {
			
			System.out.println("[3]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 3) {
				
				if(cnt == 5) System.out.println("���̻� �Է��� �� �����ϴ�.");
				
				System.out.print("������ ��ġ �Է� : ");
				int idx = scan.nextInt();
				if(cnt < idx || idx < 0) {
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
				}
				
				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();
				
				for(int i=cnt; i>idx; i--) {
					arr[i] = arr[i-1];     //20�� 2��° �ε����� �����ϰ� �̷� ��
				}
				arr[idx] = data;           //20�� �ִ� �ڸ��� data ����
				cnt+=1;
				for(int i=0; i<cnt; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}	
		}
	}
}
