package �迭��ȭ;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�̵Ǹ� ������ ����ȴ�.
 */
public class _07_��ȭ_1_to_9 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//arr �� 1 to 9 ����
		for(int i=0; i<9; i++) {
			arr[i] = i+1;
		}
		//arr shuffle
		for(int i=0; i<9; i++) {
			int r = ran.nextInt(9);
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
		int num = 1;   //1���� 9���� ������� �Է�, 1���� �Է��ؾ� �ϹǷ� �ʱ갪�� 1�� �д�.
		while(true) {
		//arr 3�� 3���� �����
		for(int i=0; i<9; i++) {
			System.out.print(arr[i] + " ");
			if(i%3 ==2) {
				System.out.println();
				}
		}
		System.out.print("�Է� : ");
		int data = scan.nextInt();
		if(arr[data] == num) {
			arr[data] = 0;
			num += 1;
			}
		if(num == 10) break;
		}
	}	
}
