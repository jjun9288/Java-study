package ����;
/*
 * ���ڿ��� ������ �迭�� ���Ӹ�
 * 0���� ���ڰ� �ο�(index)
 * 
 */
public class _01_���ڿ�_�⺻�̷� {

	public static void main(String[] args) {
		String name = "junyoung";
		System.out.println(name);
		
		//1. ������ ���� : .length()
		int size = name.length();
		System.out.println(size);
		
		//2. ���� �� �� ����(�ε���) : .charAt(index)
		char ch = name.charAt(0);
		System.out.println(ch);
		ch = name.charAt(size - 1); //�� �� ���� ���! ������ ch�� 0 �̿����� �� ���� 7�� ��µǰ���?
		System.out.println(ch);
		
		//3. ���� ���� �� ���(�����̽�) : 
			//(1) substring(index1, index2) (index1 ���� index2 - 1 ����)
		String str1 = name.substring(3,5);
		System.out.println(str1);
			//(2) substring(index) (index ���� ������)
		String str2 = name.substring(4);
		System.out.println(str2);
		
		//4. �����ڷ� �߶󳻱�
		name = "yoon,jun,young";
		String[] ar = name.split(",");	//, �� �������� ���! n �� ������ n �������� �ǰ���??
		System.out.println(ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
