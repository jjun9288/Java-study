package �迭��ȭ;

import java.util.Scanner;

/*
 * # 2�����迭[����]
 * . �̸��� ��ȣ�� �Է¹޾� �����ϱ�
 * ��)
 * �Է� : ö��	1
 * ���� : ���
 * 
 * �Է� : ö�� 2          //���⼭ ����Ʈ�� {"ö��","�ٳ���"} �� �ε����� 3��°, �Է»� 2��� ���̴�.
 * ���� : �ٳ���
 */
public class _23_2�����迭_���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
	
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		System.out.println();
		
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("������ �ε����� �Է��ϼ��� : ");
		int index = scan.nextInt();
		
		System.out.println();
		
		//���� ����
		int delete_index = 0;
		int count = 0;		//{"ö��","�ٳ���"} �� ���� �ε����� 3, ���� ���� 2�̹Ƿ� �� ���� ���� ����
		
		for(int i=0; i<jang.length; i++) {
			if(name.equals(jang[i][0])){
				if(count == index) {
					delete_index = i;
				}
				count += 1;
			}
		}
		
		//���� ���� jang �迭
		String[][] temp = jang;
		jang = new String[temp.length-1][2];  //������ �ϸ� �迭�� ũ�Ⱑ �翬�� �ٰ���?
		int j=0;
		for(int i=0; i<temp.length; i++) {
			if(i != delete_index) {
				jang[j] = temp[i];
				j += 1;
			}
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
