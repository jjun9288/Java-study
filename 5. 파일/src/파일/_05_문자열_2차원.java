package ����;

public class _05_���ڿ�_2���� {

	public static void main(String[] args) {
		// ����1) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
				
		String[] name = new String[3];
		int[] score = new int[3];
				
		String[] temp = str.split(",");  //���� temp �� [��ö��/87],[�̸���/42],[�̿���/95]
		for(int i=0; i<temp.length; i++) {		//[��ö��][87] ������ [�̸���][42] ������... 
			String[] each = temp[i].split("/"); 
			name[i] = each[0];
			score[i] = Integer.parseInt(each[1]);
		}
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		// ����2) �̸��� ������ �ϳ��� ���ڿ��� ����
		// ����) "��ö��/87,�̸���/42,�̿���/95"

		String[] name2 = {"��ö��", "�̸���", "�̿���"};
		int[] score2 = {87, 42, 95};
		
		String str2 = "";
		for(int i=0; i<3; i++) {
			str2 += name2[i];
			str2 += "/";
			str2 += score2[i] + "";
			if(i != name2.length-1) {
				str2 += ",";
			}
		}
		System.out.println(str2);
	}
}
