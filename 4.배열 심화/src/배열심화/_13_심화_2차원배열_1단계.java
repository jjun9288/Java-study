package 배열심화;

public class _13_심화_2차원배열_1단계 {

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
		
		//문제1) 전체 합 출력
		int sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum = sum + arr[i][j];
			}
		}
		System.out.println(sum);
		
		//문제2) 4의 배수만 출력
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		//문제3) 4의 배수의 합 출력
		int sum2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] % 4 == 0) {
					sum2 = sum2 + arr[i][j];
				}
			}
		}
		System.out.println(sum2);
		
		//문제4) 4의 배수의 갯수 출력
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
