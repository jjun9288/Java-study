package ����;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ÿ�ڿ��� ����[2�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
 * ��)
 * ���� : mys*l
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : *sp
 * �Է� : jsp
 * ...
 */
public class _08_Ÿ�ڿ���_2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		for(int i=0; i<words.length; i++) {
			int k = ran.nextInt(words.length);
			String temp = words[i];
			words[i] = words[k];
			words[k] = temp;
		}
		
		int i = 0;
		while(i < words.length) {
			int size = words[i].length();
			int r = ran.nextInt(size);
			System.out.print("���� : ");
			for(int j=0; j<size; j++) {
				if(r == j) {
					System.out.print("*");	
				}
				else {
					System.out.print(words[i].charAt(j));  //�� �ܾ ��� ex) java �̰� r=2���
					                                       //                   j=0�� �� j ��� �� ++
				}
			}
			System.out.println();
			
			System.out.print("�Է� : ");
			String me = scan.next();
			if(words[i].equals(me)) {
				i += 1;
			}
		}
	}
}
