package �迭��ȭ;

public class _13_��ȭ_2�����迭_1�ܰ� {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k+=1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//����1) ��ü �� ���
		int sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println(sum);
		
		//����2) 4�� ����� ���
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		//����3) 4�� ����� �� ���
		int sum2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] % 4 == 0) {
					sum2 = sum2 + arr[i][j];
				}
			}
		}
		System.out.println(sum2);
		
		//����4) 4�� ����� ���� ���
		int count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] % 4 == 0) {
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
