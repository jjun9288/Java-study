package �迭��ȭ;
/*
 * # ���ڿ�[����]
 * 1. compareTo() �޼���
 * 2. 2���� ���ڿ��� ���� int�� ���� ��ȯ�ϴ� �޼���
 * 3. A.compareTo(B)
 * 4. ���
 * 		A�� B�� ������						0
 *      A�� B���� ���������� ������ ���̸�		����
 *      A���� B�� ���������� ������ ���̸�		���
 *      
 */
public class _19_��ȭ_���ڿ�_���� {

	public static void main(String[] args) {
		
		String str1 = "��";
		String str2 = "��";
		String str3 = "��";
		
		int a = str1.compareTo(str2);
		System.out.println(a);
		
		int c = str2.compareTo(str1);
		System.out.println(c);
		
		//����) ���� ������ �̸� ���� : 
		
		String[] name = {"�輼��", "���ؿ�", "������", "������", "�̿���", "���°�", "������"};
		for(int i=0; i<name.length; i++) {
			String min_name = name[i];
			int min_idx = i;
			for(int j=i; j<name.length; j++) {
				if(min_name.compareTo(name[j]) > 0) {
					min_name = name[j];
					min_idx = j;
				}
			}
			String temp = name[i];
			name[i] = name[min_idx];
			name[min_idx] = temp;
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}
	}
}
