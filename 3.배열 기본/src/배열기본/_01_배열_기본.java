package �迭�⺻;
/*
 * # �迭(array)
 * 1. "���� ����"�� �����͸� "������" �����ϱ� ���� ���
 * 2. ����
 * 		int num = 10;
 * 		int[] arr = new int[���� ����];
 * 		int arr[] = new int[���� ����];   -> 
 * 3. �ε���(index)
 * 		0���� �����ϴ� ���ȣ(index)�� �ο��ȴ�.
 * 4. �ּ� ����
 */
public class _01_�迭_�⺻ {

	public static void main(String[] args) {
		int[] arr = null;
		arr = new int[3];
		System.out.println(arr[0]);	//0
		System.out.println(arr[1]);	//0
		System.out.println(arr[2]);	//0
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}			

	}
	
}
