package 배열심화;

import java.util.Scanner;

public class _16_심화_관리비 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
			// 문제 1) 각층별 관리비 합 출력
			// 정답 1) 4400, 7100, 5400
			int sum = 0;
			int[] floor = new int[3];
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					floor[i] = pay[i][j];
					sum = sum + floor[i];
				}
				System.out.print(sum + " ");
				sum = 0;
			}
			System.out.println();
			
			// 문제 2) 호를 입력하면 관리비 출력
			// 예    2) 입력 : 202	관리비 출력 : 2000
			System.out.print("호 입력 : ");
			int a = scan.nextInt();
			int idx1 = 0, idx2 = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(a == apt[i][j]) {
						idx1 = i;
						idx2 = j;
					}
				}
			}
			System.out.println("관리비 : " + pay[idx1][idx2]);
			
			// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
			// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
			int max = 0;
			int min = pay[0][0];
			int idx_1 = 0, idx_2 = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(max < pay[i][j]) {
						max = pay[i][j];
						idx_1 = i;
						idx_2 = j;
					}
				}
			}
			System.out.println("가장 많이 나온 집 : " + apt[idx_1][idx_2]);
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(min > pay[i][j]) {
						min = pay[i][j];
						idx_1 = i;
						idx_2 = j;
					}
				}
			}
			System.out.println("가장 적게 나온 집 : " + apt[idx_1][idx_2]);
			
			// 문제 4) 호 2개를 입력하면 관리비 교체
			int idx1_1 = 0, idx1_2 = 0;
			int idx2_1 = 0, idx2_2 = 0;
			System.out.print("호 입력 : ");
			int room1 = scan.nextInt();
			System.out.print("호 입력 : ");
			int room2 = scan.nextInt();
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(room1 == apt[i][j]) {
						idx1_1 = i;
						idx1_2 = j;
					}
					if(room2 == apt[i][j]) {
						idx2_1 = i;
						idx2_2 = j;
					}
				}
			}
			int temp = pay[idx1_1][idx1_2];
			pay[idx1_1][idx1_2] = pay[idx2_1][idx2_2];
			pay[idx2_1][idx2_2] = temp;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.print(pay[i][j] + " ");
				}
				System.out.println();
			}
	}
}
