package 배열기본;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

/*
 * # 구구단 문제(심화)
 * 1. 5회 랜덤하게 구구단 문제를 푼다.
 * 2. 정답을 맞추면 answer 배열에 1을 저장하고, 틀리면 -1을 저장한다.
 * 3. answer 배열의 값이 1이면 yes 배열에 그 위치를 저장한다.
 * 4. answer 배열의 값이 -1이면 no 배열에 그 위치를 저장한다.
 * 
 * 3 x 1 = 3
 * 2 x 4 = 3
 * 4 x 6 = 3
 * 7 x 1 = 3
 * 3 x 2 = 6
 * 
 * answer = {1, -1, -1, -1, 1};
 * yes    = {0, 4}
 * no     = {1, 2, 3}
 */

public class _14_배열_테스트 {
	public static void main(String[] args) {
		
		int[] answer = new int[5];
		int[] yes = null;
		int[] no = null;
		int cnt1 = 0;
		int cnt2 = 0;
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			int mul = a*b;
			System.out.print(a + "x" + b + "=");
			int my_answer = scan.nextInt();
			System.out.println(my_answer);
			if(my_answer == mul) {
				answer[i] = 1;	
				cnt1 += 1;
			}
			else {
				answer[i] = -1;
				cnt2 += 1;
			}
		}
		yes = new int[cnt1];
		no = new int[cnt2];
		
		int n = 0;
		int m = 0;
		for(int i=0; i<5; i++) {
			System.out.print(answer[i] + " ");
			if(answer[i]==1) {
				yes[n] = i;
				n = n + 1;
			}
			if(answer[i]==-1) {
				no[m] = i;
				m = m + 1;
			}
		}
		System.out.println();
		
		for(int j=0; j<cnt1; j++) {
			System.out.print(yes[j]);
		}
		System.out.println();
		for(int k=0; k<cnt2; k++) {
			System.out.print(no[k]);
		}
	}
}
