package 배열심화;

public class _15_심화_2차원배열_3단계 {

	public static void main(String[] args) {
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
		int[] garo = new int[3];
		int[] sero = new int[4];
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int sum = 0;
		int i = 0;
		while(i < 3){
			for(int j=0; j<4; j++) {
				sum = sum + arr[i][j];
			}
			System.out.print(sum + " ");
			sum = 0;
			i++;
		}
		System.out.println();
			
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		int sum2 = 0;
		int j = 0;
		while(j < 4) {
			for(int k=0; k<3; k++) {
				sum2 = sum2 + arr[k][j];
			}
			System.out.print(sum2 + " ");
			sum2 = 0;
			j++;
		}
		System.out.println();
		
		// 선생님 방법
		for(int m=0; m<3; m++) {
			for(int n=0; n<4; n++) {
				garo[m] += arr[m][n];
				sero[n] += arr[m][n];
			}
		}
		
		for(int k=0; k<3; k++) {
			System.out.print(garo[k] + " ");
		}
		System.out.println();
		for(int k=0; k<4; k++) {
			System.out.print(sero[k] + " ");
		}
	}
}
