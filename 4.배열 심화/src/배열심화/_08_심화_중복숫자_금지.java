package �迭��ȭ;

import java.util.Random;

/*
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
 */
public class _08_��ȭ_�ߺ�����_���� {

	public static void main(String[] args) {
	int[] arr = new int[5];	
	Random ran = new Random();
	
	int i = 0;
	while(i < 5) {
		int random_number = ran.nextInt(10)+1;
		
		int check = 1;
		int j = 0;
		while(j < i) {
			if(random_number == arr[j]) {
				check = -1;
			}
			j += 1;
		}
		if(check == 1) {
			arr[i] = random_number;
			i += 1;
		}
	}
	for(int j=0; j<5; j++) {
		System.out.print(arr[j] + " ");
	}
	}
}
