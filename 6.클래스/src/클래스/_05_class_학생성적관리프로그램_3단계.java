package Ŭ����;

import java.util.Scanner;

/*
 * # �л����� ���� ���α׷�[3�ܰ�] : Ŭ���� + ����
 * 1. �й��� �Է��ϸ�, �ش� �л��� ������ ��µȴ�.
 * 2. ��, ���� �й� �Է¿� ���� ���ܻ�Ȳ�� �ݵ�� ó���ؾ� �Ѵ�.
 * 3. 1��� �õ� �л��� ������ Ȯ���� �� �ִ�.
 */

class Ex05{
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};	
}
public class _05_class_�л������������α׷�_3�ܰ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex05 mega = new Ex05();
		mega.name = "�ް�IT";
		
		while(true) {
			// �޴� ���
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			
			// �޴� ����
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				for(int i=0; i<mega.arHakbun.length; i++) {
					System.out.println("�й�:" + mega.arHakbun[i] + "," + "����:" + mega.arScore[i]);
				}
			}
			
			else if(choice == 2) {
				int max_score = 0;
				int max_id = 0;
				for(int i=0; i<mega.arHakbun.length; i++) {
					if(max_score < mega.arScore[i])
						max_score = mega.arScore[i];
						max_id = mega.arHakbun[i];
				}
				System.out.println("1�� �л�:" + max_id + "����:" + max_score);
			}
			else if(choice == 3) {
				int min_score = mega.arScore[0];
				int min_id = 0;
				for(int i=0; i<mega.arHakbun.length; i++) {
					if(min_score > mega.arScore[i]) 
						min_score = mega.arScore[i];
						min_id = mega.arHakbun[i];
				}
				System.out.println("�õ� �л�:" + min_id + "����:" + min_score);
			}
			else if(choice == 4) {
				
			}
			else if(choice == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
