package �迭��ȭ;

public class _09_��ȭ_�迭_�ּҰ��� {

	public static void main(String[] args) {
		int[] arr = {87,100,24,11,79};
		
		int[] temp = arr;
		temp[1] = 0;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}

// int[] arr = new int[5] �� �����Ǿ� �ִٴ°� ���� ����.
// �ּҴ� stack��, ���� heap�� ���� �ǰ�,
// temp[] �� arr �ּҰ��� �� ��Ȳ�̰�,
// temp[1] �� 0 ���� �ٲ۴ٴ°� ���� 0���� �ٲ�� �� �Ӹ� �ƴ϶� arr ���� �� ���� �Ἥ �� �� 0�� ������ ���̴�.