package ����;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��)
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
 * ���� : jsp
 */
public class _07_Ÿ�ڿ���_01 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i=0; i<words.length; i++) {
			int k = ran.nextInt(words.length);
			String temp = words[0];
			words[0] = words[k];
			words[k] = temp;
		}
		int i=0;
		while(i < words.length) {
			System.out.println("���� : " + words[i]);
			System.out.print("�Է� : ");
			String me = scan.next();
			
			if(words[i].equals(me)) {
				i += 1;
			}
			else continue;
		}
	}
}
