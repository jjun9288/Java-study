package ����;

public class _03_�ֹε�Ϲ�ȣ_�˻� {

	public static void main(String[] args) {
	
	String id = "950819-1020016";
	// ���� 1) ���� ���
	// ���� 1) 26��
	String strAge = id.substring(0,2);
	int intAge = Integer.parseInt(strAge);  //string age �� int age �� �ٲ۴�!
	int age = 2020 - (1900 + intAge) + 1;
	System.out.println(age);
	
	// ���� 2) ���� ���
	// ���� 2) ����
	String strSex = id.substring(7,8);
	int intSex = Integer.parseInt(strSex);
	if(intSex == 1) {
		System.out.println("����");
		}
	else if(intSex == 2) {
		System.out.println("����");
		}
	}
}
