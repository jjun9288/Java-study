package Ŭ����;

import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}
public class _06_class_OMR_����߱� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex06 e = new Ex06();
		for(int i=0; i<e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5)+1;
			System.out.print(e.hgd[i]);
		}
		System.out.println();
		for(int i=0; i<e.hgd.length; i++) {
			if(e.hgd[i] == e.answer[i]) {
				System.out.print("O");
				e.cnt += 1;
			}
			else System.out.print("X");
		}
		e.score = 20 * e.cnt;
		System.out.println();
		System.out.println(e.score);
	}

}
