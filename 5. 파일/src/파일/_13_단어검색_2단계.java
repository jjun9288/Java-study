package ����;

import java.util.Scanner;

/*
 * # �ܾ� �˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true
 *    �ܾ ������ false�� ����Ѵ�.
 */
public class _13_�ܾ�˻�_2�ܰ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		//Life is too short. �� �� ĭ���� ���� ���̴�. ���� ��� too�� �˻��Ѵ� �ϸ� �տ������� Lif, ife, fe , ...
		//������� �˻��ؼ� too �� ã�� ��  �׷��� �׳� ort.�� �Է��ص� true �� ���´�.
		
		char[] arr = new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int size = word.length();
		int check = -1;
		for(int i=0; i < arr.length-size+1; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j] == word.charAt(j)) {
					count += 1;
				}
			}
			if(count == size) {
				check = 1;
			}
		}
		
		if(check == 1) System.out.println("true");
		else if(check == -1) System.out.println("false");
	}
}
