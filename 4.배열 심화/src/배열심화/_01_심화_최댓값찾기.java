package �迭��ȭ;
/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� : 100
 * 
 * 11, 87, 42, 0, 24
 * �Է� : 87
 * 
 * 11, 0, 42, 0, 24
 */
import java.util.Scanner;

public class _01_��ȭ_�ִ�ã�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11,87,42,100,24};
		
		int cnt = 0;
		while(true) {
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			int maxNum=0;
			int maxIdx=0;
			for(int i=0; i<5; i++) {
				if(maxNum < arr[i]) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			System.out.print("�Է� : ");
			int num = scan.nextInt();
			
			if(maxNum == num) {
				arr[maxIdx] = 0;
				cnt+=1;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���!");
			}
			if(cnt==5) break;
		}

	}

}
