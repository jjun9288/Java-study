package ����;

public class _04_���ڿ�_1���� {

	public static void main(String[] args) {
		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		int[] arr = new int[3];
		int sum = 0;
		String[] temp = str.split("/");
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(temp[i]);
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("���� : " + sum);
		
		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0; i<3; i++) {
			text = text + scores[i];
			if(i != scores.length - 1) {
				text = text + "/";		//�� if���� �� ������ 11/100/89/ �� �ȴ�. ������ /�� ���ֱ� ���� if��!
				//���� / ���� / ... ���·� �ִ� ��.
			}
		}
		System.out.print(text);
	}
}
