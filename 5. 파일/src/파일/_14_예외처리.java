package ����;

public class _14_����ó�� {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		// System.out.println(x / y);
		// 0���� �����°� �Ұ��ؼ� ������ ����. java.lang.ArithmeticException: / by zero
		
		if(y != 0) {
			System.out.println(x / y);
		}else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		//--------------------------------------------------
		
		try {
			// �����߻������� �ִ� �ڵ�
			System.out.println(x / y);
		}catch(Exception e) {
			// try�������� ������ �߻��ϸ�, ������ �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		

	}

}
