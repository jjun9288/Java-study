package ����;

import javax.print.attribute.IntegerSyntax;

/*
 * ����ȯ : �ڷ����� �ٲٴ� ���� �ǹ�
 * (��ȯ�� �ڷ���)����
 */
public class _02_����ȯ {

	public static void main(String[] args) {
		//���� -> ����
		char ch = 'c';
		int cNum = (int)ch;
		System.out.println(cNum);
		
		//���� -> ����
		ch = (char)cNum;
		System.out.println(ch);
		ch = (char)(cNum+1);
		System.out.println(ch);
		
		//���ڿ� -> ����
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		//���� -> ���ڿ�
			//1. ���� 
		strNum = String.valueOf(num);
		System.out.println(strNum);
			
			//2. �ļ�
		strNum = num + "";
		System.out.println(strNum);
	}
}
