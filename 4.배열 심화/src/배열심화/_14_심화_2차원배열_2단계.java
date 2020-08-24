package 배열심화;

import java.util.Scanner;

public class _14_심화_2차원배열_2단계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// 문제 1) 인덱스 2개를 입력받아 값 출력
			// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
			//		   값 출력 : 60 
			System.out.print("인덱스1 입력 : ");
			int a = scan.nextInt();
			System.out.print("인덱스2 입력 : ");
			int b = scan.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(a == i) {
						if(b == j) {
							System.out.println(arr[i][j]);
						}
					}
				}
			}
		// 문제 2) 값을 입력받아 인덱스 2개 출력
			// 예    2) 값 입력 : 60
			//		   인덱스1 출력 : 1	인덱스2 출력 : 2
			System.out.print("값 입력 : ");
			int value = scan.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(value == arr[i][j]) {
						System.out.print("인덱스1 출력 : " + i + "  ");
						System.out.println("인덱스2 출력 : " + j);
					}
				}
			}
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
			// 정답 3) 2 2
			int max1 = 0;
			int max2 = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(max1 < i) {
						max1 = i;
						}
					if(max2 < j) {
						max2 = j;
					}
				}
			}
			System.out.println(max1 + " " + max2);
			
		// 문제 4) 값 2개를 입력받아 값 교체
			System.out.println("값 1 입력 : ");
			int x = scan.nextInt();
			System.out.println("값 2 입력 : ");
			int y = scan.nextInt();
			int idx1_1 = 0, idx1_2 = 0;
			int idx2_1 = 0, idx2_2 = 0;
			int temp = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(arr[i][j] == x) {
						idx1_1 = i;
						idx1_2 = j;
					}
					if(arr[i][j] == y) {
						idx2_1 = i;
						idx2_2 = j;
					}
				}
			}
			
			temp = arr[idx1_1][idx1_2];
			arr[idx1_1][idx1_2] = arr[idx2_1][idx2_2];
			arr[idx2_1][idx2_2] = temp;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
	}
}
