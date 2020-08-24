package �迭�⺻;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

/*
 * # ������ ����(��ȭ)
 * 1. 5ȸ �����ϰ� ������ ������ Ǭ��.
 * 2. ������ ���߸� answer �迭�� 1�� �����ϰ�, Ʋ���� -1�� �����Ѵ�.
 * 3. answer �迭�� ���� 1�̸� yes �迭�� �� ��ġ�� �����Ѵ�.
 * 4. answer �迭�� ���� -1�̸� no �迭�� �� ��ġ�� �����Ѵ�.
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

public class _14_�迭_�׽�Ʈ {
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
